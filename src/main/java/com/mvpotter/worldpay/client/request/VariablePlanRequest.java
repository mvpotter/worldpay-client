package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.VariablePlan;

/**
 * Request to create a payment variable plan.
 *
 * @author mvpotter
 * @since 14/08/2017
 */
public class VariablePlanRequest extends WorldPayRequest {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the recurring plan to be updated.
     */
    private String planId;

    /**
     * details of the variable plan to be updated.
     */
    private VariablePlan plan;

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
    public VariablePlan getPlan() {
        return plan;
    }

    /**
     * @param plan {@link #plan}
     */
    public void setPlan(final VariablePlan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "InstallmentRequest{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", plan=" + plan +
                '}';
    }

}
