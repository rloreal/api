package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithmParameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification of a cryptographic algorithm and parameters for the MAC computation.&lt;br/&gt;
 */
@Schema(description = "Identification of a cryptographic algorithm and parameters for the MAC computation.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm   {
  @JsonProperty("Algorithm")
  private Object algorithm = null;

  @JsonProperty("Parameter")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithmParameter parameter = null;

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm algorithm(Object algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Cryptographic algorithms for the MAC (Message Authentication Code).<br/>- **MACC: RetailCBCMAC**  : *Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).*<br/>- **MCCS: RetailSHA256MAC**  : *Retail-CBC-MAC with SHA-256 (Secure HAsh standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256).*<br/>- **CMA1: SHA256CMACwithAES128**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.*<br/>- **MCC1: RetailSHA1MAC**  : *The DEPRECATED Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1).*<br/>- **CMA9: SHA384CMACwithAES192**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message.*<br/>- **CMA5: SHA512CMACwithAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message.*<br/>- **CMA2: SHA256CMACWithAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.*<br/>- **CM31: SHA3-256CMACWithAES128**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-256 digest of the message.*<br/>- **CM32: SHA3-384CMACWithAES192**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-384 digest of the message.*<br/>- **CM33: SHA3-512CMACWithAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-512 digest of the message.*<br/>- **MCS3: SHA3-256-3DESMAC**  : *3DES CBC-MAC with SHA3-256 (SecureHAsh standard) and ISO/IEC9797-1 method 2 padding.*<br/>- **CCA1: CMACAES128**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **CCA2: CMACAES192**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **CCA3: CMACAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **S34C: SM3SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode coupled with ShangMi 3 hash function.*<br/>- **S34R: SM3SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode coupled with ShangMi 3 hash function.*<br/>
   * @return algorithm
   **/
  @Schema(example = "MACC", required = true, description = "Cryptographic algorithms for the MAC (Message Authentication Code).<br/>- **MACC: RetailCBCMAC**  : *Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).*<br/>- **MCCS: RetailSHA256MAC**  : *Retail-CBC-MAC with SHA-256 (Secure HAsh standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256).*<br/>- **CMA1: SHA256CMACwithAES128**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.*<br/>- **MCC1: RetailSHA1MAC**  : *The DEPRECATED Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1).*<br/>- **CMA9: SHA384CMACwithAES192**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message.*<br/>- **CMA5: SHA512CMACwithAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message.*<br/>- **CMA2: SHA256CMACWithAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.*<br/>- **CM31: SHA3-256CMACWithAES128**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-256 digest of the message.*<br/>- **CM32: SHA3-384CMACWithAES192**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-384 digest of the message.*<br/>- **CM33: SHA3-512CMACWithAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-512 digest of the message.*<br/>- **MCS3: SHA3-256-3DESMAC**  : *3DES CBC-MAC with SHA3-256 (SecureHAsh standard) and ISO/IEC9797-1 method 2 padding.*<br/>- **CCA1: CMACAES128**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **CCA2: CMACAES192**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **CCA3: CMACAES256**  : *CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **S34C: SM3SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode coupled with ShangMi 3 hash function.*<br/>- **S34R: SM3SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode coupled with ShangMi 3 hash function.*<br/>")
      @NotNull

    public Object getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(Object algorithm) {
    this.algorithm = algorithm;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm parameter(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithmParameter parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Get parameter
   * @return parameter
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithmParameter getParameter() {
    return parameter;
  }

  public void setParameter(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithmParameter parameter) {
    this.parameter = parameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm poipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm = (PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm) o;
    return Objects.equals(this.algorithm, poipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm.algorithm) &&
        Objects.equals(this.parameter, poipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
