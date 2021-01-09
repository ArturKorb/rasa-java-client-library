package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Addional option
 */
@ApiModel(description = "Addional option")

public class DomainConfig {
    public static final String SERIALIZED_NAME_STORE_ENTITIES_AS_SLOTS = "store_entities_as_slots";
    @SerializedName(SERIALIZED_NAME_STORE_ENTITIES_AS_SLOTS)
    private Boolean storeEntitiesAsSlots;


    public DomainConfig storeEntitiesAsSlots(Boolean storeEntitiesAsSlots) {

        this.storeEntitiesAsSlots = storeEntitiesAsSlots;
        return this;
    }

    /**
     * Store all entites as slot when found
     *
     * @return storeEntitiesAsSlots
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Store all entites as slot when found")

    public Boolean getStoreEntitiesAsSlots() {
        return storeEntitiesAsSlots;
    }


    public void setStoreEntitiesAsSlots(Boolean storeEntitiesAsSlots) {
        this.storeEntitiesAsSlots = storeEntitiesAsSlots;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainConfig domainConfig = (DomainConfig) o;
        return Objects.equals(this.storeEntitiesAsSlots, domainConfig.storeEntitiesAsSlots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeEntitiesAsSlots);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainConfig {\n");
        sb.append("    storeEntitiesAsSlots: ").append(toIndentedString(storeEntitiesAsSlots)).append("\n");
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

