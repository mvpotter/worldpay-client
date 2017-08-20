package com.mvpotter.worldpay.client.model;

/**
 * EMV is a global standard for credit and debit payment cards based on chip card technology" taking its name from the card schemes Europay, MasterCard, and Visa - the original card schemes that developed it. The standard covers the processing of credit and debit card payments using a card that contains a microprocessor chip.
 *
 * @author mvpotter
 * @since 12/08/2017
 */
public class Emv {

    /**
     * Cryptogram returned by the ICC in response of the GENERATE AC command. Tag 9F26.
     */
    private String applicationCryptogram;

    /**
     * Indicates the capabilities of the card to support specific functions in the application. Tag 82.
     */
    private String applicationInterchangeProfile;

    /**
     * Counter maintained by the application in the ICC (incrementing the ATC is managed by the ICC). Tag 9F36.
     */
    private String applicationTransactionCounter;

    /**
     * This field identifies the card when multiple plastics are associated with a single account number. Tag 5F34.
     */
    private String cardSequenceNumber;

    /**
     * Secondary amount associated with the transaction representing a cashback amount. Tag 9F03.
     */
    private String cryptogramCashBackAmount;

    /**
     * Indicates the type of cryptogram and the actions to be performed by the terminal. Tag 9F27.
     */
    private String cryptogramInformationData;

    /**
     * Indicates the country of the terminal, represented according to ISO 3166. Tag 9F1A.
     */
    private String cryptogramTerminalCountryCode;

    /**
     * Clearing amount of the transaction, including tips and other adjustments. Tag 9F02.
     */
    private String cryptogramTransactionAmount;

    /**
     * Local date that the transaction was authorized. Tag 9A.
     */
    private String cryptogramTransactionDate;

    /**
     * Indicates the type of financial transaction, represented by the first two digits of the ISO 8583:1987 Processing Code. The actual values to be used for the Transaction Type data element are defined by the relevant payment system. Tag 9C.
     */
    private String cryptogramTransactionType;

    /**
     * Indicates the currency code of the transaction according to ISO 4217. Tag 5F2A.
     */
    private String cryptogramTransactioncurrencyCode;

    /**
     * Personalized on the card and carries additional information about the contactless device, its security features, and technology used to acquire the transaction. Tag 9F6E.
     */
    private String formFactorIndicator;

    /**
     * Contains proprietary application data for transmission to the issuer in an online transaction. Note: For CCD-compliant applications, Annex C, section C7 defines the specific coding of the Issuer Application Data (IAD). To avoid potential conflicts with CCD-compliant applications, it is strongly recommended that the IAD data element in an application that is not CCD-compliant should not use the coding for a CCD-compliant application. Tag 9F10.
     */
    private String issuerApplicationData;

    /**
     *Indicates the card data input, CVM, and security capabilities of the terminal. Tag 9F33.
     */
    private String terminalCapabilityProfile;

    /**
     * Status of the different functions as seen from the terminal. Tag 95.
     */
    private String terminalVerificationResults;

    /**
     * Contains the data elements of track 2 according to ISO/IEC 7813, excluding start sentinel, end sentinel, and Longitudinal Redundancy Check (LRC), as follows:Primary Account Number Field Separator (Hex 'D') Expiration Date (YYMM) Service Code Discretionary Data (defined by individual payment systems) Pad with one Hex 'F' if needed to ensure whole bytes. Tag 57.
     */
    private String track2EquivalentDataChip;

    /**
     * Value to provide variability and uniqueness to the generation of a cryptogram. Tag 9F37.
     */
    private String unpredictableNumber;

    /**
     * Identifies the application as described in ISO/IEC 7816-5. Tag 9F06.
     */
    private String applicationIdentifier;

    /**
     * Indicates the functions performed in a transaction. Tag 9B.
     */
    private String transactionStatusIndicator;

    /**
     * Preferred mnemonic associated with the AID. Tag 9F12.
     */
    private String applicationName;

    /**
     * Indicates chip / contact-less / keyed / swipe, including fallback if used.
     */
    private String cardEntryMode;

    /**
     * Indicates Online / Offline.
     */
    private String authorizationMode;

    /**
     * Identifies a method of verification of the cardholder supported by the application.
     */
    private String cardholderVerification;


    /**
     * @return {@link #applicationCryptogram}
     */
    public String getApplicationCryptogram() {
        return applicationCryptogram;
    }

    /**
     * @param applicationCryptogram {@link #applicationCryptogram}
     */
    public void setApplicationCryptogram(final String applicationCryptogram) {
        this.applicationCryptogram = applicationCryptogram;
    }

    /**
     * @return {@link #applicationInterchangeProfile}
     */
    public String getApplicationInterchangeProfile() {
        return applicationInterchangeProfile;
    }

