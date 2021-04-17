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
 * A vehicle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "vehicle_class",
        "passengers",
        "pilots",
        "name",
        "created",
        "url",
        "cargo_capacity",
        "edited",
        "consumables",
        "max_atmosphering_speed",
        "crew",
        "length",
        "films",
        "model",
        "cost_in_credits",
        "manufacturer"
})
@Generated("jsonschema2pojo")
public class Vehicle {

    /**
     * The class of this vehicle, such as Wheeled.
     * (Required)
     */
    @JsonProperty("vehicle_class")
    @JsonPropertyDescription("The class of this vehicle, such as Wheeled.")
    private String vehicleClass;
    /**
     * The number of non-essential people this vehicle can transport.
     * (Required)
     */
    @JsonProperty("passengers")
    @JsonPropertyDescription("The number of non-essential people this vehicle can transport.")
    private String passengers;
    /**
     * An array of People URL Resources that this vehicle has been piloted by.
     * (Required)
     */
    @JsonProperty("pilots")
    @JsonPropertyDescription("An array of People URL Resources that this vehicle has been piloted by.")
    private List<Object> pilots = null;
    /**
     * The name of this vehicle. The common name, such as Sand Crawler.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this vehicle. The common name, such as Sand Crawler.")
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
     * The maximum number of kilograms that this vehicle can transport.
     * (Required)
     */
    @JsonProperty("cargo_capacity")
    @JsonPropertyDescription("The maximum number of kilograms that this vehicle can transport.")
    private String cargoCapacity;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
     * (Required)
     */
    @JsonProperty("consumables")
    @JsonPropertyDescription("The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.")
    private String consumables;
    /**
     * The maximum speed of this vehicle in atmosphere.
     * (Required)
     */
    @JsonProperty("max_atmosphering_speed")
    @JsonPropertyDescription("The maximum speed of this vehicle in atmosphere.")
    private String maxAtmospheringSpeed;
    /**
     * The number of personnel needed to run or pilot this vehicle.
     * (Required)
     */
    @JsonProperty("crew")
    @JsonPropertyDescription("The number of personnel needed to run or pilot this vehicle.")
    private String crew;
    /**
     * The length of this vehicle in meters.
     * (Required)
     */
    @JsonProperty("length")
    @JsonPropertyDescription("The length of this vehicle in meters.")
    private String length;
    /**
     * An array of Film URL Resources that this vehicle has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of Film URL Resources that this vehicle has appeared in.")
    private List<Object> films = null;
    /**
     * The model or official name of this vehicle. Such as All Terrain Attack Transport.
     * (Required)
     */
    @JsonProperty("model")
    @JsonPropertyDescription("The model or official name of this vehicle. Such as All Terrain Attack Transport.")
    private String model;
    /**
     * The cost of this vehicle new, in galactic credits.
     * (Required)
     */
    @JsonProperty("cost_in_credits")
    @JsonPropertyDescription("The cost of this vehicle new, in galactic credits.")
    private String costInCredits;
    /**
     * The manufacturer of this vehicle. Comma seperated if more than one.
     * (Required)
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("The manufacturer of this vehicle. Comma seperated if more than one.")
    private String manufacturer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The class of this vehicle, such as Wheeled.
     * (Required)
     */
    @JsonProperty("vehicle_class")
    public String getVehicleClass() {
        return vehicleClass;
    }

    /**
     * The class of this vehicle, such as Wheeled.
     * (Required)
     */
    @JsonProperty("vehicle_class")
    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    /**
     * The number of non-essential people this vehicle can transport.
     * (Required)
     */
    @JsonProperty("passengers")
    public String getPassengers() {
        return passengers;
    }

    /**
     * The number of non-essential people this vehicle can transport.
     * (Required)
     */
    @JsonProperty("passengers")
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    /**
     * An array of People URL Resources that this vehicle has been piloted by.
     * (Required)
     */
    @JsonProperty("pilots")
    public List<Object> getPilots() {
        return pilots;
    }

    /**
     * An array of People URL Resources that this vehicle has been piloted by.
     * (Required)
     */
    @JsonProperty("pilots")
    public void setPilots(List<Object> pilots) {
        this.pilots = pilots;
    }

    /**
     * The name of this vehicle. The common name, such as Sand Crawler.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this vehicle. The common name, such as Sand Crawler.
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
     * The maximum number of kilograms that this vehicle can transport.
     * (Required)
     */
    @JsonProperty("cargo_capacity")
    public String getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * The maximum number of kilograms that this vehicle can transport.
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
     * The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
     * (Required)
     */
    @JsonProperty("consumables")
    public String getConsumables() {
        return consumables;
    }

    /**
     * The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
     * (Required)
     */
    @JsonProperty("consumables")
    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    /**
     * The maximum speed of this vehicle in atmosphere.
     * (Required)
     */
    @JsonProperty("max_atmosphering_speed")
    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    /**
     * The maximum speed of this vehicle in atmosphere.
     * (Required)
     */
    @JsonProperty("max_atmosphering_speed")
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    /**
     * The number of personnel needed to run or pilot this vehicle.
     * (Required)
     */
    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }

    /**
     * The number of personnel needed to run or pilot this vehicle.
     * (Required)
     */
    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

    /**
     * The length of this vehicle in meters.
     * (Required)
     */
    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    /**
     * The length of this vehicle in meters.
     * (Required)
     */
    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * An array of Film URL Resources that this vehicle has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of Film URL Resources that this vehicle has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The model or official name of this vehicle. Such as All Terrain Attack Transport.
     * (Required)
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * The model or official name of this vehicle. Such as All Terrain Attack Transport.
     * (Required)
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The cost of this vehicle new, in galactic credits.
     * (Required)
     */
    @JsonProperty("cost_in_credits")
    public String getCostInCredits() {
        return costInCredits;
    }

    /**
     * The cost of this vehicle new, in galactic credits.
     * (Required)
     */
    @JsonProperty("cost_in_credits")
    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    /**
     * The manufacturer of this vehicle. Comma seperated if more than one.
     * (Required)
     */
    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * The manufacturer of this vehicle. Comma seperated if more than one.
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