package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * BotMessage
 */

public class BotMessage {
    public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
    @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
    private String recipientId;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_IMAGE = "image";
    @SerializedName(SERIALIZED_NAME_IMAGE)
    private String image;

    public static final String SERIALIZED_NAME_BUTTONS = "buttons";
    @SerializedName(SERIALIZED_NAME_BUTTONS)
    private List<BotMessageButtons> buttons = null;

    public static final String SERIALIZED_NAME_ATTACHEMENT = "attachement";
    @SerializedName(SERIALIZED_NAME_ATTACHEMENT)
    private List<BotMessageAttachement> attachement = null;


    public BotMessage recipientId(String recipientId) {

        this.recipientId = recipientId;
        return this;
    }

    /**
     * Id of the message receiver
     *
     * @return recipientId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Id of the message receiver")

    public String getRecipientId() {
        return recipientId;
    }


    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    public BotMessage text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Message
     *
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Message")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public BotMessage image(String image) {

        this.image = image;
        return this;
    }

    /**
     * Image URL
     *
     * @return image
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Image URL")

    public String getImage() {
        return image;
    }


    public void setImage(String image) {
        this.image = image;
    }


    public BotMessage buttons(List<BotMessageButtons> buttons) {

        this.buttons = buttons;
        return this;
    }

    public BotMessage addButtonsItem(BotMessageButtons buttonsItem) {
        if (this.buttons == null) {
            this.buttons = new ArrayList<BotMessageButtons>();
        }
        this.buttons.add(buttonsItem);
        return this;
    }

    /**
     * Quick reply buttons
     *
     * @return buttons
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Quick reply buttons")

    public List<BotMessageButtons> getButtons() {
        return buttons;
    }


    public void setButtons(List<BotMessageButtons> buttons) {
        this.buttons = buttons;
    }


    public BotMessage attachement(List<BotMessageAttachement> attachement) {

        this.attachement = attachement;
        return this;
    }

    public BotMessage addAttachementItem(BotMessageAttachement attachementItem) {
        if (this.attachement == null) {
            this.attachement = new ArrayList<BotMessageAttachement>();
        }
        this.attachement.add(attachementItem);
        return this;
    }

    /**
     * Additional information
     *
     * @return attachement
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Additional information")

    public List<BotMessageAttachement> getAttachement() {
        return attachement;
    }


    public void setAttachement(List<BotMessageAttachement> attachement) {
        this.attachement = attachement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BotMessage botMessage = (BotMessage) o;
        return Objects.equals(this.recipientId, botMessage.recipientId) &&
                Objects.equals(this.text, botMessage.text) &&
                Objects.equals(this.image, botMessage.image) &&
                Objects.equals(this.buttons, botMessage.buttons) &&
                Objects.equals(this.attachement, botMessage.attachement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientId, text, image, buttons, attachement);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotMessage {\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
        sb.append("    attachement: ").append(toIndentedString(attachement)).append("\n");
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

