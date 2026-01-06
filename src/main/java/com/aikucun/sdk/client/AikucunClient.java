package com.aikucun.sdk.client;

import com.aikucun.sdk.common.ApiResponse;
import com.aikucun.sdk.constant.InterfaceNames;
import com.aikucun.sdk.model.request.AfterSaleConfirmOrderRequest;

/**
 * 爱库存客户端
 */
public class AikucunClient extends AbstractAikucunClient {

    public AikucunClient(String serverUrl, String appKey, String appSecret) {
        super(serverUrl, appKey, appSecret);
    }

    /**
     * 售后确认订单
     */
    public ApiResponse<Boolean> afterSaleConfirmOrder(AfterSaleConfirmOrderRequest request) {
        return execute(InterfaceNames.AFTERSALE_CONFIRM_ORDER, request, Boolean.class);
    }

    /**
     * 售后确认订单（指定 accessToken）
     */
    public ApiResponse<Boolean> afterSaleConfirmOrder(AfterSaleConfirmOrderRequest request, String accessTokenOverride) {
        return execute(InterfaceNames.AFTERSALE_CONFIRM_ORDER, request, accessTokenOverride, Boolean.class);
    }

    /**
     * 售后确认订单（Checked 版本，返回 data）
     */
    public Boolean afterSaleConfirmOrderChecked(AfterSaleConfirmOrderRequest request) {
        return executeChecked(InterfaceNames.AFTERSALE_CONFIRM_ORDER, request, Boolean.class);
    }

    /**
     * 售后确认订单（Checked 版本，指定 accessToken，返回 data）
     */
    public Boolean afterSaleConfirmOrderChecked(AfterSaleConfirmOrderRequest request, String accessTokenOverride) {
        return executeChecked(InterfaceNames.AFTERSALE_CONFIRM_ORDER, request, accessTokenOverride, Boolean.class);
    }
}
