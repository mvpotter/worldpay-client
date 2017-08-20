package com.mvpotter.worldpay.client.model;

/**
 * Payment installment plan.
 *
 * @author mvpotter
 * @since 14/08/2017
 */
public class InstallmentPlan extends SubscriptionPlan {

    /**
     * total amount to be billed under the plan.
     */
    private double totalAmount;

    /**
     * total number of installments in the plan.
     */
    private int numberOfPayments;

    /**
     * individual installment amount.
     */
    private double installmentAmount;

    /**
     * balloon amount.
     */
    private double balloonAmount;

    /**
     * indicates whether the balloon payment is to be applied to the first or last payment:<br>
     * <br>
     * 0 - add balloon amount to first payment<br>
     * 1 - add balloon amount to last payment
     */
    private String balloonPaymentAddedTo;

    /**
     * 	amount of the final payment.
     */
    private double remainderAmount;

    /**
     * indicates whether the remainder should be applied to the first or last payment if installments are not equally divided:<br>
     * <br>
     * 0 - add remainder to first payment<br>
     * 1 - add remainder to last payment
     */
    private String remainderPaymentAddedTo;

    /**
     * @return {@link #totalAmount}
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount {@link #totalAmount}
     */
    public void setTotalAmount(final double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return {@link #numberOfPayments}
     */
    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * @param numberOfPayments {@link #numberOfPayments}
     */
    public void setNumberOfPayments(final int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    /**
     * @return {@link #installmentAmount}
     */
    public double getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * @param installmentAmount {@link #installmentAmount}
     */
    public void setInstallmentAmount(final double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    /**
     * @return {@link #balloonAmount}
     */
    public double getBalloonAmount() {
        return balloonAmount;
    }

    /**
     * @param balloonAmount {@link #balloonAmount}
     */
    public void setBalloonAmount(final double balloonAmount) {
        this.balloonAmount = balloonAmount;
    }

    /**
     * @return {@link #balloonPaymentAddedTo}
     */
    public String getBalloonPaymentAddedTo() {
        return balloonPaymentAddedTo;
    }

    /**
     * @param balloonPaymentAddedTo {@link #balloonPaymentAddedTo}
     */
    public void setBalloonPaymentAddedTo(final String balloonPaymentAddedTo) {
        this.balloonPaymentAddedTo = balloonPaymentAddedTo;
    }

    /**
     * @return {@link #remainderAmount}
     */
    public double getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * @param remainderAmount {@link #remainderAmount}
     */
    public void setRemainderAmount(final double remainderAmount) {
        this.remainderAmount = remainderAmount;
    }

    /**
     * @return {@link #remainderPaymentAddedTo}
     */
    public String getRemainderPaymentAddedTo() {
        return remainderPaymentAddedTo;
    }

    /**
     * @param remainderPaymentAddedTo {@link #remainderPaymentAddedTo}
     */
    public void setRemainderPaymentAddedTo(final String remainderPaymentAddedTo) {
        this.remainderPaymentAddedTo = remainderPaymentAddedTo;
    }

    @Override
    public String toString() {
        return "InstallmentPlan{" +
                "totalAmount=" + totalAmount +
                ", numberOfPayments=" + numberOfPayments +
                ", installmentAmount=" + installmentAmount +
                ", balloonAmount=" + balloonAmount +
                ", balloonPaymentAddedTo='" + balloonPaymentAddedTo + '\'' +
                ", remainderAmount=" + remainderAmount +
                ", remainderPaymentAddedTo='" + remainderPaymentAddedTo + '\'' +
                '}';
    }

}