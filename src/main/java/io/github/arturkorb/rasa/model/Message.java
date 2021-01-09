package io.github.arturkorb.rasa.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;


/**
 * Message
 */

public class Message {
    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    /**
     * Origin of the message - who sent it
     */
    @JsonAdapter(SenderEnum.Adapter.class)
    public enum SenderEnum {
        USER("user");

        private String value;

        SenderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SenderEnum fromValue(String value) {
            for (SenderEnum b : SenderEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SenderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SenderEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SenderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SenderEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SENDER = "sender";
    @SerializedName(SERIALIZED_NAME_SENDER)
    private SenderEnum sender;

    public static final String SERIALIZED_NAME_PARSE_DATA = "parse_data";
    @SerializedName(SERIALIZED_NAME_PARSE_DATA)
    private ParseResult parseData;


    public Message text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Message text
     *
     * @return text
     **/
    @ApiModelProperty(example = "Hello!", required = true, value = "Message text")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public Message sender(SenderEnum sender) {

        this.sender = sender;
        return this;
    }

    /**
     * Origin of the message - who sent it
     *
     * @return sender
     **/
    @ApiModelProperty(example = "user", required = true, value = "Origin of the message - who sent it")

    public SenderEnum getSender() {
        return sender;
    }


    public void setSender(SenderEnum sender) {
        this.sender = sender;
    }


    public Message parseData(ParseResult parseData) {

        this.parseData = parseData;
        return this;
    }

    /**
     * Get parseData
     *
     * @return parseData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public ParseResult getParseData() {
        return parseData;
    }


    public void setParseData(ParseResult parseData) {
        this.parseData = parseData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(this.text, message.text) &&
                Objects.equals(this.sender, message.sender) &&
                Objects.equals(this.parseData, message.parseData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, sender, parseData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Message {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    parseData: ").append(toIndentedString(parseData)).append("\n");
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

