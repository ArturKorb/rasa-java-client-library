package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * BotMessageButtons
 */

public class BotMessageButtons {
    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_PAYLOAD = "payload";
    @SerializedName(SERIALIZED_NAME_PAYLOAD)
    private String payload;


    public BotMessageButtons title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Button caption
     *
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Button caption")

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public BotMessageButtons payload(String payload) {

        this.payload = payload;
        return this;
    }

    /**
     * Payload to be sent if button is clicked
     *
     * @return payload
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Payload to be sent if button is clicked")

    public String getPayload() {
        return payload;
    }


    public void setPayload(String payload) {
        this.payload = payload;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BotMessageButtons botMessageButtons = (BotMessageButtons) o;
        return Objects.equals(this.title, botMessageButtons.title) &&
                Objects.equals(this.payload, botMessageButtons.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, payload);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotMessageButtons {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

