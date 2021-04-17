package br.com.paulocordeiro.swapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class FilmsControllerTests {

    @Autowired
    private MockMvc mockMvc;

    final int episode_id = 1;
    final String episode_description = "episode 1 | The Phantom Menace | version 1";

    @Test
    public void shouldReturnFilmCollection() throws Exception {

        this.mockMvc
                .perform(get("/films/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray());

    }

    @Test
    public void shouldReturnFilmByEpisodeId() throws Exception {
        this.mockMvc
                .perform(get("/films/{episode_id}", episode_id))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.episode_id").value(episode_id))
                .andExpect(jsonPath("$.description").value(episode_description));

    }

    @Test
    public void shouldReturnFilmDetails() throws Exception {
        this.mockMvc
                .perform(get("/films/details/{episode_id}", episode_id))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.starships").isNotEmpty())
                .andExpect(jsonPath("$.starships[0].passengers").exists())
                .andExpect(jsonPath("$.planets").isNotEmpty())
                .andExpect(jsonPath("$.planets[0].diameter").exists())
                .andExpect(jsonPath("$.vehicles").isNotEmpty())
                .andExpect(jsonPath("$.vehicles[0].vehicle_class").exists())
                .andExpect(jsonPath("$.characters").isNotEmpty())
                .andExpect(jsonPath("$.characters[0].name").exists())
                .andExpect(jsonPath("$.species").isNotEmpty())
                .andExpect(jsonPath("$.species[0].name").exists());

    }

    @Test
    public void shouldReturnFilmNames() throws Exception {
        this.mockMvc
                .perform(get("/films/names"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.[0]").value(episode_description));

    }

    @Test
    public void shouldUpdateFilmDescriptionAndIncrementVersion() throws Exception {
        final String newEpisodeDescription ="New Episode Description";
        this.mockMvc
                .perform(
                        put("/films/updatedescription/{episode_id}", episode_id)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(newEpisodeDescription)
                )
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.description").value(newEpisodeDescription))
                .andExpect(jsonPath("$.version").value(2));

    }
}
