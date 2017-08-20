package com.mvpotter.worldpay.client.service;

import com.mvpotter.worldpay.client.request.WorldPayRequest;
import com.mvpotter.worldpay.client.response.BatchResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Worldpay REST API interface.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public interface WorldPayBatchService {

    /**
     * Closing the current open batch settles all captured transactions in the batch, and can be accomplished with a single standalone POST (shown below).
     *
     * @param request close batch request
     * @return response with batch details
     */
    @POST("/api/batches/Close")
    Call<BatchResponse> closeBatch(@Body WorldPayRequest request);

    /**
     * Once a batch is closed, you can obtain a list of all transactions associated with it using this call. If the call is successful, the method will return an array of all the transactions that were part of the batch, including the full details of each as returned during the original authorization.
     *
     * @param id batch id
     * @return response with batch details
     */
    @GET("/api/batches/{id}")
    Call<BatchResponse> batch(@Path("id") String id);

    /**
     * Calling this method retrieves the current open batch. No parameters are necessary; the method is called by means of a single standalone POST (shown below). If successful, it returns an array of the transactions in the open batch, along with the full details of each as returned during the original authorization.
     *
     * @return response with batch details
     */
    @GET("/api/batches/Current")
    Call<BatchResponse> currentBatch();

}
