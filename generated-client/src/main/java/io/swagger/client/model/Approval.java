package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class Approval   {
  
  private String clientId = null;
  private Date expiresAt = null;
  private Date lastUpdatedAt = null;
  private String scope = null;


  public enum StatusEnum {
    APPROVED("APPROVED"),
    DENIED("DENIED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String userId = null;

  
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
  @JsonProperty("expiresAt")
  public Date getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Date expiresAt) {
    this.expiresAt = expiresAt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastUpdatedAt")
  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
  }
  public void setLastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Approval approval = (Approval) o;
    return Objects.equals(clientId, approval.clientId) &&
        Objects.equals(expiresAt, approval.expiresAt) &&
        Objects.equals(lastUpdatedAt, approval.lastUpdatedAt) &&
        Objects.equals(scope, approval.scope) &&
        Objects.equals(status, approval.status) &&
        Objects.equals(userId, approval.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, expiresAt, lastUpdatedAt, scope, status, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Approval {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

