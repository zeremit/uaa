package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class SelfService   {
  
  private String passwd = null;
  private Boolean selfServiceLinksEnabled = null;
  private String signup = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("passwd")
  public String getPasswd() {
    return passwd;
  }
  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("selfServiceLinksEnabled")
  public Boolean getSelfServiceLinksEnabled() {
    return selfServiceLinksEnabled;
  }
  public void setSelfServiceLinksEnabled(Boolean selfServiceLinksEnabled) {
    this.selfServiceLinksEnabled = selfServiceLinksEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signup")
  public String getSignup() {
    return signup;
  }
  public void setSignup(String signup) {
    this.signup = signup;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfService selfService = (SelfService) o;
    return Objects.equals(passwd, selfService.passwd) &&
        Objects.equals(selfServiceLinksEnabled, selfService.selfServiceLinksEnabled) &&
        Objects.equals(signup, selfService.signup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwd, selfServiceLinksEnabled, signup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfService {\n");
    
    sb.append("    passwd: ").append(toIndentedString(passwd)).append("\n");
    sb.append("    selfServiceLinksEnabled: ").append(toIndentedString(selfServiceLinksEnabled)).append("\n");
    sb.append("    signup: ").append(toIndentedString(signup)).append("\n");
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

