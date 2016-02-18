package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Collectionobject;
import io.swagger.client.model.Collectionstring;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class SearchResultsobject   {
  
  private Integer itemsPerPage = null;
  private Collectionobject resources = null;
  private Collectionstring schemas = null;
  private Integer startIndex = null;
  private Integer totalResults = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemsPerPage")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }
  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resources")
  public Collectionobject getResources() {
    return resources;
  }
  public void setResources(Collectionobject resources) {
    this.resources = resources;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("schemas")
  public Collectionstring getSchemas() {
    return schemas;
  }
  public void setSchemas(Collectionstring schemas) {
    this.schemas = schemas;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalResults")
  public Integer getTotalResults() {
    return totalResults;
  }
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultsobject searchResultsobject = (SearchResultsobject) o;
    return Objects.equals(itemsPerPage, searchResultsobject.itemsPerPage) &&
        Objects.equals(resources, searchResultsobject.resources) &&
        Objects.equals(schemas, searchResultsobject.schemas) &&
        Objects.equals(startIndex, searchResultsobject.startIndex) &&
        Objects.equals(totalResults, searchResultsobject.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, resources, schemas, startIndex, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsobject {\n");
    
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

