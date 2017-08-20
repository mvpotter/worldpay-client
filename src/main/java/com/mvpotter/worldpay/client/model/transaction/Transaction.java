package com.mvpotter.worldpay.client.model.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.mvpotter.worldpay.client.model.Address;
import com.mvpotter.worldpay.client.model.AvsResult;
import com.mvpotter.worldpay.client.model.CardCodeResult;
import com.mvpotter.worldpay.client.model.CreditCardType;
import com.mvpotter.worldpay.client.model.PaymentTypeCode;
import com.mvpotter.worldpay.client.model.PaymentTypeResult;
import com.mvpotter.worldpay.client.model.UserDefinedField;
import com.mvpotter.worldpay.client.model.VaultData;

import java.util.List;

/**
 * Detailed information about the transaction, including but not limited to:
 * transaction id; authorization code; avs result code; and cvv result code.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class Transaction {

    /**
     * merchant account identifier.
     */
    private String secureNetId;

    /**
     * transaction type identifier.
     */
    private String transactionType;

    /**
     * transaction approval status.
     */
    private String responseText;

    /**
     * client-generated unique ID for each transaction, used as a way to prevent the processing of duplicate transactions.
     * The orderId must be unique to the merchant's SecureNet ID; however, uniqueness is only evaluated for APPROVED transactions
     * and only for the last 30 days. If a transaction is declined, the corresponding orderId may be used again.<br>
     * <br>
     * The orderId is limited to 25 characters; e.g., “CUSTOMERID MMddyyyyHHmmss”.
     */
    private String orderId;

    /**
     * transaction identifier.
     */
    private String transactionId;

    /**
     * authorization approval code.
     */
    private String authorizationCode;

    /**
     * authorized amount.
     */
    private String authorizedAmount;

    /**
     * indicates whether partial payments are to be accepted.
     */
    private Boolean allowedPartialCharges;

    /**
     * credit card or check type.
     */
    private PaymentTypeCode paymentTypeCode;

    /**
     * transaction method.
     */
    private PaymentTypeResult paymentTypeResult;

    /**
     * indicates whether the credit card is level 2 eligible.
     */
    private Boolean level2Valid;

    /**
     * indicates whether the credit card is level 3 eligible.
     */
    private Boolean level3Valid;

    /**
     * date/time and amount of the authorized transaction.
     */
    private TransactionData transactionData;

    /**
     * customer data and Vault token.
     */
    private VaultData vaultData;

    /**
     * identifies the credit card type.
     */
    private CreditCardType creditCardType;

    /**
     * last 4 digits of the credit card number. Format: XXXXXXXXXXXX 3456.
     */
    private String cardNumber;

    /**
     * address verification code. Valid values are:<br>
     * <br>
     * 0 - AVS data not provided.<br>
     * A - Street address matches, zip code does not<br>
     * B - Postal code not verified due to incompatible formats<br>
     * C - Street address and postal code not verified due to incompatible formats.<br>
     * D - Street address and postal code match<br>
     * E - AVS data is invalid<br>
     * G - Non-U.S. issuing bank does not support AVS<br>
     * I - Address information not verified by international issuer<br>
     * M - Customer name, billing address and zip match<br>
     * N - Neither street address nor zip code match<br>
     * P - Street address not verified due to incompatible format<br>
     * R - Retry: issuer's system unavailable or timed out<br>
     * S - U.S. issuing bank does not support AVS<br>
     * T - Street address does not match, but 9-digit zip code matches<br>
     * U - Address information is unavailable<br>
     * W - 9-digit zip matches, street address does not<br>
     * X - Street address and 9-digit zip match<br>
     * Y - Street address and 5-digit zip match
     */
    private String avsCode;

    /**
     * address verification result.
     */
    private AvsResult avsResult;

    /**
     * first name of the cardholder.
     */
    @JsonProperty("cardholder_firstName")
    private String cardHolderFirstName;

    /**
     * last name of the cardholder.
     */
    @JsonProperty("cardholder_lastName")
    private String cardHolderLastName;

    /**
     * account expiration date.
     */
    private String expirationDate;

    /**
     * billing address of the customer.
     */
    private Address billAddress;

    /**
     * email address of the customer.
     */
    private String email;

    /**
     * card security code result. Valid values are:<br>
     * <br>
     * 0 - CVV/CID not provided <br>
     * M - Match <br>
     * N - No match <br>
     * P - Not processed <br>
     * S - Data not present <br>
     * U - Issuer unable to process request <br>
     * Y - Card code matches (Amex only)
     */
    private String cardCodeCode;

    /**
     * card security code result.
     */
    private CardCodeResult cardCodeResult;

    /**
     * transaction account.
     */
    @JsonUnwrapped
    private TransactionAccount account;

    /**
     * individual check number.
     */
    private String checkNumber;

    /**
     * trace number of an ACH check transaction.
     */
    private String traceNumber;

    /**
     * surcharge amount to be added to the transaction.
     */
    private Double surchargeAmount;

    /**
     * 	cash back amount given to a customer. Commonly used for debit transactions.
     */
    private Double cashBackAmount;

    /**
     * tip amount.
     */
    private Double gratuity;

    /**
     * industry-specific data for ecommerce and moto transactions.<br>
     * <br>
     * For eCommerce transactions:<br>
     * <br>
     * P - Physical goods<br>
     * D - Digital goods<br>
     * <br>
     * For MO/TO transactions:<br>
     * <br>
     * 0 - Default <br>
     * 1 - Single purchase transaction (AVS is required)<br>
     * 2 - Recurring billing transaction (do not submit AVS)<br>
     * 3 - Installment transaction
     */
    private String industrySpecificData;

    /**
     * identifier for the network that returned the transaction response.
     */
    private String networkCode;

    /**
     * remaining balance on a stored value account.
     */
    private Double additionalAmount;

    /**
     * transaction method.
     */
    private TransactionMethod method;

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * indicates whether the functionality to send reciept via email is enabled or not.
     */
    private Boolean emailReceipt;

    /**
     * 	not currently used
     */
    private String fleetCardInfo;

    /**
     * Unique number assigned to a person that participates in the SNAP program.
     */
    private String fnsNumber;

    /**
     * 15 character number representing the EBT Voucher account.
     */
    private String voucherNumber;

    /**
     * Transaction additional data.
     */
    @JsonUnwrapped
    private AdditionalData additionalData;

    /**
     * displays a description in addition to the merchants DBA.
     */
    private String softDescriptor;

    /**
     * displays a 4 characters dynamic merchant category code.
     */
    private String dynamicMCC;

    /**
     * custom user-defined fields tied to the transaction, which is used for transaction reporting and settlement only.
     */
    private List<UserDefinedField> userDefinedFields;

    /**
     * notes associated with the transaction, which is used for transaction reporting and settlement only.
     */
    private String notes;

    /**
     * invoiceDescription associated with the transaction, which is used for transaction reporting and settlement only.
     */
    private String invoiceDescription;

    /**
     * Value to indicate if the transaction originated from a cardholder activated terminal. Possible values are:<br>
     * <br>
     * 0 - Not a CAT Transaction <br>
     * 1 - ATM with PIN <br>
     * 2 - Self-service terminal<br>
     * 3 - Limited-amount terminal<br>
     * 4 - In-flight commerce<br>
     * 6 - Electronic commerce<br>
     * 7 - Transponder transaction
     */
    @JsonProperty("CATIndicator")
    private Integer catIndicator;

    /**
     * Visa Checkout transaction ID associated with a payment request.
     */
    private String callId;

    /**
     * @return {@link #secureNetId}
     */
    public String getSecureNetId() {
        return secureNetId;
    }

    /**
     * @param secureNetId {@link #secureNetId}
     */
    public void setSecureNetId(final String secureNetId) {
        this.secureNetId = secureNetId;
    }

    /**
     * @return {@link #transactionType}
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType {@link #transactionType}
     */
    public void setTransactionType(final String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return {@link #responseText}
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * @param responseText {@link #responseText}
     */
    public void setResponseText(final String responseText) {
        this.responseText = responseText;
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
     * @return {@link #transactionId}
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId {@link #transactionId}
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return {@link #authorizationCode}
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * @param authorizationCode {@link #authorizationCode}
     */
    public void setAuthorizationCode(final String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * @return {@link #authorizedAmount}
     */
    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * @param authorizedAmount {@link #authorizedAmount}
     */
    public void setAuthorizedAmount(final String authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    /**
     * @return {@link #allowedPartialCharges}
     */
    public Boolean getAllowedPartialCharges() {
        return allowedPartialCharges;
    }

    /**
     * @param allowedPartialCharges {@link #allowedPartialCharges}
     */
    public void setAllowedPartialCharges(final Boolean allowedPartialCharges) {
        this.allowedPartialCharges = allowedPartialCharges;
    }

    /**
     * @return {@link #paymentTypeCode}
     */
    public PaymentTypeCode getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * @param paymentTypeCode {@link #paymentTypeCode}
     */
    public void setPaymentTypeCode(final PaymentTypeCode paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }

    /**
     * @return {@link #paymentTypeResult}
     */
    public PaymentTypeResult getPaymentTypeResult() {
        return paymentTypeResult;
    }

    /**
     * @param paymentTypeResult {@link #paymentTypeResult}
     */
    public void setPaymentTypeResult(final PaymentTypeResult paymentTypeResult) {
        this.paymentTypeResult = paymentTypeResult;
    }

    /**
     * @return {@link #level2Valid}
     */
    public Boolean getLevel2Valid() {
        return level2Valid;
    }

    /**
     * @param level2Valid {@link #level2Valid}
     */
    public void setLevel2Valid(final Boolean level2Valid) {
        this.level2Valid = level2Valid;
    }

    /**
     * @return {@link #level3Valid}
     */
    public Boolean getLevel3Valid() {
        return level3Valid;
    }

    /**
     * @param level3Valid {@link #level3Valid}
     */
    public void setLevel3Valid(final Boolean level3Valid) {
        this.level3Valid = level3Valid;
    }

    /**
     * @return {@link #transactionData}
     */
    public TransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * @param transactionData {@link #transactionData}
     */
    public void setTransactionData(final TransactionData transactionData) {
        this.transactionData = transactionData;
    }

    /**
     * @return {@link #vaultData}
     */
    public VaultData getVaultData() {
        return vaultData;
    }

    /**
     * @param vaultData {@link #vaultData}
     */
    public void setVaultData(final VaultData vaultData) {
        this.vaultData = vaultData;
    }

    /**
     * @return {@link #creditCardType}
     */
    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    /**
     * @param creditCardType {@link #creditCardType}
     */
    public void setCreditCardType(final CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    /**
     * @return {@link #cardNumber}
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber {@link #cardNumber}
     */
    public void setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return {@link #avsCode}
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * @param avsCode {@link #avsCode}
     */
    public void setAvsCode(final String avsCode) {
        this.avsCode = avsCode;
    }

    /**
     * @return {@link #avsResult}
     */
    public AvsResult getAvsResult() {
        return avsResult;
    }

    /**
     * @param avsResult {@link #avsResult}
     */
    public void setAvsResult(final AvsResult avsResult) {
        this.avsResult = avsResult;
    }

    /**
     * @return {@link #cardHolderFirstName}
     */
    public String getCardHolderFirstName() {
        return cardHolderFirstName;
    }

    /**
     * @param cardHolderFirstName {@link #cardHolderFirstName}
     */
    public void setCardHolderFirstName(final String cardHolderFirstName) {
        this.cardHolderFirstName = cardHolderFirstName;
    }

    /**
     * @return {@link #cardHolderLastName}
     */
    public String getCardHolderLastName() {
        return cardHolderLastName;
    }

    /**
     * @param cardHolderLastName {@link #cardHolderLastName}
     */
    public void setCardHolderLastName(final String cardHolderLastName) {
        this.cardHolderLastName = cardHolderLastName;
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
     * @return {@link #billAddress}
     */
    public Address getBillAddress() {
        return billAddress;
    }

    /**
     * @param billAddress {@link #billAddress}
     */
    public void setBillAddress(final Address billAddress) {
        this.billAddress = billAddress;
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
     * @return {@link #cardCodeCode}
     */
    public String getCardCodeCode() {
        return cardCodeCode;
    }

    /**
     * @param cardCodeCode {@link #cardCodeCode}
     */
    public void setCardCodeCode(final String cardCodeCode) {
        this.cardCodeCode = cardCodeCode;
    }

    /**
     * @return {@link #cardCodeResult}
     */
    public CardCodeResult getCardCodeResult() {
        return cardCodeResult;
    }

    /**
     * @param cardCodeResult {@link #cardCodeResult}
     */
    public void setCardCodeResult(final CardCodeResult cardCodeResult) {
        this.cardCodeResult = cardCodeResult;
    }

    /**
     * @return {@link #account}
     */
    public TransactionAccount getAccount() {
        return account;
    }

    /**
     * @param account {@link #account}
     */
    public void setAccount(final TransactionAccount account) {
        this.account = account;
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
     * @return {@link #traceNumber}
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * @param traceNumber {@link #traceNumber}
     */
    public void setTraceNumber(final String traceNumber) {
        this.traceNumber = traceNumber;
    }

    /**
     * @return {@link #surchargeAmount}
     */
    public Double getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * @param surchargeAmount {@link #surchargeAmount}
     */
    public void setSurchargeAmount(final Double surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
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
     * @return {@link #gratuity}
     */
    public Double getGratuity() {
        return gratuity;
    }

    /**
     * @param gratuity {@link #gratuity}
     */
    public void setGratuity(final Double gratuity) {
        this.gratuity = gratuity;
    }

    /**
     * @return {@link #industrySpecificData}
     */
    public String getIndustrySpecificData() {
        return industrySpecificData;
    }

    /**
     * @param industrySpecificData {@link #industrySpecificData}
     */
    public void setIndustrySpecificData(final String industrySpecificData) {
        this.industrySpecificData = industrySpecificData;
    }

    /**
     * @return {@link #networkCode}
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * @param networkCode {@link #networkCode}
     */
    public void setNetworkCode(final String networkCode) {
        this.networkCode = networkCode;
    }

    /**
     * @return {@link #additionalAmount}
     */
    public Double getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * @param additionalAmount {@link #additionalAmount}
     */
    public void setAdditionalAmount(final Double additionalAmount) {
        this.additionalAmount = additionalAmount;
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
     * @return {@link #fleetCardInfo}
     */
    public String getFleetCardInfo() {
        return fleetCardInfo;
    }

    /**
     * @param fleetCardInfo {@link #fleetCardInfo}
     */
    public void setFleetCardInfo(final String fleetCardInfo) {
        this.fleetCardInfo = fleetCardInfo;
    }

    /**
     * @return {@link #fnsNumber}
     */
    public String getFnsNumber() {
        return fnsNumber;
    }

    /**
     * @param fnsNumber {@link #fnsNumber}
     */
    public void setFnsNumber(final String fnsNumber) {
        this.fnsNumber = fnsNumber;
    }

    /**
     * @return {@link #voucherNumber}
     */
    public String getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * @param voucherNumber {@link #voucherNumber}
     */
    public void setVoucherNumber(final String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    /**
     * @return {@link #additionalData}
     */
    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * @param additionalData {@link #additionalData}
     */
    public void setAdditionalData(final AdditionalData additionalData) {
        this.additionalData = additionalData;
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
     * @return {@link #invoiceDescription}
     */
    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    /**
     * @param invoiceDescription {@link #invoiceDescription}
     */
    public void setInvoiceDescription(final String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    /**
     * @return {@link #catIndicator}
     */
    public Integer getCatIndicator() {
        return catIndicator;
    }

    /**
     * @param catIndicator {@link #catIndicator}
     */
    public void setCatIndicator(final Integer catIndicator) {
        this.catIndicator = catIndicator;
    }

    /**
     * @return {@link #callId}
     */
    public String getCallId() {
        return callId;
    }

    /**
     * @param callId {@link #callId}
     */
    public void setCallId(final String callId) {
        this.callId = callId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "secureNetId='" + secureNetId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", responseText='" + responseText + '\'' +
                ", orderId='" + orderId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", authorizationCode='" + authorizationCode + '\'' +
                ", authorizedAmount='" + authorizedAmount + '\'' +
                ", allowedPartialCharges=" + allowedPartialCharges +
                ", paymentTypeCode=" + paymentTypeCode +
                ", paymentTypeResult=" + paymentTypeResult +
                ", level2Valid=" + level2Valid +
                ", level3Valid=" + level3Valid +
                ", transactionData=" + transactionData +
                ", vaultData=" + vaultData +
                ", creditCardType=" + creditCardType +
                ", cardNumber='" + cardNumber + '\'' +
                ", avsCode='" + avsCode + '\'' +
                ", avsResult=" + avsResult +
                ", cardHolderFirstName='" + cardHolderFirstName + '\'' +
                ", cardHolderLastName='" + cardHolderLastName + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", billAddress=" + billAddress +
                ", email='" + email + '\'' +
                ", cardCodeCode='" + cardCodeCode + '\'' +
                ", cardCodeResult=" + cardCodeResult +
                ", account='" + account + '\'' +
                ", checkNumber='" + checkNumber + '\'' +
                ", traceNumber='" + traceNumber + '\'' +
                ", surchargeAmount=" + surchargeAmount +
                ", cashBackAmount=" + cashBackAmount +
                ", gratuity=" + gratuity +
                ", industrySpecificData='" + industrySpecificData + '\'' +
                ", networkCode='" + networkCode + '\'' +
                ", additionalAmount=" + additionalAmount +
                ", method=" + method +
                ", customerId='" + customerId + '\'' +
                ", emailReceipt=" + emailReceipt +
                ", fleetCardInfo='" + fleetCardInfo + '\'' +
                ", fnsNumber='" + fnsNumber + '\'' +
                ", voucherNumber='" + voucherNumber + '\'' +
                ", additionalData='" + additionalData + '\'' +
                ", softDescriptor='" + softDescriptor + '\'' +
                ", dynamicMCC='" + dynamicMCC + '\'' +
                ", userDefinedFields=" + userDefinedFields +
                ", notes='" + notes + '\'' +
                ", invoiceDescription='" + invoiceDescription + '\'' +
                ", catIndicator=" + catIndicator +
                ", callId='" + callId + '\'' +
                '}';
    }

}
