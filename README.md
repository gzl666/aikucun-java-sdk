# aikucun-java-sdk

A consolidated **Java 11** Maven SDK for Aikucun (Mengxiang) OpenAPI.

- Java 11 `java.net.http.HttpClient`
- Jackson JSON
- Minimal dependencies

## Install

Build from source:

```bash
mvn -q -DskipTests package
```

## Quick Start

```java
import com.aikucun.sdk.client.AikucunClient;
import com.aikucun.sdk.config.AikucunConfig;
import com.aikucun.sdk.model.request.AftersaleListRequest;
import com.aikucun.sdk.model.response.AftersaleListResponse;

public class Demo {
  public static void main(String[] args) throws Exception {
    AikucunConfig cfg = AikucunConfig.builder()
        .serverUrl("https://openapi.xxx.com/router")
        .appid("your_appid")
        .appsecret("your_appsecret")
        .version("1.0")
        .format("json")
        .build();

    AikucunClient client = new AikucunClient(cfg);
    // If your platform requires accessToken, call with accessToken parameter.

    AftersaleListRequest req = new AftersaleListRequest();
    // set fields...

    AftersaleListResponse resp = client.aftersaleList(req, null);
    System.out.println(resp);
  }
}
```

## Signature required

This SDK intentionally **does not** implement the real signature algorithm.
You must implement `SignUtil.genSign(...)` according to Aikucun/Mengxiang OpenAPI rules.

`SignUtil.genSign` returns:
- `noncestr`
- `timestampSeconds`
- `sign`

These values are appended to request query parameters.

## APIs

Implemented high-level methods:

### Aftersale (mengxiang.aftersale.*)
- confirm
- cancel
- list
- detail
- saveExpressInfo
- updateExpressInfo

### Supply order (mengxiang.supply.order.*)
- create
- split
- pay
- cancelBeforePay

## Notes

- This project replaces older utilities like `SignatureUtil` / `UrlUtil`. Prefer `SignUtil` and `HttpClient` flow.
- If legacy source files exist in the repository, they are no longer referenced by this Maven layout.
