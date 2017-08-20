package com.mvpotter.worldpay.client.model.check;

import com.mvpotter.worldpay.client.model.Address;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class Check {

    /**
     * type of checking account.
     */
    private AccountType accountType;

    /**
     * type of check payment being made.
     */
    private CheckType checkType;

    /**
     * bank routing number.
     */
    private String routingNumber;

    /**
     * checking account number.
     */
    private String accountNumber;

    /**
     * check number.
     */
    private String checkNumber;

    /**
     * billing address of the account holder
     */
    private Address address;

    /**
     * first name of the account holder.
     */
    private String firstName;

    /**
     * last name of the account holder.
     */
    private String lastName;

    /**
     * email address of the account holder.
     */
    private String email;

    /**
     * enable or disable the functionality to send reciept via email.
     */
    private Boolean emailReceipt;

    /**
     * base64-encoded image of the front of the check in BMP/JPG/PNG format; optional.
     */
    private String front;

    /**
     * base64-encoded image of the back of the check in BMP/JPG/PNG format; optional.
     */
    private String back;

    /**
     * type of check verification that was used for the transaction.
     */
    private Verification verification;

    /**
     * @return {@link #accountType}
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * @param accountType {@link #accountType}
     */
    public void setAccountType(final AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * @return {@link #checkType}
     */
    public CheckType getCheckType() {
        return checkType;
    }

    /**
     * @param checkType {@link #checkType}
     */
    public void setCheckType(final CheckType checkType) {
        this.checkType = checkType;
    }

    /**
     * @return {@link #routingNumber}
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * @param routingNumber {@link #routingNumber}
     */
    public void setRoutingNumber(final String routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * @return {@link #accountNumber}
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber {@link #accountNumber}
     */
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return {@link #checkNumber}
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * @param checkNumber {@link #checkNumber}
     */
    public void setCheckNumber(final String checkNumber) {
        this.checkNumber = checkNumber;
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
     * @return {@link #email}
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email {@link #email}
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return {@link #emailReceipt}
     */
    public Boolean getEmailReceipt() {
        return emailReceipt;
    }

    /**
     * @param emailReceipt {@link #emailReceipt}
     */
    public void setEmailReceipt(final Boolean emailReceipt) {
        this.emailReceipt = emailReceipt;
    }

    /**
     * @return {@link #front}
     */
    public String getFront() {
        return front;
    }

    /**
     * @param front {@link #front}
     */
    public void setFront(final String front) {
        this.front = front;
    }

    /**
     * @return {@link #back}
     */
    public String getBack() {
        return back;
    }

    /**
     * @param back {@link #back}
     */
    public void setBack(final String back) {
        this.back = back;
    }

    /**
     * @return {@link #verification}
     */
    public Verification getVerification() {
        return verification;
    }

    /**
     * @param verification {@link #verification}
     */
    public void setVerification(final Verification verification) {
        this.verification = verification;
    }

    @Override
    public String toString() {
        return "Check{" +
                "accountType=" + accountType +
                ", checkType=" + checkType +
                ", routingNumber='" + routingNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", checkNumber='" + checkNumber + '\'' +
                ", address=" + address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", emailReceipt=" + emailReceipt +
                ", front='" + front + '\'' +
                ", back='" + back + '\'' +
                ", verification=" + verification +
                '}';
    }

}
