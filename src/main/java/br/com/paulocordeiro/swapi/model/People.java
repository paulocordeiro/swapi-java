package br.com.paulocordeiro.swapi.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * People
 * <p>
 * A person within the Star Wars universe
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "starships",
        "edited",
        "name",
        "created",
        "url",
        "gender",
        "vehicles",
        "skin_color",
        "hair_color",
        "height",
        "eye_color",
        "mass",
        "films",
        "species",
        "homeworld",
        "birth_year"
})
@Generated("jsonschema2pojo")
public class People {

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     */
    @JsonProperty("starships")
    @JsonPropertyDescription("An array of starship resources that this person has piloted")
    private List<Object> starships = null;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The name of this person.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this person.")
    private String name;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * The url of this resource
     * (Required)
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The url of this resource")
    private URI url;
    /**
     * The gender of this person (if known).
     * (Required)
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The gender of this person (if known).")
    private String gender;
    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     */
    @JsonProperty("vehicles")
    @JsonPropertyDescription("An array of vehicle resources that this person has piloted")
    private List<Object> vehicles = null;
    /**
     * The skin color of this person.
     * (Required)
     */
    @JsonProperty("skin_color")
    @JsonPropertyDescription("The skin color of this person.")
    private String skinColor;
    /**
     * The hair color of this person.
     * (Required)
     */
    @JsonProperty("hair_color")
    @JsonPropertyDescription("The hair color of this person.")
    private String hairColor;
    /**
     * The height of this person in meters.
     * (Required)
     */
    @JsonProperty("height")
    @JsonPropertyDescription("The height of this person in meters.")
    private String height;
    /**
     * The eye color of this person.
     * (Required)
     */
    @JsonProperty("eye_color")
    @JsonPropertyDescription("The eye color of this person.")
    private String eyeColor;
    /**
     * The mass of this person in kilograms.
     * (Required)
     */
    @JsonProperty("mass")
    @JsonPropertyDescription("The mass of this person in kilograms.")
    private String mass;
    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of urls of film resources that this person has been in.")
    private List<Object> films = null;
    /**
     * The url of the species resource that this person is.
     * (Required)
     */
    @JsonProperty("species")
    @JsonPropertyDescription("The url of the species resource that this person is.")
    private List<Object> species = null;
    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     */
    @JsonProperty("homeworld")
    @JsonPropertyDescription("The url of the planet resource that this person was born on.")
    private String homeworld;
    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     */
    @JsonProperty("birth_year")
    @JsonPropertyDescription("The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).")
    private String birthYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     */
    @JsonProperty("starships")
    public List<Object> getStarships() {
        return starships;
    }

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     */
    @JsonProperty("starships")
    public void setStarships(List<Object> starships) {
        this.starships = starships;
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
     * The name of this person.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this person.
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

    /**
     * The gender of this person (if known).
     * (Required)
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     */
    @JsonProperty("vehicles")
    public List<Object> getVehicles() {
        return vehicles;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     */
    @JsonProperty("vehicles")
    public void setVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * The skin color of this person.
     * (Required)
     */
    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    /**
     * The skin color of this person.
     * (Required)
     */
    @JsonProperty("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    /**
     * The hair color of this person.
     * (Required)
     */
    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    /**
     * The hair color of this person.
     * (Required)
     */
    @JsonProperty("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * The height of this person in meters.
     * (Required)
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    /**
     * The height of this person in meters.
     * (Required)
     */
    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * The eye color of this person.
     * (Required)
     */
    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * The eye color of this person.
     * (Required)
     */
    @JsonProperty("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     */
    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     */
    @JsonProperty("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     */
    @JsonProperty("species")
    public List<Object> getSpecies() {
        return species;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     */
    @JsonProperty("species")
    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     */
    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     */
    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     */
    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     */
    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
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