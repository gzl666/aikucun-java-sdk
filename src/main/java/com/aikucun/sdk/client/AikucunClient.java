package com.aikucun.sdk.client;

import com.aikucun.sdk.config.AikucunConfig;
import com.aikucun.sdk.constant.InterfaceNames;
import com.aikucun.sdk.exception.AikucunApiException;
import com.aikucun.sdk.model.request.*;
import com.aikucun.sdk.model.response.ApiResponse;
import com.aikucun.sdk.model.response.data.*;
import com.aikucun.sdk.util.SignatureUtil;
import com.aikucun.sdk.util.UrlUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class AikucunClient {

    private final AikucunConfig config;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public AikucunClient(AikucunConfig config) {
        this(config, HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build(), new ObjectMapper());
    }

    public AikucunClient(AikucunConfig config, HttpClient httpClient, ObjectMapper objectMapper) {
        this.config = config;
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    // -------------------- Goods APIs --------------------

    public ApiResponse<GoodsSupplyDetailData> goodsDetail(GoodsSupplyDetailRequest request) {
        return goodsDetail(request, null);
    }

    public ApiResponse<GoodsSupplyDetailData> goodsDetail(GoodsSupplyDetailRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.GOODS_DETAIL, request, accessTokenOverride, objectMapper.constructType(GoodsSupplyDetailData.class));
    }

    public GoodsSupplyDetailData goodsDetailChecked(GoodsSupplyDetailRequest request) {
        return goodsDetailChecked(request, null);
    }

    public GoodsSupplyDetailData goodsDetailChecked(GoodsSupplyDetailRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.GOODS_DETAIL, request, accessTokenOverride, objectMapper.constructType(GoodsSupplyDetailData.class));
    }

    public ApiResponse<GoodsQuerySkuStockData> goodsQuerySkuStock(GoodsQuerySkuStockRequest request) {
        return goodsQuerySkuStock(request, null);
    }

    public ApiResponse<GoodsQuerySkuStockData> goodsQuerySkuStock(GoodsQuerySkuStockRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.GOODS_QUERY_SKU_STOCK, request, accessTokenOverride, objectMapper.constructType(GoodsQuerySkuStockData.class));
    }

    public GoodsQuerySkuStockData goodsQuerySkuStockChecked(GoodsQuerySkuStockRequest request) {
        return goodsQuerySkuStockChecked(request, null);
    }

    public GoodsQuerySkuStockData goodsQuerySkuStockChecked(GoodsQuerySkuStockRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.GOODS_QUERY_SKU_STOCK, request, accessTokenOverride, objectMapper.constructType(GoodsQuerySkuStockData.class));
    }

    public ApiResponse<GoodsQueryListByRuleData> goodsQueryListByRule(GoodsQueryListByRuleRequest request) {
        return goodsQueryListByRule(request, null);
    }

    public ApiResponse<GoodsQueryListByRuleData> goodsQueryListByRule(GoodsQueryListByRuleRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.GOODS_QUERY_LIST_BY_RULE, request, accessTokenOverride, objectMapper.constructType(GoodsQueryListByRuleData.class));
    }

    public GoodsQueryListByRuleData goodsQueryListByRuleChecked(GoodsQueryListByRuleRequest request) {
        return goodsQueryListByRuleChecked(request, null);
    }

    public GoodsQueryListByRuleData goodsQueryListByRuleChecked(GoodsQueryListByRuleRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.GOODS_QUERY_LIST_BY_RULE, request, accessTokenOverride, objectMapper.constructType(GoodsQueryListByRuleData.class));
    }

    public ApiResponse<GoodsSupplySearchData> goodsSearch(GoodsSupplySearchRequest request) {
        return goodsSearch(request, null);
    }

    public ApiResponse<GoodsSupplySearchData> goodsSearch(GoodsSupplySearchRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.GOODS_SEARCH, request, accessTokenOverride, objectMapper.constructType(GoodsSupplySearchData.class));
    }

    public GoodsSupplySearchData goodsSearchChecked(GoodsSupplySearchRequest request) {
        return goodsSearchChecked(request, null);
    }

    public GoodsSupplySearchData goodsSearchChecked(GoodsSupplySearchRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.GOODS_SEARCH, request, accessTokenOverride, objectMapper.constructType(GoodsSupplySearchData.class));
    }

    // -------------------- Order APIs --------------------

    public ApiResponse<SupplyOrderCreateData> orderCreate(SupplyOrderCreateRequest request) {
        return orderCreate(request, null);
    }

    public ApiResponse<SupplyOrderCreateData> orderCreate(SupplyOrderCreateRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.ORDER_CREATE, request, accessTokenOverride, objectMapper.constructType(SupplyOrderCreateData.class));
    }

    public SupplyOrderCreateData orderCreateChecked(SupplyOrderCreateRequest request) {
        return orderCreateChecked(request, null);
    }

    public SupplyOrderCreateData orderCreateChecked(SupplyOrderCreateRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.ORDER_CREATE, request, accessTokenOverride, objectMapper.constructType(SupplyOrderCreateData.class));
    }

    public ApiResponse<SupplyOrderSplitData> orderSplit(SupplyOrderSplitRequest request) {
        return orderSplit(request, null);
    }

    public ApiResponse<SupplyOrderSplitData> orderSplit(SupplyOrderSplitRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.ORDER_SPLIT, request, accessTokenOverride, objectMapper.constructType(SupplyOrderSplitData.class));
    }

    public SupplyOrderSplitData orderSplitChecked(SupplyOrderSplitRequest request) {
        return orderSplitChecked(request, null);
    }

    public SupplyOrderSplitData orderSplitChecked(SupplyOrderSplitRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.ORDER_SPLIT, request, accessTokenOverride, objectMapper.constructType(SupplyOrderSplitData.class));
    }

    public ApiResponse<Boolean> orderPay(SupplyOrderPayRequest request) {
        return orderPay(request, null);
    }

    public ApiResponse<Boolean> orderPay(SupplyOrderPayRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.ORDER_PAY, request, accessTokenOverride, objectMapper.constructType(Boolean.class));
    }

    public Boolean orderPayChecked(SupplyOrderPayRequest request) {
        return orderPayChecked(request, null);
    }

    public Boolean orderPayChecked(SupplyOrderPayRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.ORDER_PAY, request, accessTokenOverride, objectMapper.constructType(Boolean.class));
    }

    public ApiResponse<Boolean> orderCancelBeforePay(SupplyOrderCancelBeforePayRequest request) {
        return orderCancelBeforePay(request, null);
    }

    public ApiResponse<Boolean> orderCancelBeforePay(SupplyOrderCancelBeforePayRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.ORDER_CANCEL_BEFORE_PAY, request, accessTokenOverride, objectMapper.constructType(Boolean.class));
    }

    public Boolean orderCancelBeforePayChecked(SupplyOrderCancelBeforePayRequest request) {
        return orderCancelBeforePayChecked(request, null);
    }

    public Boolean orderCancelBeforePayChecked(SupplyOrderCancelBeforePayRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.ORDER_CANCEL_BEFORE_PAY, request, accessTokenOverride, objectMapper.constructType(Boolean.class));
    }

    // -------------------- AfterSale APIs --------------------

    public ApiResponse<AfterSaleReturnAddressData> afterSaleReturnAddress(AfterSaleReturnAddressRequest request) {
        return afterSaleReturnAddress(request, null);
    }

    public ApiResponse<AfterSaleReturnAddressData> afterSaleReturnAddress(AfterSaleReturnAddressRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.AFTERSALE_RETURN_ADDRESS, request, accessTokenOverride, objectMapper.constructType(AfterSaleReturnAddressData.class));
    }

    public AfterSaleReturnAddressData afterSaleReturnAddressChecked(AfterSaleReturnAddressRequest request) {
        return afterSaleReturnAddressChecked(request, null);
    }

    public AfterSaleReturnAddressData afterSaleReturnAddressChecked(AfterSaleReturnAddressRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.AFTERSALE_RETURN_ADDRESS, request, accessTokenOverride, objectMapper.constructType(AfterSaleReturnAddressData.class));
    }

    public ApiResponse<List<AfterSaleApplyOrderResultItem>> afterSaleApplyOrder(AfterSaleApplyOrderRequest request) {
        return afterSaleApplyOrder(request, null);
    }

    public ApiResponse<List<AfterSaleApplyOrderResultItem>> afterSaleApplyOrder(AfterSaleApplyOrderRequest request, String accessTokenOverride) {
        JavaType listType = objectMapper.getTypeFactory().constructCollectionType(List.class, AfterSaleApplyOrderResultItem.class);
        return execute(InterfaceNames.AFTERSALE_APPLY_ORDER, request, accessTokenOverride, listType);
    }

    public List<AfterSaleApplyOrderResultItem> afterSaleApplyOrderChecked(AfterSaleApplyOrderRequest request) {
        return afterSaleApplyOrderChecked(request, null);
    }

    public List<AfterSaleApplyOrderResultItem> afterSaleApplyOrderChecked(AfterSaleApplyOrderRequest request, String accessTokenOverride) {
        JavaType listType = objectMapper.getTypeFactory().constructCollectionType(List.class, AfterSaleApplyOrderResultItem.class);
        return executeChecked(InterfaceNames.AFTERSALE_APPLY_ORDER, request, accessTokenOverride, listType);
    }

    // -------------------- Core executor --------------------

    public <R> ApiResponse<R> execute(String interfaceName, Object bizRequest, String accessTokenOverride, JavaType dataType) {
        try {
            String nonceStr = UUID.randomUUID().toString().replace("-", "");
            String timestamp = String.valueOf(System.currentTimeMillis());

            // query params
            Map<String, Object> query = new HashMap<>();
            query.put("appId", config.getAppId());
            query.put("method", interfaceName);
            query.put("format", config.getFormat());
            query.put("v", config.getVersion());
            query.put("timestamp", timestamp);
            query.put("nonceStr", nonceStr);

            String token = accessTokenOverride != null ? accessTokenOverride : config.getAccessToken();
            if (token != null && !token.isEmpty()) {
                query.put("accessToken", token);
            }

            // sign params (same as query typically; optionally includes accessToken)
            Map<String, Object> signParams = new HashMap<>(query);
            if (!config.isSignWithAccessToken()) {
                signParams.remove("accessToken");
            }
            String sign = SignatureUtil.signMd5(config.getAppSecret(), signParams);
            query.put("sign", sign);

            String url = config.getBaseUrl();
            String qs = UrlUtil.buildQueryString(query);
            if (qs != null && !qs.isEmpty()) {
                url = url + (url.contains("?") ? "&" : "?") + qs;
            }

            String body = bizRequest == null ? "{}" : objectMapper.writeValueAsString(bizRequest);

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofSeconds(30))
                    .header("Content-Type", "application/json; charset=UTF-8")
                    .POST(HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8))
                    .build();

            HttpResponse<String> resp = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

            JavaType apiType = objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, dataType);
            return objectMapper.readValue(resp.body(), apiType);
        } catch (Exception e) {
            throw new RuntimeException("Request failed: " + interfaceName, e);
        }
    }

    public <R> R executeChecked(String interfaceName, Object bizRequest, String accessTokenOverride, JavaType dataType) {
        ApiResponse<R> resp = execute(interfaceName, bizRequest, accessTokenOverride, dataType);
        if (resp == null || resp.getSuccess() == null || !resp.getSuccess()) {
            String code = resp == null ? null : resp.getCode();
            String msg = resp == null ? "null response" : resp.getMessage();
            throw new AikucunApiException(code, msg);
        }
        return resp.getData();
    }
}
