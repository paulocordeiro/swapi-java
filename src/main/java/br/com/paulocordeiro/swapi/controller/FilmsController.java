package br.com.paulocordeiro.swapi.controller;

import br.com.paulocordeiro.swapi.model.Film;
import br.com.paulocordeiro.swapi.service.FilmsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author paulocordeiro
 * FilmsController is a end point wrapper to Film Swapi
 */
@RestController
@RequestMapping("/films")
public class FilmsController {

    private FilmsService filmsService;

    /**
     * @param filmsService auto injected
     */
    public FilmsController(FilmsService filmsService) {
        this.filmsService = filmsService;
    }

    /**
     * @return a collection of films
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Film>> getAllFilms() {
        return ResponseEntity
                .ok()
                .body(this.filmsService.getAll());
    }

    /**
     * Find a film by episode id
     *
     * @param episodeId
     * @return Entity<Film>
     */
    @GetMapping(value = "/{episodeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> getFilm(@PathVariable("episodeId") int episodeId) {
        return this.filmsService
                .findById(episodeId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * evoke aditional request SWAPI api to retrieve film details
     * to starships, planets, vehicles, peoples and species
     *
     * @param episodeId
     * @return ResponseEntity<Film>
     */
    @GetMapping(value = "/details/{episodeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> filmDetails(@PathVariable("episodeId") int episodeId) {
        return this.filmsService
                .findFilmDetails(episodeId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * @return a collection of films names
     */
    @GetMapping(value = "/names", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getFilmNames() {
        return ResponseEntity
                .ok()
                .body(this.filmsService.getFilmNames());
    }

    /**
     * @param episode_id  identify of episode
     * @param description new description
     * @return the entity that makes up this response
     */
    @PutMapping(value = "/updatedescription/{episode_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> updateDescription(@PathVariable("episode_id") int episode_id, @RequestBody String description) {
        return this.filmsService
                .updateDescription(episode_id, description)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}
