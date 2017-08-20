package com.mvpotter.worldpay.client.service;

import com.mvpotter.worldpay.client.request.AuthorizationRequest;
import com.mvpotter.worldpay.client.request.CaptureRequest;
import com.mvpotter.worldpay.client.request.ChargeRequest;
import com.mvpotter.worldpay.client.request.CreditRequest;
import com.mvpotter.worldpay.client.request.RefundRequest;
import com.mvpotter.worldpay.client.request.VerifyRequest;
import com.mvpotter.worldpay.client.request.VoidRequest;
import com.mvpotter.worldpay.client.response.AuthorizationResponse;
import com.mvpotter.worldpay.client.response.CaptureResponse;
import com.mvpotter.worldpay.client.response.ChargeResponse;
import com.mvpotter.worldpay.client.response.CreditResponse;
import com.mvpotter.worldpay.client.response.RefundResponse;
import com.mvpotter.worldpay.client.response.VerifyResponse;
import com.mvpotter.worldpay.client.response.VoidResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Worldpay REST API interface.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public interface WorldPayPaymentService {

    /**
     * This call authorizes a transaction but does not capture the transaction for settlement. In a card-present environment, this option is most commonly used in service industry transactions where an initial amount is authorized prior to a gratuity being added. If the Authorization Only call is used, a subsequent Prior Auth Capture call must be made to capture the transaction for settlement.
     *
     * @param authorizationRequest authorization request
     * @return response with authorization details
     */
    @POST("/api/Payments/Authorize")
    Call<AuthorizationResponse> authorize(@Body AuthorizationRequest authorizationRequest);

    /**
     * This call allows a previously authorized transaction to be captured for settlement. In a card-present environment, Prior Auth Capture is commonly used when the transaction amount must be modified during capture, e.g., in the service industry when a gratuity is added to the original amount.
     *
     * @param captureRequest capture request
     * @return response with capture details
     */
    @POST("/api/Payments/Capture")
    Call<CaptureResponse> capture(@Body CaptureRequest captureRequest);

    /**
     * Card verification is available for Credit card transactions. Card verification allows merchants to verify the cardholder account number, address, or security code.
     *
     * @param verifyRequest verify request
     * @return response with verify details
     */
    @POST("/api/Payments/Verify")
    Call<VerifyResponse> verify(@Body VerifyRequest verifyRequest);

    /**
     * Charge an account.<br>
     * This call authorizes the transaction and, if successful, captures it.
     * Unlike in an Authorize Only request, the merchant will receive funding
     * without performing a secondary capture request when using Charge.
     *
     * @param chargeRequest charge request
     * @return response with charge details
     */
    @POST("/api/Payments/Charge")
    Call<ChargeResponse> charge(@Body ChargeRequest chargeRequest);

    /**
     * The Credit method does not require a linked settled transaction. The only required parameters are therefore an amount and the details of a payment method (card, check, or Vault token).
     *
     * @param creditRequest credit request
     * @return response with credit details
     */
    @POST("/api/Payments/Credit")
    Call<CreditResponse> credit(@Body CreditRequest creditRequest);

    /**
     * The Refund method must be linked to a settled transaction. This is done by specifying the transactionId from the original Authorization or Charge as part of the request. By default, this method refunds the FULL amount of the transaction. However, you can perform a partial refund by passing a specific amount. If a refund is attempted on a transaction that has not yet settled, the PayOS API will automatically run a Void on the transaction. The transactionType in this case will switch to Void.
     *
     * @param refundRequest refund request
     * @return response with refund details
     */
    @POST("/api/Payments/Refund")
    Call<RefundResponse> refund(@Body RefundRequest refundRequest);

    /**
     * Voiding a transaction will cancel the transaction prior to settlement.
     *
     * @param voidRequest void request
     * @return response with void details
     */
    @POST("/api/Payments/Void")
    Call<VoidResponse> voidTransaction(@Body VoidRequest voidRequest);

}
