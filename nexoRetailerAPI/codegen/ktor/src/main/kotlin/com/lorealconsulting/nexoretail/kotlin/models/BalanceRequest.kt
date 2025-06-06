/**
* nexo retailer API
* API defining resources for interactions between POI and POS, using underlying nexo messages # Summary The **nexo retailer** *Protocol Version 8* offers a modern, open, harmonised and interoperable set of Application Programming Interfaces (APIs) as the safest and most efficient way to exchange data securely, between a Point Of sale System (POS) and Point Of Interaction (POI) System. The nexo retailer protocol reduces sale to payment terminal communication complexity and costs,  addresses the problem of multiple private standards, aligned with the goals of nexo association, enables point of sale system providers to use a single interface with multiple payment systems,  for multiple payment instruments, and payment methods,  with a clear delimitation between with the retail world and the payment world.  The possible approaches are:   * Multiple POS to Multiple POI    * One to One POS to POI   * App 2 App when POS and POI are embedded in a single device    Not every message defined in this API definition is necessary for all approaches.    Furthermore this API definition does not differ between methods which are mandatory, conditional, or optional.   Therefore for a particular implementation of a nexo compliant API it is only necessary to support    a certain subset of the methods defined in this API definition.    **Please have a look at the nexo retailer message usage guide if you are not sure    which message has to be used for the approach you are going to use.**  ## Some General Remarks Related to this version of the OpenAPI Specification: * **This API definition is based on the Message Usage Guide of the nexo retailer protocol.**    It is not a replacement in any sense.   The main specification is always the nexo Message Usage Guide, with ISO20022 definitions of the protocol (MDR Part 1 and 2).   It is highly recommended to read through the standards documentations in conjunction with this API definition.    Namely regarding :     * The rules regarding dialogue initiation, termination and combination      * The rules and constraints applied to data fields, depending on the use case     * The error management on Sale system and POI system sides     * The security that can be applied to the protocol * **This API definition contains the messages for all different approaches defined in the Message Usage Guide.**  * According to the OpenAPI-Specification [https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.1.md]        \"If in is \"header\"and the name field is \"Accept\", \"Content-Type\"or \"Authorization\", the parameter definition SHALL be ignored.\"      The element \"Accept\"will not be defined in this file at any place.      The elements \"Content-Type\"and \"Authorization\"are implicitly defined by the OpenApi tags \"content\"and \"security\".     * **We omit the definition of all standard HTTP header elements (mandatory/optional/conditional)    except they are mentioned in the Implementation Guidelines.**   Therefore the implementer might add these in his own realisation of a nexo complient API in addition to the elements defined in this file. 
*
* The version of the OpenAPI document: 2025-01
* Contact: romain.loreal@lorealconsulting.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.lorealconsulting.nexoretail.kotlin.models

import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestAdditionalService
import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestAuthorisationResult
import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestCustomerToken
import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestInitiatingParty
import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestRecipientParty
import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestSupplementaryData
import com.lorealconsulting.nexoretail.kotlin.models.BalanceRequestTransactionIdentification

import kotlinx.serialization.Serializable
/**
 * This SaleToPOIServiceRequest message is sent by a sale system to trig a financial service on POI system.
 * @param exchangeIdentification Unique identification of an exchange occurrence.
 * @param initiatingParty 
 * @param transactionType Type of transaction being undertaken for the main service.
 * @param transactionIdentification 
 * @param merchantCategoryCode Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
 * @param recipientParty 
 * @param customerToken 
 * @param additionalService 
 * @param serviceAttribute Additional attribute of the service type.
 * @param saleReferenceIdentification Detailed result of the transaction.
 * @param reconciliationIdentification Detailed result of the transaction.
 * @param authorisationResult 
 * @param currency Currency associated with the transaction.
 * @param authorisedAmount Amount authorised for the payment transaction.
 * @param requestedAmount Amount requested to be authorised.
 * @param transactionCapture Flag indicating whether the transaction data must be captured or not in addition to the message process.
 * @param supplementaryData 
 */
@Serializable
data class BalanceRequest(
    /* Unique identification of an exchange occurrence. */
    val exchangeIdentification: kotlin.String,
    val initiatingParty: BalanceRequestInitiatingParty,
    /* Type of transaction being undertaken for the main service. */
    val transactionType: BalanceRequest.TransactionType,
    val transactionIdentification: BalanceRequestTransactionIdentification,
    /* Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction. */
    val merchantCategoryCode: kotlin.String? = null,
    val recipientParty: BalanceRequestRecipientParty? = null,
    val customerToken: BalanceRequestCustomerToken? = null,
    val additionalService: BalanceRequestAdditionalService? = null,
    /* Additional attribute of the service type. */
    val serviceAttribute: BalanceRequest.ServiceAttribute? = null,
    /* Detailed result of the transaction. */
    val saleReferenceIdentification: kotlin.String? = null,
    /* Detailed result of the transaction. */
    val reconciliationIdentification: kotlin.String? = null,
    val authorisationResult: BalanceRequestAuthorisationResult? = null,
    /* Currency associated with the transaction. */
    val currency: kotlin.String? = null,
    /* Amount authorised for the payment transaction. */
    val authorisedAmount: java.math.BigDecimal? = null,
    /* Amount requested to be authorised. */
    val requestedAmount: java.math.BigDecimal? = null,
    /* Flag indicating whether the transaction data must be captured or not in addition to the message process. */
    val transactionCapture: kotlin.Boolean? = null,
    val supplementaryData: BalanceRequestSupplementaryData? = null
)
{
    /**
    * Type of transaction being undertaken for the main service.
    * Values: BALC,CACT,CRDP,CAFH,CAVR,CSHW,CSHD,DEFR,LOAD,ORCR,PINC,QUCH,RFND,RESA,VALC,UNLD,CAFT,CAFL
    */
    enum class TransactionType(val value: kotlin.String){
        BALC("BALC"),
        CACT("CACT"),
        CRDP("CRDP"),
        CAFH("CAFH"),
        CAVR("CAVR"),
        CSHW("CSHW"),
        CSHD("CSHD"),
        DEFR("DEFR"),
        LOAD("LOAD"),
        ORCR("ORCR"),
        PINC("PINC"),
        QUCH("QUCH"),
        RFND("RFND"),
        RESA("RESA"),
        VALC("VALC"),
        UNLD("UNLD"),
        CAFT("CAFT"),
        CAFL("CAFL");
    }
    /**
    * Additional attribute of the service type.
    * Values: IRES,URES,PRES,ARES,FREC,RREC,GOPT
    */
    enum class ServiceAttribute(val value: kotlin.String){
        IRES("IRES"),
        URES("URES"),
        PRES("PRES"),
        ARES("ARES"),
        FREC("FREC"),
        RREC("RREC"),
        GOPT("GOPT");
    }
}

