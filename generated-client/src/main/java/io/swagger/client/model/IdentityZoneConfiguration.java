package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Links;
import io.swagger.client.model.Prompt;
import io.swagger.client.model.SamlConfig;
import io.swagger.client.model.TokenPolicy;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class IdentityZoneConfiguration   {
  
  private Links links = null;
  private List<Prompt> prompts = new ArrayList<Prompt>();
  private SamlConfig samlConfig = null;
  private TokenPolicy tokenPolicy = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("links")
  public Links getLinks() {
    return links;
  }
  public void setLinks(Links links) {
    this.links = links;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prompts")
  public List<Prompt> getPrompts() {
    return prompts;
  }
  public void setPrompts(List<Prompt> prompts) {
    this.prompts = prompts;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("samlConfig")
  public SamlConfig getSamlConfig() {
    return samlConfig;
  }
  public void setSamlConfig(SamlConfig samlConfig) {
    this.samlConfig = samlConfig;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenPolicy")
  public TokenPolicy getTokenPolicy() {
    return tokenPolicy;
  }
  public void setTokenPolicy(TokenPolicy tokenPolicy) {
    this.tokenPolicy = tokenPolicy;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityZoneConfiguration identityZoneConfiguration = (IdentityZoneConfiguration) o;
    return Objects.equals(links, identityZoneConfiguration.links) &&
        Objects.equals(prompts, identityZoneConfiguration.prompts) &&
        Objects.equals(samlConfig, identityZoneConfiguration.samlConfig) &&
        Objects.equals(tokenPolicy, identityZoneConfiguration.tokenPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, prompts, samlConfig, tokenPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityZoneConfiguration {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
    sb.append("    samlConfig: ").append(toIndentedString(samlConfig)).append("\n");
    sb.append("    tokenPolicy: ").append(toIndentedString(tokenPolicy)).append("\n");
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

