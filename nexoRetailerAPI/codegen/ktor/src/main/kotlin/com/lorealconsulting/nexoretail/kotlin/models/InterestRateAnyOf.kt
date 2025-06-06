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

import com.lorealconsulting.nexoretail.kotlin.models.OtherType1

import kotlinx.serialization.Serializable
/**
 * Details of the interest rate. InterestRate
 * @param prd Contains instalment period Period\\n\\n- ***MNTH*** : **Monthly** Definition: Monthly instalment period.  \\n\\n- ***ANNU*** : **Annual** Definition: Annual instalment period.  
 * @param rate Rate expressed as a decimal, example, 0.7 is 7/10 and 70%. Rate
 * @param atId 
 * @param othrTp 
 * @param tp Interest rate applicable to the instalment. Type\\n\\n- ***GSRT*** : **GrossRate** Definition: Gross interest rate of the instalment  \\n\\n- ***NTRT*** : **NetRate** Definition: Net interest rate of the instalment  \\n\\n- ***OTHN*** : **OtherNational** Definition: Other interest rate of the instalment  \\n\\n- ***OTHP*** : **OtherPrivate** Definition: Other interest rate of the instalment  
 */
@Serializable
data class InterestRateAnyOf(
    /* Contains instalment period Period\\n\\n- ***MNTH*** : **Monthly** Definition: Monthly instalment period.  \\n\\n- ***ANNU*** : **Annual** Definition: Annual instalment period.   */
    val prd: InterestRateAnyOf.Prd,
    /* Rate expressed as a decimal, example, 0.7 is 7/10 and 70%. Rate */
    val rate: java.math.BigDecimal,
    /*  */
    val atId: kotlin.String? = null,
    val othrTp: OtherType1? = null,
    /* Interest rate applicable to the instalment. Type\\n\\n- ***GSRT*** : **GrossRate** Definition: Gross interest rate of the instalment  \\n\\n- ***NTRT*** : **NetRate** Definition: Net interest rate of the instalment  \\n\\n- ***OTHN*** : **OtherNational** Definition: Other interest rate of the instalment  \\n\\n- ***OTHP*** : **OtherPrivate** Definition: Other interest rate of the instalment   */
    val tp: InterestRateAnyOf.Tp? = null
)
{
    /**
    * Contains instalment period Period\\n\\n- ***MNTH*** : **Monthly** Definition: Monthly instalment period.  \\n\\n- ***ANNU*** : **Annual** Definition: Annual instalment period.  
    * Values: MNTH,ANNU
    */
    enum class Prd(val value: kotlin.String){
        MNTH("MNTH"),
        ANNU("ANNU");
    }
    /**
    * Interest rate applicable to the instalment. Type\\n\\n- ***GSRT*** : **GrossRate** Definition: Gross interest rate of the instalment  \\n\\n- ***NTRT*** : **NetRate** Definition: Net interest rate of the instalment  \\n\\n- ***OTHN*** : **OtherNational** Definition: Other interest rate of the instalment  \\n\\n- ***OTHP*** : **OtherPrivate** Definition: Other interest rate of the instalment  
    * Values: GSRT,NTRT,OTHN,OTHP
    */
    enum class Tp(val value: kotlin.String){
        GSRT("GSRT"),
        NTRT("NTRT"),
        OTHN("OTHN"),
        OTHP("OTHP");
    }
}

