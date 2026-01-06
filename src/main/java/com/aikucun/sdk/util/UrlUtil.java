package com.aikucun.sdk.util;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.StringJoiner;

public final class UrlUtil {

    private UrlUtil() {}

    public static String buildQueryString(Map<String, ?> params) {
        if (params == null || params.isEmpty()) {
            return "";
        }
        StringJoiner sj = new StringJoiner("&");
        for (Map.Entry<String, ?> e : params.entrySet()) {
            if (e.getKey() == null || e.getValue() == null) continue;
            String k = urlEncode(e.getKey());
            String v = urlEncode(String.valueOf(e.getValue()));
            sj.add(k + "=" + v);
        }
        return sj.toString();
    }

    private static String urlEncode(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8);
    }
}
