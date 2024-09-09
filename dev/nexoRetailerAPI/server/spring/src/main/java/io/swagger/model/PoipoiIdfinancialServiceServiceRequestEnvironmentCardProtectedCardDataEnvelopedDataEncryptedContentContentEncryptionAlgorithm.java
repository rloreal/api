package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cryptographic algorithm and parameters for the protection of the transported key.&lt;br/&gt;
 */
@Schema(description = "Cryptographic algorithm and parameters for the protection of the transported key.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm   {
  @JsonProperty("Algorithm")
  private Object algorithm = null;

  @JsonProperty("Parameter")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter parameter = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm algorithm(Object algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Cryptographic algorithms for the protection of transported keys.<br/>- **EA2C: AES128CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DC: DES112CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **DKP9: DUKPT2009**  : *DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.*<br/>- **UKPT: UKPT**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).*<br/>- **UKA2: UKPTwithAES192**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9C: AES192CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA5C: AES256CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **DA12: AESDUKPT128ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.*<br/>- **DA19: AESDUKPT192ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.*<br/>- **DA25: AESDUKPT256ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.*<br/>- **N108: Nist800-108KeyDerivation**  : *Key Derivation according to the Special Publication from the NIST entitled 800-108.*<br/>- **EA5R: AES256CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9R: AES192CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA2R: AES128CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DR: DES112CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.*<br/>- **E36C: DES168CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **E36R: DES168CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.*<br/>- **SD5C: SDE056CBC**  : *The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).*<br/>- **UKA1: UKPTwithAES128**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **UKA3: UKPTwithAES256**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **SM4C: SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode.*<br/>- **SM4R: SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode.*<br/>
   * @return algorithm
   **/
  @Schema(example = "EA2C", required = true, description = "Cryptographic algorithms for the protection of transported keys.<br/>- **EA2C: AES128CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DC: DES112CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **DKP9: DUKPT2009**  : *DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.*<br/>- **UKPT: UKPT**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).*<br/>- **UKA2: UKPTwithAES192**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9C: AES192CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA5C: AES256CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **DA12: AESDUKPT128ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.*<br/>- **DA19: AESDUKPT192ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.*<br/>- **DA25: AESDUKPT256ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.*<br/>- **N108: Nist800-108KeyDerivation**  : *Key Derivation according to the Special Publication from the NIST entitled 800-108.*<br/>- **EA5R: AES256CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9R: AES192CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA2R: AES128CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DR: DES112CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.*<br/>- **E36C: DES168CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **E36R: DES168CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.*<br/>- **SD5C: SDE056CBC**  : *The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).*<br/>- **UKA1: UKPTwithAES128**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **UKA3: UKPTwithAES256**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **SM4C: SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode.*<br/>- **SM4R: SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode.*<br/>")
      @NotNull

    public Object getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(Object algorithm) {
    this.algorithm = algorithm;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm parameter(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter parameter) {
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
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter getParameter() {
    return parameter;
  }

  public void setParameter(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter parameter) {
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
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm) o;
    return Objects.equals(this.algorithm, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm.algorithm) &&
        Objects.equals(this.parameter, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm {\n");
    
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
