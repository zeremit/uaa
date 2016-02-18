package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CollectionGrantedAuthority;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class ClientDetails   {
  
  private Integer accessTokenValiditySeconds = null;
  private Object additionalInformation = null;
  private CollectionGrantedAuthority authorities = null;
  private List<String> authorizedGrantTypes = new ArrayList<String>();
  private String clientId = null;
  private String clientSecret = null;
  private Integer refreshTokenValiditySeconds = null;
  private List<String> registeredRedirectUri = new ArrayList<String>();
  private List<String> resourceIds = new ArrayList<String>();
  private List<String> scope = new ArrayList<String>();
  private Boolean scoped = null;
  private Boolean secretRequired = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessTokenValiditySeconds")
  public Integer getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }
  public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalInformation")
  public Object getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorities")
  public CollectionGrantedAuthority getAuthorities() {
    return authorities;
  }
  public void setAuthorities(CollectionGrantedAuthority authorities) {
    this.authorities = authorities;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizedGrantTypes")
  public List<String> getAuthorizedGrantTypes() {
    return authorizedGrantTypes;
  }
  public void setAuthorizedGrantTypes(List<String> authorizedGrantTypes) {
    this.authorizedGrantTypes = authorizedGrantTypes;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refreshTokenValiditySeconds")
  public Integer getRefreshTokenValiditySeconds() {
    return refreshTokenValiditySeconds;
  }
  public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("registeredRedirectUri")
  public List<String> getRegisteredRedirectUri() {
    return registeredRedirectUri;
  }
  public void setRegisteredRedirectUri(List<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resourceIds")
  public List<String> getResourceIds() {
    return resourceIds;
  }
  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public List<String> getScope() {
    return scope;
  }
  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scoped")
  public Boolean getScoped() {
    return scoped;
  }
  public void setScoped(Boolean scoped) {
    this.scoped = scoped;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secretRequired")
  public Boolean getSecretRequired() {
    return secretRequired;
  }
  public void setSecretRequired(Boolean secretRequired) {
    this.secretRequired = secretRequired;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetails clientDetails = (ClientDetails) o;
    return Objects.equals(accessTokenValiditySeconds, clientDetails.accessTokenValiditySeconds) &&
        Objects.equals(additionalInformation, clientDetails.additionalInformation) &&
        Objects.equals(authorities, clientDetails.authorities) &&
        Objects.equals(authorizedGrantTypes, clientDetails.authorizedGrantTypes) &&
        Objects.equals(clientId, clientDetails.clientId) &&
        Objects.equals(clientSecret, clientDetails.clientSecret) &&
        Objects.equals(refreshTokenValiditySeconds, clientDetails.refreshTokenValiditySeconds) &&
        Objects.equals(registeredRedirectUri, clientDetails.registeredRedirectUri) &&
        Objects.equals(resourceIds, clientDetails.resourceIds) &&
        Objects.equals(scope, clientDetails.scope) &&
        Objects.equals(scoped, clientDetails.scoped) &&
        Objects.equals(secretRequired, clientDetails.secretRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValiditySeconds, additionalInformation, authorities, authorizedGrantTypes, clientId, clientSecret, refreshTokenValiditySeconds, registeredRedirectUri, resourceIds, scope, scoped, secretRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetails {\n");
    
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    authorizedGrantTypes: ").append(toIndentedString(authorizedGrantTypes)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    refreshTokenValiditySeconds: ").append(toIndentedString(refreshTokenValiditySeconds)).append("\n");
    sb.append("    registeredRedirectUri: ").append(toIndentedString(registeredRedirectUri)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scoped: ").append(toIndentedString(scoped)).append("\n");
    sb.append("    secretRequired: ").append(toIndentedString(secretRequired)).append("\n");
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

