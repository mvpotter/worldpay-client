package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.SubscriptionPlan;

/**
 * Request to create a payment subscription.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class SubscribeRequest extends WorldPayRequest {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the recurring plan to be updated.
     */
    private String planId;

    /**
     * details of the recurring plan to be updated.
     */
    private SubscriptionPlan plan;

    public SubscribeRequest(final String customerId, final SubscriptionPlan plan) {
        this.customerId = customerId;
        this.plan = plan;
    }

    public SubscribeRequest(final String customerId, final String planId, final SubscriptionPlan plan) {
        this.customerId = customerId;
        this.planId = planId;
        this.plan = plan;
    }

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
     * @return {@link #plan}
     */
    public SubscriptionPlan getPlan() {
        return plan;
    }

    /**
     * @param plan {@link #plan}
     */
    public void setPlan(final SubscriptionPlan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "SubscribeRequest{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", plan=" + plan +
                '}';
    }

}
