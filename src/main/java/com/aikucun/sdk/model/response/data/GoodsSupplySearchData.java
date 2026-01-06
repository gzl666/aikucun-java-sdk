package com.aikucun.sdk.model.response.data;

import java.util.List;

public class GoodsSupplySearchData {

    public static class SpuSupplyInfo extends GoodsSupplyDetailData {
        private String activityId;
        private String activitySpuId;
        private String sizeImage;
        private String taxRate;
        private String taxCode;

        public String getActivityId() {
            return activityId;
        }

        public void setActivityId(String activityId) {
            this.activityId = activityId;
        }

        public String getActivitySpuId() {
            return activitySpuId;
        }

        public void setActivitySpuId(String activitySpuId) {
            this.activitySpuId = activitySpuId;
        }

        public String getSizeImage() {
            return sizeImage;
        }

        public void setSizeImage(String sizeImage) {
            this.sizeImage = sizeImage;
        }

        public String getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(String taxRate) {
            this.taxRate = taxRate;
        }

        public String getTaxCode() {
            return taxCode;
        }

        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }
    }

    private List<SpuSupplyInfo> goodsList;

    public List<SpuSupplyInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<SpuSupplyInfo> goodsList) {
        this.goodsList = goodsList;
    }
}
