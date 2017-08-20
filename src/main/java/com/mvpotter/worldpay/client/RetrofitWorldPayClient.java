package com.mvpotter.worldpay.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mvpotter.worldpay.client.exception.WorldPayException;
import com.mvpotter.worldpay.client.interceptor.AuthInterceptor;
import com.mvpotter.worldpay.client.interceptor.DeveloperInfoInterceptor;
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
import com.mvpotter.worldpay.client.response.WorldPayResponse;
import com.mvpotter.worldpay.client.response.WorldPayTransactionResponse;
import com.mvpotter.worldpay.client.service.WorldPayBatchService;
import com.mvpotter.worldpay.client.service.WorldPayCustomerService;
import com.mvpotter.worldpay.client.service.WorldPayPaymentMethodService;
import com.mvpotter.worldpay.client.service.WorldPayPaymentScheduleService;
import com.mvpotter.worldpay.client.service.WorldPayPaymentService;
import com.mvpotter.worldpay.client.service.WorldPayTransactionService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author mvpotter
 * @since 05/08/2017
 */
public class RetrofitWorldPayClient implements WorldPayClient {

    public static final String BASE_URL = "https://gwapi.demo.securenet.com/";
    public static final String DEFAULT_VERSION = "1.2";
    public static final long DEFAULT_TIMEOUT = 30000;

    private static final Logger LOGGER = LoggerFactory.getLogger(RetrofitWorldPayClient.class);

    private final WorldPayBatchService batchService;
    private final WorldPayCustomerService customerService;
    private final WorldPayPaymentMethodService paymentMethodService;
    private final WorldPayPaymentScheduleService paymentScheduleService;
    private final WorldPayPaymentService paymentService;
    private final WorldPayTransactionService transactionService;

    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * Create Worldpay REST API client with demo URL (https://gwapi.demo.securenet.com/).
     *
     * @param secureNetId secure net id
     * @param secureKey secure key
     * @param developerId developer id
     */
    public RetrofitWorldPayClient(final String secureNetId, final String secureKey,
                                  final String developerId) {
        this(BASE_URL, secureNetId, secureKey, developerId, DEFAULT_VERSION);
    }

    /**
     * Create Worldpay REST API client.
     *
     * @param baseURL API URL
     * @param secureNetId secure net id
     * @param secureKey secure key
     * @param developerId developer id
     */
    public RetrofitWorldPayClient(final String baseURL, final String secureNetId,
                                  final String secureKey, final String developerId) {
        this(baseURL, secureNetId, secureKey, developerId, DEFAULT_VERSION, DEFAULT_TIMEOUT);
    }

    /**
     * Create Worldpay REST API client.
     *
     * @param baseURL API URL
     * @param secureNetId secure net id
     * @param secureKey secure key
     * @param developerId developer id
     * @param version API version
     */
    public RetrofitWorldPayClient(final String baseURL, final String secureNetId,
                                  final String secureKey, final String developerId,
                                  final String version) {
        this(baseURL, secureNetId, secureKey, developerId, version, DEFAULT_TIMEOUT);
    }

    /**
     * Create Worldpay REST API client.
     *
     * @param baseURL API URL
     * @param secureNetId secure net id
     * @param secureKey secure key
     * @param developerId developer id
     * @param version API version
     * @param timeout request timeout in milliseconds
     */
    public RetrofitWorldPayClient(final String baseURL, final String secureNetId,
                                  final String secureKey, final String developerId,
                                  final String version, final long timeout) {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(timeout, TimeUnit.MILLISECONDS)
                .readTimeout(timeout, TimeUnit.MILLISECONDS)
                .addInterceptor(new AuthInterceptor(secureNetId, secureKey))
                .addInterceptor(new DeveloperInfoInterceptor(mapper, developerId, version))
                .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(final String message) {
                        LOGGER.debug(message);
                    }
                }).setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .client(okHttpClient)
                .build();

