package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.Card;
import com.mvpotter.worldpay.client.model.UserDefinedField;
import com.mvpotter.worldpay.client.model.check.Check;

import java.util.List;

/**
 * Request to create a payment account.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class PaymentAccountRequest extends WorldPayRequest {

    /**
     * identifier for the customer whose payment method is being added.
     */
    private String customerId;

    /**
     * credit-card-specific data for a card-based payment method. Track data and security code information will not be stored in the Vault due to PCI regulations.
     */
    private Card card;

    /**
     * check-specific data for a check-based payment method.
     */
    private Check check;

    /**
     * unique identifier (per customer), which can be used with customerId to reference the payment method.
     */
    private String paymentMethodId;

    /**
     * notes associated with the payment method.
     */
    private String notes;

    /**
     * phone number of the customer.
     */
    private String phone;

    /**
     * indicates whether this payment method is to be the primary account for the customer. If there is no primary payment method currently associated with the customer, this will default to true; otherwise it will default to false.
     */
    private Boolean primary = true;

    /**
     * custom user-defined fields tied to the plan, which can be used for reporting.
     */
    private List<UserDefinedField> userDefinedFields;

    /**
     * indicates how (and whether) the method should check for duplicate accounts. Defaults to 1.<br>
     * <br>
     * 0 - Does not check for Duplicate Card Number for specified Customer ID<br>
     * 1 - Checks for Duplicate Card Number for specified Customer ID<br>
     * 2 - Checks for Duplicate Card Number for All Customer IDs for specified SecureNet ID<br>
     * 3 - Checks for Duplicate Card Number for All Customer IDs for specified Group ID
     */
    private Integer accountDuplicateCheckIndicator;

    public PaymentAccountRequest(final String customerId, final String paymentMethodId, final Card card) {
        this.customerId = customerId;
        this.paymentMethodId = paymentMethodId;
        this.card = card;
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
     * @return {@link #paymentMethodId}
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * @param paymentMethodId {@link #paymentMethodId}
     */
    public void setPaymentMethodId(final String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
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
     * @return {@link #phone}
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone {@link #phone}
     */
    public void setPhone(final String phone) {
        this.phone = phone;
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

    /**
     * @return {@link #accountDuplicateCheckIndicator}
     */
    public Integer getAccountDuplicateCheckIndicator() {
        return accountDuplicateCheckIndicator;
    }

    /**
     * @param accountDuplicateCheckIndicator {@link #accountDuplicateCheckIndicator}
     */
    public void setAccountDuplicateCheckIndicator(final Integer accountDuplicateCheckIndicator) {
        this.accountDuplicateCheckIndicator = accountDuplicateCheckIndicator;
    }

    @Override
    public String toString() {
        return "PaymentAccountRequest{" +
                "customerId='" + customerId + '\'' +
                ", card=" + card +
                ", check=" + check +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", notes='" + notes + '\'' +
                ", phone='" + phone + '\'' +
                ", primary=" + primary +
                ", userDefinedFields=" + userDefinedFields +
                ", accountDuplicateCheckIndicator=" + accountDuplicateCheckIndicator +
                '}';
    }

}
