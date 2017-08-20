package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 14/08/2017
 */
public class Product {

    /**
     * alternate tax id.
     */
    private String alternateTaxId;

    /**
     * commodity code.
     */
    private String commodityCode;

    /**
     * discount amount.
     */
    private Double discountAmount;

    /**
     * discount rate.
     */
    private Double discountRate;

    /**
     * discount indicator.
     */
    private String discountIndicator;

    /**
     * gross net indicator.
     */
    private String grossNetIndicator;

    /**
     * item code.
     */
    private String itemCode;

    /**
     * item name.
     */
    private String itemName;

    /**
     * item description.
     */
    private String itemDescription;

    /**
     * unit.
     */
    private String unit;

    /**
     * unit price.
     */
    private Double unitPrice;

    /**
     * quantity.
     */
    private Double quantity;

    /**
     * 	total amount.
     */
    private Double totalAmount;

    /**
     * tax amount.
     */
    private Double taxAmount;

    /**
     * tax rate.
     */
    private Double taxRate;

    /**
     * tax type identifier.
     */
    private String taxTypeIdentifier;

    /**
     * tax type applied.
     */
    private String taxTypeApplied;

    /**
     * indicates whether product is taxable.
     */
    private Boolean taxable;

    /**
     * @return {@link #alternateTaxId}
     */
    public String getAlternateTaxId() {
        return alternateTaxId;
    }

    /**
     * @param alternateTaxId {@link #alternateTaxId}
     */
    public void setAlternateTaxId(final String alternateTaxId) {
        this.alternateTaxId = alternateTaxId;
    }

    /**
     * @return {@link #commodityCode}
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * @param commodityCode {@link #commodityCode}
     */
    public void setCommodityCode(final String commodityCode) {
        this.commodityCode = commodityCode;
    }

    /**
     * @return {@link #discountAmount}
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * @param discountAmount {@link #discountAmount}
     */
    public void setDiscountAmount(final Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * @return {@link #discountRate}
     */
    public Double getDiscountRate() {
        return discountRate;
    }

    /**
     * @param discountRate {@link #discountRate}
     */
    public void setDiscountRate(final Double discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * @return {@link #discountIndicator}
     */
    public String getDiscountIndicator() {
        return discountIndicator;
    }

    /**
     * @param discountIndicator {@link #discountIndicator}
     */
    public void setDiscountIndicator(final String discountIndicator) {
        this.discountIndicator = discountIndicator;
    }

    /**
     * @return {@link #grossNetIndicator}
     */
    public String getGrossNetIndicator() {
        return grossNetIndicator;
    }

    /**
     * @param grossNetIndicator {@link #grossNetIndicator}
     */
    public void setGrossNetIndicator(final String grossNetIndicator) {
        this.grossNetIndicator = grossNetIndicator;
    }

    /**
     * @return {@link #itemCode}
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode {@link #itemCode}
     */
    public void setItemCode(final String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return {@link #itemName}
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName {@link #itemName}
     */
    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return {@link #itemDescription}
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription {@link #itemDescription}
     */
    public void setItemDescription(final String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return {@link #unit}
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit {@link #unit}
     */
    public void setUnit(final String unit) {
        this.unit = unit;
    }

    /**
     * @return {@link #unitPrice}
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice {@link #unitPrice}
     */
    public void setUnitPrice(final Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return {@link #quantity}
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity {@link #quantity}
     */
    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return {@link #totalAmount}
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount {@link #totalAmount}
     */
    public void setTotalAmount(final Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return {@link #taxAmount}
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * @param taxAmount {@link #taxAmount}
     */
    public void setTaxAmount(final Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * @return {@link #taxRate}
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate {@link #taxRate}
     */
    public void setTaxRate(final Double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * @return {@link #taxTypeIdentifier}
     */
    public String getTaxTypeIdentifier() {
        return taxTypeIdentifier;
    }

    /**
     * @param taxTypeIdentifier {@link #taxTypeIdentifier}
     */
    public void setTaxTypeIdentifier(final String taxTypeIdentifier) {
        this.taxTypeIdentifier = taxTypeIdentifier;
    }

    /**
     * @return {@link #taxTypeApplied}
     */
    public String getTaxTypeApplied() {
        return taxTypeApplied;
    }

    /**
     * @param taxTypeApplied {@link #taxTypeApplied}
     */
    public void setTaxTypeApplied(final String taxTypeApplied) {
        this.taxTypeApplied = taxTypeApplied;
    }

    /**
     * @return {@link #taxable}
     */
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * @param taxable {@link #taxable}
     */
    public void setTaxable(final Boolean taxable) {
        this.taxable = taxable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "alternateTaxId='" + alternateTaxId + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", discountAmount=" + discountAmount +
                ", discountRate=" + discountRate +
                ", discountIndicator='" + discountIndicator + '\'' +
                ", grossNetIndicator='" + grossNetIndicator + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", unit='" + unit + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                ", taxAmount=" + taxAmount +
                ", taxRate=" + taxRate +
                ", taxTypeIdentifier='" + taxTypeIdentifier + '\'' +
                ", taxTypeApplied='" + taxTypeApplied + '\'' +
                ", taxable=" + taxable +
                '}';
    }

}
