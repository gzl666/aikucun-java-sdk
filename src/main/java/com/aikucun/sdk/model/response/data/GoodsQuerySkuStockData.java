package com.aikucun.sdk.model.response.data;

import java.util.List;

public class GoodsQuerySkuStockData {

    public static class SkuStockListItem {
        private String skuId;
        private String status;
        private Integer skuStock;

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getSkuStock() {
            return skuStock;
        }

        public void setSkuStock(Integer skuStock) {
            this.skuStock = skuStock;
        }
    }

    private List<SkuStockListItem> skuStockList;

    public List<SkuStockListItem> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<SkuStockListItem> skuStockList) {
        this.skuStockList = skuStockList;
    }
}
