package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.*;

/**
 * Conversation tracker which stores the conversation state.
 */
@ApiModel(description = "Conversation tracker which stores the conversation state.")

public class Tracker {
    public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
    @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
    private String conversationId;

    public static final String SERIALIZED_NAME_SLOTS = "slots";
    @SerializedName(SERIALIZED_NAME_SLOTS)
    private Map<String, SlotDescription> slots = null;

    public static final String SERIALIZED_NAME_LATEST_MESSAGE = "latest_message";
    @SerializedName(SERIALIZED_NAME_LATEST_MESSAGE)
    private ParseResult latestMessage;

    public static final String SERIALIZED_NAME_LATEST_EVENT_TIME = "latest_event_time";
    @SerializedName(SERIALIZED_NAME_LATEST_EVENT_TIME)
    private BigDecimal latestEventTime;

    public static final String SERIALIZED_NAME_FOLLOWUP_ACTION = "followup_action";
    @SerializedName(SERIALIZED_NAME_FOLLOWUP_ACTION)
    private String followupAction;

    public static final String SERIALIZED_NAME_PAUSED = "paused";
    @SerializedName(SERIALIZED_NAME_PAUSED)
    private Boolean paused;

    public static final String SERIALIZED_NAME_EVENTS = "events";
    @SerializedName(SERIALIZED_NAME_EVENTS)
    private List<Event> events = null;

    public static final String SERIALIZED_NAME_LATEST_INPUT_CHANNEL = "latest_input_channel";
    @SerializedName(SERIALIZED_NAME_LATEST_INPUT_CHANNEL)
    private String latestInputChannel;

    public static final String SERIALIZED_NAME_LATEST_ACTION_NAME = "latest_action_name";
    @SerializedName(SERIALIZED_NAME_LATEST_ACTION_NAME)
    private String latestActionName;

    public static final String SERIALIZED_NAME_LATEST_ACTION = "latest_action";
    @SerializedName(SERIALIZED_NAME_LATEST_ACTION)
    private LatestAction latestAction;

    public static final String SERIALIZED_NAME_ACTIVE_LOOP = "active_loop";
    @SerializedName(SERIALIZED_NAME_ACTIVE_LOOP)
    private TrackerActiveLoop activeLoop;


    public Tracker conversationId(String conversationId) {

        this.conversationId = conversationId;
        return this;
    }

