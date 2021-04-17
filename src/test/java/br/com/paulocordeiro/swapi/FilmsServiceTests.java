package br.com.paulocordeiro.swapi;

import br.com.paulocordeiro.swapi.model.*;
import br.com.paulocordeiro.swapi.service.FilmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@AutoConfigureMockMvc
public class FilmsServiceTests {

    @Autowired
    private FilmsService filmsService;

    final int episode_id = 1;
    final String episode_description = "episode 1 | The Phantom Menace | version 1";

    @Test
    public void shouldReturnFilmCollection() throws Exception {
        Assert.notEmpty(filmsService.getAll(), "The film collection must need not be empty");
    }

    @Test
    public void shouldReturnFilmByEpisodeId() throws Exception {
        Assert.notNull(filmsService.findById(episode_id), "The film must need not be null");
    }

    @Test
    public void shouldReturnFilmDetails() throws Exception {

        Optional<Film> opFilm = filmsService.findFilmDetails(episode_id);
        Assert.isTrue(opFilm.isPresent(), "The film must need not be null");

        Assert.notEmpty(opFilm.get().getStarships(), "Startships must be not empty");
        Assert.isTrue(opFilm.get().getStarships().get(0).getClass() == Starship.class, "Startships must be a Starship class type");

        Assert.notEmpty(opFilm.get().getStarships(), "Planets must be not empty");
        Assert.isTrue(opFilm.get().getPlanets().get(0).getClass() == Planet.class, "Planets must be a Planet class type");

        Assert.notEmpty(opFilm.get().getStarships(), "Vehicles must be not empty");
        Assert.isTrue(opFilm.get().getVehicles().get(0).getClass() == Vehicle.class, "Vehicles must be a Vehicle class type");

        Assert.notEmpty(opFilm.get().getCharacters(), "Characters must be not empty");
        Assert.isTrue(opFilm.get().getCharacters().get(0).getClass() == People.class, "Characters must be a People class type");

        Assert.notEmpty(opFilm.get().getSpecies(), "Species must be not empty");
        Assert.isTrue(opFilm.get().getSpecies().get(0).getClass() == Specie.class, "Species must be a Specie class type");

    }

    @Test
    public void shouldReturnFilmNames() throws Exception {
        List<String> filmNames = filmsService.getFilmNames();
        Assert.notEmpty(filmNames, "The Film names must be not empty");
        Assert.isTrue(episode_description.equalsIgnoreCase(filmNames.get(0)), "The Film name must be equals to episode_description");

    }

    @Test
    public void shouldUpdateFilmDescriptionAndIncrementVersion() throws Exception {

        final String newEpisodeDescription = "New Episode Description";
        Optional<Film> opFilm = filmsService.updateDescription(episode_id, newEpisodeDescription);
        Assert.isTrue(opFilm.isPresent(), "The film must need not be null");
        Assert.isTrue(newEpisodeDescription.equalsIgnoreCase(opFilm.get().getDescription()), "The new film description need be equals to newEpisodeDescription");
        Assert.isTrue(opFilm.get().getVersion() == 2, "The new film version need be equals to 2");

    }

}
