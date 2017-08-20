package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.PaymentAccount;

/**
 * Response with payment account details.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class PaymentAccountResponse extends WorldPayResponse {

    /**
     * contents of the newly created payment account record.
     */
    private PaymentAccount vaultPaymentMethod;

    /**
     * @return {@link #vaultPaymentMethod}
     */
    public PaymentAccount getVaultPaymentMethod() {
        return vaultPaymentMethod;
    }

    /**
     * @param vaultPaymentMethod {@link #vaultPaymentMethod}
     */
    public void setVaultPaymentMethod(final PaymentAccount vaultPaymentMethod) {
        this.vaultPaymentMethod = vaultPaymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentAccountResponse{" +
                "vaultPaymentMethod=" + vaultPaymentMethod +
                '}';
    }

}
