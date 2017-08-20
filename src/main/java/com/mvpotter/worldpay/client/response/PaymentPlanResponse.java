package com.mvpotter.worldpay.client.response;

/**
 * @author mvpotter
 * @since 14/08/2017
 */
public class PaymentPlanResponse extends WorldPayResponse {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the retrieved payment plan.
     */
    private String planId;

    /**
     * details of the retrieved payment plan (if installment).
     */
    private String storedInstallmentPaymentPlan;

    /**
     * details of the retrieved payment plan (if variable).
     */
    private String storedVariablePaymentPlan;

    /**
     * details of the retrieved payment plan (if recurring).
     */
    private String storedRecurringPaymentPlan;

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
    public String getStoredInstallmentPaymentPlan() {
        return storedInstallmentPaymentPlan;
    }

    /**
     * @param storedInstallmentPaymentPlan {@link #storedInstallmentPaymentPlan}
     */
    public void setStoredInstallmentPaymentPlan(final String storedInstallmentPaymentPlan) {
        this.storedInstallmentPaymentPlan = storedInstallmentPaymentPlan;
    }

    /**
     * @return {@link #storedVariablePaymentPlan}
     */
    public String getStoredVariablePaymentPlan() {
        return storedVariablePaymentPlan;
    }

    /**
     * @param storedVariablePaymentPlan {@link #storedVariablePaymentPlan}
     */
    public void setStoredVariablePaymentPlan(final String storedVariablePaymentPlan) {
        this.storedVariablePaymentPlan = storedVariablePaymentPlan;
    }

    /**
     * @return {@link #storedRecurringPaymentPlan}
     */
    public String getStoredRecurringPaymentPlan() {
        return storedRecurringPaymentPlan;
    }

    /**
     * @param storedRecurringPaymentPlan {@link #storedRecurringPaymentPlan}
     */
    public void setStoredRecurringPaymentPlan(final String storedRecurringPaymentPlan) {
        this.storedRecurringPaymentPlan = storedRecurringPaymentPlan;
    }

    @Override
    public String toString() {
        return "PaymentPlanResponse{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", storedInstallmentPaymentPlan='" + storedInstallmentPaymentPlan + '\'' +
                ", storedVariablePaymentPlan='" + storedVariablePaymentPlan + '\'' +
                ", storedRecurringPaymentPlan='" + storedRecurringPaymentPlan + '\'' +
                '}';
    }

}
