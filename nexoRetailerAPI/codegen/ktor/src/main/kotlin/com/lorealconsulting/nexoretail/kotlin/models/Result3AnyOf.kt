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

import com.lorealconsulting.nexoretail.kotlin.models.AccountIdentification4
import com.lorealconsulting.nexoretail.kotlin.models.EANUPC1
import com.lorealconsulting.nexoretail.kotlin.models.HostTransactionIdentification1
import com.lorealconsulting.nexoretail.kotlin.models.ItemAmount2
import com.lorealconsulting.nexoretail.kotlin.models.OriginalPOITransaction4
import com.lorealconsulting.nexoretail.kotlin.models.ProductCode5
import com.lorealconsulting.nexoretail.kotlin.models.Provider7

import kotlinx.serialization.Serializable
/**
 * Result of loading/reloading a stored value card. Result
 * @param txTp Identification of operation to proceed on the stored value account or the stored value card. TransactionType\\n\\n- ***ACTV*** : **Activate** Definition: Activate the account or the card.  \\n\\n- ***DUPL*** : **Duplicate** Definition: Duplicate the code or number provided by the loading or activation.  \\n\\n- ***LOAD*** : **Load** Definition: Load the account or the card with money.  \\n\\n- ***RESV*** : **Reserve** Definition: Reserve the account (e.g. get an activation code).  \\n\\n- ***REVS*** : **Reverse** Definition: Reverse an activation or loading.  \\n\\n- ***ULOA*** : **Unload** Definition: Unload the account.  \\n\\n- ***CLOS*** : **CloseAccount** Definition: Close the account.  \\n\\n- ***DCTV*** : **Deactivate** Definition: Deactivate the account or the card.  \\n\\n- ***OPEN*** : **OpenAccount** Definition: Open the account.  \\n\\n- ***BALC*** : **Balance** Definition: Balance enquiry.  
 * @param atId 
 * @param acctId 
 * @param ccy Currency of the monetary amount. Currency
 * @param EANUPC 
 * @param hstTxId 
 * @param itmAmt 
 * @param orgnlPOITx 
 * @param pdctCd 
 * @param prvdr 
 */
@Serializable
data class Result3AnyOf(
    /* Identification of operation to proceed on the stored value account or the stored value card. TransactionType\\n\\n- ***ACTV*** : **Activate** Definition: Activate the account or the card.  \\n\\n- ***DUPL*** : **Duplicate** Definition: Duplicate the code or number provided by the loading or activation.  \\n\\n- ***LOAD*** : **Load** Definition: Load the account or the card with money.  \\n\\n- ***RESV*** : **Reserve** Definition: Reserve the account (e.g. get an activation code).  \\n\\n- ***REVS*** : **Reverse** Definition: Reverse an activation or loading.  \\n\\n- ***ULOA*** : **Unload** Definition: Unload the account.  \\n\\n- ***CLOS*** : **CloseAccount** Definition: Close the account.  \\n\\n- ***DCTV*** : **Deactivate** Definition: Deactivate the account or the card.  \\n\\n- ***OPEN*** : **OpenAccount** Definition: Open the account.  \\n\\n- ***BALC*** : **Balance** Definition: Balance enquiry.   */
    val txTp: Result3AnyOf.TxTp,
    /*  */
    val atId: kotlin.String? = null,
    val acctId: AccountIdentification4? = null,
    /* Currency of the monetary amount. Currency */
    val ccy: kotlin.String? = null,
    val EANUPC: EANUPC1? = null,
    val hstTxId: HostTransactionIdentification1? = null,
    val itmAmt: ItemAmount2? = null,
    val orgnlPOITx: OriginalPOITransaction4? = null,
    val pdctCd: ProductCode5? = null,
    val prvdr: Provider7? = null
)
{
    /**
    * Identification of operation to proceed on the stored value account or the stored value card. TransactionType\\n\\n- ***ACTV*** : **Activate** Definition: Activate the account or the card.  \\n\\n- ***DUPL*** : **Duplicate** Definition: Duplicate the code or number provided by the loading or activation.  \\n\\n- ***LOAD*** : **Load** Definition: Load the account or the card with money.  \\n\\n- ***RESV*** : **Reserve** Definition: Reserve the account (e.g. get an activation code).  \\n\\n- ***REVS*** : **Reverse** Definition: Reverse an activation or loading.  \\n\\n- ***ULOA*** : **Unload** Definition: Unload the account.  \\n\\n- ***CLOS*** : **CloseAccount** Definition: Close the account.  \\n\\n- ***DCTV*** : **Deactivate** Definition: Deactivate the account or the card.  \\n\\n- ***OPEN*** : **OpenAccount** Definition: Open the account.  \\n\\n- ***BALC*** : **Balance** Definition: Balance enquiry.  
    * Values: ACTV,DUPL,LOAD,RESV,REVS,ULOA,CLOS,DCTV,OPEN,BALC
    */
    enum class TxTp(val value: kotlin.String){
        ACTV("ACTV"),
        DUPL("DUPL"),
        LOAD("LOAD"),
        RESV("RESV"),
        REVS("REVS"),
        ULOA("ULOA"),
        CLOS("CLOS"),
        DCTV("DCTV"),
        OPEN("OPEN"),
        BALC("BALC");
    }
}

