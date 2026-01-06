package com.aikucun.sdk.exception;

public class AikucunApiException extends RuntimeException {

    private final String code;

    public AikucunApiException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
