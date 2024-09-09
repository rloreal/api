package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
  * Cryptographic algorithm and parameters for the protection of the transported key.<br/>
 **/
@Schema(description="Cryptographic algorithm and parameters for the protection of the transported key.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm   {
  
  @Schema(example = "EA2C", required = true, description = "Cryptographic algorithms for the protection of transported keys.<br/>- **EA2C: AES128CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DC: DES112CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **DKP9: DUKPT2009**  : *DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.*<br/>- **UKPT: UKPT**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).*<br/>- **UKA2: UKPTwithAES192**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9C: AES192CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA5C: AES256CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **DA12: AESDUKPT128ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.*<br/>- **DA19: AESDUKPT192ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.*<br/>- **DA25: AESDUKPT256ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.*<br/>- **N108: Nist800-108KeyDerivation**  : *Key Derivation according to the Special Publication from the NIST entitled 800-108.*<br/>- **EA5R: AES256CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9R: AES192CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA2R: AES128CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DR: DES112CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.*<br/>- **E36C: DES168CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **E36R: DES168CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.*<br/>- **SD5C: SDE056CBC**  : *The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).*<br/>- **UKA1: UKPTwithAES128**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **UKA3: UKPTwithAES256**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **SM4C: SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode.*<br/>- **SM4R: SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode.*<br/>")
 /**
   * Cryptographic algorithms for the protection of transported keys.<br/>- **EA2C: AES128CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DC: DES112CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **DKP9: DUKPT2009**  : *DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.*<br/>- **UKPT: UKPT**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).*<br/>- **UKA2: UKPTwithAES192**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9C: AES192CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA5C: AES256CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*<br/>- **DA12: AESDUKPT128ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.*<br/>- **DA19: AESDUKPT192ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.*<br/>- **DA25: AESDUKPT256ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.*<br/>- **N108: Nist800-108KeyDerivation**  : *Key Derivation according to the Special Publication from the NIST entitled 800-108.*<br/>- **EA5R: AES256CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA9R: AES192CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **EA2R: AES128CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **E3DR: DES112CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.*<br/>- **E36C: DES168CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*<br/>- **E36R: DES168CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.*<br/>- **SD5C: SDE056CBC**  : *The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).*<br/>- **UKA1: UKPTwithAES128**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **UKA3: UKPTwithAES256**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*<br/>- **SM4C: SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode.*<br/>- **SM4R: SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode.*<br/>  
  **/
  private Object algorithm = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter parameter = null;
 /**
   * Cryptographic algorithms for the protection of transported keys.&lt;br/&gt;- **EA2C: AES128CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **E3DC: DES112CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*&lt;br/&gt;- **DKP9: DUKPT2009**  : *DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.*&lt;br/&gt;- **UKPT: UKPT**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).*&lt;br/&gt;- **UKA2: UKPTwithAES192**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **EA9C: AES192CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **EA5C: AES256CBC**  : *AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **DA12: AESDUKPT128ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.*&lt;br/&gt;- **DA19: AESDUKPT192ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.*&lt;br/&gt;- **DA25: AESDUKPT256ECB**  : *AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.*&lt;br/&gt;- **N108: Nist800-108KeyDerivation**  : *Key Derivation according to the Special Publication from the NIST entitled 800-108.*&lt;br/&gt;- **EA5R: AES256CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **EA9R: AES192CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **EA2R: AES128CTR**  : *AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **E3DR: DES112CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.*&lt;br/&gt;- **E36C: DES168CBC**  : *Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).*&lt;br/&gt;- **E36R: DES168CTR**  : *Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.*&lt;br/&gt;- **SD5C: SDE056CBC**  : *The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).*&lt;br/&gt;- **UKA1: UKPTwithAES128**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **UKA3: UKPTwithAES256**  : *UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).*&lt;br/&gt;- **SM4C: SM4CBC**  : *ShangMi 4 enciphering method used in CBC mode.*&lt;br/&gt;- **SM4R: SM4CTR**  : *ShangMi 4 enciphering method used in CTR mode.*&lt;br/&gt;
   * @return algorithm
  **/
  @JsonProperty("Algorithm")
  @NotNull
  public Object getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(Object algorithm) {
    this.algorithm = algorithm;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm algorithm(Object algorithm) {
    this.algorithm = algorithm;
    return this;
  }

 /**
   * Get parameter
   * @return parameter
  **/
  @JsonProperty("Parameter")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter getParameter() {
    return parameter;
  }

  public void setParameter(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter parameter) {
    this.parameter = parameter;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm parameter(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter parameter) {
    this.parameter = parameter;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
