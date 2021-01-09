package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entity prediction errors which was made during testing
 */
@ApiModel(description = "Entity prediction errors which was made during testing")

public class EntityTestError implements TestError {
    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_ENTITIES = "entities";
    @SerializedName(SERIALIZED_NAME_ENTITIES)
    private List<Entity> entities = null;

    public static final String SERIALIZED_NAME_PREDICTED_ENTITIES = "predicted_entities";
    @SerializedName(SERIALIZED_NAME_PREDICTED_ENTITIES)
    private List<Entity> predictedEntities = null;


    public EntityTestError text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Test message
     *
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "what is the weather in zurich?", value = "Test message")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public EntityTestError entities(List<Entity> entities) {

        this.entities = entities;
        return this;
    }

    public EntityTestError addEntitiesItem(Entity entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<Entity>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    /**
     * Expected entities
     *
     * @return entities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Expected entities")

    public List<Entity> getEntities() {
        return entities;
    }


    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }


    public EntityTestError predictedEntities(List<Entity> predictedEntities) {

        this.predictedEntities = predictedEntities;
        return this;
    }

    public EntityTestError addPredictedEntitiesItem(Entity predictedEntitiesItem) {
        if (this.predictedEntities == null) {
            this.predictedEntities = new ArrayList<Entity>();
        }
        this.predictedEntities.add(predictedEntitiesItem);
        return this;
    }

    /**
     * Predicted entities
     *
     * @return predictedEntities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Predicted entities")

    public List<Entity> getPredictedEntities() {
        return predictedEntities;
    }


    public void setPredictedEntities(List<Entity> predictedEntities) {
        this.predictedEntities = predictedEntities;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityTestError entityTestError = (EntityTestError) o;
        return Objects.equals(this.text, entityTestError.text) &&
                Objects.equals(this.entities, entityTestError.entities) &&
                Objects.equals(this.predictedEntities, entityTestError.predictedEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, entities, predictedEntities);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityTestError {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    predictedEntities: ").append(toIndentedString(predictedEntities)).append("\n");
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

