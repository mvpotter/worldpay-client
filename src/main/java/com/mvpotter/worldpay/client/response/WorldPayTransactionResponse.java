package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.transaction.Transaction;

/**
 * General Worldpay response.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class WorldPayTransactionResponse extends WorldPayResponse {

    /**
     * detailed information about the transaction, including but not limited to: transaction id; authorization code; avs result code; and cvv result code.
     */
    private Transaction transaction;

    /**
     * @return {@link #transaction}
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * @param transaction {@link #transaction}
     */
    public void setTransaction(final Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "WorldPayTransactionResponse{" +
                "result=" + getResult() +
                ", responseCode=" + getResponseCode() +
                ", message=" + getMessage() +
                ", transaction=" + transaction +
                '}';
    }

}
