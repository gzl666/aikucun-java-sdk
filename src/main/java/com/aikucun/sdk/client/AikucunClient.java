package com.aikucun.sdk.client;

import com.aikucun.sdk.config.AikucunConfig;
import com.aikucun.sdk.constant.InterfaceNames;
import com.aikucun.sdk.model.request.*;
import com.aikucun.sdk.model.response.*;

/**
 * High-level API client.
 */
public class AikucunClient extends AbstractAikucunClient {

    public AikucunClient(AikucunConfig config) {
        super(config);
    }

    // ---------------- aftersale ----------------

    public AftersaleConfirmResponse aftersaleConfirm(AftersaleConfirmRequest request, String accessToken) {
        return postJson(InterfaceNames.AFTERSALE_CONFIRM, request, accessToken, AftersaleConfirmResponse.class);
    }

    public AftersaleCancelResponse aftersaleCancel(AftersaleCancelRequest request, String accessToken) {
        return postJson(InterfaceNames.AFTERSALE_CANCEL, request, accessToken, AftersaleCancelResponse.class);
    }

    public AftersaleListResponse aftersaleList(AftersaleListRequest request, String accessToken) {
        return postJson(InterfaceNames.AFTERSALE_LIST, request, accessToken, AftersaleListResponse.class);
    }

    public AftersaleDetailResponse aftersaleDetail(AftersaleDetailRequest request, String accessToken) {
        return postJson(InterfaceNames.AFTERSALE_DETAIL, request, accessToken, AftersaleDetailResponse.class);
    }

    public AftersaleSaveExpressInfoResponse aftersaleSaveExpressInfo(AftersaleSaveExpressInfoRequest request, String accessToken) {
        return postJson(InterfaceNames.AFTERSALE_SAVE_EXPRESS_INFO, request, accessToken, AftersaleSaveExpressInfoResponse.class);
    }

    public AftersaleUpdateExpressInfoResponse aftersaleUpdateExpressInfo(AftersaleUpdateExpressInfoRequest request, String accessToken) {
        return postJson(InterfaceNames.AFTERSALE_UPDATE_EXPRESS_INFO, request, accessToken, AftersaleUpdateExpressInfoResponse.class);
    }

    // ---------------- supply order ----------------

    public SupplyOrderCreateResponse supplyOrderCreate(SupplyOrderCreateRequest request, String accessToken) {
        return postJson(InterfaceNames.SUPPLY_ORDER_CREATE, request, accessToken, SupplyOrderCreateResponse.class);
    }

    public SupplyOrderSplitResponse supplyOrderSplit(SupplyOrderSplitRequest request, String accessToken) {
        return postJson(InterfaceNames.SUPPLY_ORDER_SPLIT, request, accessToken, SupplyOrderSplitResponse.class);
    }

    public SupplyOrderPayResponse supplyOrderPay(SupplyOrderPayRequest request, String accessToken) {
        return postJson(InterfaceNames.SUPPLY_ORDER_PAY, request, accessToken, SupplyOrderPayResponse.class);
    }

    public SupplyOrderCancelBeforePayResponse supplyOrderCancelBeforePay(SupplyOrderCancelBeforePayRequest request, String accessToken) {
        return postJson(InterfaceNames.SUPPLY_ORDER_CANCEL_BEFORE_PAY, request, accessToken, SupplyOrderCancelBeforePayResponse.class);
    }
}
