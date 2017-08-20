package com.mvpotter.worldpay.client.model;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class MailOrTelephoneOrderData {

    /**
     * type of transaction.
     */
    private OrderType type;

    /**
     * total number of installments. Required if type is INSTALLMENT.
     */
    private String totalNumberOfInstallments;

    /**
     * current installment number. Required if type is INSTALLMENT.
     */
    private String currentInstallment;

    /**
     * @return {@link #type}
     */
    public OrderType getType() {
        return type;
    }

    /**
     * @param type {@link #type}
     */
    public void setType(final OrderType type) {
        this.type = type;
    }

    /**
     * @return {@link #totalNumberOfInstallments}
     */
    public String getTotalNumberOfInstallments() {
        return totalNumberOfInstallments;
    }

    /**
     * @param totalNumberOfInstallments {@link #totalNumberOfInstallments}
     */
    public void setTotalNumberOfInstallments(final String totalNumberOfInstallments) {
        this.totalNumberOfInstallments = totalNumberOfInstallments;
    }

    /**
     * @return {@link #currentInstallment}
     */
    public String getCurrentInstallment() {
        return currentInstallment;
    }

    /**
     * @param currentInstallment {@link #currentInstallment}
     */
    public void setCurrentInstallment(final String currentInstallment) {
        this.currentInstallment = currentInstallment;
    }

    @Override
    public String toString() {
        return "MailOrTelephoneOrderData{" +
                "type=" + type +
                ", totalNumberOfInstallments='" + totalNumberOfInstallments + '\'' +
                ", currentInstallment='" + currentInstallment + '\'' +
                '}';
    }

}
