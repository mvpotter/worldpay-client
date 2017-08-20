package com.mvpotter.worldpay.client.model;

import java.util.List;

/**
 * Customer information.
 *
 * @author mvpotter
 * @since 06/08/2017
 */
public class VaultCustomer {

    private String customerId;
    private List<SubscriptionPlan> recurringPaymentPlans;
    private List<PaymentAccount> paymentMethods;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public List<SubscriptionPlan> getRecurringPaymentPlans() {
        return recurringPaymentPlans;
    }

    public void setRecurringPaymentPlans(final List<SubscriptionPlan> recurringPaymentPlans) {
        this.recurringPaymentPlans = recurringPaymentPlans;
    }

    public List<PaymentAccount> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(final List<PaymentAccount> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public String toString() {
        return "VaultCustomer { " +
                "customerId = '" + customerId + '\'' +
                ", recurringPaymentPlans = " + recurringPaymentPlans +
                ", paymentMethods = " + paymentMethods +
                " } ";
    }

}
