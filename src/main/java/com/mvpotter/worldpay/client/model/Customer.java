package com.mvpotter.worldpay.client.model;

import java.util.List;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class Customer {

    /**
     *
     first name of the customer.
     */
    private String firstName;

    /**
     * last name of the customer.
     */
    private String lastName;

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     *
     phone number of the customer.
     */
    private String phoneNumber;

    /**
     * billing address information of the customer.
     */
    private Address address;

    /**
     * email address for the customer.
     */
    private String emailAddress;

    /**
     * indicates whether an email receipt should be sent to the customer whenever a transaction is completed.
     */
    private Boolean sendEmailReceipts;

    /**
     * company with which the customer is associated.
     */
    private String company;

    /**
     * notes associated with the customer.
     */
    private String notes;

    /**
     * custom user-defined fields tied to the plan, which can be used for reporting.
     */
    private List<UserDefinedField> userDefinedFields;

    /**
     * indicates how the method should behave if the Customer ID already exists. Default is 0.<br>
     * <br>
     * 0 - If Customer ID exists then return an Error.<br>
     * <br>
     * 1 - If Customer ID exists then do not add account but continue with transaction.
     */
    private Integer customerDuplicateCheckIndicator;

    /**
     * @return {@link #firstName}
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName {@link #firstName}
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return {@link #lastName}
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName {@link #lastName}
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
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
     * @return {@link #phoneNumber}
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber {@link #phoneNumber}
     */
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return {@link #address}
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address {@link #address}
     */
    public void setAddress(final Address address) {
        this.address = address;
    }

    /**
     * @return {@link #emailAddress}
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress {@link #emailAddress}
     */
    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return {@link #sendEmailReceipts}
     */
    public Boolean getSendEmailReceipts() {
        return sendEmailReceipts;
    }

    /**
     * @param sendEmailReceipts {@link #sendEmailReceipts}
     */
    public void setSendEmailReceipts(final Boolean sendEmailReceipts) {
        this.sendEmailReceipts = sendEmailReceipts;
    }

    /**
     * @return {@link #company}
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company {@link #company}
     */
    public void setCompany(final String company) {
        this.company = company;
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
     * @return {@link #customerDuplicateCheckIndicator}
     */
    public Integer getCustomerDuplicateCheckIndicator() {
        return customerDuplicateCheckIndicator;
    }

    /**
     * @param customerDuplicateCheckIndicator {@link #customerDuplicateCheckIndicator}
     */
    public void setCustomerDuplicateCheckIndicator(final Integer customerDuplicateCheckIndicator) {
        this.customerDuplicateCheckIndicator = customerDuplicateCheckIndicator;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", emailAddress='" + emailAddress + '\'' +
                ", sendEmailReceipts=" + sendEmailReceipts +
                ", company='" + company + '\'' +
                ", notes='" + notes + '\'' +
                ", userDefinedFields=" + userDefinedFields +
                ", customerDuplicateCheckIndicator=" + customerDuplicateCheckIndicator +
                '}';
    }

}
