package com.mvpotter.worldpay.client.model;

import com.mvpotter.worldpay.client.model.check.Check;
import com.mvpotter.worldpay.client.model.transaction.TransactionMethod;

import java.util.List;

/**
 * Request to create a payment account.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class PaymentAccount {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * payment account identifier or token.
     */
    private String paymentId;

    /**
     * 	credit card account associated with the payment method.
     */
    private Card card;

    /**
     * checking account associated with the payment method.
     */
    private Check check;

    /**
     * notes associated with the payment account.
     */
    private String notes;

    /**
     * payment method of the payment account.
     */
    private TransactionMethod method;

    /**
     * indicates whether the account is set as the primary account for the associated customer.
     */
    private Boolean primary;

    /**
     * most recent date the payment method was accessed.
     */
    private String lastAccessDate;

    /**
     * custom user-defined fields for reporting purposes.
     */
    private List<UserDefinedField> userDefinedFields;

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
     * @return {@link #paymentId}
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId {@link #paymentId}
     */
    public void setPaymentId(final String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return {@link #card}
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card {@link #card}
     */
    public void setCard(final Card card) {
        this.card = card;
    }

    /**
     * @return {@link #check}
     */
    public Check getCheck() {
        return check;
    }

    /**
     * @param check {@link #check}
     */
    public void setCheck(final Check check) {
        this.check = check;
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
     * @return {@link #method}
     */
    public TransactionMethod getMethod() {
        return method;
    }

    /**
     * @param method {@link #method}
     */
    public void setMethod(final TransactionMethod method) {
        this.method = method;
    }

    /**
     * @return {@link #primary}
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * @param primary {@link #primary}
     */
    public void setPrimary(final Boolean primary) {
        this.primary = primary;
    }

    /**
     * @return {@link #lastAccessDate}
     */
    public String getLastAccessDate() {
        return lastAccessDate;
    }

    /**
     * @param lastAccessDate {@link #lastAccessDate}
     */
    public void setLastAccessDate(final String lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
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
        return "PaymentAccount{" +
                "customerId='" + customerId + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", card=" + card +
                ", check=" + check +
                ", notes='" + notes + '\'' +
                ", method=" + method +
                ", primary=" + primary +
                ", lastAccessDate='" + lastAccessDate + '\'' +
                ", userDefinedFields=" + userDefinedFields +
                '}';
    }

}
