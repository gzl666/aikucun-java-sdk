package com.aikucun.sdk.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Signature utility.
 *
 * IMPORTANT: This is a placeholder. You MUST implement the real signature algorithm
 * according to Aikucun/Mengxiang OpenAPI documentation.
 */
public final class SignUtil {

    private SignUtil() {
    }

    /**
     * Placeholder signature generation.
     *
     * @return map with keys: noncestr, timestampSeconds, sign
     */
    public static Map<String, String> genSign(
            String appid,
            String appsecret,
            String interfaceName,
            Map<String, Object> queryParams,
            String jsonString,
            String accessToken
    ) {
        Map<String, String> m = new HashMap<>();
        m.put("noncestr", "PLEASE_IMPLEMENT_NONCE");
        m.put("timestampSeconds", String.valueOf(System.currentTimeMillis() / 1000));
        m.put("sign", "PLEASE_IMPLEMENT_SIGN");
        return m;
    }
}
