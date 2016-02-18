package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Logout;
import io.swagger.client.model.SelfService;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class Links   {
  
  private String homeRedirect = null;
  private Logout logout = null;
  private SelfService selfService = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("homeRedirect")
  public String getHomeRedirect() {
    return homeRedirect;
  }
  public void setHomeRedirect(String homeRedirect) {
    this.homeRedirect = homeRedirect;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("logout")
  public Logout getLogout() {
    return logout;
  }
  public void setLogout(Logout logout) {
    this.logout = logout;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("selfService")
  public SelfService getSelfService() {
    return selfService;
  }
  public void setSelfService(SelfService selfService) {
    this.selfService = selfService;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(homeRedirect, links.homeRedirect) &&
        Objects.equals(logout, links.logout) &&
        Objects.equals(selfService, links.selfService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeRedirect, logout, selfService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    homeRedirect: ").append(toIndentedString(homeRedirect)).append("\n");
    sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
    sb.append("    selfService: ").append(toIndentedString(selfService)).append("\n");
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

