package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Collectionstring;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class BaseClientDetails   {
  
  private Integer accessTokenValidity = null;
  private List<String> authorities = new ArrayList<String>();
  private Collectionstring authorizedGrantTypes = null;
  private Collectionstring autoapprove = null;
  private String clientId = null;
  private String clientSecret = null;
  private List<String> redirectUri = new ArrayList<String>();
  private Integer refreshTokenValidity = null;
  private Collectionstring resourceIds = null;
  private Collectionstring scope = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("access_token_validity")
  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }
  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorities")
  public List<String> getAuthorities() {
    return authorities;
  }
  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorized_grant_types")
  public Collectionstring getAuthorizedGrantTypes() {
    return authorizedGrantTypes;
  }
  public void setAuthorizedGrantTypes(Collectionstring authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("autoapprove")
  public Collectionstring getAutoapprove() {
    return autoapprove;
  }
  public void setAutoapprove(Collectionstring autoapprove) {
    this.autoapprove = autoapprove;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redirect_uri")
  public List<String> getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(List<String> redirectUri) {
    this.redirectUri = redirectUri;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refresh_token_validity")
  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }
  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resource_ids")
  public Collectionstring getResourceIds() {
    return resourceIds;
  }
  public void setResourceIds(Collectionstring resourceIds) {
    this.resourceIds = resourceIds;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public Collectionstring getScope() {
    return scope;
  }
  public void setScope(Collectionstring scope) {
    this.scope = scope;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseClientDetails baseClientDetails = (BaseClientDetails) o;
    return Objects.equals(accessTokenValidity, baseClientDetails.accessTokenValidity) &&
        Objects.equals(authorities, baseClientDetails.authorities) &&
        Objects.equals(authorizedGrantTypes, baseClientDetails.authorizedGrantTypes) &&
        Objects.equals(autoapprove, baseClientDetails.autoapprove) &&
        Objects.equals(clientId, baseClientDetails.clientId) &&
        Objects.equals(clientSecret, baseClientDetails.clientSecret) &&
        Objects.equals(redirectUri, baseClientDetails.redirectUri) &&
        Objects.equals(refreshTokenValidity, baseClientDetails.refreshTokenValidity) &&
        Objects.equals(resourceIds, baseClientDetails.resourceIds) &&
        Objects.equals(scope, baseClientDetails.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValidity, authorities, authorizedGrantTypes, autoapprove, clientId, clientSecret, redirectUri, refreshTokenValidity, resourceIds, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseClientDetails {\n");
    
    sb.append("    accessTokenValidity: ").append(toIndentedString(accessTokenValidity)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    authorizedGrantTypes: ").append(toIndentedString(authorizedGrantTypes)).append("\n");
    sb.append("    autoapprove: ").append(toIndentedString(autoapprove)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    refreshTokenValidity: ").append(toIndentedString(refreshTokenValidity)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

