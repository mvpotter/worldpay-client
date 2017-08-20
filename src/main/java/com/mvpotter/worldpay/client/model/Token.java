package com.mvpotter.worldpay.client.model;

/**
 * Vault token.
 *
 * @author mvpotter
 * @since 06/08/2017
 */
public class Token {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * payment method to be used for billing.
     */
    private String paymentMethodId;

    /**
     * Public Key used to identify the mechant.
     */
    private String publicKey;

    /**
     * payment type that is stored or about to be stored in the Vault.
     */
    private String paymentType;

    /**
     * @return {@link #customerId}
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId {@link #customerId}
     */
    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return {@link #paymentMethodId}
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * @param paymentMethodId {@link #paymentMethodId}
     */
    public void setPaymentMethodId(final String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    /**
     * @return {@link #publicKey}
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * @param publicKey {@link #publicKey}
     */
    public void setPublicKey(final String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * @return {@link #paymentType}
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType {@link #paymentType}
     */
    public void setPaymentType(final String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Token{" +
                "customerId='" + customerId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", paymentType=" + paymentType +
                '}';
    }

}
