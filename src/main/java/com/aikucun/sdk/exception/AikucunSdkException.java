package com.aikucun.sdk.exception;

public class AikucunSdkException extends RuntimeException {
    public AikucunSdkException(String message) {
        super(message);
    }

    public AikucunSdkException(String message, Throwable cause) {
        super(message, cause);
    }
}
