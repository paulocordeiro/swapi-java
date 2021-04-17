package br.com.paulocordeiro.swapi.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Planet
 * <p>
 * A planet.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "diameter",
        "climate",
        "surface_water",
        "name",
        "created",
        "url",
        "rotation_period",
        "edited",
        "terrain",
        "gravity",
        "orbital_period",
        "films",
        "residents",
        "population"
})
@Generated("jsonschema2pojo")
public class Planet {

    /**
     * The diameter of this planet in kilometers.
     * (Required)
     */
    @JsonProperty("diameter")
    @JsonPropertyDescription("The diameter of this planet in kilometers.")
    private String diameter;
    /**
     * The climate of this planet. Comma-seperated if diverse.
     * (Required)
     */
    @JsonProperty("climate")
    @JsonPropertyDescription("The climate of this planet. Comma-seperated if diverse.")
    private String climate;
    /**
     * The percentage of the planet surface that is naturally occuring water or bodies of water.
     * (Required)
     */
    @JsonProperty("surface_water")
    @JsonPropertyDescription("The percentage of the planet surface that is naturally occuring water or bodies of water.")
    private String surfaceWater;
    /**
     * The name of this planet.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this planet.")
    private String name;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * The hypermedia URL of this resource.
     * (Required)
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The hypermedia URL of this resource.")
    private URI url;
    /**
     * The number of standard hours it takes for this planet to complete a single rotation on its axis.
     * (Required)
     */
    @JsonProperty("rotation_period")
    @JsonPropertyDescription("The number of standard hours it takes for this planet to complete a single rotation on its axis.")
    private String rotationPeriod;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * the terrain of this planet. Comma-seperated if diverse.
     * (Required)
     */
    @JsonProperty("terrain")
    @JsonPropertyDescription("the terrain of this planet. Comma-seperated if diverse.")
    private String terrain;
    /**
     * A number denoting the gravity of this planet. Where 1 is normal.
     * (Required)
     */
    @JsonProperty("gravity")
    @JsonPropertyDescription("A number denoting the gravity of this planet. Where 1 is normal.")
    private String gravity;
    /**
     * The number of standard days it takes for this planet to complete a single orbit of its local star.
     * (Required)
     */
    @JsonProperty("orbital_period")
    @JsonPropertyDescription("The number of standard days it takes for this planet to complete a single orbit of its local star.")
    private String orbitalPeriod;
    /**
     * An array of Film URL Resources that this planet has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of Film URL Resources that this planet has appeared in.")
    private List<Object> films = null;
    /**
     * An array of People URL Resources that live on this planet.
     * (Required)
     */
    @JsonProperty("residents")
    @JsonPropertyDescription("An array of People URL Resources that live on this planet.")
    private List<Object> residents = null;
    /**
     * The average populationof sentient beings inhabiting this planet.
     * (Required)
     */
    @JsonProperty("population")
    @JsonPropertyDescription("The average populationof sentient beings inhabiting this planet.")
    private String population;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The diameter of this planet in kilometers.
     * (Required)
     */
    @JsonProperty("diameter")
    public String getDiameter() {
        return diameter;
    }

    /**
     * The diameter of this planet in kilometers.
     * (Required)
     */
    @JsonProperty("diameter")
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    /**
     * The climate of this planet. Comma-seperated if diverse.
     * (Required)
     */
    @JsonProperty("climate")
    public String getClimate() {
        return climate;
    }

    /**
     * The climate of this planet. Comma-seperated if diverse.
     * (Required)
     */
    @JsonProperty("climate")
    public void setClimate(String climate) {
        this.climate = climate;
    }

    /**
     * The percentage of the planet surface that is naturally occuring water or bodies of water.
     * (Required)
     */
    @JsonProperty("surface_water")
    public String getSurfaceWater() {
        return surfaceWater;
    }

    /**
     * The percentage of the planet surface that is naturally occuring water or bodies of water.
     * (Required)
     */
    @JsonProperty("surface_water")
    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    /**
     * The name of this planet.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this planet.
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    /**
     * The hypermedia URL of this resource.
     * (Required)
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * The hypermedia URL of this resource.
     * (Required)
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * The number of standard hours it takes for this planet to complete a single rotation on its axis.
     * (Required)
     */
    @JsonProperty("rotation_period")
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    /**
     * The number of standard hours it takes for this planet to complete a single rotation on its axis.
     * (Required)
     */
    @JsonProperty("rotation_period")
    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
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

    /**
     * the terrain of this planet. Comma-seperated if diverse.
     * (Required)
     */
    @JsonProperty("terrain")
    public String getTerrain() {
        return terrain;
    }

    /**
     * the terrain of this planet. Comma-seperated if diverse.
     * (Required)
     */
    @JsonProperty("terrain")
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    /**
     * A number denoting the gravity of this planet. Where 1 is normal.
     * (Required)
     */
    @JsonProperty("gravity")
    public String getGravity() {
        return gravity;
    }

    /**
     * A number denoting the gravity of this planet. Where 1 is normal.
     * (Required)
     */
    @JsonProperty("gravity")
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    /**
     * The number of standard days it takes for this planet to complete a single orbit of its local star.
     * (Required)
     */
    @JsonProperty("orbital_period")
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    /**
     * The number of standard days it takes for this planet to complete a single orbit of its local star.
     * (Required)
     */
    @JsonProperty("orbital_period")
    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    /**
     * An array of Film URL Resources that this planet has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of Film URL Resources that this planet has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * An array of People URL Resources that live on this planet.
     * (Required)
     */
    @JsonProperty("residents")
    public List<Object> getResidents() {
        return residents;
    }

    /**
     * An array of People URL Resources that live on this planet.
     * (Required)
     */
    @JsonProperty("residents")
    public void setResidents(List<Object> residents) {
        this.residents = residents;
    }

    /**
     * The average populationof sentient beings inhabiting this planet.
     * (Required)
     */
    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }

    /**
     * The average populationof sentient beings inhabiting this planet.
     * (Required)
     */
    @JsonProperty("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}