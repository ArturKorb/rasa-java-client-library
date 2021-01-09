package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class UserMessage {

    public static final String SERIALIZED_NAME_SENDER = "sender";
    @SerializedName(SERIALIZED_NAME_SENDER)
    private String sender;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public UserMessage message(String message) {
        this.message = message;
        return this;
    }

    public UserMessage sender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserMessage userMessage = (UserMessage) o;
        return Objects.equals(this.message, userMessage.message) &&
                Objects.equals(this.sender, userMessage.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, sender);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserMessage {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
