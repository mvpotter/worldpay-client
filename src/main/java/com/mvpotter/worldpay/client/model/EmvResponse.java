package com.mvpotter.worldpay.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * УmvResponse values are returned from the card issuer during authorization
 *
 * @author mvpotter
 * @since 12/08/2017
 */
public class EmvResponse {

    /**
     * Code that defines the disposition of a message.
     */
    @JsonProperty("emvauthresponsecode")
    private String authResponsecode;

    /**
     * Data sent to the ICC for online issuer authentication.
     */
    @JsonProperty("issuerauthenticationdata")
    private String issuerAuthenticationData;

    /**
     * Indicates the result of the terminal script processing.
     */
    private String issuerScriptResult;

    /**
     * Contains proprietary issuer data for transmission to the ICC before the second GENERATE AC command.
     */
    @JsonProperty("issuerscripttemplate1")
    private String issuerscripttemplate1;

    /**
     * Contains proprietary issuer data for transmission to the ICC after the second GENERATE AC command.
     */
    @JsonProperty("issuerscripttemplate2")
    private String issuerscripttemplate2;

    /**
     * @return {@link #authResponsecode}
     */
    public String getAuthResponsecode() {
        return authResponsecode;
    }

    /**
     * @param authResponsecode {@link #authResponsecode}
     */
    public void setAuthResponsecode(final String authResponsecode) {
        this.authResponsecode = authResponsecode;
    }

    /**
     * @return {@link #issuerAuthenticationData}
     */
    public String getIssuerAuthenticationData() {
        return issuerAuthenticationData;
    }

    /**
     * @param issuerAuthenticationData {@link #issuerAuthenticationData}
     */
    public void setIssuerAuthenticationData(final String issuerAuthenticationData) {
        this.issuerAuthenticationData = issuerAuthenticationData;
    }

    /**
     * @return {@link #issuerScriptResult}
     */
    public String getIssuerScriptResult() {
        return issuerScriptResult;
    }

    /**
     * @param issuerScriptResult {@link #issuerScriptResult}
     */
    public void setIssuerScriptResult(final String issuerScriptResult) {
        this.issuerScriptResult = issuerScriptResult;
    }

    /**
     * @return {@link #issuerscripttemplate1}
     */
    public String getIssuerscripttemplate1() {
        return issuerscripttemplate1;
    }

    /**
     * @param issuerscripttemplate1 {@link #issuerscripttemplate1}
     */
    public void setIssuerscripttemplate1(final String issuerscripttemplate1) {
        this.issuerscripttemplate1 = issuerscripttemplate1;
    }

    /**
     * @return {@link #issuerscripttemplate2}
     */
    public String getIssuerscripttemplate2() {
        return issuerscripttemplate2;
    }

    /**
     * @param issuerscripttemplate2 {@link #issuerscripttemplate2}
     */
    public void setIssuerscripttemplate2(final String issuerscripttemplate2) {
        this.issuerscripttemplate2 = issuerscripttemplate2;
    }

    @Override
    public String toString() {
        return "EmvResponse{" +
                "authResponsecode='" + authResponsecode + '\'' +
                ", issuerAuthenticationData='" + issuerAuthenticationData + '\'' +
                ", issuerScriptResult='" + issuerScriptResult + '\'' +
                ", issuerscripttemplate1='" + issuerscripttemplate1 + '\'' +
                ", issuerscripttemplate2='" + issuerscripttemplate2 + '\'' +
                '}';
    }

}

