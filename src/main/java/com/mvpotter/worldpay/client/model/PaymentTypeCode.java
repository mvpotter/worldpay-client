package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public enum PaymentTypeCode {

    ACH("Check"),
    DB("PIN Debit"),
    PD("Pinless Debit"),
    VI("VISA"),
    MC("MasterCard"),
    AX("American Express"),
    DS("Discover"),
    MCF("MasterCard Fleet"),
    VIF("VISA Fleet"),
    WX("Wex"),
    VY("Voyager"),
    SV("Stored Value");

    private String description;

    PaymentTypeCode(final String description) {
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
        return "PaymentTypeCode{" +
                "description='" + description + '\'' +
                '}';
    }

}
