package com.aikucun.sdk.model.request;

import com.aikucun.sdk.common.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 售后确认订单请求
 * <p>
 * 接口：mengxiang.aftersale.confirm.order
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AfterSaleConfirmOrderRequest extends BaseRequest {

    /**
     * 售后单号
     */
    private String afterSalesNo;

    /**
     * 确认类型
     */
    private Integer confirmType;

    /**
     * 确认状态
     */
    private Boolean confirmStatus;

    /**
     * 第三方用户ID
     */
    private String thirdUserId;
}
