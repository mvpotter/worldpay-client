package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.Card;
import com.mvpotter.worldpay.client.model.ExtendedInformation;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class VerifyRequest extends WorldPayRequest {

    /**
     * final amount of the transaction.
     */
    private Double amount;

    /**
     * credit-card-specific data. Required for credit card transactions.
     */
    private Card card;

    /**
     *
     additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information. If a gratuity is to be added to the previously authorized amount, it can be sent in the serviceData object field.
     */
    private ExtendedInformation extendedInformation;

    /**
     * @return {@link #amount}
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount {@link #amount}
     */
    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    /**
     * @return {@link #card}
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card {@link #card}
     */
    public void setCard(final Card card) {
        this.card = card;
    }

    /**
     * @return {@link #extendedInformation}
     */
    public ExtendedInformation getExtendedInformation() {
        return extendedInformation;
    }

    /**
     * @param extendedInformation {@link #extendedInformation}
     */
    public void setExtendedInformation(final ExtendedInformation extendedInformation) {
        this.extendedInformation = extendedInformation;
    }

    @Override
    public String toString() {
        return "VerifyRequest{" +
                "amount=" + amount +
                ", card=" + card +
                ", extendedInformation=" + extendedInformation +
                '}';
    }

}
