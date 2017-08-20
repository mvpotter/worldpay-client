package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.Result;

/**
 * General Worldpay response.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class WorldPayResponse {

    public static final String APPROVED = "1";
    public static final String DECLINED = "2";
    public static final String ERROR = "3";

    /**
     * result of the method call.
     */
    private Result result;

    /**
     * Response code for a transaction. Values are:<br>
     * <br>
     * 1 - Approved<br>
     * 2 - Declined<br>
     * 3 - Error<br>
     */
    private String responseCode;

    /**
     * text description of the response.
     */
    private String message;

    public WorldPayResponse() {
    }

    /**
     * Constructor.
     *
     * @param result {@link #result}
     * @param responseCode {@link #responseCode}
     * @param message {@link #message}
     */
    public WorldPayResponse(final Result result, final String responseCode, final String message) {
        this.result = result;
        this.responseCode = responseCode;
        this.message = message;
    }

    /**
     * @return {@link #result}
     */
    public Result getResult() {
        return result;
    }

    /**
     * @param result {@link #result}
     */
    public void setResult(final Result result) {
        this.result = result;
    }

    /**
     * @return {@link #responseCode}
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode {@link #responseCode}
     */
    public void setResponseCode(final String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return {@link #message}
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message {@link #message}
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WorldPayResponse{" +
                "result=" + result +
                ", responseCode='" + responseCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
