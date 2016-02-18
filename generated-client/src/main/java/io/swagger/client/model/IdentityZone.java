package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IdentityZoneConfiguration;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class IdentityZone   {
  
  private IdentityZoneConfiguration config = null;
  private Date created = null;
  private String description = null;
  private String id = null;
  private Date lastModified = null;
  private String name = null;
  private String subdomain = null;
  private Integer version = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("config")
  public IdentityZoneConfiguration getConfig() {
    return config;
  }
  public void setConfig(IdentityZoneConfiguration config) {
    this.config = config;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
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
  @JsonProperty("last_modified")
  public Date getLastModified() {
    return lastModified;
  }
  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subdomain")
  public String getSubdomain() {
    return subdomain;
  }
  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityZone identityZone = (IdentityZone) o;
    return Objects.equals(config, identityZone.config) &&
        Objects.equals(created, identityZone.created) &&
        Objects.equals(description, identityZone.description) &&
        Objects.equals(id, identityZone.id) &&
        Objects.equals(lastModified, identityZone.lastModified) &&
        Objects.equals(name, identityZone.name) &&
        Objects.equals(subdomain, identityZone.subdomain) &&
        Objects.equals(version, identityZone.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, created, description, id, lastModified, name, subdomain, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityZone {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

