package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class SettlementData {

    /**
     * date and time when the transaction took place.
     */
    private String date;

    /**
     * amount of the transaction.
     */
    private double amount;

    /**
     * identifier for the batch that the transaction belongs to.
     */
    private String batchId;

    /**
     * @return {@link #date}
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date {@link #date}
     */
    public void setDate(final String date) {
        this.date = date;
    }

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
     * @return {@link #batchId}
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId {@link #batchId}
     */
    public void setBatchId(final String batchId) {
        this.batchId = batchId;
    }

    @Override
    public String toString() {
        return "SettlementData{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                ", batchId='" + batchId + '\'' +
                '}';
    }

}
