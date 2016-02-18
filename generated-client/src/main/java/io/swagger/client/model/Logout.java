package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class Logout   {
  
  private Boolean disableRedirectParameter = null;
  private String redirectParameterName = null;
  private String redirectUrl = null;
  private List<String> whitelist = new ArrayList<String>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disableRedirectParameter")
  public Boolean getDisableRedirectParameter() {
    return disableRedirectParameter;
  }
  public void setDisableRedirectParameter(Boolean disableRedirectParameter) {
    this.disableRedirectParameter = disableRedirectParameter;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redirectParameterName")
  public String getRedirectParameterName() {
    return redirectParameterName;
  }
  public void setRedirectParameterName(String redirectParameterName) {
    this.redirectParameterName = redirectParameterName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redirectUrl")
  public String getRedirectUrl() {
    return redirectUrl;
  }
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("whitelist")
  public List<String> getWhitelist() {
    return whitelist;
  }
  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logout logout = (Logout) o;
    return Objects.equals(disableRedirectParameter, logout.disableRedirectParameter) &&
        Objects.equals(redirectParameterName, logout.redirectParameterName) &&
        Objects.equals(redirectUrl, logout.redirectUrl) &&
        Objects.equals(whitelist, logout.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableRedirectParameter, redirectParameterName, redirectUrl, whitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logout {\n");
    
    sb.append("    disableRedirectParameter: ").append(toIndentedString(disableRedirectParameter)).append("\n");
    sb.append("    redirectParameterName: ").append(toIndentedString(redirectParameterName)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

