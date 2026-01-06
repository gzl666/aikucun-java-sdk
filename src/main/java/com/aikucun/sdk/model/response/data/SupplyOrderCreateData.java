package com.aikucun.sdk.model.response.data;

import java.util.List;

public class SupplyOrderCreateData {

    public static class OrderPromotionItem {
        private String promotionId;
        private String promotionName;
        private Double discountAmount;

        public String getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(String promotionId) {
            this.promotionId = promotionId;
        }

        public String getPromotionName() {
            return promotionName;
        }

        public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public Double getDiscountAmount() {
            return discountAmount;
        }

        public void setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
        }
    }

    public static class OrderSkuItem {
        private String orderSkuNo;
        private String skuId;
        private String spuId;
        private Integer count;
        private Double payAmount;

        public String getOrderSkuNo() {
            return orderSkuNo;
        }

        public void setOrderSkuNo(String orderSkuNo) {
            this.orderSkuNo = orderSkuNo;
        }

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public String getSpuId() {
            return spuId;
        }

        public void setSpuId(String spuId) {
            this.spuId = spuId;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Double getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(Double payAmount) {
            this.payAmount = payAmount;
        }
    }

    public static class OrderItem {
        private String orderNo;
        private String orderStatus;
        private Double orderAmount;
        private List<OrderSkuItem> orderSkuList;
        private List<OrderPromotionItem> orderPromotionList;

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public Double getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(Double orderAmount) {
            this.orderAmount = orderAmount;
        }

        public List<OrderSkuItem> getOrderSkuList() {
            return orderSkuList;
        }

        public void setOrderSkuList(List<OrderSkuItem> orderSkuList) {
            this.orderSkuList = orderSkuList;
        }

        public List<OrderPromotionItem> getOrderPromotionList() {
            return orderPromotionList;
        }

        public void setOrderPromotionList(List<OrderPromotionItem> orderPromotionList) {
            this.orderPromotionList = orderPromotionList;
        }
    }

    private String orderGroupNo;
    private List<OrderItem> orderList;

    public String getOrderGroupNo() {
        return orderGroupNo;
    }

    public void setOrderGroupNo(String orderGroupNo) {
        this.orderGroupNo = orderGroupNo;
    }

    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderItem> orderList) {
        this.orderList = orderList;
    }
}
