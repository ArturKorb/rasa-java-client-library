package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InlineResponse2002
 */

public class InlineResponse202 {
    public static final String SERIALIZED_NAME_TRACKER = "tracker";
    @SerializedName(SERIALIZED_NAME_TRACKER)
    private Tracker tracker;

    public static final String SERIALIZED_NAME_MESSAGES = "messages";
    @SerializedName(SERIALIZED_NAME_MESSAGES)
    private List<BotMessage> messages = null;


    public InlineResponse202 tracker(Tracker tracker) {

        this.tracker = tracker;
        return this;
    }

    /**
     * Get tracker
     *
     * @return tracker
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Tracker getTracker() {
        return tracker;
    }


    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }


    public InlineResponse202 messages(List<BotMessage> messages) {

        this.messages = messages;
        return this;
    }

    public InlineResponse202 addMessagesItem(BotMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<BotMessage>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * Get messages
     *
     * @return messages
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<BotMessage> getMessages() {
        return messages;
    }


    public void setMessages(List<BotMessage> messages) {
        this.messages = messages;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse202 inlineResponse202 = (InlineResponse202) o;
        return Objects.equals(this.tracker, inlineResponse202.tracker) &&
                Objects.equals(this.messages, inlineResponse202.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracker, messages);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2002 {\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

