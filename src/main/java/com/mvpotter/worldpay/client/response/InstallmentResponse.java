package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.InstallmentPlan;

/**
 * Response with installment payment details.
 *
 * @author mvpotter
 * @since 14/08/2017
 */
public class InstallmentResponse extends WorldPayResponse {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the the newly created installment payment plan.
     */
    private String planId;

    /**
     * details about the new installment payment plan.
     */
    private InstallmentPlan storedInstallmentPaymentPlan;

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
     * @return {@link #storedInstallmentPaymentPlan}
     */
    public InstallmentPlan getStoredInstallmentPaymentPlan() {
        return storedInstallmentPaymentPlan;
    }

    /**
     * @param storedInstallmentPaymentPlan {@link #storedInstallmentPaymentPlan}
     */
    public void setStoredInstallmentPaymentPlan(final InstallmentPlan storedInstallmentPaymentPlan) {
        this.storedInstallmentPaymentPlan = storedInstallmentPaymentPlan;
    }

    @Override
    public String toString() {
        return "SubscribeResponse{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", storedInstallmentPaymentPlan=" + storedInstallmentPaymentPlan +
                '}';
    }

}
