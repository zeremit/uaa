package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ScimGroupMember;
import io.swagger.client.model.ScimMeta;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class ScimGroup   {
  
  private String description = null;
  private String displayName = null;
  private String externalId = null;
  private String id = null;
  private List<ScimGroupMember> members = new ArrayList<ScimGroupMember>();
  private ScimMeta meta = null;
  private List<String> schemas = new ArrayList<String>();
  private String zoneId = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
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
  @JsonProperty("members")
  public List<ScimGroupMember> getMembers() {
    return members;
  }
  public void setMembers(List<ScimGroupMember> members) {
    this.members = members;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("meta")
  public ScimMeta getMeta() {
    return meta;
  }
  public void setMeta(ScimMeta meta) {
    this.meta = meta;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("zoneId")
  public String getZoneId() {
    return zoneId;
  }
  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroup scimGroup = (ScimGroup) o;
    return Objects.equals(description, scimGroup.description) &&
        Objects.equals(displayName, scimGroup.displayName) &&
        Objects.equals(externalId, scimGroup.externalId) &&
        Objects.equals(id, scimGroup.id) &&
        Objects.equals(members, scimGroup.members) &&
        Objects.equals(meta, scimGroup.meta) &&
        Objects.equals(schemas, scimGroup.schemas) &&
        Objects.equals(zoneId, scimGroup.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, externalId, id, members, meta, schemas, zoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroup {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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

