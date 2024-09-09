# PoipoiIdfinancialServiceServiceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_inquiry_request** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest.md) |  | [optional] 
**batch_request** | [**PoipoiIdfinancialServiceServiceRequestBatchRequest**](PoipoiIdfinancialServiceServiceRequestBatchRequest.md) |  | [optional] 
**card_acquisition_request** | [**PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest**](PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.md) |  | [optional] 
**context** | [**PoipoiIdfinancialServiceServiceRequestContext**](PoipoiIdfinancialServiceServiceRequestContext.md) |  | 
**environment** | [**PoipoiIdfinancialServiceServiceRequestEnvironment**](PoipoiIdfinancialServiceServiceRequestEnvironment.md) |  | 
**loyalty_request** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequest**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequest.md) |  | [optional] 
**enable_service_request** | [**PoipoiIdfinancialServiceServiceRequestEnableServiceRequest**](PoipoiIdfinancialServiceServiceRequestEnableServiceRequest.md) |  | [optional] 
**payment_request** | [**PoipoiIdfinancialServiceServiceRequestPaymentRequest**](PoipoiIdfinancialServiceServiceRequestPaymentRequest.md) |  | [optional] 
**reversal_request** | [**PoipoiIdfinancialServiceServiceRequestReversalRequest**](PoipoiIdfinancialServiceServiceRequestReversalRequest.md) |  | [optional] 
**supplementary_data** | **object** | Additional information incorporated as an extension to the message. | [optional] 
**stored_value_request** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest.md) |  | [optional] 
**service_content** | **object** | List of specific services for ServiceRequest&lt;br/&gt;- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*&lt;br/&gt;- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*&lt;br/&gt;- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*&lt;br/&gt;- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*&lt;br/&gt;- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*&lt;br/&gt;- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*&lt;br/&gt;- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*&lt;br/&gt;- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *&lt;br/&gt; | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

