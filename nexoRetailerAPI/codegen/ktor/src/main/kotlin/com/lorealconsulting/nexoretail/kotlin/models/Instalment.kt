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

import com.lorealconsulting.nexoretail.kotlin.models.Charges
import com.lorealconsulting.nexoretail.kotlin.models.DetailedCharges
import com.lorealconsulting.nexoretail.kotlin.models.FirstAmount
import com.lorealconsulting.nexoretail.kotlin.models.GracePeriod
import com.lorealconsulting.nexoretail.kotlin.models.InstalmentAnyOf
import com.lorealconsulting.nexoretail.kotlin.models.InstalmentAnyOf1Inner
import com.lorealconsulting.nexoretail.kotlin.models.InstalmentPlan
import com.lorealconsulting.nexoretail.kotlin.models.InterestRate
import com.lorealconsulting.nexoretail.kotlin.models.LastAmount
import com.lorealconsulting.nexoretail.kotlin.models.PlanIdentification
import com.lorealconsulting.nexoretail.kotlin.models.PlanNotice
import com.lorealconsulting.nexoretail.kotlin.models.SubsequentAmount
import com.lorealconsulting.nexoretail.kotlin.models.TotalAmount

import kotlinx.serialization.Serializable
/**
 * 
 * @param atId 
 * @param chrgs 
 * @param dtldChrgs 
 * @param frstAmt 
 * @param frstPmtDt Date of the first payment. FirstPaymentDate
 * @param gracePrd 
 * @param instlmtPlan 
 * @param instlmtPrd Number of period units between consecutive payments. InstalmentPeriod
 * @param intrstRate 
 * @param lastAmt 
 * @param planId 
 * @param planNtce 
 * @param planOwnr Type of the Plan Owner. PlanOwner\\n\\n- ***ACCP*** : **Acceptor** Definition: Plan owner is an acceptor.  \\n\\n- ***ACQR*** : **Acquirer** Definition: Plan owner is an acquirer.  \\n\\n- ***ISSR*** : **Issuer** Definition: Plan owner is an issuer.  \\n\\n- ***OTHN*** : **OtherNational** Definition: plan owner type is other national.  \\n\\n- ***OTHP*** : **OtherPrivate** Definition: plan owner type is other private.  
 * @param prdUnit Period unit between consecutive payments (for example day, month, year). PeriodUnit\\n\\n- ***YEAR*** : **Annual** Definition: Event takes place every year or once a year.  \\n\\n- ***MNTH*** : **Monthly** Definition: Event takes place every month or once a month.  \\n\\n- ***QURT*** : **Quarterly** Definition: Event takes place every three months or four times a year.  \\n\\n- ***MIAN*** : **SemiAnnual** Definition: Event takes place every six months or two times a year.  \\n\\n- ***WEEK*** : **Weekly** Definition: Event takes place once a week.  \\n\\n- ***DAIL*** : **Daily** Definition: Event takes place every day.  \\n\\n- ***TEND*** : **TenDays** Definition: Event takes place every ten business days.  
 * @param sbsqntAmt 
 * @param seqNb Indicates the instalment occurrence of the transaction (1 = 1st instalment, 2 = 2nd instalment, etc.). SequenceNumber
 * @param ttlAmt 
 * @param ttlNbOfPmts Total number of instalment payments. TotalNumberOfPayments
 */
