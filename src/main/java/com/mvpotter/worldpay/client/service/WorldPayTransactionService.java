package com.mvpotter.worldpay.client.service;

import com.mvpotter.worldpay.client.request.TransactionRequest;
import com.mvpotter.worldpay.client.request.TransactionSearchRequest;
import com.mvpotter.worldpay.client.response.TransactionResponse;
import com.mvpotter.worldpay.client.response.TransactionSearchResponse;
import com.mvpotter.worldpay.client.response.WorldPayTransactionResponse;
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
public interface WorldPayTransactionService {

    /**
     * Returns an array of all completed transactions that meet the specified search criteria.
     * The search method can be performed using a variety of parameters.
     *
     * @param request transaction search request
     * @return response with search results
     */
    @POST("/api/transactions/Search")
    Call<TransactionSearchResponse> search(@Body TransactionSearchRequest request);

    /**
     * Retrieves an individual transaction by its transaction ID.
     *
     * @param id transaction id
     * @return response with transaction details
     */
    @GET("/api/transactions/{transactionId}")
    Call<WorldPayTransactionResponse> search(@Path("transactionId") String id);

    /**
     * Updates an existing transaction with additional details, such as order number,
     * tax information, or signature details.
     *
     * @param id transaction id
     * @param request transaction request
     * @return response with transaction details
     */
    @PUT("/api/transactions/{transactionId}")
    Call<TransactionResponse> updateTransaction(@Path("transactionId") String id, @Body TransactionRequest request);

}
