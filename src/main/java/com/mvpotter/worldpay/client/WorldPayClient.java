package com.mvpotter.worldpay.client;

import com.mvpotter.worldpay.client.exception.WorldPayException;
import com.mvpotter.worldpay.client.request.AuthorizationRequest;
import com.mvpotter.worldpay.client.request.CaptureRequest;
import com.mvpotter.worldpay.client.request.ChargeRequest;
import com.mvpotter.worldpay.client.request.CreditRequest;
import com.mvpotter.worldpay.client.request.CustomerRequest;
import com.mvpotter.worldpay.client.request.InstallmentRequest;
import com.mvpotter.worldpay.client.request.PaymentAccountRequest;
import com.mvpotter.worldpay.client.request.RefundRequest;
import com.mvpotter.worldpay.client.request.SubscribeRequest;
import com.mvpotter.worldpay.client.request.TransactionRequest;
import com.mvpotter.worldpay.client.request.TransactionSearchRequest;
import com.mvpotter.worldpay.client.request.VariablePlanRequest;
import com.mvpotter.worldpay.client.request.VerifyRequest;
import com.mvpotter.worldpay.client.request.VoidRequest;
import com.mvpotter.worldpay.client.request.WorldPayRequest;
import com.mvpotter.worldpay.client.response.AuthorizationResponse;
import com.mvpotter.worldpay.client.response.BatchResponse;
import com.mvpotter.worldpay.client.response.CaptureResponse;
import com.mvpotter.worldpay.client.response.ChargeResponse;
import com.mvpotter.worldpay.client.response.CreditResponse;
import com.mvpotter.worldpay.client.response.CustomerResponse;
import com.mvpotter.worldpay.client.response.InstallmentResponse;
import com.mvpotter.worldpay.client.response.PaymentAccountResponse;
import com.mvpotter.worldpay.client.response.PaymentPlanResponse;
import com.mvpotter.worldpay.client.response.RefundResponse;
import com.mvpotter.worldpay.client.response.SubscribeResponse;
import com.mvpotter.worldpay.client.response.TransactionResponse;
import com.mvpotter.worldpay.client.response.TransactionSearchResponse;
import com.mvpotter.worldpay.client.response.VariablePlanResponse;
import com.mvpotter.worldpay.client.response.VerifyResponse;
import com.mvpotter.worldpay.client.response.VoidResponse;
import com.mvpotter.worldpay.client.response.WorldPayTransactionResponse;

import java.io.IOException;

/**
 * Worldpay REST API client.
 *
 * @author mvpotter
 * @since 05/08/2017
 */
public interface WorldPayClient {

