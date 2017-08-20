package com.mvpotter.worldpay.client.model;

import java.util.List;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class LevelThreeData {

    /**
     * details of the product(s) that make up the total transaction.
     */
    private List<Product> products;

    /**
     * value added tax (VAT) information.
     */
    private VatData vatData;

    /**
     * date of the transaction.
     */
    private String orderDate;

    /**
     * destination address of the purchased items.
     */
    private Address destinationAddress;

    /**
     * origin address of the purchased items.
     */
    private Address originAddress;

    /**
     * amount of discount applied to the purchased items.
     */
    private Double discountAmount;

    /**
     * @return {@link #products}
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products {@link #products}
     */
    public void setProducts(final List<Product> products) {
        this.products = products;
    }

    /**
     * @return {@link #vatData}
     */
    public VatData getVatData() {
        return vatData;
    }

    /**
     * @param vatData {@link #vatData}
     */
    public void setVatData(final VatData vatData) {
        this.vatData = vatData;
    }

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
     * @return {@link #destinationAddress}
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * @param destinationAddress {@link #destinationAddress}
     */
    public void setDestinationAddress(final Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    /**
     * @return {@link #originAddress}
     */
    public Address getOriginAddress() {
        return originAddress;
    }

    /**
     * @param originAddress {@link #originAddress}
     */
    public void setOriginAddress(final Address originAddress) {
        this.originAddress = originAddress;
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

    @Override
    public String toString() {
        return "LevelThreeData{" +
                "products=" + products +
                ", vatData=" + vatData +
                ", orderDate='" + orderDate + '\'' +
                ", destinationAddress=" + destinationAddress +
                ", originAddress=" + originAddress +
                ", discountAmount=" + discountAmount +
                '}';
    }

}
