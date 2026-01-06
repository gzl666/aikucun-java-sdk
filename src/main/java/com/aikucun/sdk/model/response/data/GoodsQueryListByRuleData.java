package com.aikucun.sdk.model.response.data;

import java.util.List;

public class GoodsQueryListByRuleData {

    private Boolean hasNextPage;
    private List<GoodsSupplyDetailData> goodsList;
    private String offset;

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public List<GoodsSupplyDetailData> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsSupplyDetailData> goodsList) {
        this.goodsList = goodsList;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
