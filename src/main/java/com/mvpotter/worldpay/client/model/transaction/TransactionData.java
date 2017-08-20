package com.mvpotter.worldpay.client.model.transaction;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class TransactionData {

    /**
     * date and time when the transaction took place.
     */
    private String date;

    /**
     * amount of the transaction.
     */
    private double amount;

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

    @Override
    public String toString() {
        return "TransactionData{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }

}
