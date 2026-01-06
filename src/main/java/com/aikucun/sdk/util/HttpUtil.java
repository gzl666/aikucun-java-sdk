package com.aikucun.sdk.util;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class HttpUtil {

    private HttpUtil() {
    }

    public static String buildQuery(Map<String, ?> params) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, ?> e : params.entrySet()) {
            if (e.getValue() == null) continue;
            if (!first) sb.append('&');
            first = false;
            sb.append(urlEncode(e.getKey())).append('=')
              .append(urlEncode(String.valueOf(e.getValue())));
        }
        return sb.toString();
    }

    public static String urlEncode(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8);
    }
}
