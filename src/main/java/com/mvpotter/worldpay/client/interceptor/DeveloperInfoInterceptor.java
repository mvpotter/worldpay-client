package com.mvpotter.worldpay.client.interceptor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mvpotter.worldpay.client.model.DeveloperApplication;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds developer information to every POST and PUT requests.
 *
 * @author mvpotter
 * @since 06/08/2017
 */
public class DeveloperInfoInterceptor implements Interceptor {

    private static final Set<String> METHODS_WITH_DEVELOPER_INFO = new HashSet<>(Arrays.asList("POST", "PUT"));

    private final ObjectMapper mapper;
    private final String developerId;
    private final String version;

    public DeveloperInfoInterceptor(final ObjectMapper mapper, final String developerId, final String version) {
        this.mapper = mapper;
        this.developerId = developerId;
        this.version = version;
    }

    @Override
    public Response intercept(final Chain chain) throws IOException {
        final Request original = chain.request();
        if (METHODS_WITH_DEVELOPER_INFO.contains(original.method())) {
            final RequestBody body = original.body();
            final ObjectNode node = (ObjectNode) mapper.readTree(bodyToString(body));
            final DeveloperApplication developerApplication = new DeveloperApplication(developerId, version);

            node.put("developerApplication", mapper.convertValue(developerApplication, JsonNode.class));
            final Request.Builder requestBuilder = original.newBuilder().method(
                    original.method(), RequestBody.create(body.contentType(), node.toString())
            );
            return chain.proceed(requestBuilder.build());
        }
        return chain.proceed(original);
    }

    private String bodyToString(final RequestBody request){
        try {
            final Buffer buffer = new Buffer();
            if(request != null) {
                request.writeTo(buffer);
            } else {
                return "";
            }
            return buffer.readUtf8();
        } catch (final IOException e) {
            return null;
        }
    }

}