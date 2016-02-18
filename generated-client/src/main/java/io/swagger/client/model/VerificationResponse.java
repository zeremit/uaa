package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.URL;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class VerificationResponse   {
  
  private URL verifyLink = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("verify_link")
  public URL getVerifyLink() {
    return verifyLink;
  }
  public void setVerifyLink(URL verifyLink) {
    this.verifyLink = verifyLink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResponse verificationResponse = (VerificationResponse) o;
    return Objects.equals(verifyLink, verificationResponse.verifyLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifyLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationResponse {\n");
    
    sb.append("    verifyLink: ").append(toIndentedString(verifyLink)).append("\n");
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

