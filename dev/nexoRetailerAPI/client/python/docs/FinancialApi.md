# swagger_client.FinancialApi

All URIs are relative to *https://devlc/lorealconsulting.com:8099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_service**](FinancialApi.md#create_service) | **POST** /poi/{poiId}/financialService | creates a service request to a POI

# **create_service**
> create_service(body, poi_id, idempotency_key=idempotency_key, traceparent=traceparent, tracestate=tracestate)

creates a service request to a POI

request a service, such as payment, to be done on the specified POI

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FinancialApi()
body = swagger_client.PoiIdFinancialServiceBody() # PoiIdFinancialServiceBody | 
poi_id = NULL # object | Identifier of the POI
idempotency_key = NULL # object | The idempotency key is a free identifier created by the client to identify a request. It is used by the service to identify subsequent retries of the same request and ensure idempotent behavior by sending the same response without executing the request a second time.  Clients should be careful as any subsequent requests with the same key may return the same response without further check. Therefore, it is recommended to use an UUID version 4 (random) or any other random string with enough entropy to avoid collisions.  Idempotency keys expire after 24 hours. Clients are responsible to stay within this limits, if they require idempotent behavior.  (optional)
traceparent = NULL # object | describes the position of the incoming request in its trace graph  in a portable, fixed-length format.  Its design focuses on fast parsing.  Every tracing tool MUST properly set traceparent even when it only relies  on vendor-specific information in tracestate. The traceparent HTTP header field identifies the incoming request in a tracing system. It has four fields: - version-format: 2 bytes, \"00-\" in ASCII - trace-id: 32 bytes, a unique identifier for the trace, represented as a 16-byte array, formatted as a 32-digit hexadecimal number - parent-id: 16 bytes, a unique identifier for the span, represented as an 8-byte array, formatted as a 16-digit hexadecimal number - trace-flags: An 8-bit field that controls tracing flags such as sampling, trace level, etc   Example Value = 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01   base16(version) = 00   base16(trace-id) = 4bf92f3577b34da6a3ce929d0e0e4736   base16(parent-id) = 00f067aa0ba902b7   base16(trace-flags) = 01  // sampled  (optional)
tracestate = NULL # object | extends traceparent with vendor-specific data represented by a set of name/value pairs. Storing information in tracestate is optional.  (optional)

try:
    # creates a service request to a POI
    api_instance.create_service(body, poi_id, idempotency_key=idempotency_key, traceparent=traceparent, tracestate=tracestate)
except ApiException as e:
    print("Exception when calling FinancialApi->create_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiIdFinancialServiceBody**](PoiIdFinancialServiceBody.md)|  | 
 **poi_id** | [**object**](.md)| Identifier of the POI | 
 **idempotency_key** | [**object**](.md)| The idempotency key is a free identifier created by the client to identify a request. It is used by the service to identify subsequent retries of the same request and ensure idempotent behavior by sending the same response without executing the request a second time.  Clients should be careful as any subsequent requests with the same key may return the same response without further check. Therefore, it is recommended to use an UUID version 4 (random) or any other random string with enough entropy to avoid collisions.  Idempotency keys expire after 24 hours. Clients are responsible to stay within this limits, if they require idempotent behavior.  | [optional] 
 **traceparent** | [**object**](.md)| describes the position of the incoming request in its trace graph  in a portable, fixed-length format.  Its design focuses on fast parsing.  Every tracing tool MUST properly set traceparent even when it only relies  on vendor-specific information in tracestate. The traceparent HTTP header field identifies the incoming request in a tracing system. It has four fields: - version-format: 2 bytes, \&quot;00-\&quot; in ASCII - trace-id: 32 bytes, a unique identifier for the trace, represented as a 16-byte array, formatted as a 32-digit hexadecimal number - parent-id: 16 bytes, a unique identifier for the span, represented as an 8-byte array, formatted as a 16-digit hexadecimal number - trace-flags: An 8-bit field that controls tracing flags such as sampling, trace level, etc   Example Value &#x3D; 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01   base16(version) &#x3D; 00   base16(trace-id) &#x3D; 4bf92f3577b34da6a3ce929d0e0e4736   base16(parent-id) &#x3D; 00f067aa0ba902b7   base16(trace-flags) &#x3D; 01  // sampled  | [optional] 
 **tracestate** | [**object**](.md)| extends traceparent with vendor-specific data represented by a set of name/value pairs. Storing information in tracestate is optional.  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

