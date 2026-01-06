package com.aikucun.sdk.model.request;

public class SupplyOrderCancelBeforePayRequest {

    private String orderGroupNo;
    private String refundReason;

    public String getOrderGroupNo() {
        return orderGroupNo;
    }

    public void setOrderGroupNo(String orderGroupNo) {
        this.orderGroupNo = orderGroupNo;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
}
