package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class Name   {
  
  private String familyName = null;
  private String formatted = null;
  private String givenName = null;
  private String honorificPrefix = null;
  private String honorificSuffix = null;
  private String middleName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("honorificPrefix")
  public String getHonorificPrefix() {
    return honorificPrefix;
  }
  public void setHonorificPrefix(String honorificPrefix) {
    this.honorificPrefix = honorificPrefix;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("honorificSuffix")
  public String getHonorificSuffix() {
    return honorificSuffix;
  }
  public void setHonorificSuffix(String honorificSuffix) {
    this.honorificSuffix = honorificSuffix;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(familyName, name.familyName) &&
        Objects.equals(formatted, name.formatted) &&
        Objects.equals(givenName, name.givenName) &&
        Objects.equals(honorificPrefix, name.honorificPrefix) &&
        Objects.equals(honorificSuffix, name.honorificSuffix) &&
        Objects.equals(middleName, name.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, formatted, givenName, honorificPrefix, honorificSuffix, middleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    honorificPrefix: ").append(toIndentedString(honorificPrefix)).append("\n");
    sb.append("    honorificSuffix: ").append(toIndentedString(honorificSuffix)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

