# PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessed_by** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**additional_information** | **object** | Specifies a character string with a maximum length of 1025 characters.&lt;br/&gt; | [optional] 
**currency** | **object** | A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt; | [optional] 
**customer_order_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | 
**current_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**end_date** | **object** | A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt; | [optional] 
**forecasted_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | 
**open_order_state** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**sale_reference_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | 
**start_date** | **object** | A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt; | 
**unit** | **object** | Unit of a amount (for loyalty or account).&lt;br/&gt;- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*&lt;br/&gt;- **POIN: Point**  : *The amount is expressed in point.*&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

