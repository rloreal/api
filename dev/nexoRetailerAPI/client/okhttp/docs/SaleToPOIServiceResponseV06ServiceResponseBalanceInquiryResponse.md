# SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loyaltyAccount** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.md) |  |  [optional]
**poITransactionIdentification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  |  [optional]
**paymentAccount** | [**SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount**](SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount.md) |  |  [optional]
**receiptV07** | **Object** | Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation. |  [optional]
**saleTransactionIdentification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  |  [optional]
**storedValueAccount** | **Object** | Stored value account information. |  [optional]
