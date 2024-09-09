# SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tms_contact_date_time** | **object** | A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt; | [optional] 
**tms_contact_level** | **object** | Level of urgency in contacting the terminal management system.&lt;br/&gt;- **CRIT: Critical**  : *Terminal management system has to be contacted before the next transaction.*&lt;br/&gt;- **ASAP: AsSoonAsPossible**  : *Terminal management system has to be contacted as soon as possible (for example after reconciliation).*&lt;br/&gt;- **DTIM: DateTime**  : *Terminal management system has to be contacted at the date and time provided.*&lt;br/&gt; | 
**tms_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

