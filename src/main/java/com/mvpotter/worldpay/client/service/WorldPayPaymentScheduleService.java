package com.mvpotter.worldpay.client.service;

import com.mvpotter.worldpay.client.request.InstallmentRequest;
import com.mvpotter.worldpay.client.request.SubscribeRequest;
import com.mvpotter.worldpay.client.request.VariablePlanRequest;
import com.mvpotter.worldpay.client.response.InstallmentResponse;
import com.mvpotter.worldpay.client.response.PaymentPlanResponse;
import com.mvpotter.worldpay.client.response.SubscribeResponse;
import com.mvpotter.worldpay.client.response.VariablePlanResponse;
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
public interface WorldPayPaymentScheduleService {

    /**
     * Create Recurring Payment Plan.<br>
     * <br>
     * A recurring payment plan pays for a repeated delivery or service
     * (e.g., a magazine subscription or gym membership) on an ongoing basis.
     * Payments are of equal amounts and are billed on a regular schedule until the subscription ends
     * or is cancelled. Once the plan is created, the customer is billed automatically.<br>
     * <br>
     * In a Recurring payment plan:<br>
     * The same dollar amount is billed each billing period<br>
     * The merchant can select an end date for the schedule or the schedule can have no end date
     *
     * @param customerId customer id
     * @param subscribeRequest subscribe request
     * @return response with subscription details
     */
    @POST("/api/Customers/{customerId}/PaymentSchedules/Recurring")
    Call<SubscribeResponse> createSubscription(@Path("customerId") String customerId,
                                               @Body SubscribeRequest subscribeRequest);

    /**
     * Updates the Recurring payment plan.<br>
     * <br>
     * In a Recurring payment plan:<br>
     * The same dollar amount is billed each billing period<br>
     * The merchant can select an end date for the schedule or the schedule can have no end date
     *
     * @param customerId customer id
     * @param planId subscription plan id
     * @param subscribeRequest subscribe request
     * @return response with subscription details
     */
    @PUT("/api/Customers/{customerId}/PaymentSchedules/Recurring/{planId}")
    Call<SubscribeResponse> updateSubscription(@Path("customerId") String customerId, @Path("planId") String planId,
                                               @Body SubscribeRequest subscribeRequest);

    /**
     * Create Installment Plan.<br>
     * <br>
     * An installment payment plan is similar to a recurring payment plan in that payments are of equal amounts
     * and billed on a regular schedule; however, an installment plan is usually associated with a single
     * large purchase, and divides the purchase amount into a set number of equal payments, with a possible
     * additional "balloon" or remainder payment.<br>
     * <br>
     * In an installment payment plan:<br>
     * Schedules are calculated on the basis of the total amount due and the number of installment payments<br>
     * The balloon payment, if any, may be applied to either the first or the last payment of the schedule
     *
     * @param customerId customer id
     * @param installmentRequest installment request
     * @return response with installment details
     */
    @POST("/api/Customers/{customerId}/PaymentSchedules/Installment")
    Call<InstallmentResponse> createInstallment(@Path("customerId") String customerId,
                                                @Body InstallmentRequest installmentRequest);

    /**
     * Updates an existing Installment plan.<br>
     * <br>
     * In an installment payment plan:<br>
     * Schedules are calculated on the basis of the total amount due and the number of installment payments<br>
     * The balloon payment, if any, may be applied to either the first or the last payment of the schedule
     *
     * @param customerId customer id
     * @param planId installment plan id
     * @param installmentRequest installment request
     * @return response with installment details
     */
    @PUT("/api/Customers/{customerId}/PaymentSchedules/Installment/{planId}")
    Call<InstallmentResponse> updateInstallment(@Path("customerId") String customerId, @Path("planId") String planId,
                                                @Body InstallmentRequest installmentRequest);

    /**
     * Create Variable Payment Plan.<br>
     * <br>
     * A variable payment plan associates a completely customized payment schedule with an existing customer.
     * Once the plan is created, the customer is billed automatically.<br>
     * <br>
     * In a variable payment plan:<br>
     * The billing schedule is based on any combination of amounts and dates
     *
     * @param customerId customer id
     * @param request variable payment request
     * @return response with variable payment details
     */
    @POST("/api/Customers/{customerId}/PaymentSchedules/Variable")
    Call<VariablePlanResponse> createVariable(@Path("customerId") String customerId,
                                              @Body VariablePlanRequest request);

    /**
     * Update Variable Payment Plan.<br>
     * <br>
     * A variable payment plan associates a completely customized payment schedule with an existing customer.
     * Once the plan is created, the customer is billed automatically.<br>
     * <br>
     * In a variable payment plan:<br>
     * The billing schedule is based on any combination of amounts and dates
     *
     * @param customerId customer id
     * @param planId variable payment plan id
     * @param request variable payment request
     * @return response with variable payment details
     */
    @PUT("/api/Customers/{customerId}/PaymentSchedules/Variable/{planId}")
    Call<VariablePlanResponse> updateVariable(@Path("customerId") String customerId, @Path("planId") String planId,
                                              @Body VariablePlanRequest request);

    /**
     * Retrieve Payment Plan.<br>
     * <br>
     * A Retrieive Payment Plan method call returns a particular payment plan for a given customer.
     * As shown below, the call identifies the customer by customerId and the plan by planId.
     * The specified plan may be recurring, installment, or variable.<br>
     *
     * @param customerId customer id
     * @param planId plan id
     * @return response with payment plan details
     */
    @GET("/api/Customers/{customerId}/PaymentSchedules/{planId}")
    Call<PaymentPlanResponse> paymentPlan(@Path("customerId") String customerId,
                                          @Path("planId") String planId);

    /**
     * Deletes a payment plan for a customer in the vault.
     *
     * @param customerId customer id
     * @param planId plan id
     * @return response with payment plan details
     */
    @DELETE("/api/Customers/{customerId}/PaymentSchedules/{planId}")
    Call<PaymentPlanResponse> deletePaymentPlan(@Path("customerId") String customerId,
                                                @Path("planId") String planId);

}
