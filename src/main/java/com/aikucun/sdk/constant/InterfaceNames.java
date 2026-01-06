package com.aikucun.sdk.constant;

/**
 * Interface name constants for Aikucun/Mengxiang OpenAPI.
 */
public final class InterfaceNames {

    private InterfaceNames() {
    }

    // aftersale APIs
    public static final String AFTERSALE_CONFIRM = "mengxiang.aftersale.confirm";
    public static final String AFTERSALE_CANCEL = "mengxiang.aftersale.cancel";
    public static final String AFTERSALE_LIST = "mengxiang.aftersale.list";
    public static final String AFTERSALE_DETAIL = "mengxiang.aftersale.detail";
    public static final String AFTERSALE_SAVE_EXPRESS_INFO = "mengxiang.aftersale.saveExpressInfo";
    public static final String AFTERSALE_UPDATE_EXPRESS_INFO = "mengxiang.aftersale.updateExpressInfo";

    // supply order APIs
    public static final String SUPPLY_ORDER_CREATE = "mengxiang.supply.order.create";
    public static final String SUPPLY_ORDER_SPLIT = "mengxiang.supply.order.split";
    public static final String SUPPLY_ORDER_PAY = "mengxiang.supply.order.pay";
    public static final String SUPPLY_ORDER_CANCEL_BEFORE_PAY = "mengxiang.supply.order.cancelBeforePay";
}
