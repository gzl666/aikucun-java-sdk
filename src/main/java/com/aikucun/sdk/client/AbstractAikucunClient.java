package com.aikucun.sdk.client;

import com.aikucun.sdk.config.AikucunConfig;
import com.aikucun.sdk.exception.AikucunSdkException;
import com.aikucun.sdk.util.HttpUtil;
import com.aikucun.sdk.util.SignUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Base client that performs POST(JSON) to serverUrl with required query parameters.
 */
public abstract class AbstractAikucunClient {

    protected final AikucunConfig config;
    protected final HttpClient httpClient;
    protected final ObjectMapper objectMapper;

    protected AbstractAikucunClient(AikucunConfig config) {
        this(config,
                HttpClient.newBuilder()
                        .connectTimeout(Duration.ofSeconds(10))
                        .build(),
                new ObjectMapper());
    }

    protected AbstractAikucunClient(AikucunConfig config, HttpClient httpClient, ObjectMapper objectMapper) {
        this.config = config;
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    protected <T> T postJson(String interfaceName, Object requestObj, String accessToken, Class<T> responseType) {
        try {
            String json = requestObj == null ? "{}" : objectMapper.writeValueAsString(requestObj);

            Map<String, Object> q = new LinkedHashMap<>();
            q.put("appid", config.getAppid());
            q.put("version", config.getVersion());
            q.put("format", config.getFormat());
            q.put("interfaceName", interfaceName);
            if (accessToken != null && !accessToken.isBlank()) {
                q.put("accessToken", accessToken);
            }

            Map<String, String> sign = SignUtil.genSign(
                    config.getAppid(),
                    config.getAppsecret(),
                    interfaceName,
                    q,
                    json,
                    accessToken
            );
            q.put("noncestr", sign.get("noncestr"));
            q.put("timestamp", sign.get("timestampSeconds"));
            q.put("sign", sign.get("sign"));

            String url = config.getServerUrl();
            String query = HttpUtil.buildQuery(q);
            if (query != null && !query.isBlank()) {
                url = url + (url.contains("?") ? "&" : "?") + query;
            }

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofSeconds(30))
                    .header("Content-Type", "application/json; charset=UTF-8")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> resp = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            if (resp.statusCode() < 200 || resp.statusCode() >= 300) {
                throw new AikucunSdkException("HTTP " + resp.statusCode() + ": " + resp.body());
            }
            return objectMapper.readValue(resp.body(), responseType);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AikucunSdkException("Request failed", e);
        }
    }
}
