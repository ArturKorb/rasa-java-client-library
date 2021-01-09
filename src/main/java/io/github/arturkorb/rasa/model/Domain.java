package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;


/**
 * The bot&#39;s domain.
 */
@ApiModel(description = "The bot's domain.")

public class Domain {
    public static final String SERIALIZED_NAME_CONFIG = "io/github/arturkorb/client";
    @SerializedName(SERIALIZED_NAME_CONFIG)
    private DomainConfig config;

    public static final String SERIALIZED_NAME_INTENTS = "intents";
    @SerializedName(SERIALIZED_NAME_INTENTS)
    private List<Map<String, Object>> intents = null;

    public static final String SERIALIZED_NAME_ENTITIES = "entities";
    @SerializedName(SERIALIZED_NAME_ENTITIES)
    private List<String> entities = null;

    public static final String SERIALIZED_NAME_SLOTS = "slots";
    @SerializedName(SERIALIZED_NAME_SLOTS)
    private Map<String, SlotDescription> slots = null;

    public static final String SERIALIZED_NAME_RESPONSES = "responses";
    @SerializedName(SERIALIZED_NAME_RESPONSES)
    private Map<String, Object> responses = null;

    public static final String SERIALIZED_NAME_ACTIONS = "actions";
    @SerializedName(SERIALIZED_NAME_ACTIONS)
    private List<String> actions = null;


    public Domain config(DomainConfig config) {

        this.config = config;
        return this;
    }

    /**
     * Get config
     *
     * @return config
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public DomainConfig getConfig() {
        return config;
    }


    public void setConfig(DomainConfig config) {
        this.config = config;
    }


    public Domain intents(List<Map<String, Object>> intents) {

        this.intents = intents;
        return this;
    }

    public Domain addIntentsItem(Map<String, Object> intentsItem) {
        if (this.intents == null) {
            this.intents = new ArrayList<Map<String, Object>>();
        }
        this.intents.add(intentsItem);
        return this;
    }

    /**
     * All intent names and properties
     *
     * @return intents
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "All intent names and properties")

    public List<Map<String, Object>> getIntents() {
        return intents;
    }


    public void setIntents(List<Map<String, Object>> intents) {
        this.intents = intents;
    }


    public Domain entities(List<String> entities) {

        this.entities = entities;
        return this;
    }

    public Domain addEntitiesItem(String entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<String>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    /**
     * All entity names
     *
     * @return entities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"person\",\"location\"]", value = "All entity names")

    public List<String> getEntities() {
        return entities;
    }


    public void setEntities(List<String> entities) {
        this.entities = entities;
    }


    public Domain slots(Map<String, SlotDescription> slots) {

        this.slots = slots;
        return this;
    }

    public Domain putSlotsItem(String key, SlotDescription slotsItem) {
        if (this.slots == null) {
            this.slots = new HashMap<String, SlotDescription>();
        }
        this.slots.put(key, slotsItem);
        return this;
    }

    /**
     * Slot names and configuration
     *
     * @return slots
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Slot names and configuration")

    public Map<String, SlotDescription> getSlots() {
        return slots;
    }


    public void setSlots(Map<String, SlotDescription> slots) {
        this.slots = slots;
    }


    public Domain responses(Map<String, Object> responses) {

        this.responses = responses;
        return this;
    }

    public Domain putResponsesItem(String key, TemplateDescription responsesItem) {
        if (this.responses == null) {
            this.responses = new HashMap<String, Object>();
        }
        this.responses.put(key, responsesItem);
        return this;
    }

    /**
     * Bot response templates
     *
     * @return responses
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Bot response templates")

    public Map<String, Object> getResponses() {
        return responses;
    }


    public void setResponses(Map<String, Object> responses) {
        this.responses = responses;
    }


    public Domain actions(List<String> actions) {

        this.actions = actions;
        return this;
    }

    public Domain addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<String>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Available action names
     *
     * @return actions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"action_greet\",\"action_goodbye\",\"action_listen\"]", value = "Available action names")

    public List<String> getActions() {
        return actions;
    }


    public void setActions(List<String> actions) {
        this.actions = actions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Domain domain = (Domain) o;
        return Objects.equals(this.config, domain.config) &&
                Objects.equals(this.intents, domain.intents) &&
                Objects.equals(this.entities, domain.entities) &&
                Objects.equals(this.slots, domain.slots) &&
                Objects.equals(this.responses, domain.responses) &&
                Objects.equals(this.actions, domain.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, intents, entities, slots, responses, actions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Domain {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

