# FinancialApi

All URIs are relative to *https://devlc/lorealconsulting.com:8099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createService**](FinancialApi.md#createService) | **POST** /poi/{poiId}/financialService | creates a service request to a POI

<a name="createService"></a>
# **createService**
> createService(body, poiId, idempotencyKey, traceparent, tracestate)

creates a service request to a POI

request a service, such as payment, to be done on the specified POI

### Example
```java
// Import classes:
//import com.lorealconsulting.nexoRetailerAPI.client.invoker.ApiException;
//import com.lorealconsulting.nexoRetailerAPI.client.api.FinancialApi;


FinancialApi apiInstance = new FinancialApi();
PoiIdFinancialServiceBody body = new PoiIdFinancialServiceBody(); // PoiIdFinancialServiceBody | 
Object poiId = null; // Object | Identifier of the POI
Object idempotencyKey = null; // Object | The idempotency key is a free identifier created by the client to identify a request. It is used by the service to identify subsequent retries of the same request and ensure idempotent behavior by sending the same response without executing the request a second time.  Clients should be careful as any subsequent requests with the same key may return the same response without further check. Therefore, it is recommended to use an UUID version 4 (random) or any other random string with enough entropy to avoid collisions.  Idempotency keys expire after 24 hours. Clients are responsible to stay within this limits, if they require idempotent behavior. 
Object traceparent = null; // Object | describes the position of the incoming request in its trace graph  in a portable, fixed-length format.  Its design focuses on fast parsing.  Every tracing tool MUST properly set traceparent even when it only relies  on vendor-specific information in tracestate. The traceparent HTTP header field identifies the incoming request in a tracing system. It has four fields: - version-format: 2 bytes, \"00-\" in ASCII - trace-id: 32 bytes, a unique identifier for the trace, represented as a 16-byte array, formatted as a 32-digit hexadecimal number - parent-id: 16 bytes, a unique identifier for the span, represented as an 8-byte array, formatted as a 16-digit hexadecimal number - trace-flags: An 8-bit field that controls tracing flags such as sampling, trace level, etc   Example Value = 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01   base16(version) = 00   base16(trace-id) = 4bf92f3577b34da6a3ce929d0e0e4736   base16(parent-id) = 00f067aa0ba902b7   base16(trace-flags) = 01  // sampled 
Object tracestate = null; // Object | extends traceparent with vendor-specific data represented by a set of name/value pairs. Storing information in tracestate is optional. 
try {
    apiInstance.createService(body, poiId, idempotencyKey, traceparent, tracestate);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialApi#createService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiIdFinancialServiceBody**](PoiIdFinancialServiceBody.md)|  |
 **poiId** | [**Object**](.md)| Identifier of the POI |
 **idempotencyKey** | [**Object**](.md)| The idempotency key is a free identifier created by the client to identify a request. It is used by the service to identify subsequent retries of the same request and ensure idempotent behavior by sending the same response without executing the request a second time.  Clients should be careful as any subsequent requests with the same key may return the same response without further check. Therefore, it is recommended to use an UUID version 4 (random) or any other random string with enough entropy to avoid collisions.  Idempotency keys expire after 24 hours. Clients are responsible to stay within this limits, if they require idempotent behavior.  | [optional]
 **traceparent** | [**Object**](.md)| describes the position of the incoming request in its trace graph  in a portable, fixed-length format.  Its design focuses on fast parsing.  Every tracing tool MUST properly set traceparent even when it only relies  on vendor-specific information in tracestate. The traceparent HTTP header field identifies the incoming request in a tracing system. It has four fields: - version-format: 2 bytes, \&quot;00-\&quot; in ASCII - trace-id: 32 bytes, a unique identifier for the trace, represented as a 16-byte array, formatted as a 32-digit hexadecimal number - parent-id: 16 bytes, a unique identifier for the span, represented as an 8-byte array, formatted as a 16-digit hexadecimal number - trace-flags: An 8-bit field that controls tracing flags such as sampling, trace level, etc   Example Value &#x3D; 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01   base16(version) &#x3D; 00   base16(trace-id) &#x3D; 4bf92f3577b34da6a3ce929d0e0e4736   base16(parent-id) &#x3D; 00f067aa0ba902b7   base16(trace-flags) &#x3D; 01  // sampled  | [optional]
 **tracestate** | [**Object**](.md)| extends traceparent with vendor-specific data represented by a set of name/value pairs. Storing information in tracestate is optional.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

