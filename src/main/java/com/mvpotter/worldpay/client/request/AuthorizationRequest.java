package com.mvpotter.worldpay.client.request;

import com.mvpotter.worldpay.client.model.Card;
import com.mvpotter.worldpay.client.model.ExtendedInformation;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class AuthorizationRequest extends WorldPayRequest {

    /**
     * amount of the charge to be authorized.
     */
    private double amount;

    /**
     * credit-card-specific data. In the case of a card-present transaction, track data from a swiped transaction is the most commonly used property. Required for credit card charges.
     */
    private Card card;

    /**
     * indicates whether the card object is to be added to the vault to be stored as a token.
     */
    private Boolean addToVault;

    /**
     * indicates whether the card object is to be added to the vault to be stored as a token even if the attempted authorization is declined.
     */
    private Boolean addToVaultOnFailure;

    /**
     * typically used as an optional field for pin debit processing. The value of cashBackAmount indicates the amount in cash to be given back to the customer during card processing.
     */
    private Double cashBackAmount;

    /**
     * indicates whether it is permissible to authorize less than the total balance available on a prepaid card.
     */
    private Double allowPartialCharges;

    /**
     * indicates how checks for duplicate transactions should behave. Duplicates are evaluated on the basis of amount, card number, and order ID; these evaluation criteria can be extended to also include customer ID, invoice number, or a user-defined field. Valid values for this parameter are:<br>
     * <br>
     * 0 - No duplicate check <br>
     * 1 - Exception code is returned in case of duplicate<br>
     * 2 - Previously existing transaction is returned in case of duplicate<br>
     * 3 - Check is performed as above but without using order ID, and exception code is returned in case of duplicate<br>
     * <br>
     * The transactionDuplicateCheckIndicator parameter must be enabled in the Virtual Terminal under Tools-&gt;Duplicate Transactions. Duplicates are checked only for APPROVED transactions.
     */
    private Integer transactionDuplicateCheckIndicator;

    /**
     * client-generated unique ID for each transaction, used as a way to prevent the processing of duplicate transactions. The orderId must be unique to the merchant's SecureNet ID; however, uniqueness is only evaluated for APPROVED transactions and only for the last 30 days. If a transaction is declined, the corresponding orderId may be used again. (NOTE: orderId is not used in Prior Auth Capture.) <br>
     * <br>
     * The orderId is limited to 25 characters; e.g., “CUSTOMERID MMddyyyyHHmmss”.
     */
    private String orderId;

    /**
     * additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information.
     */
    private ExtendedInformation extendedInformation;

    public AuthorizationRequest() {
    }

    /**
     * Constructor.
     *
     * @param amount {@link #amount}
     * @param card {@link #card}
     */
    public AuthorizationRequest(final double amount, final Card card) {
        this.amount = amount;
        this.card = card;
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
     * @return {@link #addToVault}
     */
    public Boolean getAddToVault() {
        return addToVault;
    }

    /**
     * @param addToVault {@link #addToVault}
     */
    public void setAddToVault(final Boolean addToVault) {
        this.addToVault = addToVault;
    }

    /**
     * @return {@link #addToVaultOnFailure}
     */
    public Boolean getAddToVaultOnFailure() {
        return addToVaultOnFailure;
    }

    /**
     * @param addToVaultOnFailure {@link #addToVaultOnFailure}
     */
    public void setAddToVaultOnFailure(final Boolean addToVaultOnFailure) {
        this.addToVaultOnFailure = addToVaultOnFailure;
    }

    /**
     * @return {@link #cashBackAmount}
     */
    public Double getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * @param cashBackAmount {@link #cashBackAmount}
     */
    public void setCashBackAmount(final Double cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    /**
     * @return {@link #allowPartialCharges}
     */
    public Double getAllowPartialCharges() {
        return allowPartialCharges;
    }

    /**
     * @param allowPartialCharges {@link #allowPartialCharges}
     */
    public void setAllowPartialCharges(final Double allowPartialCharges) {
        this.allowPartialCharges = allowPartialCharges;
    }

    /**
     * @return {@link #transactionDuplicateCheckIndicator}
     */
    public Integer getTransactionDuplicateCheckIndicator() {
        return transactionDuplicateCheckIndicator;
    }

    /**
     * @param transactionDuplicateCheckIndicator {@link #transactionDuplicateCheckIndicator}
     */
    public void setTransactionDuplicateCheckIndicator(final Integer transactionDuplicateCheckIndicator) {
        this.transactionDuplicateCheckIndicator = transactionDuplicateCheckIndicator;
    }

    /**
     * @return {@link #orderId}
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId {@link #orderId}
     */
    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return {@link #extendedInformation}
     */
    public ExtendedInformation getExtendedInformation() {
        return extendedInformation;
    }

    /**
     * @param extendedInformation {@link #extendedInformation}
     */
    public void setExtendedInformation(final ExtendedInformation extendedInformation) {
        this.extendedInformation = extendedInformation;
    }

    @Override
    public String toString() {
        return "AuthorizationRequest{" +
                "amount=" + amount +
                ", card=" + card +
                ", addToVault=" + addToVault +
                ", addToVaultOnFailure=" + addToVaultOnFailure +
                ", cashBackAmount=" + cashBackAmount +
                ", allowPartialCharges=" + allowPartialCharges +
                ", transactionDuplicateCheckIndicator=" + transactionDuplicateCheckIndicator +
                ", orderId='" + orderId + '\'' +
                ", extendedInformation=" + extendedInformation +
                '}';
    }

}
