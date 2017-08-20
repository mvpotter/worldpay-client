package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 14/08/2017
 */
public class Schedule {

    /**
     * amount of the scheduled payment.
     */
    private double amount;

    /**
     * scheduled date of the payment.
     */
    private String scheduledDate;

    /**
     * number of times to retry if the payment is declined.
     */
    private Integer numberOfRetries;

    /**
     * indicates whether the payment has been made.
     */
    private Boolean paid;

    /**
     * date of the completed payment.
     */
    private String paymentDate;

    /**
     * payment method to be charged.
     */
    private String paymentMethodId;

    /**
     * payment plan identifier.
     */
    private String planId;

    /**
     * indicates whether the payment has been processed.
     */
    private String processed;

    /**
     * schedule ID for the payment.
     */
    private String scheduleId;

    /**
     * transaction ID of the completed payment.
     */
    private String transactionId;

    /**
     * @return {@link #amount}
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount {@link #amount}
     */
    public void setAmount(final double amount) {
        this.amount = amount;
    }

    /**
     * @return {@link #scheduledDate}
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    /**
     * @param scheduledDate {@link #scheduledDate}
     */
    public void setScheduledDate(final String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    /**
     * @return {@link #numberOfRetries}
     */
    public Integer getNumberOfRetries() {
        return numberOfRetries;
    }

    /**
     * @param numberOfRetries {@link #numberOfRetries}
     */
    public void setNumberOfRetries(final Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
    }

    /**
     * @return {@link #paid}
     */
    public Boolean getPaid() {
        return paid;
    }

    /**
     * @param paid {@link #paid}
     */
    public void setPaid(final Boolean paid) {
        this.paid = paid;
    }

    /**
     * @return {@link #paymentDate}
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate {@link #paymentDate}
     */
    public void setPaymentDate(final String paymentDate) {
        this.paymentDate = paymentDate;
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
     * @return {@link #planId}
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId {@link #planId}
     */
    public void setPlanId(final String planId) {
        this.planId = planId;
    }

    /**
     * @return {@link #processed}
     */
    public String getProcessed() {
        return processed;
    }

    /**
     * @param processed {@link #processed}
     */
    public void setProcessed(final String processed) {
        this.processed = processed;
    }

    /**
     * @return {@link #scheduleId}
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * @param scheduleId {@link #scheduleId}
     */
    public void setScheduleId(final String scheduleId) {
        this.scheduleId = scheduleId;
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

    @Override
    public String toString() {
        return "Schedule{" +
                "amount=" + amount +
                ", scheduledDate='" + scheduledDate + '\'' +
                ", numberOfRetries=" + numberOfRetries +
                ", paid=" + paid +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", planId='" + planId + '\'' +
                ", processed='" + processed + '\'' +
                ", scheduleId='" + scheduleId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

}
