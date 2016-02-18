package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class SamlConfig   {
  
  private Boolean assertionSigned = null;
  private Integer assertionTimeToLiveSeconds = null;
  private String certificate = null;
  private String privateKey = null;
  private String privateKeyPassword = null;
  private Boolean requestSigned = null;
  private Boolean wantAssertionSigned = null;
  private Boolean wantAuthnRequestSigned = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assertionSigned")
  public Boolean getAssertionSigned() {
    return assertionSigned;
  }
  public void setAssertionSigned(Boolean assertionSigned) {
    this.assertionSigned = assertionSigned;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assertionTimeToLiveSeconds")
  public Integer getAssertionTimeToLiveSeconds() {
    return assertionTimeToLiveSeconds;
  }
  public void setAssertionTimeToLiveSeconds(Integer assertionTimeToLiveSeconds) {
    this.assertionTimeToLiveSeconds = assertionTimeToLiveSeconds;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("privateKey")
  public String getPrivateKey() {
    return privateKey;
  }
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("privateKeyPassword")
  public String getPrivateKeyPassword() {
    return privateKeyPassword;
  }
  public void setPrivateKeyPassword(String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestSigned")
  public Boolean getRequestSigned() {
    return requestSigned;
  }
  public void setRequestSigned(Boolean requestSigned) {
    this.requestSigned = requestSigned;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wantAssertionSigned")
  public Boolean getWantAssertionSigned() {
    return wantAssertionSigned;
  }
  public void setWantAssertionSigned(Boolean wantAssertionSigned) {
    this.wantAssertionSigned = wantAssertionSigned;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wantAuthnRequestSigned")
  public Boolean getWantAuthnRequestSigned() {
    return wantAuthnRequestSigned;
  }
  public void setWantAuthnRequestSigned(Boolean wantAuthnRequestSigned) {
    this.wantAuthnRequestSigned = wantAuthnRequestSigned;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfig samlConfig = (SamlConfig) o;
    return Objects.equals(assertionSigned, samlConfig.assertionSigned) &&
        Objects.equals(assertionTimeToLiveSeconds, samlConfig.assertionTimeToLiveSeconds) &&
        Objects.equals(certificate, samlConfig.certificate) &&
        Objects.equals(privateKey, samlConfig.privateKey) &&
        Objects.equals(privateKeyPassword, samlConfig.privateKeyPassword) &&
        Objects.equals(requestSigned, samlConfig.requestSigned) &&
        Objects.equals(wantAssertionSigned, samlConfig.wantAssertionSigned) &&
        Objects.equals(wantAuthnRequestSigned, samlConfig.wantAuthnRequestSigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertionSigned, assertionTimeToLiveSeconds, certificate, privateKey, privateKeyPassword, requestSigned, wantAssertionSigned, wantAuthnRequestSigned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfig {\n");
    
    sb.append("    assertionSigned: ").append(toIndentedString(assertionSigned)).append("\n");
    sb.append("    assertionTimeToLiveSeconds: ").append(toIndentedString(assertionTimeToLiveSeconds)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyPassword: ").append(toIndentedString(privateKeyPassword)).append("\n");
    sb.append("    requestSigned: ").append(toIndentedString(requestSigned)).append("\n");
    sb.append("    wantAssertionSigned: ").append(toIndentedString(wantAssertionSigned)).append("\n");
    sb.append("    wantAuthnRequestSigned: ").append(toIndentedString(wantAuthnRequestSigned)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

