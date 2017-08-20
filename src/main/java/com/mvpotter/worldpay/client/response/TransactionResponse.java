package com.mvpotter.worldpay.client.response;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class TransactionResponse extends WorldPayTransactionResponse {

    /**
     * 	contains the updated ip address of the customer.
     */
    private String ipAddress;

    /**
     * @return {@link #ipAddress}
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress {@link #ipAddress}
     */
    public void setIpAddress(final String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "TransactionResponse{" +
                "ipAddress='" + ipAddress + '\'' +
                '}';
    }

}
