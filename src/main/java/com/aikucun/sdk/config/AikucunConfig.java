package com.aikucun.sdk.config;

public class AikucunConfig {

    private String appId;
    private String appSecret;

    private String baseUrl = "https://openapi.aikucun.com/route/rest";
    private String version = "1.0";
    private String format = "json";

    private String accessToken;

    /**
     * If true, include accessToken into signing parameters.
     */
    private boolean signWithAccessToken = false;

    public static AikucunConfig forSandbox(String appId, String appSecret) {
        AikucunConfig c = new AikucunConfig();
        c.setAppId(appId);
        c.setAppSecret(appSecret);
        c.setBaseUrl("https://openapi-sandbox.aikucun.com/route/rest");
        return c;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public boolean isSignWithAccessToken() {
        return signWithAccessToken;
    }

    public void setSignWithAccessToken(boolean signWithAccessToken) {
        this.signWithAccessToken = signWithAccessToken;
    }
}
