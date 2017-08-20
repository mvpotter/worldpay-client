package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.ExtendedInformation;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class VoidRequest extends WorldPayRequest {

    /**
     * identifier for the transaction to be voided.
     */
    private String transactionId;

    /**
     * indicates whether the void is merchant generated or system generated. Valid values for this parameter are:<br>
     * <br>
     * 1 - Merchant Generated<br>
     * 2 - System Generated
     */
    private Integer voidType;

    /**
     * amount to be voided. A PARTIAL_VOID will be performed if the amount is lower than the authorized amount.
     */
    private Double amount;

    /**
     * client-generated unique ID for each transaction, used as a way to prevent the processing of duplicate transactions. The orderId must be unique to the merchant's SecureNet ID; however, uniqueness is only evaluated for APPROVED transactions and only for the last 30 days. If a transaction is declined, the corresponding orderId may be used again.<br>
     * <br>
     * The orderId is limited to 25 characters; e.g., “CUSTOMERID MMddyyyyHHmmss”.
     */
    private String orderId;

    /**
     * additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information.
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
     * @return {@link #voidType}
     */
    public Integer getVoidType() {
        return voidType;
    }

    /**
     * @param voidType {@link #voidType}
     */
    public void setVoidType(final Integer voidType) {
        this.voidType = voidType;
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
     * @return {@link #orderId}
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId {@link #orderId}
     */
    public void setOrderId(final String orderId) {
        this.orderId = orderId;
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
        return "VoidRequest{" +
                "transactionId='" + transactionId + '\'' +
                ", voidType=" + voidType +
                ", amount=" + amount +
                ", orderId='" + orderId + '\'' +
                ", extendedInformation=" + extendedInformation +
                '}';
    }

}
