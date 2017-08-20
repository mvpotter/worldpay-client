package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.ExtendedInformation;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class CaptureRequest extends WorldPayRequest {

    /**
     * identifier of the previously authorized transaction to be captured.
     */
    private String transactionId;

    /**
     * final amount of the transaction.
     */
    private Double amount;

    /**
     *
     additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information. If a gratuity is to be added to the previously authorized amount, it can be sent in the serviceData object field.
     */
    private ExtendedInformation extendedInformation;

    /**
     * @return {@link #transactionId}
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId {@link #transactionId}
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

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
        return "CaptureRequest{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", extendedInformation=" + extendedInformation +
                '}';
    }

}
