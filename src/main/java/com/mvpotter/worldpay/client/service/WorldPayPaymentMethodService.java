package com.mvpotter.worldpay.client.service;

import com.mvpotter.worldpay.client.request.PaymentAccountRequest;
import com.mvpotter.worldpay.client.response.PaymentAccountResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Worldpay REST API interface.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public interface WorldPayPaymentMethodService {

    /**
     * Creates a payment method record in the Vault.<br>
     * <br>
     * A Vault account stores a payment method. Each Vault payment account is linked to a specific customer ID. Once a Vault account is created and associated with a customer, it can be used for subsequent charges or for recurring billing. The payment method can be a credit card, pinless debit, or ACH payment account.
     *
     * @param customerId identifier for the customer whose payment method is being created
     * @param paymentAccountRequest payment account request
     * @return response with payment account details
     */
    @POST("/api/Customers/{customerId}/PaymentMethod")
    Call<PaymentAccountResponse> createPaymentAccount(@Path("customerId") String customerId,
                                                      @Body PaymentAccountRequest paymentAccountRequest);

    /**
     * Retrieves a payment account record from the Vault.
     *
     * @param customerId identifier for the customer whose payment method is being updated
     * @param paymentMethodId unique (per customer) identifier for the payment method to be updated.
     *                        If this parameter is not supplied, the update is performed by default on the customer's
     *                        primary payment account.
     * @return response with payment account details
     */
    @GET("/api/Customers/{customerId}/PaymentMethod/{paymentMethodId}")
    Call<PaymentAccountResponse> paymentAccount(@Path("customerId") String customerId,
                                                @Path("paymentMethodId") String paymentMethodId);

    /**
     * Updates an existing payment account record in the Vault.
     *
     * @param customerId identifier for the customer whose payment method is being updated
     * @param paymentMethodId unique (per customer) identifier for the payment method to be updated.
     *                        If this parameter is not supplied, the update is performed by default on the customer's
     *                        primary payment account.
     * @param paymentAccountRequest payment account request
     * @return response with payment account details
     */
    @PUT("/api/Customers/{customerId}/PaymentMethod/{paymentMethodId}")
    Call<PaymentAccountResponse> updatePaymentAccount(@Path("customerId") String customerId,
                                                      @Path("paymentMethodId") String paymentMethodId,
                                                      @Body PaymentAccountRequest paymentAccountRequest);

    /**
     * Removes an existing payment account record from the Vault.
     *
     * @param customerId identifier for the customer whose payment method is being deleted
     * @param paymentMethodId unique (per customer) identifier for the payment method to be updated.
     *                        If this parameter is not supplied, the update is performed by default on the customer's
     *                        primary payment account.
     * @param paymentAccountRequest payment account request
     * @return response with operation details
     */
    @DELETE("/api/Customers/{customerId}/PaymentMethod/{paymentMethodId}")
    Call<PaymentAccountResponse> deletePaymentAccount(@Path("customerId") String customerId,
                                                      @Path("paymentMethodId") String paymentMethodId,
                                                      @Body PaymentAccountRequest paymentAccountRequest);

}
