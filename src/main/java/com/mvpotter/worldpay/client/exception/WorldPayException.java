package com.mvpotter.worldpay.client.exception;

import com.mvpotter.worldpay.client.response.WorldPayResponse;

/**
 * @author mvpotter
 * @since 06/08/2017
 */
public class WorldPayException extends RuntimeException {

    private final WorldPayResponse response;

    public WorldPayException(final WorldPayResponse response) {
        super(response.getMessage());
        this.response = response;
    }

    public WorldPayResponse getResponse() {
        return response;
    }

}
