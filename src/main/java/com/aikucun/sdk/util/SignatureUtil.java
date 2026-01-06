package com.aikucun.sdk.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SignatureUtil {

    private SignatureUtil() {}

    /**
     * MD5(appSecret + sorted(key+value) + appSecret), UTF-8, lowercase.
     */
    public static String signMd5(String appSecret, Map<String, ?> params) {
        StringBuilder sb = new StringBuilder();
        sb.append(appSecret == null ? "" : appSecret);

        if (params != null && !params.isEmpty()) {
            List<String> keys = new ArrayList<>(params.keySet());
            Collections.sort(keys);
            for (String key : keys) {
                Object val = params.get(key);
                if (key == null || val == null) {
                    continue;
                }
                sb.append(key).append(val);
            }
        }

        sb.append(appSecret == null ? "" : appSecret);
        return md5Lower(sb.toString());
    }

    private static String md5Lower(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                String h = Integer.toHexString(b & 0xff);
                if (h.length() == 1) hex.append('0');
                hex.append(h);
            }
            return hex.toString().toLowerCase();
        } catch (Exception e) {
            throw new RuntimeException("MD5 sign failed", e);
        }
    }
}
