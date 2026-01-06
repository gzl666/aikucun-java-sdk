package com.aikucun.sdk.model.request;

import com.aikucun.sdk.model.common.OrderReceiver;
import com.aikucun.sdk.model.common.OrderSpuItem;

import java.util.List;

public class SupplyOrderSplitRequest {

    private String thirdUserId;
    private List<OrderSpuItem> spuList;
    private List<String> voucherIds;
    private OrderReceiver receiver;

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public List<OrderSpuItem> getSpuList() {
        return spuList;
    }

    public void setSpuList(List<OrderSpuItem> spuList) {
        this.spuList = spuList;
    }

    public List<String> getVoucherIds() {
        return voucherIds;
    }

    public void setVoucherIds(List<String> voucherIds) {
        this.voucherIds = voucherIds;
    }

    public OrderReceiver getReceiver() {
        return receiver;
    }

    public void setReceiver(OrderReceiver receiver) {
        this.receiver = receiver;
    }
}
