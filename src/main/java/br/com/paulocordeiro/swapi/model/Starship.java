package br.com.paulocordeiro.swapi.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Starship
 * <p>
 * A Starship
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "passengers",
        "pilots",
        "name",
        "hyperdrive_rating",
        "url",
        "cargo_capacity",
        "edited",
        "consumables",
        "max_atmosphering_speed",
        "crew",
        "length",
        "MGLT",
        "starship_class",
        "created",
        "films",
        "model",
        "cost_in_credits",
        "manufacturer"
})
@Generated("jsonschema2pojo")
public class Starship {

    /**
     * The number of non-essential people this starship can transport.
     * (Required)
     */
    @JsonProperty("passengers")
    @JsonPropertyDescription("The number of non-essential people this starship can transport.")
    private String passengers;
    /**
     * An array of People URL Resources that this starship has been piloted by.
     * (Required)
     */
    @JsonProperty("pilots")
    @JsonPropertyDescription("An array of People URL Resources that this starship has been piloted by.")
    private List<Object> pilots = null;
    /**
     * The name of this starship. The common name, such as Death Star.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this starship. The common name, such as Death Star.")
    private String name;
    /**
     * The class of this starships hyperdrive.
     * (Required)
     */
    @JsonProperty("hyperdrive_rating")
    @JsonPropertyDescription("The class of this starships hyperdrive.")
    private String hyperdriveRating;
    /**
     * The hypermedia URL of this resource.
     * (Required)
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The hypermedia URL of this resource.")
    private URI url;
    /**
     * The maximum number of kilograms that this starship can transport.
     * (Required)
     */
    @JsonProperty("cargo_capacity")
    @JsonPropertyDescription("The maximum number of kilograms that this starship can transport.")
    private String cargoCapacity;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
     * (Required)
     */
    @JsonProperty("consumables")
    @JsonPropertyDescription("The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.")
    private String consumables;
    /**
     * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
     * (Required)
     */
    @JsonProperty("max_atmosphering_speed")
    @JsonPropertyDescription("The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.")
    private String maxAtmospheringSpeed;
    /**
     * The number of personnel needed to run or pilot this starship.
     * (Required)
     */
    @JsonProperty("crew")
    @JsonPropertyDescription("The number of personnel needed to run or pilot this starship.")
    private String crew;
    /**
     * The length of this starship in meters.
     * (Required)
     */
    @JsonProperty("length")
    @JsonPropertyDescription("The length of this starship in meters.")
    private String length;
    /**
     * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
     * (Required)
     */
    @JsonProperty("MGLT")
    @JsonPropertyDescription("The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.")
    private String mglt;
    /**
     * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
     * (Required)
     */
    @JsonProperty("starship_class")
    @JsonPropertyDescription("The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.")
    private String starshipClass;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * An array of Film URL Resources that this starship has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of Film URL Resources that this starship has appeared in.")
    private List<Object> films = null;
    /**
     * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
     * (Required)
     */
    @JsonProperty("model")
    @JsonPropertyDescription("The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.")
    private String model;
    /**
     * The cost of this starship new, in galactic credits.
     * (Required)
     */
    @JsonProperty("cost_in_credits")
    @JsonPropertyDescription("The cost of this starship new, in galactic credits.")
    private String costInCredits;
    /**
     * The manufacturer of this starship. Comma seperated if more than one.
     * (Required)
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("The manufacturer of this starship. Comma seperated if more than one.")
    private String manufacturer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The number of non-essential people this starship can transport.
     * (Required)
     */
    @JsonProperty("passengers")
    public String getPassengers() {
        return passengers;
    }

    /**
     * The number of non-essential people this starship can transport.
     * (Required)
     */
    @JsonProperty("passengers")
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    /**
     * An array of People URL Resources that this starship has been piloted by.
     * (Required)
     */
    @JsonProperty("pilots")
    public List<Object> getPilots() {
        return pilots;
    }

    /**
     * An array of People URL Resources that this starship has been piloted by.
     * (Required)
     */
    @JsonProperty("pilots")
    public void setPilots(List<Object> pilots) {
        this.pilots = pilots;
    }

    /**
     * The name of this starship. The common name, such as Death Star.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this starship. The common name, such as Death Star.
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The class of this starships hyperdrive.
     * (Required)
     */
    @JsonProperty("hyperdrive_rating")
    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    /**
     * The class of this starships hyperdrive.
     * (Required)
     */
    @JsonProperty("hyperdrive_rating")
    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
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
     * The maximum number of kilograms that this starship can transport.
     * (Required)
     */
    @JsonProperty("cargo_capacity")
    public String getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * The maximum number of kilograms that this starship can transport.
     * (Required)
     */
    @JsonProperty("cargo_capacity")
    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
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
     * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
     * (Required)
     */
    @JsonProperty("consumables")
    public String getConsumables() {
        return consumables;
    }

    /**
     * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
     * (Required)
     */
    @JsonProperty("consumables")
    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    /**
     * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
     * (Required)
     */
    @JsonProperty("max_atmosphering_speed")
    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    /**
     * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
     * (Required)
     */
    @JsonProperty("max_atmosphering_speed")
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    /**
     * The number of personnel needed to run or pilot this starship.
     * (Required)
     */
    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }

    /**
     * The number of personnel needed to run or pilot this starship.
     * (Required)
     */
    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

    /**
     * The length of this starship in meters.
     * (Required)
     */
    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    /**
     * The length of this starship in meters.
     * (Required)
     */
    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
     * (Required)
     */
    @JsonProperty("MGLT")
    public String getMglt() {
        return mglt;
    }

    /**
     * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
     * (Required)
     */
    @JsonProperty("MGLT")
    public void setMglt(String mglt) {
        this.mglt = mglt;
    }

    /**
     * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
     * (Required)
     */
    @JsonProperty("starship_class")
    public String getStarshipClass() {
        return starshipClass;
    }

    /**
     * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
     * (Required)
     */
    @JsonProperty("starship_class")
    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
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
     * An array of Film URL Resources that this starship has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of Film URL Resources that this starship has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
     * (Required)
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
     * (Required)
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The cost of this starship new, in galactic credits.
     * (Required)
     */
    @JsonProperty("cost_in_credits")
    public String getCostInCredits() {
        return costInCredits;
    }

    /**
     * The cost of this starship new, in galactic credits.
     * (Required)
     */
    @JsonProperty("cost_in_credits")
    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    /**
     * The manufacturer of this starship. Comma seperated if more than one.
     * (Required)
     */
    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * The manufacturer of this starship. Comma seperated if more than one.
     * (Required)
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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