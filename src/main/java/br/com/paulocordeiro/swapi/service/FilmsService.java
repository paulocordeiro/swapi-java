package br.com.paulocordeiro.swapi.service;

import br.com.paulocordeiro.swapi.model.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author paulocordeiro
 * Film service to use SWAPI api
 */
@Service
public class FilmsService {

    private static final String BASE_URL = "https://swapi.dev/api/films/";
    private RestTemplate restTemplate;
    private List<Film> filmsRepository;

    /**
     * @param restTemplate auto injected
     */
    public FilmsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * this is a init method to load all films
     * sort result by episode id
     * the results will use on next requests
     */
    @PostConstruct
    private void init() {

        ResponseEntity<SwapiResult<Film>> responseEntity = restTemplate.exchange(
                FilmsService.BASE_URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<SwapiResult<Film>>() {}
        );

        this.filmsRepository = responseEntity
                .getBody().getResults()
                .stream()
                .sorted(Comparator.comparingInt(Film::getEpisodeId))
                .collect(Collectors.toList());
    }


    /**
     * Update Find and change Film description and up it on film repository
     *
     * @param episodeId
     * @param description
     * @return Optional<Film> with updated descrition
     */
    public Optional<Film> updateDescription(int episodeId, String description) {

        Optional<Film> opFilm = findById(episodeId);

        opFilm.ifPresent(film -> {
            int index = this.filmsRepository.indexOf(film);
            film.setDescription(description);
            film.setVersion(film.getVersion() + 1);
            this.filmsRepository.set(index, film);
        });

        return opFilm;
    }

    /**
     * Method to find Film by episode id
     * Here we use local repository but the SWAPI provide entry point in /films/:id/
     *
     * @param episodeId
     * @return Optional<Film>
     */
    public Optional<Film> findById(int episodeId) {
        return this.filmsRepository
                .stream()
                .filter(f -> f.getEpisodeId() == episodeId)
                .findAny();
    }

    /**
     * find a film by episode id and retrieve their
     * starships, planets, vehicles, peoples and species details
     * this method no update current film on local repository
     * @param episodeId
     * @return Optional<Film>
     */
    public Optional<Film> findFilmDetails(int episodeId) {
        Optional<Film> opFilm = findById(episodeId);
        opFilm.ifPresent(film -> {

            List<Object> starships = film.getStarships()
                    .parallelStream()
                    .map(o -> findByUrl(o.toString(), Starship.class))
                    .collect(Collectors.toList());
            film.setStarships(starships);

            List<Object> planets = film.getPlanets()
                    .parallelStream()
                    .map(o -> findByUrl(o.toString(), Planet.class))
                    .collect(Collectors.toList());
            film.setPlanets(planets);

            List<Object> vehicles = film.getVehicles()
                    .parallelStream()
                    .map(o -> findByUrl(o.toString(), Vehicle.class))
                    .collect(Collectors.toList());
            film.setVehicles(vehicles);

            List<Object> peoples = film.getCharacters()
                    .parallelStream()
                    .map(o -> findByUrl(o.toString(), People.class))
                    .collect(Collectors.toList());
            film.setCharacters(peoples);

            List<Object> species = film.getSpecies()
                    .parallelStream()
                    .map(o -> findByUrl(o.toString(), Specie.class))
                    .collect(Collectors.toList());
            film.setSpecies(species);

        });

        return opFilm;
    }

    /**
     * a helpful method to make genetic requests
     * @param url
     * @param responseType
     * @param <T>
     * @return <T>
     */
    private <T> T findByUrl(String url,Class<T> responseType) {
        ResponseEntity<T> responseEntity = restTemplate.getForEntity(url, responseType);
        return responseEntity.getBody();
    }

    /**
     * @return List<Film>
     */
    public List<Film> getAll() {
        return this.filmsRepository;
    }

    /**
     * Simple method to return list of film name with episode id
     * @return List<String>
     */
    public List<String> getFilmNames() {
        return this.filmsRepository
                .stream()
                .map(film -> String.format("episode %s | %s | version %s", film.getEpisodeId(), film.getTitle(), film.getVersion()))
                .collect(Collectors.toList());
    }

}
