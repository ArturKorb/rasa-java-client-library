package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Event
 */

public class Event {
    public static final String SERIALIZED_NAME_EVENT = "event";
    @SerializedName(SERIALIZED_NAME_EVENT)
    private String event;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    private BigDecimal timestamp;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;


    public Event event(String event) {

        this.event = event;
        return this;
    }

    /**
     * Event name
     *
     * @return event
     **/
    @ApiModelProperty(example = "slot", required = true, value = "Event name")

    public String getEvent() {
        return event;
    }


    public void setEvent(String event) {
        this.event = event;
    }


    public Event timestamp(BigDecimal timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * Time of application
     *
     * @return timestamp
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1559744410", value = "Time of application")

    public BigDecimal getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.event, event.event) && Objects.equals(this.value, event.value) &&
                Objects.equals(this.text, event.text) && Objects.equals(this.name, event.name) &&
                Objects.equals(this.timestamp, event.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, timestamp, value, name, text);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

