package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.EmvResponse;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class AuthorizationResponse extends WorldPayTransactionResponse {

    /**
     * emvResponse values are returned from the card issuer during authorization
     */
    private EmvResponse emvResponse;

    /**
     * @return {@link #emvResponse}
     */
    public EmvResponse getEmvResponse() {
        return emvResponse;
    }

    /**
     * @param emvResponse {@link #emvResponse}
     */
    public void setEmvResponse(final EmvResponse emvResponse) {
        this.emvResponse = emvResponse;
    }

    @Override
    public String toString() {
        return "AuthorizationResponse{" +
                "result=" + getResult() +
                ", responseCode=" + getResponseCode() +
                ", message=" + getMessage() +
                ", transaction=" + getTransaction() +
                ", emvResponse=" + emvResponse +
                '}';
    }

}
