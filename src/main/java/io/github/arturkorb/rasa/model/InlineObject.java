package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * InlineObject
 */

public class InlineObject {
    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
    @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
    private String messageId;


    public InlineObject text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Message to be parsed
     *
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Hello, I am Rasa!", value = "Message to be parsed")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public InlineObject messageId(String messageId) {

        this.messageId = messageId;
        return this;
    }

    /**
     * Optional ID for message to be parsed
     *
     * @return messageId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "b2831e73-1407-4ba0-a861-0f30a42a2a5a", value = "Optional ID for message to be parsed")

    public String getMessageId() {
        return messageId;
    }


    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineObject inlineObject = (InlineObject) o;
        return Objects.equals(this.text, inlineObject.text) &&
                Objects.equals(this.messageId, inlineObject.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, messageId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineObject {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

