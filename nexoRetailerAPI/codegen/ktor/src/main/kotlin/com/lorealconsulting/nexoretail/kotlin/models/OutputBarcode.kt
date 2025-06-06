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

import com.lorealconsulting.nexoretail.kotlin.models.BarcodeValue
import com.lorealconsulting.nexoretail.kotlin.models.QRCodeVersion

import kotlinx.serialization.Serializable
/**
 * Content of message displayed or printed as Barcode. OutputBarcode
 * @param brcdTp Type of Barcode coding. BarcodeType\\n\\n- ***COQR*** : **BarcodeEncodedAs2DQRCode** Definition: Barcode encoded according to the 2Dimensions Quick Response Code Standard.  \\n\\n- ***C128*** : **BarcodeEncodedAsCode128** Definition: Barcode encoded according to the Code 128 standard.  \\n\\n- ***C025*** : **BarcodeEncodedAsCode25** Definition: Barcode encoded according to the Code 25 standard.  \\n\\n- ***C039*** : **BarcodeEncodedAsCode39** Definition: Barcode encoded according to the Code 39 standard.  \\n\\n- ***EA13*** : **BarcodeEncodedAsEA13** Definition: Barcode encoded according to the EAN13 standard.  \\n\\n- ***EAN8*** : **BarcodeEncodedAsEAN8** Definition: Barcode encoded according to the EAN8 standard.  \\n\\n- ***P417*** : **BarcodeEncodedAsPDF417** Definition: Barcode encoded according to the PDF417 standard.  \\n\\n- ***UPCA*** : **BarcodeEncodedAsUPCA** Definition: Barcode encoded according to the UPCA standard.  
 * @param atId 
 * @param brcdVal 
 * @param qrCdBinryVal Use for binary and Kanji Quick Respone Code. QRCodeBinaryValue
 * @param qrCdErrCrrctn Error Correction mode of Quick Response Code. QRCodeErrorCorrection\\n\\n- ***M015*** : **ErrorCorrection15Percent** Definition: Reed-Solomon error correction 15%  \\n\\n- ***Q025*** : **ErrorCorrection25Percent** Definition: Reed-Solomon error correction 25%  \\n\\n- ***H030*** : **ErrorCorrection30Percent** Definition: Reed-Solomon error correction 30%  \\n\\n- ***L007*** : **ErrorCorrection7Percent** Definition: Reed-Solomon error correction  7%  
 * @param qrCdNcodgMd Encoding Mode of Quick Response Code. QRCodeEncodingMode\\n\\n- ***ALFA*** : **Alphanumeric** Definition: Alphanumeric value provided in Barcode field.  \\n\\n- ***BINA*** : **Binary** Definition: Binary value provided in Quick Response Code Binary Value.  \\n\\n- ***KANJ*** : **Kanji** Definition: Kanji value provided in Quick Response Code Binary Value.  \\n\\n- ***NUME*** : **Numeric** Definition: Numeric value provided in Barcode field.  
 * @param qrCdVrsn 
 */
