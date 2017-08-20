package com.mvpotter.worldpay.client.request;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class RefundRequest extends WorldPayRequest {

    /**
     * identifier for the transaction to be refunded.
     */
    private String transactionId;

    /**
     * client-generated unique ID for the transaction, used as a way to prevent the processing of duplicate transactions. The orderId must be unique to the merchant's SecureNet ID; however, uniqueness is only evaluated for APPROVED transactions and only for the last 30 days. If a transaction is declined, the corresponding orderId may be used again.<br>
     * <br>
     * The orderId is limited to 25 characters; e.g., “CUSTOMERID MMddyyyyHHmmss”.
     */
    private String orderId;

    /**
     * 	amount to be refunded; needed only if the refund amount is less than the original authorization amount.
     */
    private Double amount;

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

    @Override
    public String toString() {
        return "RefundRequest{" +
                "transactionId='" + transactionId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                '}';
    }

}