        batchService = retrofit.create(WorldPayBatchService.class);
        customerService = retrofit.create(WorldPayCustomerService.class);
        paymentMethodService = retrofit.create(WorldPayPaymentMethodService.class);
        paymentScheduleService = retrofit.create(WorldPayPaymentScheduleService.class);
        paymentService = retrofit.create(WorldPayPaymentService.class);
        transactionService = retrofit.create(WorldPayTransactionService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditResponse credit(final CreditRequest creditRequest) throws IOException, WorldPayException {
        return body(paymentService.credit(creditRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundResponse refund(final RefundRequest refundRequest) throws IOException, WorldPayException {
        return body(paymentService.refund(refundRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VoidResponse voidTransaction(final VoidRequest voidRequest) throws IOException, WorldPayException {
        return body(paymentService.voidTransaction(voidRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionSearchResponse search(final TransactionSearchRequest request)
            throws IOException, WorldPayException {
        return body(transactionService.search(request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorldPayTransactionResponse search(final String id) throws IOException, WorldPayException {
        return body(transactionService.search(id).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionResponse updateTransaction(final String id, final TransactionRequest request)
            throws IOException, WorldPayException {
        return body(transactionService.updateTransaction(id, request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchResponse closeBatch(final WorldPayRequest request) throws IOException, WorldPayException {
        return body(batchService.closeBatch(request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchResponse batch(final String id) throws IOException, WorldPayException {
        return body(batchService.batch(id).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchResponse currentBatch() throws IOException, WorldPayException {
        return body(batchService.currentBatch().execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResponse createCustomer(final CustomerRequest customerRequest)
            throws IOException, WorldPayException {
        return body(customerService.createCustomer(customerRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResponse customer(final String customerId) throws IOException, WorldPayException {
        return body(customerService.customer(customerId).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerResponse updateCustomer(final String customerId, final CustomerRequest customerRequest)
            throws IOException, WorldPayException {
        return body(customerService.updateCustomer(customerId, customerRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentAccountResponse createPaymentAccount(final String customerId,
                                                       final PaymentAccountRequest paymentAccountRequest)
            throws IOException, WorldPayException {
        return body(paymentMethodService.createPaymentAccount(customerId, paymentAccountRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentAccountResponse paymentAccount(final String customerId, final String paymentMethodId)
            throws IOException, WorldPayException {
        return body(paymentMethodService.paymentAccount(customerId, paymentMethodId).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentAccountResponse updatePaymentAccount(final String customerId, final String paymentMethodId,
                                                       final PaymentAccountRequest request)
            throws IOException, WorldPayException {
        return body(paymentMethodService.updatePaymentAccount(customerId, paymentMethodId, request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentAccountResponse deletePaymentAccount(final String customerId, final String paymentMethodId,
                                                       final PaymentAccountRequest request)
            throws IOException, WorldPayException {
        return body(paymentMethodService.deletePaymentAccount(customerId, paymentMethodId, request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscribeResponse createSubscription(final String customerId, final SubscribeRequest subscribeRequest)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.createSubscription(customerId, subscribeRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscribeResponse updateSubscription(final String customerId, final String planId,
                                                final SubscribeRequest subscribeRequest)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.updateSubscription(customerId, planId, subscribeRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstallmentResponse createInstallment(final String customerId, final InstallmentRequest installmentRequest)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.createInstallment(customerId, installmentRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstallmentResponse updateInstallment(final String customerId, final String planId,
                                                 final InstallmentRequest installmentRequest)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.updateInstallment(customerId, planId, installmentRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariablePlanResponse createVariable(final String customerId, final VariablePlanRequest request)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.createVariable(customerId, request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariablePlanResponse updateVariable(final String customerId, final String planId,
                                               final VariablePlanRequest request)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.updateVariable(customerId, planId, request).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentPlanResponse paymentPlan(final String customerId, final String planId)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.paymentPlan(customerId, planId).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentPlanResponse deletePaymentPlan(final String customerId, final String planId)
            throws IOException, WorldPayException {
        return body(paymentScheduleService.deletePaymentPlan(customerId, planId).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorizationResponse authorize(final AuthorizationRequest authorizationRequest)
            throws IOException, WorldPayException {
        return body(paymentService.authorize(authorizationRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaptureResponse capture(final CaptureRequest captureRequest) throws IOException, WorldPayException {
        return body(paymentService.capture(captureRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyResponse verify(final VerifyRequest verifyRequest) throws IOException, WorldPayException {
        return body(paymentService.verify(verifyRequest).execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeResponse charge(final ChargeRequest chargeRequest) throws IOException {
        return body(paymentService.charge(chargeRequest).execute());
    }

    private <T extends WorldPayResponse> T body(final retrofit2.Response<T> response) throws IOException {
        if (response.isSuccessful()) {
            final T body = response.body();
            if (!WorldPayResponse.APPROVED.equals(body.getResponseCode())) {
                throw new WorldPayException(body);
            } else {
                return body;
            }
        } else {
            final WorldPayResponse errorResponse = mapper.readValue(response.errorBody().string(),
                                                                    WorldPayResponse.class);
            throw new WorldPayException(errorResponse);
        }
    }

}