@Serializable
data class OutputBarcode(
    /* Type of Barcode coding. BarcodeType\\n\\n- ***COQR*** : **BarcodeEncodedAs2DQRCode** Definition: Barcode encoded according to the 2Dimensions Quick Response Code Standard.  \\n\\n- ***C128*** : **BarcodeEncodedAsCode128** Definition: Barcode encoded according to the Code 128 standard.  \\n\\n- ***C025*** : **BarcodeEncodedAsCode25** Definition: Barcode encoded according to the Code 25 standard.  \\n\\n- ***C039*** : **BarcodeEncodedAsCode39** Definition: Barcode encoded according to the Code 39 standard.  \\n\\n- ***EA13*** : **BarcodeEncodedAsEA13** Definition: Barcode encoded according to the EAN13 standard.  \\n\\n- ***EAN8*** : **BarcodeEncodedAsEAN8** Definition: Barcode encoded according to the EAN8 standard.  \\n\\n- ***P417*** : **BarcodeEncodedAsPDF417** Definition: Barcode encoded according to the PDF417 standard.  \\n\\n- ***UPCA*** : **BarcodeEncodedAsUPCA** Definition: Barcode encoded according to the UPCA standard.   */
    val brcdTp: OutputBarcode.BrcdTp,
    /*  */
    val atId: kotlin.String? = null,
    val brcdVal: BarcodeValue? = null,
    /* Use for binary and Kanji Quick Respone Code. QRCodeBinaryValue */
    val qrCdBinryVal: kotlin.String? = null,
    /* Error Correction mode of Quick Response Code. QRCodeErrorCorrection\\n\\n- ***M015*** : **ErrorCorrection15Percent** Definition: Reed-Solomon error correction 15%  \\n\\n- ***Q025*** : **ErrorCorrection25Percent** Definition: Reed-Solomon error correction 25%  \\n\\n- ***H030*** : **ErrorCorrection30Percent** Definition: Reed-Solomon error correction 30%  \\n\\n- ***L007*** : **ErrorCorrection7Percent** Definition: Reed-Solomon error correction  7%   */
    val qrCdErrCrrctn: OutputBarcode.QrCdErrCrrctn? = null,
    /* Encoding Mode of Quick Response Code. QRCodeEncodingMode\\n\\n- ***ALFA*** : **Alphanumeric** Definition: Alphanumeric value provided in Barcode field.  \\n\\n- ***BINA*** : **Binary** Definition: Binary value provided in Quick Response Code Binary Value.  \\n\\n- ***KANJ*** : **Kanji** Definition: Kanji value provided in Quick Response Code Binary Value.  \\n\\n- ***NUME*** : **Numeric** Definition: Numeric value provided in Barcode field.   */
    val qrCdNcodgMd: OutputBarcode.QrCdNcodgMd? = null,
    val qrCdVrsn: QRCodeVersion? = null
)
{
    /**
    * Type of Barcode coding. BarcodeType\\n\\n- ***COQR*** : **BarcodeEncodedAs2DQRCode** Definition: Barcode encoded according to the 2Dimensions Quick Response Code Standard.  \\n\\n- ***C128*** : **BarcodeEncodedAsCode128** Definition: Barcode encoded according to the Code 128 standard.  \\n\\n- ***C025*** : **BarcodeEncodedAsCode25** Definition: Barcode encoded according to the Code 25 standard.  \\n\\n- ***C039*** : **BarcodeEncodedAsCode39** Definition: Barcode encoded according to the Code 39 standard.  \\n\\n- ***EA13*** : **BarcodeEncodedAsEA13** Definition: Barcode encoded according to the EAN13 standard.  \\n\\n- ***EAN8*** : **BarcodeEncodedAsEAN8** Definition: Barcode encoded according to the EAN8 standard.  \\n\\n- ***P417*** : **BarcodeEncodedAsPDF417** Definition: Barcode encoded according to the PDF417 standard.  \\n\\n- ***UPCA*** : **BarcodeEncodedAsUPCA** Definition: Barcode encoded according to the UPCA standard.  
    * Values: COQR,C128,C025,C039,EA13,EAN8,P417,UPCA
    */
    enum class BrcdTp(val value: kotlin.String){
        COQR("COQR"),
        C128("C128"),
        C025("C025"),
        C039("C039"),
        EA13("EA13"),
        EAN8("EAN8"),
        P417("P417"),
        UPCA("UPCA");
    }
    /**
    * Error Correction mode of Quick Response Code. QRCodeErrorCorrection\\n\\n- ***M015*** : **ErrorCorrection15Percent** Definition: Reed-Solomon error correction 15%  \\n\\n- ***Q025*** : **ErrorCorrection25Percent** Definition: Reed-Solomon error correction 25%  \\n\\n- ***H030*** : **ErrorCorrection30Percent** Definition: Reed-Solomon error correction 30%  \\n\\n- ***L007*** : **ErrorCorrection7Percent** Definition: Reed-Solomon error correction  7%  
    * Values: M015,Q025,H030,L007
    */
    enum class QrCdErrCrrctn(val value: kotlin.String){
        M015("M015"),
        Q025("Q025"),
        H030("H030"),
        L007("L007");
    }
    /**
    * Encoding Mode of Quick Response Code. QRCodeEncodingMode\\n\\n- ***ALFA*** : **Alphanumeric** Definition: Alphanumeric value provided in Barcode field.  \\n\\n- ***BINA*** : **Binary** Definition: Binary value provided in Quick Response Code Binary Value.  \\n\\n- ***KANJ*** : **Kanji** Definition: Kanji value provided in Quick Response Code Binary Value.  \\n\\n- ***NUME*** : **Numeric** Definition: Numeric value provided in Barcode field.  
    * Values: ALFA,BINA,KANJ,NUME
    */
    enum class QrCdNcodgMd(val value: kotlin.String){
        ALFA("ALFA"),
        BINA("BINA"),
        KANJ("KANJ"),
        NUME("NUME");
    }
}

