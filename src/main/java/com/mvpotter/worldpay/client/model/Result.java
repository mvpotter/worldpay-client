package com.mvpotter.worldpay.client.model;

/**
 * Request result.
 *
 * @author mvpotter
 * @since 06/08/2017
 */
public enum Result {

    SUCCESS,
    COMMUNICATION_ERROR,
    AUTHENTICATION_ERROR,
    DECLINE,
    DECLINE_AVS,
    DECLINE_CVV,
    UNSUPPORTED_CARD,
    INVALID_NAME,
    INVALID_ADDRESS,
    INVALID_CARD_NUMBER,
    INVALID_CVV,
    INVALID_EXPIRATION,
    GATEWAY_ERROR,
    BAD_REQUEST,
    INVALID_ROUTING_NUMBER,
    INVALID_AVS,
    APPROVED

}
