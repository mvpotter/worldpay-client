package com.mvpotter.worldpay.client.service;

import com.mvpotter.worldpay.client.request.CustomerRequest;
import com.mvpotter.worldpay.client.response.CustomerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
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
public interface WorldPayCustomerService {

    /**
     * Creates a customer record in the Vault.<br>
     * <br>
     * All payment accounts in the Vault are associated with a customer, so before adding a payment account, it is necessary to create a customer record. A single customer may have multiple stored payment accounts, any of which may be set for recurring billing or used to run transactions.
     *
     * @param customerRequest customer request
     * @return response with customer details
     */
    @POST("/api/Customers")
    Call<CustomerResponse> createCustomer(@Body CustomerRequest customerRequest);

    /**
     * Retrieves a customer record from the Vault.
     *
     * @param customerId customer id
     * @return response with customer details
     */
    @GET("/api/Customers/{customerId}")
    Call<CustomerResponse> customer(@Path("customerId") String customerId);

    /**
     * Updates a customer record in the Vault.
     *
     * @param customerId customer id
     * @param customerRequest customer request
     * @return response with customer details
     */
    @PUT("/api/Customers/{customerId}")
    Call<CustomerResponse> updateCustomer(@Path("customerId") String customerId, @Body CustomerRequest customerRequest);

}
