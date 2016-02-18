package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Approval;
import io.swagger.client.model.CollectionGroup;
import io.swagger.client.model.Email;
import io.swagger.client.model.Name;
import io.swagger.client.model.PhoneNumber;
import io.swagger.client.model.ScimMeta;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class ScimUser   {
  
  private Boolean active = null;
  private List<Approval> approvals = new ArrayList<Approval>();
  private String displayName = null;
  private List<Email> emails = new ArrayList<Email>();
  private String externalId = null;
  private CollectionGroup groups = null;
  private String id = null;
  private String locale = null;
  private ScimMeta meta = null;
  private Name name = null;
  private String nickName = null;
  private String origin = null;
  private String password = null;
  private Date passwordLastModified = null;
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
  private String preferredLanguage = null;
  private String profileUrl = null;
  private String salt = null;
  private List<String> schemas = new ArrayList<String>();
  private String timezone = null;
  private String title = null;
  private String userName = null;
  private String userType = null;
  private Boolean verified = null;
  private String zoneId = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approvals")
  public List<Approval> getApprovals() {
    return approvals;
  }
  public void setApprovals(List<Approval> approvals) {
    this.approvals = approvals;
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
  @JsonProperty("emails")
  public List<Email> getEmails() {
    return emails;
  }
  public void setEmails(List<Email> emails) {
    this.emails = emails;
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
  @JsonProperty("groups")
  public CollectionGroup getGroups() {
    return groups;
  }
  public void setGroups(CollectionGroup groups) {
    this.groups = groups;
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
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
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
  @JsonProperty("name")
  public Name getName() {
    return name;
  }
  public void setName(Name name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nickName")
  public String getNickName() {
    return nickName;
  }
  public void setNickName(String nickName) {
    this.nickName = nickName;
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
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordLastModified")
  public Date getPasswordLastModified() {
    return passwordLastModified;
  }
  public void setPasswordLastModified(Date passwordLastModified) {
    this.passwordLastModified = passwordLastModified;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phoneNumbers")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredLanguage")
  public String getPreferredLanguage() {
    return preferredLanguage;
  }
  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileUrl")
  public String getProfileUrl() {
    return profileUrl;
  }
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("salt")
  public String getSalt() {
    return salt;
  }
  public void setSalt(String salt) {
    this.salt = salt;
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
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userType")
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
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
    ScimUser scimUser = (ScimUser) o;
    return Objects.equals(active, scimUser.active) &&
        Objects.equals(approvals, scimUser.approvals) &&
        Objects.equals(displayName, scimUser.displayName) &&
        Objects.equals(emails, scimUser.emails) &&
        Objects.equals(externalId, scimUser.externalId) &&
        Objects.equals(groups, scimUser.groups) &&
        Objects.equals(id, scimUser.id) &&
        Objects.equals(locale, scimUser.locale) &&
        Objects.equals(meta, scimUser.meta) &&
        Objects.equals(name, scimUser.name) &&
        Objects.equals(nickName, scimUser.nickName) &&
        Objects.equals(origin, scimUser.origin) &&
        Objects.equals(password, scimUser.password) &&
        Objects.equals(passwordLastModified, scimUser.passwordLastModified) &&
        Objects.equals(phoneNumbers, scimUser.phoneNumbers) &&
        Objects.equals(preferredLanguage, scimUser.preferredLanguage) &&
        Objects.equals(profileUrl, scimUser.profileUrl) &&
        Objects.equals(salt, scimUser.salt) &&
        Objects.equals(schemas, scimUser.schemas) &&
        Objects.equals(timezone, scimUser.timezone) &&
        Objects.equals(title, scimUser.title) &&
        Objects.equals(userName, scimUser.userName) &&
        Objects.equals(userType, scimUser.userType) &&
        Objects.equals(verified, scimUser.verified) &&
        Objects.equals(zoneId, scimUser.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, approvals, displayName, emails, externalId, groups, id, locale, meta, name, nickName, origin, password, passwordLastModified, phoneNumbers, preferredLanguage, profileUrl, salt, schemas, timezone, title, userName, userType, verified, zoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUser {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    approvals: ").append(toIndentedString(approvals)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordLastModified: ").append(toIndentedString(passwordLastModified)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

