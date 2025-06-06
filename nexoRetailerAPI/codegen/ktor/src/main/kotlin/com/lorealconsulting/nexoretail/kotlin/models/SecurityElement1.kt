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

import com.lorealconsulting.nexoretail.kotlin.models.AdditionalManagementInformation1
import com.lorealconsulting.nexoretail.kotlin.models.ComponentWithAuthorisedAccess1
import com.lorealconsulting.nexoretail.kotlin.models.Function1
import com.lorealconsulting.nexoretail.kotlin.models.Identification27
import com.lorealconsulting.nexoretail.kotlin.models.ItemNumber2
import com.lorealconsulting.nexoretail.kotlin.models.KeyValue1
import com.lorealconsulting.nexoretail.kotlin.models.Name9
import com.lorealconsulting.nexoretail.kotlin.models.ProtectedComponentWithAuthorisedAccess1
import com.lorealconsulting.nexoretail.kotlin.models.SecurityElement1AnyOf
import com.lorealconsulting.nexoretail.kotlin.models.SecurityProfile5
import com.lorealconsulting.nexoretail.kotlin.models.Version2

import kotlinx.serialization.Serializable
/**
 * 
 * @param id 
 * @param vrsn 
 * @param atId 
 * @param actvtnDt Date and time on which the key must be activated. ActivationDate
 * @param addtlId Additional identification of the key.  Usage  For derived unique key per transaction (DUKPT) keys, the key serial number (KSN) with the 21 bits of the transaction counter set to zero. AdditionalIdentification
 * @param addtlMgmtInf 
 * @param cmpntWthAuthrsdAccs 
 * @param deactvtnDt Date and time on which the key must be deactivated. DeactivationDate
 * @param fctn 
 * @param itmNb 
 * @param keyChckVal Value for checking a cryptographic key security parameter. KeyCheckValue
 * @param keyVal 
 * @param nm 
 * @param prtctdCmpntWthAuthrsdAccs 
 * @param sctyPrfl 
 * @param tp Type of algorithm used by the cryptographic key. Type\\n\\n- ***AES2*** : **AES128** Definition: AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***EDE3*** : **DES112** Definition: Data encryption standard key of 112 bits (without the parity bits).  \\n\\n- ***DKP9*** : **DUKPT2009** Definition: DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A.  \\n\\n- ***AES9*** : **AES192** Definition: AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***AES5*** : **AES256** Definition: AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***EDE4*** : **DES168** Definition: Data encryption standard key of 168 bits (without the parity bits).  
 */
@Serializable
data class SecurityElement1(
    val id: Identification27,
    val vrsn: Version2,
    /*  */
    val atId: kotlin.String? = null,
    /* Date and time on which the key must be activated. ActivationDate */
    val actvtnDt: kotlin.String? = null,
    /* Additional identification of the key.  Usage  For derived unique key per transaction (DUKPT) keys, the key serial number (KSN) with the 21 bits of the transaction counter set to zero. AdditionalIdentification */
    val addtlId: kotlin.String? = null,
    val addtlMgmtInf: AdditionalManagementInformation1? = null,
    val cmpntWthAuthrsdAccs: ComponentWithAuthorisedAccess1? = null,
    /* Date and time on which the key must be deactivated. DeactivationDate */
    val deactvtnDt: kotlin.String? = null,
    val fctn: Function1? = null,
    val itmNb: ItemNumber2? = null,
    /* Value for checking a cryptographic key security parameter. KeyCheckValue */
    val keyChckVal: kotlin.String? = null,
    val keyVal: KeyValue1? = null,
    val nm: Name9? = null,
    val prtctdCmpntWthAuthrsdAccs: ProtectedComponentWithAuthorisedAccess1? = null,
    val sctyPrfl: SecurityProfile5? = null,
    /* Type of algorithm used by the cryptographic key. Type\\n\\n- ***AES2*** : **AES128** Definition: AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***EDE3*** : **DES112** Definition: Data encryption standard key of 112 bits (without the parity bits).  \\n\\n- ***DKP9*** : **DUKPT2009** Definition: DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A.  \\n\\n- ***AES9*** : **AES192** Definition: AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***AES5*** : **AES256** Definition: AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***EDE4*** : **DES168** Definition: Data encryption standard key of 168 bits (without the parity bits).   */
    val tp: SecurityElement1.Tp? = null
)
{
    /**
    * Type of algorithm used by the cryptographic key. Type\\n\\n- ***AES2*** : **AES128** Definition: AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***EDE3*** : **DES112** Definition: Data encryption standard key of 112 bits (without the parity bits).  \\n\\n- ***DKP9*** : **DUKPT2009** Definition: DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A.  \\n\\n- ***AES9*** : **AES192** Definition: AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***AES5*** : **AES256** Definition: AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).  \\n\\n- ***EDE4*** : **DES168** Definition: Data encryption standard key of 168 bits (without the parity bits).  
    * Values: AES2,EDE3,DKP9,AES9,AES5,EDE4
    */
    enum class Tp(val value: kotlin.String){
        AES2("AES2"),
        EDE3("EDE3"),
        DKP9("DKP9"),
        AES9("AES9"),
        AES5("AES5"),
        EDE4("EDE4");
    }
}

