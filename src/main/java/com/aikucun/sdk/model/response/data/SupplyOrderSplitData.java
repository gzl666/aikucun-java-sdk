package com.aikucun.sdk.model.response.data;

import java.util.List;

public class SupplyOrderSplitData {

    public static class SkuSplitDetail {
        private String skuId;
        private Integer splitCount;

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public Integer getSplitCount() {
            return splitCount;
        }

        public void setSplitCount(Integer splitCount) {
            this.splitCount = splitCount;
        }
    }

    public static class OrderSplitDetail {
        private String splitOrderId;
        private List<SkuSplitDetail> skuSplitDetailList;
        private List<SupplyOrderCreateData.OrderPromotionItem> orderPromotionList;

        public String getSplitOrderId() {
            return splitOrderId;
        }

        public void setSplitOrderId(String splitOrderId) {
            this.splitOrderId = splitOrderId;
        }

        public List<SkuSplitDetail> getSkuSplitDetailList() {
            return skuSplitDetailList;
        }

        public void setSkuSplitDetailList(List<SkuSplitDetail> skuSplitDetailList) {
            this.skuSplitDetailList = skuSplitDetailList;
        }

        public List<SupplyOrderCreateData.OrderPromotionItem> getOrderPromotionList() {
            return orderPromotionList;
        }

        public void setOrderPromotionList(List<SupplyOrderCreateData.OrderPromotionItem> orderPromotionList) {
            this.orderPromotionList = orderPromotionList;
        }
    }

    private List<OrderSplitDetail> orderSplitDetailList;

    public List<OrderSplitDetail> getOrderSplitDetailList() {
        return orderSplitDetailList;
    }

    public void setOrderSplitDetailList(List<OrderSplitDetail> orderSplitDetailList) {
        this.orderSplitDetailList = orderSplitDetailList;
    }
}
