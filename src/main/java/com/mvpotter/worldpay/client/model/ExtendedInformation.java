package com.mvpotter.worldpay.client.model;

import java.util.List;

/**
 * Additional data to assist in reporting, ecommerce or moto transactions, and level 2 or level 3 processing. Includes user-defined fields and invoice-related information.
 *
 * @author mvpotter
 * @since 12/08/2017
 */
public class ExtendedInformation {

    /**
     * type of goods that are being purchased
     */
    private GoodType typeOfGoods;

    /**
     * additional terminal information. Required to process checks when using the SEC code POINT_OF_SALE.
     */
    private AdditionalTerminalInfo additionalTerminalInfo;

    /**
     * information related to level two processing.
     */
    private LevelTwoData levelTwoData;

    /**
     * information related to level three processing.
     */
    private LevelThreeData levelThreeData;

    /**
     * device code of the device where the transaction originated.
     */
    private String deviceCode;

    /**
     * entry source of the transaction.
     */
    private String entrySource;

    /**
     * additional data for remote orders. Required in the case of a mail, phone, or ecommerce transaction.
     */
    private MailOrTelephoneOrderData mailOrTelephoneOrderData;

    /**
     * restaurant-related transaction information.
     */
    private ServiceData serviceData;

    /**
     * custom user-defined fields that can be sent with the transaction for reporting purposes.
     */
    private List<UserDefinedField> userDefinedFields;

    /**
     * notes associated with the transaction.
     */
    private String notes;

    /**
     * invoice number.
     */
    private String invoiceNumber;

    /**
     * invoice description.
     */
    private String invoiceDescription;

    /**
     * displays a description in addition to the merchants DBA. Maximum length is 25 characters
     */
    private String softDescriptor;

    /**
     * displays a 4 characters dynamic merchant category code.
     */
    private String dynamicMCC;

    /**
     * @return {@link #typeOfGoods}
     */
    public GoodType getTypeOfGoods() {
        return typeOfGoods;
    }

    /**
     * @param typeOfGoods {@link #typeOfGoods}
     */
    public void setTypeOfGoods(final GoodType typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    /**
     * @return {@link #additionalTerminalInfo}
     */
    public AdditionalTerminalInfo getAdditionalTerminalInfo() {
        return additionalTerminalInfo;
    }

    /**
     * @param additionalTerminalInfo {@link #additionalTerminalInfo}
     */
    public void setAdditionalTerminalInfo(final AdditionalTerminalInfo additionalTerminalInfo) {
        this.additionalTerminalInfo = additionalTerminalInfo;
    }

    /**
     * @return {@link #levelTwoData}
     */
    public LevelTwoData getLevelTwoData() {
        return levelTwoData;
    }

    /**
     * @param levelTwoData {@link #levelTwoData}
     */
    public void setLevelTwoData(final LevelTwoData levelTwoData) {
        this.levelTwoData = levelTwoData;
    }

    /**
     * @return {@link #levelThreeData}
     */
    public LevelThreeData getLevelThreeData() {
        return levelThreeData;
    }

    /**
     * @param levelThreeData {@link #levelThreeData}
     */
    public void setLevelThreeData(final LevelThreeData levelThreeData) {
        this.levelThreeData = levelThreeData;
    }

    /**
     * @return {@link #deviceCode}
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * @param deviceCode {@link #deviceCode}
     */
    public void setDeviceCode(final String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * @return {@link #entrySource}
     */
    public String getEntrySource() {
        return entrySource;
    }

    /**
     * @param entrySource {@link #entrySource}
     */
    public void setEntrySource(final String entrySource) {
        this.entrySource = entrySource;
    }

    /**
     * @return {@link #mailOrTelephoneOrderData}
     */
    public MailOrTelephoneOrderData getMailOrTelephoneOrderData() {
        return mailOrTelephoneOrderData;
    }

    /**
     * @param mailOrTelephoneOrderData {@link #mailOrTelephoneOrderData}
     */
    public void setMailOrTelephoneOrderData(final MailOrTelephoneOrderData mailOrTelephoneOrderData) {
        this.mailOrTelephoneOrderData = mailOrTelephoneOrderData;
    }

    /**
     * @return {@link #serviceData}
     */
    public ServiceData getServiceData() {
        return serviceData;
    }

    /**
     * @param serviceData {@link #serviceData}
     */
    public void setServiceData(final ServiceData serviceData) {
        this.serviceData = serviceData;
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
     * @return {@link #invoiceNumber}
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber {@link #invoiceNumber}
     */
    public void setInvoiceNumber(final String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
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

    @Override
    public String toString() {
        return "ExtendedInformation{" +
                "typeOfGoods=" + typeOfGoods +
                ", additionalTerminalInfo=" + additionalTerminalInfo +
                ", levelTwoData=" + levelTwoData +
                ", levelThreeData=" + levelThreeData +
                ", deviceCode='" + deviceCode + '\'' +
                ", entrySource='" + entrySource + '\'' +
                ", mailOrTelephoneOrderData=" + mailOrTelephoneOrderData +
                ", serviceData=" + serviceData +
                ", userDefinedFields=" + userDefinedFields +
                ", notes='" + notes + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", invoiceDescription='" + invoiceDescription + '\'' +
                ", softDescriptor='" + softDescriptor + '\'' +
                ", dynamicMCC='" + dynamicMCC + '\'' +
                '}';
    }

}
