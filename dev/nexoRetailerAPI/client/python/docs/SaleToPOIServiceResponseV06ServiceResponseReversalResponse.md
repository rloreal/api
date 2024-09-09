# SaleToPOIServiceResponseV06ServiceResponseReversalResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer_reference_data** | **object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; | [optional] 
**poi_reconciliation_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**poi_transaction_identification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  | 
**receipt_v07** | **object** | Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation. | [optional] 
**reversed_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**reversal_transaction_result** | [**SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult**](SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult.md) |  | 
**sale_reference_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**sale_transaction_identification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

