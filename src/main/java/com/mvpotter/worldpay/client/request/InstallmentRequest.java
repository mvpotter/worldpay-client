package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.InstallmentPlan;
import com.mvpotter.worldpay.client.model.Schedule;

/**
 * Request to create a payment installment.
 *
 * @author mvpotter
 * @since 14/08/2017
 */
public class InstallmentRequest extends WorldPayRequest {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * identifier for the recurring plan to be updated.
     */
    private String planId;

    /**
     * details of the installment plan to be updated.
     */
    private InstallmentPlan plan;

    /**
     * Action Code is used to determine if the update is for Plan or for a particular Schedule.
     * Action Code is defaulted to 0 by default. When updating a schedule,
     * Schedule object needs to be passed and no changes should be made to the Plan.<br>
     * <br>
     * Action Code = 0 : To update the Plan.<br>
     * Action Code = 1 : To Update a Schedule.<br>
     * <br>
     * Only one schedule can be updated at a time.
     */
    private Integer actionCode;

    /**
     * Schedule information that needs to be updated, updates one individual payment, not the entire plan.
     * The Schedule object should only be passed when actionCode = 1.
     */
    private Schedule schedule;

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
    public InstallmentPlan getPlan() {
        return plan;
    }

    /**
     * @param plan {@link #plan}
     */
    public void setPlan(final InstallmentPlan plan) {
        this.plan = plan;
    }

    /**
     * @return {@link #actionCode}
     */
    public Integer getActionCode() {
        return actionCode;
    }

    /**
     * @param actionCode {@link #actionCode}
     */
    public void setActionCode(final Integer actionCode) {
        this.actionCode = actionCode;
    }

    /**
     * @return {@link #schedule}
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * @param schedule {@link #schedule}
     */
    public void setSchedule(final Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "InstallmentRequest{" +
                "customerId='" + customerId + '\'' +
                ", planId='" + planId + '\'' +
                ", plan=" + plan +
                ", actionCode=" + actionCode +
                ", schedule=" + schedule +
                '}';
    }

}
