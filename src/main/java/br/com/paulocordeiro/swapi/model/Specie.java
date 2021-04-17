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
 * A species within the Star Wars universe
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "edited",
        "name",
        "classification",
        "people",
        "eye_colors",
        "created",
        "designation",
        "skin_colors",
        "language",
        "url",
        "hair_colors",
        "homeworld",
        "films",
        "average_lifespan",
        "average_height"
})
@Generated("jsonschema2pojo")
public class Specie {

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The name of this species.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this species.")
    private String name;
    /**
     * The classification of this species.
     * (Required)
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("The classification of this species.")
    private String classification;
    /**
     * An array of People URL Resources that are a part of this species.
     * (Required)
     */
    @JsonProperty("people")
    @JsonPropertyDescription("An array of People URL Resources that are a part of this species.")
    private List<Object> people = null;
    /**
     * A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.
     * (Required)
     */
    @JsonProperty("eye_colors")
    @JsonPropertyDescription("A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.")
    private String eyeColors;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * The designation of this species.
     * (Required)
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The designation of this species.")
    private String designation;
    /**
     * A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.
     * (Required)
     */
    @JsonProperty("skin_colors")
    @JsonPropertyDescription("A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.")
    private String skinColors;
    /**
     * The language commonly spoken by this species.
     * (Required)
     */
    @JsonProperty("language")
    @JsonPropertyDescription("The language commonly spoken by this species.")
    private String language;
    /**
     * The hypermedia URL of this resource.
     * (Required)
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The hypermedia URL of this resource.")
    private URI url;
    /**
     * A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.
     * (Required)
     */
    @JsonProperty("hair_colors")
    @JsonPropertyDescription("A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.")
    private String hairColors;
    /**
     * The URL of a planet resource, a planet that this species originates from.
     * (Required)
     */
    @JsonProperty("homeworld")
    @JsonPropertyDescription("The URL of a planet resource, a planet that this species originates from.")
    private String homeworld;
    /**
     * An array of Film URL Resources that this species has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    @JsonPropertyDescription(" An array of Film URL Resources that this species has appeared in.")
    private List<Object> films = null;
    /**
     * The average lifespan of this species in years.
     * (Required)
     */
    @JsonProperty("average_lifespan")
    @JsonPropertyDescription("The average lifespan of this species in years.")
    private String averageLifespan;
    /**
     * The average height of this person in centimeters.
     * (Required)
     */
    @JsonProperty("average_height")
    @JsonPropertyDescription("The average height of this person in centimeters.")
    private String averageHeight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    public Date getEdited() {
        return edited;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     * (Required)
     */
    @JsonProperty("edited")
    public void setEdited(Date edited) {
        this.edited = edited;
    }

    /**
     * The name of this species.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this species.
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The classification of this species.
     * (Required)
     */
    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }

    /**
     * The classification of this species.
     * (Required)
     */
    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * An array of People URL Resources that are a part of this species.
     * (Required)
     */
    @JsonProperty("people")
    public List<Object> getPeople() {
        return people;
    }

    /**
     * An array of People URL Resources that are a part of this species.
     * (Required)
     */
    @JsonProperty("people")
    public void setPeople(List<Object> people) {
        this.people = people;
    }

    /**
     * A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.
     * (Required)
     */
    @JsonProperty("eye_colors")
    public String getEyeColors() {
        return eyeColors;
    }

    /**
     * A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.
     * (Required)
     */
    @JsonProperty("eye_colors")
    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
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
     * The designation of this species.
     * (Required)
     */
    @JsonProperty("designation")
    public String getDesignation() {
        return designation;
    }

    /**
     * The designation of this species.
     * (Required)
     */
    @JsonProperty("designation")
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.
     * (Required)
     */
    @JsonProperty("skin_colors")
    public String getSkinColors() {
        return skinColors;
    }

    /**
     * A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.
     * (Required)
     */
    @JsonProperty("skin_colors")
    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    /**
     * The language commonly spoken by this species.
     * (Required)
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * The language commonly spoken by this species.
     * (Required)
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
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
     * A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.
     * (Required)
     */
    @JsonProperty("hair_colors")
    public String getHairColors() {
        return hairColors;
    }

    /**
     * A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.
     * (Required)
     */
    @JsonProperty("hair_colors")
    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    /**
     * The URL of a planet resource, a planet that this species originates from.
     * (Required)
     */
    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    /**
     * The URL of a planet resource, a planet that this species originates from.
     * (Required)
     */
    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    /**
     * An array of Film URL Resources that this species has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of Film URL Resources that this species has appeared in.
     * (Required)
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The average lifespan of this species in years.
     * (Required)
     */
    @JsonProperty("average_lifespan")
    public String getAverageLifespan() {
        return averageLifespan;
    }

    /**
     * The average lifespan of this species in years.
     * (Required)
     */
    @JsonProperty("average_lifespan")
    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    /**
     * The average height of this person in centimeters.
     * (Required)
     */
    @JsonProperty("average_height")
    public String getAverageHeight() {
        return averageHeight;
    }

    /**
     * The average height of this person in centimeters.
     * (Required)
     */
    @JsonProperty("average_height")
    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
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