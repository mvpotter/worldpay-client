package com.mvpotter.worldpay.client.request;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.mvpotter.worldpay.client.model.Customer;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class CustomerRequest extends WorldPayRequest {

    @JsonUnwrapped
    private Customer customer;

    /**
     * @return {@link #customer}
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer {@link #customer}
     */
    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "customer=" + customer +
                '}';
    }

}
