package com.aikucun.sdk.model.response.data;

import java.util.List;

public class GoodsSupplyDetailData {

    public static class SalesAttributeInfo {
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class BaseAttributeInfo {
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class SkuInfo {
        private String skuId;
        private String skuName;
        private String status;
        private Integer skuStock;
        private Double supplyPrice;
        private Double marketPrice;
        private String image;
        private List<SalesAttributeInfo> salesAttributeList;

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public String getSkuName() {
            return skuName;
        }

        public void setSkuName(String skuName) {
            this.skuName = skuName;
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

        public Double getSupplyPrice() {
            return supplyPrice;
        }

        public void setSupplyPrice(Double supplyPrice) {
            this.supplyPrice = supplyPrice;
        }

        public Double getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(Double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<SalesAttributeInfo> getSalesAttributeList() {
            return salesAttributeList;
        }

        public void setSalesAttributeList(List<SalesAttributeInfo> salesAttributeList) {
            this.salesAttributeList = salesAttributeList;
        }
    }

    private String spuId;
    private String spuName;
    private String productNum;
    private String brandId;
    private String brandName;
    private String thirdCategoryId;
    private String thirdCategoryName;
    private String status;
    private List<String> images;
    private List<BaseAttributeInfo> baseAttributeList;
    private List<SkuInfo> skuList;

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getThirdCategoryId() {
        return thirdCategoryId;
    }

    public void setThirdCategoryId(String thirdCategoryId) {
        this.thirdCategoryId = thirdCategoryId;
    }

    public String getThirdCategoryName() {
        return thirdCategoryName;
    }

    public void setThirdCategoryName(String thirdCategoryName) {
        this.thirdCategoryName = thirdCategoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<BaseAttributeInfo> getBaseAttributeList() {
        return baseAttributeList;
    }

    public void setBaseAttributeList(List<BaseAttributeInfo> baseAttributeList) {
        this.baseAttributeList = baseAttributeList;
    }

    public List<SkuInfo> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<SkuInfo> skuList) {
        this.skuList = skuList;
    }
}
