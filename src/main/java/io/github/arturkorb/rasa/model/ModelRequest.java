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
 * ModelRequest
 */

public class ModelRequest {
    public static final String SERIALIZED_NAME_MODEL_FILE = "model_file";
    @SerializedName(SERIALIZED_NAME_MODEL_FILE)
    private String modelFile;

    public static final String SERIALIZED_NAME_MODEL_SERVER = "model_server";
    @SerializedName(SERIALIZED_NAME_MODEL_SERVER)
    private EndpointConfig modelServer;

    /**
     * Name of remote storage system
     */
    @JsonAdapter(RemoteStorageEnum.Adapter.class)
    public enum RemoteStorageEnum {
        AWS("aws"),

        GCS("gcs"),

        AZURE("azure");

        private String value;

        RemoteStorageEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RemoteStorageEnum fromValue(String value) {
            for (RemoteStorageEnum b : RemoteStorageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<RemoteStorageEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RemoteStorageEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RemoteStorageEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RemoteStorageEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_REMOTE_STORAGE = "remote_storage";
    @SerializedName(SERIALIZED_NAME_REMOTE_STORAGE)
    private RemoteStorageEnum remoteStorage;


    public ModelRequest modelFile(String modelFile) {

        this.modelFile = modelFile;
        return this;
    }

    /**
     * Path to model file
     *
     * @return modelFile
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "/models/20190512.tar.gz", value = "Path to model file")

    public String getModelFile() {
        return modelFile;
    }


    public void setModelFile(String modelFile) {
        this.modelFile = modelFile;
    }


    public ModelRequest modelServer(EndpointConfig modelServer) {

        this.modelServer = modelServer;
        return this;
    }

    /**
     * Get modelServer
     *
     * @return modelServer
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public EndpointConfig getModelServer() {
        return modelServer;
    }


    public void setModelServer(EndpointConfig modelServer) {
        this.modelServer = modelServer;
    }


    public ModelRequest remoteStorage(RemoteStorageEnum remoteStorage) {

        this.remoteStorage = remoteStorage;
        return this;
    }

    /**
     * Name of remote storage system
     *
     * @return remoteStorage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "aws", value = "Name of remote storage system")

    public RemoteStorageEnum getRemoteStorage() {
        return remoteStorage;
    }


    public void setRemoteStorage(RemoteStorageEnum remoteStorage) {
        this.remoteStorage = remoteStorage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelRequest modelRequest = (ModelRequest) o;
        return Objects.equals(this.modelFile, modelRequest.modelFile) &&
                Objects.equals(this.modelServer, modelRequest.modelServer) &&
                Objects.equals(this.remoteStorage, modelRequest.remoteStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelFile, modelServer, remoteStorage);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelRequest {\n");
        sb.append("    modelFile: ").append(toIndentedString(modelFile)).append("\n");
        sb.append("    modelServer: ").append(toIndentedString(modelServer)).append("\n");
        sb.append("    remoteStorage: ").append(toIndentedString(remoteStorage)).append("\n");
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

