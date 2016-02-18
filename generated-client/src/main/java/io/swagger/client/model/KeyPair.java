package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class KeyPair   {
  
  private String id = null;
  private String signingKey = null;
  private String signingKeyPassword = null;
  private String verificationKey = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signingKey")
  public String getSigningKey() {
    return signingKey;
  }
  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signingKeyPassword")
  public String getSigningKeyPassword() {
    return signingKeyPassword;
  }
  public void setSigningKeyPassword(String signingKeyPassword) {
    this.signingKeyPassword = signingKeyPassword;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("verificationKey")
  public String getVerificationKey() {
    return verificationKey;
  }
  public void setVerificationKey(String verificationKey) {
    this.verificationKey = verificationKey;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPair keyPair = (KeyPair) o;
    return Objects.equals(id, keyPair.id) &&
        Objects.equals(signingKey, keyPair.signingKey) &&
        Objects.equals(signingKeyPassword, keyPair.signingKeyPassword) &&
        Objects.equals(verificationKey, keyPair.verificationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, signingKey, signingKeyPassword, verificationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPair {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    signingKeyPassword: ").append(toIndentedString(signingKeyPassword)).append("\n");
    sb.append("    verificationKey: ").append(toIndentedString(verificationKey)).append("\n");
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

