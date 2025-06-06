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

import com.lorealconsulting.nexoretail.kotlin.models.Period

import kotlinx.serialization.Serializable
/**
 * Timing condition for periodic exchanges. TimeCondition
 * @param atId 
 * @param endTm Date and time after which the action cannot be processed. EndTime
 * @param prd 
 * @param startTm Date and time to start the action. StartTime
 * @param unitOfTm Identification of the minimum unit of time used by time configuration parameters. UnitOfTime\\n\\n- ***DAYC*** : **CalendarDay** Definition: Time unit is calendar day.  \\n\\n- ***HOUR*** : **Hour** Definition: Time unit is hour.  \\n\\n- ***MINU*** : **Minute** Definition: Time unit is minute.  \\n\\n- ***MNTH*** : **Month** Definition: Time unit is month.  \\n\\n- ***SECO*** : **Second** Definition: Time unit is second.  \\n\\n- ***WEEK*** : **Week** Definition: Time unit is week.  \\n\\n- ***YEAR*** : **Year** Definition: Time unit is year.  
 */
@Serializable
data class TimeCondition(
    /*  */
    val atId: kotlin.String? = null,
    /* Date and time after which the action cannot be processed. EndTime */
    val endTm: kotlin.String? = null,
    val prd: Period? = null,
    /* Date and time to start the action. StartTime */
    val startTm: kotlin.String? = null,
    /* Identification of the minimum unit of time used by time configuration parameters. UnitOfTime\\n\\n- ***DAYC*** : **CalendarDay** Definition: Time unit is calendar day.  \\n\\n- ***HOUR*** : **Hour** Definition: Time unit is hour.  \\n\\n- ***MINU*** : **Minute** Definition: Time unit is minute.  \\n\\n- ***MNTH*** : **Month** Definition: Time unit is month.  \\n\\n- ***SECO*** : **Second** Definition: Time unit is second.  \\n\\n- ***WEEK*** : **Week** Definition: Time unit is week.  \\n\\n- ***YEAR*** : **Year** Definition: Time unit is year.   */
    val unitOfTm: TimeCondition.UnitOfTm? = null
)
{
    /**
    * Identification of the minimum unit of time used by time configuration parameters. UnitOfTime\\n\\n- ***DAYC*** : **CalendarDay** Definition: Time unit is calendar day.  \\n\\n- ***HOUR*** : **Hour** Definition: Time unit is hour.  \\n\\n- ***MINU*** : **Minute** Definition: Time unit is minute.  \\n\\n- ***MNTH*** : **Month** Definition: Time unit is month.  \\n\\n- ***SECO*** : **Second** Definition: Time unit is second.  \\n\\n- ***WEEK*** : **Week** Definition: Time unit is week.  \\n\\n- ***YEAR*** : **Year** Definition: Time unit is year.  
    * Values: DAYC,HOUR,MINU,MNTH,SECO,WEEK,YEAR
    */
    enum class UnitOfTm(val value: kotlin.String){
        DAYC("DAYC"),
        HOUR("HOUR"),
        MINU("MINU"),
        MNTH("MNTH"),
        SECO("SECO"),
        WEEK("WEEK"),
        YEAR("YEAR");
    }
}

