package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Objects;

/**
 * SlotDescription
 */

public class SlotDescription {
    public static final String SERIALIZED_NAME_AUTO_FILL = "auto_fill";
    @SerializedName(SERIALIZED_NAME_AUTO_FILL)
    private Boolean autoFill;

    public static final String SERIALIZED_NAME_INITIAL_VALUE = "initial_value";
    @SerializedName(SERIALIZED_NAME_INITIAL_VALUE)
    private String initialValue;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_VALUES = "values";
    @SerializedName(SERIALIZED_NAME_VALUES)
    private SlotValue values = null;


    public SlotDescription autoFill(Boolean autoFill) {

        this.autoFill = autoFill;
        return this;
    }

    /**
     * Get autoFill
     *
     * @return autoFill
     **/
    @ApiModelProperty(required = true, value = "")

    public Boolean getAutoFill() {
        return autoFill;
    }


    public void setAutoFill(Boolean autoFill) {
        this.autoFill = autoFill;
    }


    public SlotDescription initialValue(String initialValue) {

        this.initialValue = initialValue;
        return this;
    }

    /**
     * Get initialValue
     *
     * @return initialValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getInitialValue() {
        return initialValue;
    }


    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue;
    }


    public SlotDescription type(String type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public SlotDescription values(SlotValue values) {

        this.values = values;
        return this;
    }

    public SlotDescription addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new SlotValue();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<String> getValues() {
        return values;
    }


    public void setValues(SlotValue values) {
        this.values = values;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotDescription slotDescription = (SlotDescription) o;
        return Objects.equals(this.autoFill, slotDescription.autoFill) &&
                Objects.equals(this.initialValue, slotDescription.initialValue) &&
                Objects.equals(this.type, slotDescription.type) &&
                Objects.equals(this.values, slotDescription.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoFill, initialValue, type, values);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotDescription {\n");
        sb.append("    autoFill: ").append(toIndentedString(autoFill)).append("\n");
        sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

