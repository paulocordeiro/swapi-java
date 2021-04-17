package br.com.paulocordeiro.swapi.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.net.URI;
import java.util.*;


/**
 * Film
 * <p>
 * A Star Wars film
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "starships",
        "edited",
        "planets",
        "producer",
        "title",
        "url",
        "release_date",
        "vehicles",
        "episode_id",
        "director",
        "created",
        "opening_crawl",
        "characters",
        "species"
})

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Film {

    /**
     * The starship resources featured within this film.
     * (Required)
     */
    @JsonProperty("starships")
    @JsonPropertyDescription("The starship resources featured within this film.")
    private List<Object> starships = Collections.emptyList();
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The planet resources featured within this film.
     * (Required)
     */
    @JsonProperty("planets")
    @JsonPropertyDescription("The planet resources featured within this film.")
    private List<Object> planets = null;
    /**
     * The producer(s) of this film.
     * (Required)
     */
    @JsonProperty("producer")
    @JsonPropertyDescription("The producer(s) of this film.")
    private String producer;
    /**
     * The title of this film.
     * (Required)
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of this film.")
    private String title;
    /**
     * The url of this resource
     * (Required)
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The url of this resource")
    private URI url;
    /**
     * The release date at original creator country.
     * (Required)
     */
    @JsonProperty("release_date")
    @JsonPropertyDescription("The release date at original creator country.")
    private String releaseDate;
    /**
     * The vehicle resources featured within this film.
     * (Required)
     */
    @JsonProperty("vehicles")
    @JsonPropertyDescription("The vehicle resources featured within this film.")
    private List<Object> vehicles = null;
    /**
     * The episode number of this film.
     * (Required)
     */
    @JsonProperty("episode_id")
    @JsonPropertyDescription("The episode number of this film.")
    private int episodeId;
    /**
     * The director of this film.
     * (Required)
     */
    @JsonProperty("director")
    @JsonPropertyDescription("The director of this film.")
    private String director;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * The opening crawl text at the beginning of this film.
     * (Required)
     */
    @JsonProperty("opening_crawl")
    @JsonPropertyDescription("The opening crawl text at the beginning of this film.")
    private String openingCrawl;
    /**
     * The people resources featured within this film.
     * (Required)
     */
    @JsonProperty("characters")
    @JsonPropertyDescription("The people resources featured within this film.")
    private List<Object> characters = null;
    /**
     * The species resources featured within this film.
     * (Required)
     */
    @JsonProperty("species")
    @JsonPropertyDescription("The species resources featured within this film.")
    private List<Object> species = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A aditional genereted property for didactic purposes
     */
    private String description;

    /**
     * A aditional property for didactic purposes
     */
    private int version = 1;

    /**
     * @return String film description
     */
    public String getDescription() {
        if(description==null){
            description=String.format("episode %s | %s | version %s", episodeId, title, version);
        }
        return description;
    }

    /**
     * update film description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return int film version
     */
    public int getVersion() {
        return version;
    }

    /**
     * update film version
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * The starship resources featured within this film.
     * (Required)
     */
    @JsonProperty("starships")
    public List<Object> getStarships() {
        return starships;
    }

    /**
     * The starship resources featured within this film.
     * (Required)
     */
    @JsonProperty("starships")
    public void setStarships(List<Object> starships) {
        this.starships = starships;
    }

    public Film withStarships(List<Object> starships) {
        this.starships = starships;
        return this;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    public Date getEdited() {
        return edited;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    public void setEdited(Date edited) {
        this.edited = edited;
    }

    public Film withEdited(Date edited) {
        this.edited = edited;
        return this;
    }

    /**
     * The planet resources featured within this film.
     * (Required)
     */
    @JsonProperty("planets")
    public List<Object> getPlanets() {
        return planets;
    }

    /**
     * The planet resources featured within this film.
     * (Required)
     */
    @JsonProperty("planets")
    public void setPlanets(List<Object> planets) {
        this.planets = planets;
    }

    public Film withPlanets(List<Object> planets) {
        this.planets = planets;
        return this;
    }

    /**
     * The producer(s) of this film.
     * (Required)
     */
    @JsonProperty("producer")
    public String getProducer() {
        return producer;
    }

    /**
     * The producer(s) of this film.
     * (Required)
     */
    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Film withProducer(String producer) {
        this.producer = producer;
        return this;
    }

    /**
     * The title of this film.
     * (Required)
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * The title of this film.
     * (Required)
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Film withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * The url of this resource
     * (Required)
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * The url of this resource
     * (Required)
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public Film withUrl(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The release date at original creator country.
     * (Required)
     */
    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * The release date at original creator country.
     * (Required)
     */
    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Film withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * The vehicle resources featured within this film.
     * (Required)
     */
    @JsonProperty("vehicles")
    public List<Object> getVehicles() {
        return vehicles;
    }

    /**
     * The vehicle resources featured within this film.
     * (Required)
     */
    @JsonProperty("vehicles")
    public void setVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
    }

    public Film withVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    /**
     * The episode number of this film.
     * (Required)
     */
    @JsonProperty("episode_id")
    public int getEpisodeId() {
        return episodeId;
    }

    /**
     * The episode number of this film.
     * (Required)
     */
    @JsonProperty("episode_id")
    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public Film withEpisodeId(int episodeId) {
        this.episodeId = episodeId;
        return this;
    }

    /**
     * The director of this film.
     * (Required)
     */
    @JsonProperty("director")
    public String getDirector() {
        return director;
    }

    /**
     * The director of this film.
     * (Required)
     */
    @JsonProperty("director")
    public void setDirector(String director) {
        this.director = director;
    }

    public Film withDirector(String director) {
        this.director = director;
        return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    public Date getCreated() {
        return created;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    public void setCreated(Date created) {
        this.created = created;
    }

    public Film withCreated(Date created) {
        this.created = created;
        return this;
    }

    /**
     * The opening crawl text at the beginning of this film.
     * (Required)
     */
    @JsonProperty("opening_crawl")
    public String getOpeningCrawl() {
        return openingCrawl;
    }

    /**
     * The opening crawl text at the beginning of this film.
     * (Required)
     */
    @JsonProperty("opening_crawl")
    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public Film withOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
        return this;
    }

    /**
     * The people resources featured within this film.
     * (Required)
     */
    @JsonProperty("characters")
    public List<Object> getCharacters() {
        return characters;
    }

    /**
     * The people resources featured within this film.
     * (Required)
     */
    @JsonProperty("characters")
    public void setCharacters(List<Object> characters) {
        this.characters = characters;
    }

    public Film withCharacters(List<Object> characters) {
        this.characters = characters;
        return this;
    }

    /**
     * The species resources featured within this film.
     * (Required)
     */
    @JsonProperty("species")
    public List<Object> getSpecies() {
        return species;
    }

    /**
     * The species resources featured within this film.
     * (Required)
     */
    @JsonProperty("species")
    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    public Film withSpecies(List<Object> species) {
        this.species = species;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Film withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}