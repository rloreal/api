# SaleToPOIServiceResponseV06ServiceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_inquiry_response** | [**SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse**](SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse.md) |  | [optional] 
**batch_response** | [**SaleToPOIServiceResponseV06ServiceResponseBatchResponse**](SaleToPOIServiceResponseV06ServiceResponseBatchResponse.md) |  | [optional] 
**card_acquisition_response** | [**SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse**](SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse.md) |  | [optional] 
**context** | [**PoipoiIdfinancialServiceServiceRequestContext**](PoipoiIdfinancialServiceServiceRequestContext.md) |  | 
**environment** | [**PoipoiIdfinancialServiceServiceRequestEnvironment**](PoipoiIdfinancialServiceServiceRequestEnvironment.md) |  | 
**loyalty_response** | [**SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse**](SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse.md) |  | [optional] 
**payment_response** | [**SaleToPOIServiceResponseV06ServiceResponsePaymentResponse**](SaleToPOIServiceResponseV06ServiceResponsePaymentResponse.md) |  | [optional] 
**response** | [**SaleToPOIServiceResponseV06ServiceResponseResponse**](SaleToPOIServiceResponseV06ServiceResponseResponse.md) |  | 
**reversal_response** | [**SaleToPOIServiceResponseV06ServiceResponseReversalResponse**](SaleToPOIServiceResponseV06ServiceResponseReversalResponse.md) |  | [optional] 
**supplementary_data** | **object** | Additional information incorporated as an extension to the message. | [optional] 
**stored_value_response** | [**SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse**](SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse.md) |  | [optional] 
**service_content** | **object** | List of specific services for ServiceResponse.&lt;br/&gt;- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*&lt;br/&gt;- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*&lt;br/&gt;- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*&lt;br/&gt;- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*&lt;br/&gt;- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*&lt;br/&gt;- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*&lt;br/&gt;- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*&lt;br/&gt;- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*&lt;br/&gt; | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

