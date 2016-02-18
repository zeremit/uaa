package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class URL   {
  
  private String authority = null;
  private Object content = null;
  private Integer defaultPort = null;
  private String file = null;
  private String host = null;
  private String _path = null;
  private Integer port = null;
  private String protocol = null;
  private String query = null;
  private String ref = null;
  private String userInfo = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authority")
  public String getAuthority() {
    return authority;
  }
  public void setAuthority(String authority) {
    this.authority = authority;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultPort")
  public Integer getDefaultPort() {
    return defaultPort;
  }
  public void setDefaultPort(Integer defaultPort) {
    this.defaultPort = defaultPort;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file")
  public String getFile() {
    return file;
  }
  public void setFile(String file) {
    this.file = file;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }
  public void setPath(String _path) {
    this._path = _path;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ref")
  public String getRef() {
    return ref;
  }
  public void setRef(String ref) {
    this.ref = ref;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userInfo")
  public String getUserInfo() {
    return userInfo;
  }
  public void setUserInfo(String userInfo) {
    this.userInfo = userInfo;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URL URL = (URL) o;
    return Objects.equals(authority, URL.authority) &&
        Objects.equals(content, URL.content) &&
        Objects.equals(defaultPort, URL.defaultPort) &&
        Objects.equals(file, URL.file) &&
        Objects.equals(host, URL.host) &&
        Objects.equals(_path, URL._path) &&
        Objects.equals(port, URL.port) &&
        Objects.equals(protocol, URL.protocol) &&
        Objects.equals(query, URL.query) &&
        Objects.equals(ref, URL.ref) &&
        Objects.equals(userInfo, URL.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, content, defaultPort, file, host, _path, port, protocol, query, ref, userInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URL {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    defaultPort: ").append(toIndentedString(defaultPort)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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

