package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.transaction.Transaction;

import java.util.List;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class BatchResponse extends WorldPayResponse {

    /**
     * array of transaction objects; contains detailed information about each transaction in the batch, including but not limited to transaction ID and authorization code.
     */
    private List<Transaction> transactions;

    /**
     * @return {@link #transactions}
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions {@link #transactions}
     */
    public void setTransactions(final List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "BatchResponse{" +
                "result=" + getResult() +
                ", responseCode=" + getResponseCode() +
                ", message=" + getMessage() +
                ", transactions=" + transactions +
                '}';
    }

}
