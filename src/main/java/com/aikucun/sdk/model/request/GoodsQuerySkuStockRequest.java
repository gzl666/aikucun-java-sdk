package com.aikucun.sdk.model.request;

import java.util.List;

public class GoodsQuerySkuStockRequest {

    private List<String> skuIdList;

    public List<String> getSkuIdList() {
        return skuIdList;
    }

    public void setSkuIdList(List<String> skuIdList) {
        this.skuIdList = skuIdList;
    }
}
