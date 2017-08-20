package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class LevelTwoData {

    /**
     * date of the transaction.
     */
    private String orderDate;

    /**
     * purchase order number associated with the transaction
     */
    private String purchaseOrder;

    /**
     * duty amount included in the transaction.
     */
    private Double dutyAmount;

    /**
     * freight amount included in the transaction.
     */
    private Double freightAmount;

    /**
     * lane number at which the transaction was completed in a retail environment.
     */
    private String retailLaneNumber;

    /**
     * tax amount for the transaction.
     */
    private Double taxAmount;

    /**
     * tax status of the transaction.
     */
    private Status status;

    /**
     * @return {@link #orderDate}
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate {@link #orderDate}
     */
    public void setOrderDate(final String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return {@link #purchaseOrder}
     */
    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * @param purchaseOrder {@link #purchaseOrder}
     */
    public void setPurchaseOrder(final String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    /**
     * @return {@link #dutyAmount}
     */
    public Double getDutyAmount() {
        return dutyAmount;
    }

    /**
     * @param dutyAmount {@link #dutyAmount}
     */
    public void setDutyAmount(final Double dutyAmount) {
        this.dutyAmount = dutyAmount;
    }

    /**
     * @return {@link #freightAmount}
     */
    public Double getFreightAmount() {
        return freightAmount;
    }

    /**
     * @param freightAmount {@link #freightAmount}
     */
    public void setFreightAmount(final Double freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * @return {@link #retailLaneNumber}
     */
    public String getRetailLaneNumber() {
        return retailLaneNumber;
    }

    /**
     * @param retailLaneNumber {@link #retailLaneNumber}
     */
    public void setRetailLaneNumber(final String retailLaneNumber) {
        this.retailLaneNumber = retailLaneNumber;
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
     * @return {@link #status}
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status {@link #status}
     */
    public void setStatus(final Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LevelThreeData{" +
                "orderDate='" + orderDate + '\'' +
                ", purchaseOrder='" + purchaseOrder + '\'' +
                ", dutyAmount=" + dutyAmount +
                ", freightAmount=" + freightAmount +
                ", retailLaneNumber='" + retailLaneNumber + '\'' +
                ", taxAmount=" + taxAmount +
                ", status=" + status +
                '}';
    }

}
