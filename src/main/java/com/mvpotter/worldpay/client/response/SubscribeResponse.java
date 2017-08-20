package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.SubscriptionPlan;

/**
 * Response with subscription details.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class SubscribeResponse extends WorldPayResponse {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the the newly created recurring plan.
     */
    private String planId;

    /**
     * details about the new recurring plan.
     */
    private SubscriptionPlan storedRecurringPaymentPlan;

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
     * @return {@link #storedRecurringPaymentPlan}
     */
    public SubscriptionPlan getStoredRecurringPaymentPlan() {
        return storedRecurringPaymentPlan;
    }

    /**
     * @param storedRecurringPaymentPlan {@link #storedRecurringPaymentPlan}
     */
    public void setStoredRecurringPaymentPlan(final SubscriptionPlan storedRecurringPaymentPlan) {
        this.storedRecurringPaymentPlan = storedRecurringPaymentPlan;
    }

    @Override
    public String toString() {
        return "SubscribeResponse{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", storedRecurringPaymentPlan=" + storedRecurringPaymentPlan +
                '}';
    }

}
