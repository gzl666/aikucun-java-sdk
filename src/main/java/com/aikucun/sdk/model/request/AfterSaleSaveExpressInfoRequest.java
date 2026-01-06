package com.aikucun.sdk.model.request;

import com.aikucun.sdk.model.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 售后保存寄件信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AfterSaleSaveExpressInfoRequest extends BaseRequest {

    /**
     * 售后单号
     */
    private String afterSalesNo;

    /**
     * 物流公司编码
     */
    private String logisticsCode;

    /**
     * 运单号
     */
    private String expressNo;

    /**
     * 第三方用户ID
     */
    private String thirdUserId;
}
