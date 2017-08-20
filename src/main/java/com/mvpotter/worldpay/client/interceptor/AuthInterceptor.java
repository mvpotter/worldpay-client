package com.mvpotter.worldpay.client.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

/**
 * Adds authentication headers to every request.
 *
 * @author mvpotter
 * @since 06/08/2017
 */
public class AuthInterceptor implements Interceptor {

    private final String secureNetId;
    private final String secureKey;

    public AuthInterceptor(final String secureNetId, final String secureKey) {
        this.secureNetId = secureNetId;
        this.secureKey = secureKey;
    }

    @Override
    public Response intercept(final Chain chain) throws IOException {
        final Request original = chain.request();
        final Request.Builder requestBuilder = original.newBuilder()
                .header("Authorization", "Basic " + authId(secureNetId, secureKey));
        final Request request = requestBuilder.build();
        return chain.proceed(request);
    }

    private String authId(final String secureNetId, final String secureKey) {
        return DatatypeConverter.printBase64Binary((secureNetId + ":" + secureKey).getBytes());
    }

}