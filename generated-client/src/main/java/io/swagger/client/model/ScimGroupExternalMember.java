package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ScimMeta;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class ScimGroupExternalMember   {
  
  private String displayName = null;
  private String externalGroup = null;
  private String externalId = null;
  private String groupId = null;
  private String id = null;
  private ScimMeta meta = null;
  private String origin = null;
  private List<String> schemas = new ArrayList<String>();

  
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
  @JsonProperty("externalGroup")
  public String getExternalGroup() {
    return externalGroup;
  }
  public void setExternalGroup(String externalGroup) {
    this.externalGroup = externalGroup;
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
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
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
  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroupExternalMember scimGroupExternalMember = (ScimGroupExternalMember) o;
    return Objects.equals(displayName, scimGroupExternalMember.displayName) &&
        Objects.equals(externalGroup, scimGroupExternalMember.externalGroup) &&
        Objects.equals(externalId, scimGroupExternalMember.externalId) &&
        Objects.equals(groupId, scimGroupExternalMember.groupId) &&
        Objects.equals(id, scimGroupExternalMember.id) &&
        Objects.equals(meta, scimGroupExternalMember.meta) &&
        Objects.equals(origin, scimGroupExternalMember.origin) &&
        Objects.equals(schemas, scimGroupExternalMember.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, externalGroup, externalId, groupId, id, meta, origin, schemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroupExternalMember {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    externalGroup: ").append(toIndentedString(externalGroup)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

