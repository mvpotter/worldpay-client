package com.mvpotter.worldpay.client.model.transaction;

/**
 * @author mvpotter
 * @since 13/08/2017
 */
public class AdditionalData {

    /**
     * For stored value cards this is the Previous Balance (15 characters long zero filled decimal number with explicit decimal point) followed by Cash Out Amount (15 characters long zero filled decimal number with explicit decimal point).
     */
    private String additionalData1;

    /**
     * For EBT transactions, it will contain the FNS # echoed from the ADDITIONALINFO field of the MERCHANT_KEY object. For stored value cards this is the virtual issued card number.
     */
    private String additionalData2;

    /**
     * For EBT transactions, it will contain the Voucher # echoed from the ADDITIONALINFO field of the CARD object. For stored value cards it is the issued card EXP date.
     */
    private String additionalData3;

    /**
     * Virtual issued card pin number. Used only for specific stored value card transactions.
     */
    private String additionalData4;

    /**
     * P2P Encryption Transaction Response-String (22 Characters): 7-digit Key ID + {1,2} + MMddyyyyHHmmss
     */
    private String additionalData5;

    /**
     * @return {@link #additionalData1}
     */
    public String getAdditionalData1() {
        return additionalData1;
    }

    /**
     * @param additionalData1 {@link #additionalData1}
     */
    public void setAdditionalData1(final String additionalData1) {
        this.additionalData1 = additionalData1;
    }

    /**
     * @return {@link #additionalData2}
     */
    public String getAdditionalData2() {
        return additionalData2;
    }

    /**
     * @param additionalData2 {@link #additionalData2}
     */
    public void setAdditionalData2(final String additionalData2) {
        this.additionalData2 = additionalData2;
    }

    /**
     * @return {@link #additionalData3}
     */
    public String getAdditionalData3() {
        return additionalData3;
    }

    /**
     * @param additionalData3 {@link #additionalData3}
     */
    public void setAdditionalData3(final String additionalData3) {
        this.additionalData3 = additionalData3;
    }

    /**
     * @return {@link #additionalData4}
     */
    public String getAdditionalData4() {
        return additionalData4;
    }

    /**
     * @param additionalData4 {@link #additionalData4}
     */
    public void setAdditionalData4(final String additionalData4) {
        this.additionalData4 = additionalData4;
    }

    /**
     * @return {@link #additionalData5}
     */
    public String getAdditionalData5() {
        return additionalData5;
    }

    /**
     * @param additionalData5 {@link #additionalData5}
     */
    public void setAdditionalData5(final String additionalData5) {
        this.additionalData5 = additionalData5;
    }

    @Override
    public String toString() {
        return "AdditionalData{" +
                "additionalData1='" + additionalData1 + '\'' +
                ", additionalData2='" + additionalData2 + '\'' +
                ", additionalData3='" + additionalData3 + '\'' +
                ", additionalData4='" + additionalData4 + '\'' +
                ", additionalData5='" + additionalData5 + '\'' +
                '}';
    }

}
