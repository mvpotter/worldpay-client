package com.mvpotter.worldpay.client.request;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class TransactionSearchRequest extends WorldPayRequest {

    /**
     * start date for a date range search. Required if search criteria specified is customerId or amount.
     */
    private String startDate;

    /**
     * 	end date for a date range search. Required if search criteria specified is customerId or amount.
     */
    private String endDate;

    /**
     * identifier for the transaction to be retrieved.
     */
    private String transactionId;

    /**
     * client-generated unique ID for each transaction, used as a way to prevent the processing of duplicate transactions.
     */
    private String orderId;

    /**
     * transaction amount.
     */
    private Double amount;

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * @return {@link #startDate}
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate {@link #startDate}
     */
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return {@link #endDate}
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate {@link #endDate}
     */
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }

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

    @Override
    public String toString() {
        return "TransactionSearchRequest{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", customerId='" + customerId + '\'' +
                '}';
    }

}
