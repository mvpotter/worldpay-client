package com.mvpotter.worldpay.client.response;

import com.mvpotter.worldpay.client.model.VaultCustomer;

/**
 * Response with customer details.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public class CustomerResponse extends WorldPayResponse {

    /**
     * customer identifier.
     */
    private String customerId;

    /**
     * contents of the newly created Vault customer record.
     */
    private VaultCustomer vaultCustomer;

    /**
     * @return {@link #customerId}
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId {@link #customerId}
     */
    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return {@link #vaultCustomer}
     */
    public VaultCustomer getVaultCustomer() {
        return vaultCustomer;
    }

    /**
     * @param vaultCustomer {@link #vaultCustomer}
     */
    public void setVaultCustomer(final VaultCustomer vaultCustomer) {
        this.vaultCustomer = vaultCustomer;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "customerId='" + customerId + '\'' +
                ", vaultCustomer=" + vaultCustomer +
                '}';
    }
}