    /**
     * @param applicationInterchangeProfile {@link #applicationInterchangeProfile}
     */
    public void setApplicationInterchangeProfile(final String applicationInterchangeProfile) {
        this.applicationInterchangeProfile = applicationInterchangeProfile;
    }

    /**
     * @return {@link #applicationTransactionCounter}
     */
    public String getApplicationTransactionCounter() {
        return applicationTransactionCounter;
    }

    /**
     * @param applicationTransactionCounter {@link #applicationTransactionCounter}
     */
    public void setApplicationTransactionCounter(final String applicationTransactionCounter) {
        this.applicationTransactionCounter = applicationTransactionCounter;
    }

    /**
     * @return {@link #cardSequenceNumber}
     */
    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * @param cardSequenceNumber {@link #cardSequenceNumber}
     */
    public void setCardSequenceNumber(final String cardSequenceNumber) {
        this.cardSequenceNumber = cardSequenceNumber;
    }

    /**
     * @return {@link #cryptogramCashBackAmount}
     */
    public String getCryptogramCashBackAmount() {
        return cryptogramCashBackAmount;
    }

    /**
     * @param cryptogramCashBackAmount {@link #cryptogramCashBackAmount}
     */
    public void setCryptogramCashBackAmount(final String cryptogramCashBackAmount) {
        this.cryptogramCashBackAmount = cryptogramCashBackAmount;
    }

    /**
     * @return {@link #cryptogramInformationData}
     */
    public String getCryptogramInformationData() {
        return cryptogramInformationData;
    }

    /**
     * @param cryptogramInformationData {@link #cryptogramInformationData}
     */
    public void setCryptogramInformationData(final String cryptogramInformationData) {
        this.cryptogramInformationData = cryptogramInformationData;
    }

    /**
     * @return {@link #cryptogramTerminalCountryCode}
     */
    public String getCryptogramTerminalCountryCode() {
        return cryptogramTerminalCountryCode;
    }

    /**
     * @param cryptogramTerminalCountryCode {@link #cryptogramTerminalCountryCode}
     */
    public void setCryptogramTerminalCountryCode(final String cryptogramTerminalCountryCode) {
        this.cryptogramTerminalCountryCode = cryptogramTerminalCountryCode;
    }

    /**
     * @return {@link #cryptogramTransactionAmount}
     */
    public String getCryptogramTransactionAmount() {
        return cryptogramTransactionAmount;
    }

    /**
     * @param cryptogramTransactionAmount {@link #cryptogramTransactionAmount}
     */
    public void setCryptogramTransactionAmount(final String cryptogramTransactionAmount) {
        this.cryptogramTransactionAmount = cryptogramTransactionAmount;
    }

    /**
     * @return {@link #cryptogramTransactionDate}
     */
    public String getCryptogramTransactionDate() {
        return cryptogramTransactionDate;
    }

    /**
     * @param cryptogramTransactionDate {@link #cryptogramTransactionDate}
     */
    public void setCryptogramTransactionDate(final String cryptogramTransactionDate) {
        this.cryptogramTransactionDate = cryptogramTransactionDate;
    }

    /**
     * @return {@link #cryptogramTransactionType}
     */
    public String getCryptogramTransactionType() {
        return cryptogramTransactionType;
    }

    /**
     * @param cryptogramTransactionType {@link #cryptogramTransactionType}
     */
    public void setCryptogramTransactionType(final String cryptogramTransactionType) {
        this.cryptogramTransactionType = cryptogramTransactionType;
    }

    /**
     * @return {@link #cryptogramTransactioncurrencyCode}
     */
    public String getCryptogramTransactioncurrencyCode() {
        return cryptogramTransactioncurrencyCode;
    }

    /**
     * @param cryptogramTransactioncurrencyCode {@link #cryptogramTransactioncurrencyCode}
     */
    public void setCryptogramTransactioncurrencyCode(final String cryptogramTransactioncurrencyCode) {
        this.cryptogramTransactioncurrencyCode = cryptogramTransactioncurrencyCode;
    }

    /**
     * @return {@link #formFactorIndicator}
     */
    public String getFormFactorIndicator() {
        return formFactorIndicator;
    }

    /**
     * @param formFactorIndicator {@link #formFactorIndicator}
     */
    public void setFormFactorIndicator(final String formFactorIndicator) {
        this.formFactorIndicator = formFactorIndicator;
    }

    /**
     * @return {@link #issuerApplicationData}
     */
    public String getIssuerApplicationData() {
        return issuerApplicationData;
    }

    /**
     * @param issuerApplicationData {@link #issuerApplicationData}
     */
    public void setIssuerApplicationData(final String issuerApplicationData) {
        this.issuerApplicationData = issuerApplicationData;
    }

    /**
     * @return {@link #terminalCapabilityProfile}
     */
    public String getTerminalCapabilityProfile() {
        return terminalCapabilityProfile;
    }

    /**
     * @param terminalCapabilityProfile {@link #terminalCapabilityProfile}
     */
    public void setTerminalCapabilityProfile(final String terminalCapabilityProfile) {
        this.terminalCapabilityProfile = terminalCapabilityProfile;
    }

    /**
     * @return {@link #terminalVerificationResults}
     */
    public String getTerminalVerificationResults() {
        return terminalVerificationResults;
    }

    /**
     * @param terminalVerificationResults {@link #terminalVerificationResults}
     */
    public void setTerminalVerificationResults(final String terminalVerificationResults) {
        this.terminalVerificationResults = terminalVerificationResults;
    }

    /**
     * @return {@link #track2EquivalentDataChip}
     */
    public String getTrack2EquivalentDataChip() {
        return track2EquivalentDataChip;
    }

    /**
     * @param track2EquivalentDataChip {@link #track2EquivalentDataChip}
     */
    public void setTrack2EquivalentDataChip(final String track2EquivalentDataChip) {
        this.track2EquivalentDataChip = track2EquivalentDataChip;
    }

    /**
     * @return {@link #unpredictableNumber}
     */
    public String getUnpredictableNumber() {
        return unpredictableNumber;
    }

    /**
     * @param unpredictableNumber {@link #unpredictableNumber}
     */
    public void setUnpredictableNumber(final String unpredictableNumber) {
        this.unpredictableNumber = unpredictableNumber;
    }

    /**
     * @return {@link #applicationIdentifier}
     */
    public String getApplicationIdentifier() {
        return applicationIdentifier;
    }

    /**
     * @param applicationIdentifier {@link #applicationIdentifier}
     */
    public void setApplicationIdentifier(final String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * @return {@link #transactionStatusIndicator}
     */
    public String getTransactionStatusIndicator() {
        return transactionStatusIndicator;
    }

    /**
     * @param transactionStatusIndicator {@link #transactionStatusIndicator}
     */
    public void setTransactionStatusIndicator(final String transactionStatusIndicator) {
        this.transactionStatusIndicator = transactionStatusIndicator;
    }

    /**
     * @return {@link #applicationName}
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * @param applicationName {@link #applicationName}
     */
    public void setApplicationName(final String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * @return {@link #cardEntryMode}
     */
    public String getCardEntryMode() {
        return cardEntryMode;
    }

    /**
     * @param cardEntryMode {@link #cardEntryMode}
     */
    public void setCardEntryMode(final String cardEntryMode) {
        this.cardEntryMode = cardEntryMode;
    }

    /**
     * @return {@link #authorizationMode}
     */
    public String getAuthorizationMode() {
        return authorizationMode;
    }

    /**
     * @param authorizationMode {@link #authorizationMode}
     */
    public void setAuthorizationMode(final String authorizationMode) {
        this.authorizationMode = authorizationMode;
    }

    /**
     * @return {@link #cardholderVerification}
     */
    public String getCardholderVerification() {
        return cardholderVerification;
    }

    /**
     * @param cardholderVerification {@link #cardholderVerification}
     */
    public void setCardholderVerification(final String cardholderVerification) {
        this.cardholderVerification = cardholderVerification;
    }

    @Override
    public String toString() {
        return "Emv{" +
                "applicationCryptogram='" + applicationCryptogram + '\'' +
                ", applicationInterchangeProfile='" + applicationInterchangeProfile + '\'' +
                ", applicationTransactionCounter='" + applicationTransactionCounter + '\'' +
                ", cardSequenceNumber='" + cardSequenceNumber + '\'' +
                ", cryptogramCashBackAmount='" + cryptogramCashBackAmount + '\'' +
                ", cryptogramInformationData='" + cryptogramInformationData + '\'' +
                ", cryptogramTerminalCountryCode='" + cryptogramTerminalCountryCode + '\'' +
                ", cryptogramTransactionAmount='" + cryptogramTransactionAmount + '\'' +
                ", cryptogramTransactionDate='" + cryptogramTransactionDate + '\'' +
                ", cryptogramTransactionType='" + cryptogramTransactionType + '\'' +
                ", cryptogramTransactioncurrencyCode='" + cryptogramTransactioncurrencyCode + '\'' +
                ", formFactorIndicator='" + formFactorIndicator + '\'' +
                ", issuerApplicationData='" + issuerApplicationData + '\'' +
                ", terminalCapabilityProfile='" + terminalCapabilityProfile + '\'' +
                ", terminalVerificationResults='" + terminalVerificationResults + '\'' +
                ", track2EquivalentDataChip='" + track2EquivalentDataChip + '\'' +
                ", unpredictableNumber='" + unpredictableNumber + '\'' +
                ", applicationIdentifier='" + applicationIdentifier + '\'' +
                ", transactionStatusIndicator='" + transactionStatusIndicator + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", cardEntryMode='" + cardEntryMode + '\'' +
                ", authorizationMode='" + authorizationMode + '\'' +
                ", cardholderVerification='" + cardholderVerification + '\'' +
                '}';
    }

}
