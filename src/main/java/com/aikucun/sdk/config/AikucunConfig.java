package com.aikucun.sdk.config;

/**
 * SDK config.
 */
public class AikucunConfig {

    private final String serverUrl;
    private final String appid;
    private final String appsecret;
    private final String version;
    private final String format;

    private AikucunConfig(Builder b) {
        this.serverUrl = b.serverUrl;
        this.appid = b.appid;
        this.appsecret = b.appsecret;
        this.version = b.version;
        this.format = b.format;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public String getAppid() {
        return appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public String getVersion() {
        return version;
    }

    public String getFormat() {
        return format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String serverUrl;
        private String appid;
        private String appsecret;
        private String version = "1.0";
        private String format = "json";

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder appid(String appid) {
            this.appid = appid;
            return this;
        }

        public Builder appsecret(String appsecret) {
            this.appsecret = appsecret;
            return this;
        }

        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Builder format(String format) {
            this.format = format;
            return this;
        }

        public AikucunConfig build() {
            if (serverUrl == null || serverUrl.isBlank()) {
                throw new IllegalArgumentException("serverUrl is required");
            }
            if (appid == null || appid.isBlank()) {
                throw new IllegalArgumentException("appid is required");
            }
            if (appsecret == null || appsecret.isBlank()) {
                throw new IllegalArgumentException("appsecret is required");
            }
            return new AikucunConfig(this);
        }
    }
}
