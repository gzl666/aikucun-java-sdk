package com.aikucun.sdk.model.request;

import java.util.List;

public class AfterSaleApplyOrderRequest {

    public static class ApplyExtend {
        private String orderSkuNo;
        private Integer applyCount;
        private Double applyAmount;

        public String getOrderSkuNo() {
            return orderSkuNo;
        }

        public void setOrderSkuNo(String orderSkuNo) {
            this.orderSkuNo = orderSkuNo;
        }

        public Integer getApplyCount() {
            return applyCount;
        }

        public void setApplyCount(Integer applyCount) {
            this.applyCount = applyCount;
        }

        public Double getApplyAmount() {
            return applyAmount;
        }

        public void setApplyAmount(Double applyAmount) {
            this.applyAmount = applyAmount;
        }
    }

    private List<ApplyExtend> applyExtendList;
    private String thirdUserId;
    private Integer afterSaleType;
    private Integer afterSaleFirstReason;
    private List<String> proofImageUrls;
    private String applyRemark;
    private Integer afterSaleSecondReason;
    private Integer isReceived;
    private String userAddress;
    private String userName;
    private String userPhone;
    private String orderNo;
    private String provinceCode;
    private String cityCode;
    private String districtCode;
    private String exSkuId;
    private String spec;

    public List<ApplyExtend> getApplyExtendList() {
        return applyExtendList;
    }

    public void setApplyExtendList(List<ApplyExtend> applyExtendList) {
        this.applyExtendList = applyExtendList;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public Integer getAfterSaleType() {
        return afterSaleType;
    }

    public void setAfterSaleType(Integer afterSaleType) {
        this.afterSaleType = afterSaleType;
    }

    public Integer getAfterSaleFirstReason() {
        return afterSaleFirstReason;
    }

    public void setAfterSaleFirstReason(Integer afterSaleFirstReason) {
        this.afterSaleFirstReason = afterSaleFirstReason;
    }

    public List<String> getProofImageUrls() {
        return proofImageUrls;
    }

    public void setProofImageUrls(List<String> proofImageUrls) {
        this.proofImageUrls = proofImageUrls;
    }

    public String getApplyRemark() {
        return applyRemark;
    }

    public void setApplyRemark(String applyRemark) {
        this.applyRemark = applyRemark;
    }

    public Integer getAfterSaleSecondReason() {
        return afterSaleSecondReason;
    }

    public void setAfterSaleSecondReason(Integer afterSaleSecondReason) {
        this.afterSaleSecondReason = afterSaleSecondReason;
    }

    public Integer getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(Integer isReceived) {
        this.isReceived = isReceived;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getExSkuId() {
        return exSkuId;
    }

    public void setExSkuId(String exSkuId) {
        this.exSkuId = exSkuId;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
