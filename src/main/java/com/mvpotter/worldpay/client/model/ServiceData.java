package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class ServiceData {

    /**
     * tip amount.
     */
    private Double gratuityAmount;

    /**
     * server number (used in restaurant transactions).
     */
    private String server;

    /**
     * @return {@link #gratuityAmount}
     */
    public Double getGratuityAmount() {
        return gratuityAmount;
    }

    /**
     * @param gratuityAmount {@link #gratuityAmount}
     */
    public void setGratuityAmount(final Double gratuityAmount) {
        this.gratuityAmount = gratuityAmount;
    }

    /**
     * @return {@link #server}
     */
    public String getServer() {
        return server;
    }

    /**
     * @param server {@link #server}
     */
    public void setServer(final String server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return "ServiceData{" +
                "gratuityAmount=" + gratuityAmount +
                ", server='" + server + '\'' +
                '}';
    }

}
