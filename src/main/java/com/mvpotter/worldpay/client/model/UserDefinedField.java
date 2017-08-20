package com.mvpotter.worldpay.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class UserDefinedField {

    /**
     * valid values are udf1 to udf50.
     */
    @JsonProperty("udfName")
    private String name;

    /**
     * value of the udf specified in udfName.
     */
    @JsonProperty("udfValue")
    private String value;

    /**
     * @return {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * @param name {@link #name}
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return {@link #value}
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value {@link #value}
     */
    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UserDefinedField{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
