package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.VariablePlan;

/**
 * Response with variable payment plan details.
 *
 * @author mvpotter
 * @since 14/08/2017
 */
public class VariablePlanResponse extends WorldPayResponse {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the the newly created variable payment plan.
     */
    private String planId;

    /**
     * details about the new variable payment plan.
     */
    private VariablePlan storedVariablePaymentPlan;

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
     * @return {@link #storedVariablePaymentPlan}
     */
    public VariablePlan getStoredVariablePaymentPlan() {
        return storedVariablePaymentPlan;
    }

    /**
     * @param storedVariablePaymentPlan {@link #storedVariablePaymentPlan}
     */
    public void setStoredVariablePaymentPlan(final VariablePlan storedVariablePaymentPlan) {
        this.storedVariablePaymentPlan = storedVariablePaymentPlan;
    }

    @Override
    public String toString() {
        return "SubscribeResponse{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", storedVariablePaymentPlan=" + storedVariablePaymentPlan +
                '}';
    }

}