@Serializable
data class Instalment(
    /*  */
    val atId: kotlin.String? = null,
    val chrgs: Charges? = null,
    val dtldChrgs: DetailedCharges? = null,
    val frstAmt: FirstAmount? = null,
    /* Date of the first payment. FirstPaymentDate */
    val frstPmtDt: kotlin.String? = null,
    val gracePrd: GracePeriod? = null,
    val instlmtPlan: InstalmentPlan? = null,
    /* Number of period units between consecutive payments. InstalmentPeriod */
    val instlmtPrd: java.math.BigDecimal? = null,
    val intrstRate: InterestRate? = null,
    val lastAmt: LastAmount? = null,
    val planId: PlanIdentification? = null,
    val planNtce: PlanNotice? = null,
    /* Type of the Plan Owner. PlanOwner\\n\\n- ***ACCP*** : **Acceptor** Definition: Plan owner is an acceptor.  \\n\\n- ***ACQR*** : **Acquirer** Definition: Plan owner is an acquirer.  \\n\\n- ***ISSR*** : **Issuer** Definition: Plan owner is an issuer.  \\n\\n- ***OTHN*** : **OtherNational** Definition: plan owner type is other national.  \\n\\n- ***OTHP*** : **OtherPrivate** Definition: plan owner type is other private.   */
    val planOwnr: Instalment.PlanOwnr? = null,
    /* Period unit between consecutive payments (for example day, month, year). PeriodUnit\\n\\n- ***YEAR*** : **Annual** Definition: Event takes place every year or once a year.  \\n\\n- ***MNTH*** : **Monthly** Definition: Event takes place every month or once a month.  \\n\\n- ***QURT*** : **Quarterly** Definition: Event takes place every three months or four times a year.  \\n\\n- ***MIAN*** : **SemiAnnual** Definition: Event takes place every six months or two times a year.  \\n\\n- ***WEEK*** : **Weekly** Definition: Event takes place once a week.  \\n\\n- ***DAIL*** : **Daily** Definition: Event takes place every day.  \\n\\n- ***TEND*** : **TenDays** Definition: Event takes place every ten business days.   */
    val prdUnit: Instalment.PrdUnit? = null,
    val sbsqntAmt: SubsequentAmount? = null,
    /* Indicates the instalment occurrence of the transaction (1 = 1st instalment, 2 = 2nd instalment, etc.). SequenceNumber */
    val seqNb: java.math.BigDecimal? = null,
    val ttlAmt: TotalAmount? = null,
    /* Total number of instalment payments. TotalNumberOfPayments */
    val ttlNbOfPmts: java.math.BigDecimal? = null
)
{
    /**
    * Type of the Plan Owner. PlanOwner\\n\\n- ***ACCP*** : **Acceptor** Definition: Plan owner is an acceptor.  \\n\\n- ***ACQR*** : **Acquirer** Definition: Plan owner is an acquirer.  \\n\\n- ***ISSR*** : **Issuer** Definition: Plan owner is an issuer.  \\n\\n- ***OTHN*** : **OtherNational** Definition: plan owner type is other national.  \\n\\n- ***OTHP*** : **OtherPrivate** Definition: plan owner type is other private.  
    * Values: ACCP,ACQR,ISSR,OTHN,OTHP
    */
    enum class PlanOwnr(val value: kotlin.String){
        ACCP("ACCP"),
        ACQR("ACQR"),
        ISSR("ISSR"),
        OTHN("OTHN"),
        OTHP("OTHP");
    }
    /**
    * Period unit between consecutive payments (for example day, month, year). PeriodUnit\\n\\n- ***YEAR*** : **Annual** Definition: Event takes place every year or once a year.  \\n\\n- ***MNTH*** : **Monthly** Definition: Event takes place every month or once a month.  \\n\\n- ***QURT*** : **Quarterly** Definition: Event takes place every three months or four times a year.  \\n\\n- ***MIAN*** : **SemiAnnual** Definition: Event takes place every six months or two times a year.  \\n\\n- ***WEEK*** : **Weekly** Definition: Event takes place once a week.  \\n\\n- ***DAIL*** : **Daily** Definition: Event takes place every day.  \\n\\n- ***TEND*** : **TenDays** Definition: Event takes place every ten business days.  
    * Values: YEAR,MNTH,QURT,MIAN,WEEK,DAIL,TEND
    */
    enum class PrdUnit(val value: kotlin.String){
        YEAR("YEAR"),
        MNTH("MNTH"),
        QURT("QURT"),
        MIAN("MIAN"),
        WEEK("WEEK"),
        DAIL("DAIL"),
        TEND("TEND");
    }
}

