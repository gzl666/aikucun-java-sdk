package com.aikucun.sdk.model.request;

public class AftersaleUpdateExpressInfoRequest {
    private String aftersaleId;
    private String expressCompany;
    private String expressNo;

    public String getAftersaleId() {
        return aftersaleId;
    }

    public void setAftersaleId(String aftersaleId) {
        this.aftersaleId = aftersaleId;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }
}
