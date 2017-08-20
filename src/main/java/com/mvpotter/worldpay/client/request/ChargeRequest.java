package com.mvpotter.worldpay.client.request;


import com.mvpotter.worldpay.client.model.Card;
import com.mvpotter.worldpay.client.model.Encryption;
import com.mvpotter.worldpay.client.model.ExtendedInformation;
import com.mvpotter.worldpay.client.model.Token;
import com.mvpotter.worldpay.client.model.check.Check;

/**
 * Request for one time payment.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class ChargeRequest extends WorldPayRequest {

    /**
     * amount to charge the account.
     */
    private double amount;

    /**
     * card
     */
    private Card card;

    /**
     * required to charge a check; contains check-specific data.
     */
    private Check check;

    /**
     * encryption mode for the transaction. Required when using device-based encryption. Valid values include IDTECH_MSR, MAGTEK_MSR, or MAGTEK_IPAD. Defaults to NONE.
     */
    private Encryption encryption;

    /**
     * data from a Vault payment account. Required for transactions where a Vault token is sent in the place of card or check data.
     */
    private Token paymentVaultToken;

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
    private Boolean allowPartialCharges;

    /**
     * additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information.
     */
    private ExtendedInformation extendedInformation;

    /**
     * indicates how checks for duplicate transactions should behave. Duplicates are evaluated on the basis of amount,
     * card number, and order ID; these evaluation criteria can be extended to also include customer ID,
     * invoice number, or a user-defined field. Valid values for this parameter are:<br>
     * <br>
     * 0 - No duplicate check <br>
     * 1 - Exception code is returned in case of duplicate<br>
     * 2 - Previously existing transaction is returned in case of duplicate<br>
     * 3 - Check is performed as above but without using order ID, and exception code is returned in case of duplicate<br>
     * <br>
     * The transactionDuplicateCheckIndicator parameter must be enabled in the Virtual Terminal under Tools-&gt;Duplicate Transactions.Duplicates are checked only for APPROVED transactions.
     */
    private Integer transactionDuplicateCheckIndicator;

    /**
     * client-generated unique ID for each transaction, used as a way to prevent the processing of duplicate transactions.
     * The orderId must be unique to the merchant's SecureNet ID;
     * however, uniqueness is only evaluated for APPROVED transactions and only for the last 30 days.
     * If a transaction is declined, the corresponding orderId may be used again.<br>
     * <br>
     * The orderId is limited to 25 characters; e.g., “CUSTOMERID MMddyyyyHHmmss”.
     */
    private String orderId;

    public ChargeRequest(final double amount, final Card card) {
        this.amount = amount;
        this.card = card;
    }

    public ChargeRequest(final double amount, final Card card, final Boolean addToVault) {
        this(amount, card);
        this.addToVault = addToVault;
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
     * @return {@link #encryption}
     */
    public Encryption getEncryption() {
        return encryption;
    }

    /**
     * @param encryption {@link #encryption}
     */
    public void setEncryption(final Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return {@link #paymentVaultToken}
     */
    public Token getPaymentVaultToken() {
        return paymentVaultToken;
    }

    /**
     * @param paymentVaultToken {@link #paymentVaultToken}
     */
    public void setPaymentVaultToken(final Token paymentVaultToken) {
        this.paymentVaultToken = paymentVaultToken;
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
    public Boolean getAllowPartialCharges() {
        return allowPartialCharges;
    }

    /**
     * @param allowPartialCharges {@link #allowPartialCharges}
     */
    public void setAllowPartialCharges(final Boolean allowPartialCharges) {
        this.allowPartialCharges = allowPartialCharges;
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

    @Override
    public String toString() {
        return "ChargeRequest{" +
                "amount=" + amount +
                ", card=" + card +
                ", check=" + check +
                ", encryption=" + encryption +
                ", paymentVaultToken=" + paymentVaultToken +
                ", addToVault=" + addToVault +
                ", addToVaultOnFailure=" + addToVaultOnFailure +
                ", cashBackAmount=" + cashBackAmount +
                ", allowPartialCharges=" + allowPartialCharges +
                ", extendedInformation=" + extendedInformation +
                ", transactionDuplicateCheckIndicator=" + transactionDuplicateCheckIndicator +
                ", orderId='" + orderId + '\'' +
                '}';
    }

}
