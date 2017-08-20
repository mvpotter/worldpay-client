package com.mvpotter.worldpay.client.model.transaction;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public enum TransactionMethod {

    CC("Credit Card"),
    DB("Debit"),
    ECHECK("Electronic Check"),
    CHECK21("Electronic check"),
    PD("Pinless Debit"),
    SV("Stored Value");

    /**
     * Method description.
     */
    private String description;

    TransactionMethod(final String description) {
        this.description = description;
    }

    /**
     * @return {@link #description}
     */
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TransactionMethod{" +
                "description='" + description + '\'' +
                '}';
    }

}
