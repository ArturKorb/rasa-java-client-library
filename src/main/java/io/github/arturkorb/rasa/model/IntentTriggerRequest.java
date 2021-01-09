package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * IntentTriggerRequest
 */

public class IntentTriggerRequest {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ENTITIES = "entities";
    @SerializedName(SERIALIZED_NAME_ENTITIES)
    private Object entities;


    public IntentTriggerRequest name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Name of the intent to be executed.
     *
     * @return name
     **/
    @ApiModelProperty(example = "greet", required = true, value = "Name of the intent to be executed.")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public IntentTriggerRequest entities(Object entities) {

        this.entities = entities;
        return this;
    }

    /**
     * Entities to be passed on.
     *
     * @return entities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "{\"temperature\":\"high\"}", value = "Entities to be passed on.")

    public Object getEntities() {
        return entities;
    }


    public void setEntities(Object entities) {
        this.entities = entities;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntentTriggerRequest intentTriggerRequest = (IntentTriggerRequest) o;
        return Objects.equals(this.name, intentTriggerRequest.name) &&
                Objects.equals(this.entities, intentTriggerRequest.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, entities);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntentTriggerRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

