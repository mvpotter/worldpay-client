package com.mvpotter.worldpay.client.model;

import java.util.List;

/**
 * Payment subscription plan.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class SubscriptionPlan {

    /**
     * amount to be billed under the plan.
     */
    private double amount;

    /**
     * time unit of billing cycle.
     */
    private CycleType cycleType;

    /**
     * day of the month on which the plan is set to bill.
     */
    private int dayOfTheMonth;

    /**
     * day of the week on which the plan is set to bill.
     */
    private int dayOfTheWeek;

    /**
     * month the plan is set to bill.
     */
    private int month;

    /**
     * frequency (in terms of cycles) with which to bill the account. Valid values are:<br>
     * <br>
     * If cycleType = MONTHLY: 1 - 11 (e.g., 2 = every 2 months <br>
     * if cycleType = WEEKLY: 1 - 51 (e.g., 6 = every 6 weeks)<br>
     * <br>
     * For cycleType = QUARTERLY, SEMI_ANNUALLY and ANNUALLY, frequency is set to 1 automatically.
     */
    private int frequency;

    /**
     * plan end date.
     */
    private String endDate;

    /**
     * sets the Plan Active or Inactive
     */
    private Boolean active;

    /**
     * notes associated with the plan.
     */
    private String notes;

    /**
     * displays a description in addition to the merchants DBA.
     */
    private String softDescriptor;

    /**
     * 	displays a 4 characters dynamic merchant category code.
     */
    private String dynamicMCC;

    /**
     * plan identifier. Auto-generated by the system and given to the merchant when the plan is added.
     */
    private String planId;

    /**
     * plan start date.
     */
    private String startDate;

    /**
     * next scheduled payment date.
     */
    private String nextPaymentDate;

    /**
     * number of times to retry billing if payment is declined.
     */
    private Integer maxRetries;

    /**
     * primary payment method to be used for billing.
     */
    private String primaryPaymentMethodId;

    /**
     * secondary payment method to be used for billing.
     */
    private String secondaryPaymentMethodId;

    /**
     * custom user-defined fields tied to the plan, which can be used for reporting.
     */
    private List<UserDefinedField> userDefinedFields;

    public SubscriptionPlan() {
    }

    public SubscriptionPlan(final CycleType cycleType, final double amount, final String primaryPaymentMethodId,
                            final String startDate, final int dayOfTheMonth, final int frequency,
                            final boolean active) {
        this.cycleType = cycleType;
        this.amount = amount;
        this.primaryPaymentMethodId = primaryPaymentMethodId;
        this.startDate = startDate;
        this.dayOfTheMonth = dayOfTheMonth;
        this.frequency = frequency;
        this.active = active;
    }

    /**
     * @return {@link #amount}
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount {@link #amount}
     */
    public void setAmount(final double amount) {
        this.amount = amount;
    }

    /**
     * @return {@link #cycleType}
     */
    public CycleType getCycleType() {
        return cycleType;
    }

    /**
     * @param cycleType {@link #cycleType}
     */
    public void setCycleType(final CycleType cycleType) {
        this.cycleType = cycleType;
    }

    /**
     * @return {@link #dayOfTheMonth}
     */
    public int getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    /**
     * @param dayOfTheMonth {@link #dayOfTheMonth}
     */
    public void setDayOfTheMonth(final int dayOfTheMonth) {
        this.dayOfTheMonth = dayOfTheMonth;
    }

    /**
     * @return {@link #dayOfTheWeek}
     */
    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    /**
     * @param dayOfTheWeek {@link #dayOfTheWeek}
     */
    public void setDayOfTheWeek(final int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    /**
     * @return {@link #month}
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month {@link #month}
     */
    public void setMonth(final int month) {
        this.month = month;
    }

    /**
     * @return {@link #frequency}
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * @param frequency {@link #frequency}
     */
    public void setFrequency(final int frequency) {
        this.frequency = frequency;
    }

    /**
     * @return {@link #endDate}
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate {@link #endDate}
     */
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return {@link #active}
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active {@link #active}
     */
    public void setActive(final Boolean active) {
        this.active = active;
    }

    /**
     * @return {@link #notes}
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes {@link #notes}
     */
    public void setNotes(final String notes) {
        this.notes = notes;
    }

    /**
     * @return {@link #softDescriptor}
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * @param softDescriptor {@link #softDescriptor}
     */
    public void setSoftDescriptor(final String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    /**
     * @return {@link #dynamicMCC}
     */
    public String getDynamicMCC() {
        return dynamicMCC;
    }

    /**
     * @param dynamicMCC {@link #dynamicMCC}
     */
    public void setDynamicMCC(final String dynamicMCC) {
        this.dynamicMCC = dynamicMCC;
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
     * @return {@link #startDate}
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate {@link #startDate}
     */
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return {@link #nextPaymentDate}
     */
    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * @param nextPaymentDate {@link #nextPaymentDate}
     */
    public void setNextPaymentDate(final String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    /**
     * @return {@link #maxRetries}
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    /**
     * @param maxRetries {@link #maxRetries}
     */
    public void setMaxRetries(final Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * @return {@link #primaryPaymentMethodId}
     */
    public String getPrimaryPaymentMethodId() {
        return primaryPaymentMethodId;
    }

    /**
     * @param primaryPaymentMethodId {@link #primaryPaymentMethodId}
     */
    public void setPrimaryPaymentMethodId(final String primaryPaymentMethodId) {
        this.primaryPaymentMethodId = primaryPaymentMethodId;
    }

    /**
     * @return {@link #secondaryPaymentMethodId}
     */
    public String getSecondaryPaymentMethodId() {
        return secondaryPaymentMethodId;
    }

    /**
     * @param secondaryPaymentMethodId {@link #secondaryPaymentMethodId}
     */
    public void setSecondaryPaymentMethodId(final String secondaryPaymentMethodId) {
        this.secondaryPaymentMethodId = secondaryPaymentMethodId;
    }

    /**
     * @return {@link #userDefinedFields}
     */
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    /**
     * @param userDefinedFields {@link #userDefinedFields}
     */
    public void setUserDefinedFields(final List<UserDefinedField> userDefinedFields) {
        this.userDefinedFields = userDefinedFields;
    }

    @Override
    public String toString() {
        return "SubscriptionPlan{" +
                "amount=" + amount +
                ", cycleType=" + cycleType +
                ", dayOfTheMonth=" + dayOfTheMonth +
                ", dayOfTheWeek=" + dayOfTheWeek +
                ", month=" + month +
                ", frequency=" + frequency +
                ", endDate='" + endDate + '\'' +
                ", active=" + active +
                ", notes='" + notes + '\'' +
                ", softDescriptor='" + softDescriptor + '\'' +
                ", dynamicMCC='" + dynamicMCC + '\'' +
                ", planId='" + planId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", nextPaymentDate='" + nextPaymentDate + '\'' +
                ", maxRetries=" + maxRetries +
                ", primaryPaymentMethodId='" + primaryPaymentMethodId + '\'' +
                ", secondaryPaymentMethodId='" + secondaryPaymentMethodId + '\'' +
                ", userDefinedFields=" + userDefinedFields +
                '}';
    }

}