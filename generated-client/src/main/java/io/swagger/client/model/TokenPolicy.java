package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.KeyPair;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class TokenPolicy   {
  
  private Integer accessTokenValidity = null;
  private Map<String, KeyPair> keys = new HashMap<String, KeyPair>();
  private Integer refreshTokenValidity = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessTokenValidity")
  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }
  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("keys")
  public Map<String, KeyPair> getKeys() {
    return keys;
  }
  public void setKeys(Map<String, KeyPair> keys) {
    this.keys = keys;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refreshTokenValidity")
  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }
  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPolicy tokenPolicy = (TokenPolicy) o;
    return Objects.equals(accessTokenValidity, tokenPolicy.accessTokenValidity) &&
        Objects.equals(keys, tokenPolicy.keys) &&
        Objects.equals(refreshTokenValidity, tokenPolicy.refreshTokenValidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValidity, keys, refreshTokenValidity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPolicy {\n");
    
    sb.append("    accessTokenValidity: ").append(toIndentedString(accessTokenValidity)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    refreshTokenValidity: ").append(toIndentedString(refreshTokenValidity)).append("\n");
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

