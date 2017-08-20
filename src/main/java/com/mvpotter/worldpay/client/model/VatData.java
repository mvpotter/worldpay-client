package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 14/08/2017
 */
public class VatData {

    /**
     * Vat Number used for the purchase
     */
    private String purchaserVatNumber;

    /**
     * Merchant Vat Number
     */
    private String merchantVatNumber;

    /**
     * Tax Rate
     */
    private Double taxRate;

    /**
     * @return {@link #purchaserVatNumber}
     */
    public String getPurchaserVatNumber() {
        return purchaserVatNumber;
    }

    /**
     * @param purchaserVatNumber {@link #purchaserVatNumber}
     */
    public void setPurchaserVatNumber(final String purchaserVatNumber) {
        this.purchaserVatNumber = purchaserVatNumber;
    }

    /**
     * @return {@link #merchantVatNumber}
     */
    public String getMerchantVatNumber() {
        return merchantVatNumber;
    }

    /**
     * @param merchantVatNumber {@link #merchantVatNumber}
     */
    public void setMerchantVatNumber(final String merchantVatNumber) {
        this.merchantVatNumber = merchantVatNumber;
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

    @Override
    public String toString() {
        return "VatData{" +
                "purchaserVatNumber='" + purchaserVatNumber + '\'' +
                ", merchantVatNumber='" + merchantVatNumber + '\'' +
                ", taxRate=" + taxRate +
                '}';
    }

}