    /**
     * ID of the conversation
     *
     * @return conversationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "default", value = "ID of the conversation")

    public String getConversationId() {
        return conversationId;
    }


    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }


    public Tracker slots(Map<String, SlotDescription> slots) {

        this.slots = slots;
        return this;
    }

    public Tracker addSlotsItem(SlotDescription slotsItem) {
        if (this.slots == null) {
            this.slots = new HashMap<>();
        }
        this.slots.put(SERIALIZED_NAME_SLOTS, slotsItem);
        return this;
    }

    /**
     * Slot values
     *
     * @return slots
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Slot values")

    public Map<String, SlotDescription> getSlots() {
        return slots;
    }


    public void setSlots(Map<String, SlotDescription> slots) {
        this.slots = slots;
    }


    public Tracker latestMessage(ParseResult latestMessage) {

        this.latestMessage = latestMessage;
        return this;
    }

    /**
     * Get latestMessage
     *
     * @return latestMessage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public ParseResult getLatestMessage() {
        return latestMessage;
    }


    public void setLatestMessage(ParseResult latestMessage) {
        this.latestMessage = latestMessage;
    }


    public Tracker latestEventTime(BigDecimal latestEventTime) {

        this.latestEventTime = latestEventTime;
        return this;
    }

    /**
     * Most recent event time
     *
     * @return latestEventTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1537645578.314389", value = "Most recent event time")

    public BigDecimal getLatestEventTime() {
        return latestEventTime;
    }


    public void setLatestEventTime(BigDecimal latestEventTime) {
        this.latestEventTime = latestEventTime;
    }


    public Tracker followupAction(String followupAction) {

        this.followupAction = followupAction;
        return this;
    }

    /**
     * Deterministic scheduled next action
     *
     * @return followupAction
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deterministic scheduled next action")

    public String getFollowupAction() {
        return followupAction;
    }


    public void setFollowupAction(String followupAction) {
        this.followupAction = followupAction;
    }


    public Tracker paused(Boolean paused) {

        this.paused = paused;
        return this;
    }

    /**
     * Bot is paused
     *
     * @return paused
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Bot is paused")

    public Boolean getPaused() {
        return paused;
    }


    public void setPaused(Boolean paused) {
        this.paused = paused;
    }


    public Tracker events(List<Event> events) {

        this.events = events;
        return this;
    }

    public Tracker addEventsItem(Event eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<Event>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Event history
     *
     * @return events
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Event history")

    public List<Event> getEvents() {
        return events;
    }


    public void setEvents(List<Event> events) {
        this.events = events;
    }


    public Tracker latestInputChannel(String latestInputChannel) {

        this.latestInputChannel = latestInputChannel;
        return this;
    }

    /**
     * Communication channel
     *
     * @return latestInputChannel
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "rest", value = "Communication channel")

    public String getLatestInputChannel() {
        return latestInputChannel;
    }


    public void setLatestInputChannel(String latestInputChannel) {
        this.latestInputChannel = latestInputChannel;
    }


    public Tracker latestActionName(String latestActionName) {

        this.latestActionName = latestActionName;
        return this;
    }

    /**
     * Name of last bot action
     *
     * @return latestActionName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "action_listen", value = "Name of last bot action")

    public String getLatestActionName() {
        return latestActionName;
    }


    public void setLatestActionName(String latestActionName) {
        this.latestActionName = latestActionName;
    }


    public Tracker latestAction(LatestAction latestAction) {

        this.latestAction = latestAction;
        return this;
    }

    /**
     * Get latestAction
     *
     * @return latestAction
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public LatestAction getLatestAction() {
        return latestAction;
    }


    public void setLatestAction(LatestAction latestAction) {
        this.latestAction = latestAction;
    }


    public Tracker activeLoop(TrackerActiveLoop activeLoop) {

        this.activeLoop = activeLoop;
        return this;
    }

    /**
     * Get activeLoop
     *
     * @return activeLoop
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public TrackerActiveLoop getActiveLoop() {
        return activeLoop;
    }


    public void setActiveLoop(TrackerActiveLoop activeLoop) {
        this.activeLoop = activeLoop;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracker tracker = (Tracker) o;
        return Objects.equals(this.conversationId, tracker.conversationId) &&
                Objects.equals(this.slots, tracker.slots) &&
                Objects.equals(this.latestMessage, tracker.latestMessage) &&
                Objects.equals(this.latestEventTime, tracker.latestEventTime) &&
                Objects.equals(this.followupAction, tracker.followupAction) &&
                Objects.equals(this.paused, tracker.paused) &&
                Objects.equals(this.events, tracker.events) &&
                Objects.equals(this.latestInputChannel, tracker.latestInputChannel) &&
                Objects.equals(this.latestActionName, tracker.latestActionName) &&
                Objects.equals(this.latestAction, tracker.latestAction) &&
                Objects.equals(this.activeLoop, tracker.activeLoop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversationId, slots, latestMessage, latestEventTime, followupAction, paused, events, latestInputChannel, latestActionName, latestAction, activeLoop);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tracker {\n");
        sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
        sb.append("    latestMessage: ").append(toIndentedString(latestMessage)).append("\n");
        sb.append("    latestEventTime: ").append(toIndentedString(latestEventTime)).append("\n");
        sb.append("    followupAction: ").append(toIndentedString(followupAction)).append("\n");
        sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    latestInputChannel: ").append(toIndentedString(latestInputChannel)).append("\n");
        sb.append("    latestActionName: ").append(toIndentedString(latestActionName)).append("\n");
        sb.append("    latestAction: ").append(toIndentedString(latestAction)).append("\n");
        sb.append("    activeLoop: ").append(toIndentedString(activeLoop)).append("\n");
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