    /**
     * Closing the current open batch settles all captured transactions in the batch, and can be accomplished with a single standalone POST (shown below).
     *
     * @param request close batch request
     *
     * @return response with batch details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    BatchResponse closeBatch(WorldPayRequest request) throws IOException, WorldPayException;

    /**
     * Once a batch is closed, you can obtain a list of all transactions associated with it using this call. If the call is successful, the method will return an array of all the transactions that were part of the batch, including the full details of each as returned during the original authorization.
     *
     * @param id batch id
     *
     * @return response with batch details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    BatchResponse batch(String id) throws IOException, WorldPayException;

    /**
     * Calling this method retrieves the current open batch. No parameters are necessary; the method is called by means of a single standalone POST (shown below). If successful, it returns an array of the transactions in the open batch, along with the full details of each as returned during the original authorization.
     *
     * @return response with batch details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    BatchResponse currentBatch() throws IOException, WorldPayException;

    /**
     * Creates a customer record in the Vault.<br>
     * <br>
     * All payment accounts in the Vault are associated with a customer, so before adding a payment account, it is necessary to create a customer record. A single customer may have multiple stored payment accounts, any of which may be set for recurring billing or used to run transactions.
     *
     * @param customerRequest customer request
     *
     * @return response with customer details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    CustomerResponse createCustomer(CustomerRequest customerRequest) throws IOException, WorldPayException;

    /**
     * Retrieves a customer record from the Vault.
     *
     * @param customerId customer id
     *
     * @return response with customer details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    CustomerResponse customer(String customerId) throws IOException, WorldPayException;

    /**
     * Updates a customer record in the Vault.
     *
     * @param customerId customer id
     * @param customerRequest customer request
     *
     * @return response with customer details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    CustomerResponse updateCustomer(String customerId, CustomerRequest customerRequest)
            throws IOException, WorldPayException;

    /**
     * Creates a payment method record in the Vault.<br>
     * <br>
     * A Vault account stores a payment method. Each Vault payment account is linked to a specific customer ID. Once a Vault account is created and associated with a customer, it can be used for subsequent charges or for recurring billing. The payment method can be a credit card, pinless debit, or ACH payment account.
     *
     * @param customerId identifier for the customer whose payment method is being created
     * @param paymentAccountRequest payment account request
     *
     * @return response with payment account details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    PaymentAccountResponse createPaymentAccount(String customerId, PaymentAccountRequest paymentAccountRequest)
            throws IOException, WorldPayException;

    /**
     * Retrieves a payment account record from the Vault.
     *
     * @param customerId identifier for the customer whose payment method is being updated
     * @param paymentMethodId unique (per customer) identifier for the payment method to be updated.
     *                        If this parameter is not supplied, the update is performed by default on the customer's
     *                        primary payment account.
     *
     * @return response with payment account details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    PaymentAccountResponse paymentAccount(String customerId, String paymentMethodId)
            throws IOException, WorldPayException;

    /**
     * Updates an existing payment account record in the Vault.
     *
     * @param customerId identifier for the customer whose payment method is being updated
     * @param paymentMethodId unique (per customer) identifier for the payment method to be updated.
     *                        If this parameter is not supplied, the update is performed by default on the customer's
     *                        primary payment account.
     * @param paymentAccountRequest payment account request
     *
     * @return response with payment account details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    PaymentAccountResponse updatePaymentAccount(String customerId, String paymentMethodId,
                                                PaymentAccountRequest paymentAccountRequest)
            throws IOException, WorldPayException;

    /**
     * Removes an existing payment account record from the Vault.
     *
     * @param customerId identifier for the customer whose payment method is being deleted
     * @param paymentMethodId unique (per customer) identifier for the payment method to be updated.
     *                        If this parameter is not supplied, the update is performed by default on the customer's
     *                        primary payment account.
     * @param paymentAccountRequest payment account request
     *
     * @return response with operation details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    PaymentAccountResponse deletePaymentAccount(String customerId, String paymentMethodId,
                                                PaymentAccountRequest paymentAccountRequest)
            throws IOException, WorldPayException;

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
     *
     * @return response with subscription details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    SubscribeResponse createSubscription(String customerId, SubscribeRequest subscribeRequest)
            throws IOException, WorldPayException;

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
     *
     * @return response with subscription details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    SubscribeResponse updateSubscription(String customerId, String planId, SubscribeRequest subscribeRequest)
            throws IOException, WorldPayException;

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
     *
     * @return response with installment details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    InstallmentResponse createInstallment(String customerId, InstallmentRequest installmentRequest)
            throws IOException, WorldPayException;

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
     *
     * @return response with installment details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    InstallmentResponse updateInstallment(String customerId, String planId, InstallmentRequest installmentRequest)
            throws IOException, WorldPayException;

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
     *
     * @return response with variable payment details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    VariablePlanResponse createVariable(String customerId, VariablePlanRequest request)
            throws IOException, WorldPayException;

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
     *
     * @return response with variable payment details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    VariablePlanResponse updateVariable(String customerId, String planId, VariablePlanRequest request)
            throws IOException, WorldPayException;

    /**
     * Retrieve Payment Plan.<br>
     * <br>
     * A Retrieive Payment Plan method call returns a particular payment plan for a given customer.
     * As shown below, the call identifies the customer by customerId and the plan by planId.
     * The specified plan may be recurring, installment, or variable.<br>
     *
     * @param customerId customer id
     * @param planId plan id
     *
     * @return response with payment plan details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    PaymentPlanResponse paymentPlan(String customerId, String planId) throws IOException, WorldPayException;

    /**
     * Deletes a payment plan for a customer in the vault.
     *
     * @param customerId customer id
     * @param planId plan id
     *
     * @return response with payment plan details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    PaymentPlanResponse deletePaymentPlan(String customerId, String planId) throws IOException, WorldPayException;

    /**
     * This call authorizes a transaction but does not capture the transaction for settlement. In a card-present environment, this option is most commonly used in service industry transactions where an initial amount is authorized prior to a gratuity being added. If the Authorization Only call is used, a subsequent Prior Auth Capture call must be made to capture the transaction for settlement.
     *
     * @param authorizationRequest authorization request
     *
     * @return response with authorization details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    AuthorizationResponse authorize(AuthorizationRequest authorizationRequest) throws IOException, WorldPayException;

    /**
     * This call allows a previously authorized transaction to be captured for settlement. In a card-present environment, Prior Auth Capture is commonly used when the transaction amount must be modified during capture, e.g., in the service industry when a gratuity is added to the original amount.
     *
     * @param captureRequest capture request
     *
     * @return response with capture details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    CaptureResponse capture(CaptureRequest captureRequest) throws IOException, WorldPayException;

    /**
     * Card verification is available for Credit card transactions. Card verification allows merchants to verify the cardholder account number, address, or security code.
     *
     * @param verifyRequest verify request
     *
     * @return response with verify details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    VerifyResponse verify(VerifyRequest verifyRequest) throws IOException, WorldPayException;

    /**
     * Charge an account.<br>
     * This call authorizes the transaction and, if successful, captures it.
     * Unlike in an Authorize Only request, the merchant will receive funding
     * without performing a secondary capture request when using Charge.
     *
     * @param chargeRequest charge request
     *
     * @return response with charge details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    ChargeResponse charge(ChargeRequest chargeRequest) throws IOException, WorldPayException;

    /**
     * The Credit method does not require a linked settled transaction. The only required parameters are therefore an amount and the details of a payment method (card, check, or Vault token).
     *
     * @param creditRequest credit request
     *
     * @return response with credit details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    CreditResponse credit(CreditRequest creditRequest) throws IOException, WorldPayException;

    /**
     * The Refund method must be linked to a settled transaction. This is done by specifying the transactionId from the original Authorization or Charge as part of the request. By default, this method refunds the FULL amount of the transaction. However, you can perform a partial refund by passing a specific amount. If a refund is attempted on a transaction that has not yet settled, the PayOS API will automatically run a Void on the transaction. The transactionType in this case will switch to Void.
     *
     * @param refundRequest refund request
     *
     * @return response with refund details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    RefundResponse refund(RefundRequest refundRequest) throws IOException, WorldPayException;

    /**
     * Voiding a transaction will cancel the transaction prior to settlement.
     *
     * @param voidRequest void request
     *
     * @return response with void details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    VoidResponse voidTransaction(VoidRequest voidRequest) throws IOException, WorldPayException;

    /**
     * Returns an array of all completed transactions that meet the specified search criteria.
     * The search method can be performed using a variety of parameters.
     *
     * @param request transaction search request
     *
     * @return response with search results
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    TransactionSearchResponse search(TransactionSearchRequest request) throws IOException, WorldPayException;

    /**
     * Retrieves an individual transaction by its transaction ID.
     *
     * @param id transaction id
     *
     * @return response with transaction details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    WorldPayTransactionResponse search(String id) throws IOException, WorldPayException;

    /**
     * Updates an existing transaction with additional details, such as order number,
     * tax information, or signature details.
     *
     * @param id transaction id
     * @param request transaction request
     *
     * @return response with transaction details
     *
     * @throws IOException in case of network errors
     * @throws WorldPayException in case of Worldpay issues
     */
    TransactionResponse updateTransaction(String id, TransactionRequest request) throws IOException, WorldPayException;
    
}
