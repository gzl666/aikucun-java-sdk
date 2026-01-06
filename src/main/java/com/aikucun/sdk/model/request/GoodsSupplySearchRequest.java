package com.aikucun.sdk.model.request;

import java.util.List;

public class GoodsSupplySearchRequest {

    private String brandName;
    private List<String> brandIdList;
    private List<String> productNumList;
    private List<String> thirdCategoryIdList;
    private Integer pageSize;
    private Integer pageIndex;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<String> getBrandIdList() {
        return brandIdList;
    }

    public void setBrandIdList(List<String> brandIdList) {
        this.brandIdList = brandIdList;
    }

    public List<String> getProductNumList() {
        return productNumList;
    }

    public void setProductNumList(List<String> productNumList) {
        this.productNumList = productNumList;
    }

    public List<String> getThirdCategoryIdList() {
        return thirdCategoryIdList;
    }

    public void setThirdCategoryIdList(List<String> thirdCategoryIdList) {
        this.thirdCategoryIdList = thirdCategoryIdList;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}
