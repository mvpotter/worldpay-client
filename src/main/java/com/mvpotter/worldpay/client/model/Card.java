package com.mvpotter.worldpay.client.model;

/**
 * credit-card-specific data. In the case of a card-present transaction, track data from a swiped transaction is the most commonly used property. Required for credit card charges..
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class Card {

    /**
     * data that has been read from the card's magnetic stripe.
     */
    private String trackData;

    /**
     * credit card account number.
     */
    private String number;

    /**
     * card security code.
     */
    private String cvv;

    /**
     * expiration date for the card. Format: MM/YYYY.
     */
    private String expirationDate;

    /**
     * card type of the payment account.
     */
    private String creditCardType;

    /**
     * 	unaltered KSN Number from PIN pad. (Debit only.)
     */
    private String ksn;

    /**
     * pinblock obtained from the PIN pad. (Debit only.)
     */
    private String pinBlock;

    /**
     * first name of the account holder.
     */
    private String firstName;

    /**
     * last name of the account holder.
     */
    private String lastName;

    /**
     * 	billing address of the account holder.
     */
    private Address address;

    /**
     * Every chip card transaction contain dozens of pieces of information to be exchanged between the card, the terminal and the acquiring bank or processors host. (EMV Only)
     */
    private Emv emv;

    /**
     * image of the signature of the cardholder as completed at the time of the transaction.
     */
    private String signature;

    /**
     * email address of the account holder.
     */
    private String email;

    /**
     * enable or disable the functionality to send reciept via email.
     */
    private String emailReceipt;

    /**
     * Indicates the channel in which the card was input.<br>
     * Indicates the channel in which the card was input.Valid values for this parameter are:<br>
     * <br>
     * 0 - Contact<br>
     * 1 - Contactless
     */
    private String contactlessIndicator;

    /**
     * Indicates whether the card should be processed as a debit card.<br>
     * Valid values for this parameter are:<br>
     * <br>
     * 0 - Credit<br>
     * 1 - Debit
     */
    private String isDebit;

    /**
     * Indicates if the chip failed and the transaction was entered as mag stripe. Valid values for this parameter are:<br>
     * <br>
     * 0 - No Fallback<br>
     * 1 - Fallback
     */
    private String fallbackIndicator;


    public Card() {
    }

    /**
     * @return {@link #trackData}
     */
    public String getTrackData() {
        return trackData;
    }

    /**
     * @param trackData {@link #trackData}
     */
    public void setTrackData(final String trackData) {
        this.trackData = trackData;
    }

    /**
     * @return {@link #number}
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number {@link #number}
     */
    public void setNumber(final String number) {
        this.number = number;
    }

    /**
     * @return {@link #cvv}
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * @param cvv {@link #cvv}
     */
    public void setCvv(final String cvv) {
        this.cvv = cvv;
    }

    /**
     * @return {@link #expirationDate}
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate {@link #expirationDate}
     */
    public void setExpirationDate(final String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return {@link #creditCardType}
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * @param creditCardType {@link #creditCardType}
     */
    public void setCreditCardType(final String creditCardType) {
        this.creditCardType = creditCardType;
    }

    /**
     * @return {@link #ksn}
     */
    public String getKsn() {
        return ksn;
    }

    /**
     * @param ksn {@link #ksn}
     */
    public void setKsn(final String ksn) {
        this.ksn = ksn;
    }

    /**
     * @return {@link #pinBlock}
     */
    public String getPinBlock() {
        return pinBlock;
    }

    /**
     * @param pinBlock {@link #pinBlock}
     */
    public void setPinBlock(final String pinBlock) {
        this.pinBlock = pinBlock;
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
     * @return {@link #emv}
     */
    public Emv getEmv() {
        return emv;
    }

    /**
     * @param emv {@link #emv}
     */
    public void setEmv(final Emv emv) {
        this.emv = emv;
    }

    /**
     * @return {@link #signature}
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature {@link #signature}
     */
    public void setSignature(final String signature) {
        this.signature = signature;
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
    public String getEmailReceipt() {
        return emailReceipt;
    }

    /**
     * @param emailReceipt {@link #emailReceipt}
     */
    public void setEmailReceipt(final String emailReceipt) {
        this.emailReceipt = emailReceipt;
    }

    /**
     * @return {@link #contactlessIndicator}
     */
    public String getContactlessIndicator() {
        return contactlessIndicator;
    }

    /**
     * @param contactlessIndicator {@link #contactlessIndicator}
     */
    public void setContactlessIndicator(final String contactlessIndicator) {
        this.contactlessIndicator = contactlessIndicator;
    }

    /**
     * @return {@link #isDebit}
     */
    public String getIsDebit() {
        return isDebit;
    }

    /**
     * @param isDebit {@link #isDebit}
     */
    public void setIsDebit(final String isDebit) {
        this.isDebit = isDebit;
    }

    /**
     * @return {@link #fallbackIndicator}
     */
    public String getFallbackIndicator() {
        return fallbackIndicator;
    }

    /**
     * @param fallbackIndicator {@link #fallbackIndicator}
     */
    public void setFallbackIndicator(final String fallbackIndicator) {
        this.fallbackIndicator = fallbackIndicator;
    }

    @Override
    public String toString() {
        return "Card{" +
                "trackData='" + trackData + '\'' +
                ", number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", creditCardType='" + creditCardType + '\'' +
                ", ksn='" + ksn + '\'' +
                ", pinBlock='" + pinBlock + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", emv=" + emv +
                ", signature='" + signature + '\'' +
                ", email='" + email + '\'' +
                ", emailReceipt='" + emailReceipt + '\'' +
                ", contactlessIndicator='" + contactlessIndicator + '\'' +
                ", isDebit='" + isDebit + '\'' +
                ", fallbackIndicator='" + fallbackIndicator + '\'' +
                '}';
    }

}