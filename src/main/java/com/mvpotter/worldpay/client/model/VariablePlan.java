package com.mvpotter.worldpay.client.model;

import java.util.List;

/**
 * Payment installment plan.
 *
 * @author mvpotter
 * @since 14/08/2017
 */
public class VariablePlan extends InstallmentPlan {

    /**
     * scheduled payments.
     */
    private List<Schedule> scheduledPayments;

    /**
     * @return {@link #scheduledPayments}
     */
    public List<Schedule> getScheduledPayments() {
        return scheduledPayments;
    }

    /**
     * @param scheduledPayments {@link #scheduledPayments}
     */
    public void setScheduledPayments(final List<Schedule> scheduledPayments) {
        this.scheduledPayments = scheduledPayments;
    }

    @Override
    public String toString() {
        return "VariablePlan{" +
                "scheduledPayments=" + scheduledPayments +
                '}';
    }

}