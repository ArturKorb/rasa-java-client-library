package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Entities within a message
 */
@ApiModel(description = "Entities within a message")

public class Entity {
    public static final String SERIALIZED_NAME_START = "start";
    @SerializedName(SERIALIZED_NAME_START)
    private Integer start;

    public static final String SERIALIZED_NAME_END = "end";
    @SerializedName(SERIALIZED_NAME_END)
    private Integer end;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_ENTITY = "entity";
    @SerializedName(SERIALIZED_NAME_ENTITY)
    private String entity;

    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    private BigDecimal confidence;


    public Entity start(Integer start) {

        this.start = start;
        return this;
    }

    /**
     * Char offset of the start
     *
     * @return start
     **/
    @ApiModelProperty(required = true, value = "Char offset of the start")

    public Integer getStart() {
        return start;
    }


    public void setStart(Integer start) {
        this.start = start;
    }


    public Entity end(Integer end) {

        this.end = end;
        return this;
    }

    /**
     * Char offset of the end
     *
     * @return end
     **/
    @ApiModelProperty(required = true, value = "Char offset of the end")

    public Integer getEnd() {
        return end;
    }


    public void setEnd(Integer end) {
        this.end = end;
    }


    public Entity value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Found value for entity
     *
     * @return value
     **/
    @ApiModelProperty(required = true, value = "Found value for entity")

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public Entity entity(String entity) {

        this.entity = entity;
        return this;
    }

    /**
     * Type of the entity
     *
     * @return entity
     **/
    @ApiModelProperty(required = true, value = "Type of the entity")

    public String getEntity() {
        return entity;
    }


    public void setEntity(String entity) {
        this.entity = entity;
    }


    public Entity confidence(BigDecimal confidence) {

        this.confidence = confidence;
        return this;
    }

    /**
     * Get confidence
     *
     * @return confidence
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public BigDecimal getConfidence() {
        return confidence;
    }


    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entity entity = (Entity) o;
        return Objects.equals(this.start, entity.start) &&
                Objects.equals(this.end, entity.end) &&
                Objects.equals(this.value, entity.value) &&
                Objects.equals(this.entity, entity.entity) &&
                Objects.equals(this.confidence, entity.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, value, entity, confidence);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entity {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

