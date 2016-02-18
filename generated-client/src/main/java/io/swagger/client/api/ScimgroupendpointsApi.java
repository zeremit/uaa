package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ScimGroup;
import io.swagger.client.model.ScimGroupExternalMember;
//import io.swagger.client.model.Error;
import io.swagger.client.model.SearchResultsobject;
import io.swagger.client.model.ScimGroupMember;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class ScimgroupendpointsApi {
  private ApiClient apiClient;

  public ScimgroupendpointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScimgroupendpointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * createGroup
   * 
   * @param group group
   * @return ScimGroup
   */
  public ScimGroup createGroupUsingPOST1(ScimGroup group) throws ApiException {
    Object postBody = group;
    
     // verify the required parameter 'group' is set
     if (group == null) {
        throw new ApiException(400, "Missing the required parameter 'group' when calling createGroupUsingPOST1");
     }
     
    // create path and map variables
    String path = "/Groups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * mapExternalGroup
   * 
   * @param sgm sgm
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember mapExternalGroupUsingPOST2(ScimGroupExternalMember sgm) throws ApiException {
    Object postBody = sgm;
    
     // verify the required parameter 'sgm' is set
     if (sgm == null) {
        throw new ApiException(400, "Missing the required parameter 'sgm' when calling mapExternalGroupUsingPOST2");
     }
     
    // create path and map variables
    String path = "/Groups/External".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * unmapExternalGroupUsingName
   * 
   * @param displayName displayName
   * @param externalGroup externalGroup
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember unmapExternalGroupUsingNameUsingDELETE4(String displayName, String externalGroup) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'displayName' is set
     if (displayName == null) {
        throw new ApiException(400, "Missing the required parameter 'displayName' when calling unmapExternalGroupUsingNameUsingDELETE4");
     }
     
     // verify the required parameter 'externalGroup' is set
     if (externalGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'externalGroup' when calling unmapExternalGroupUsingNameUsingDELETE4");
     }
     
    // create path and map variables
    String path = "/Groups/External/displayName/{displayName}/externalGroup/{externalGroup}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "displayName" + "\\}", apiClient.escapeString(displayName.toString()))
      .replaceAll("\\{" + "externalGroup" + "\\}", apiClient.escapeString(externalGroup.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * unmapExternalGroupUsingName
   * 
   * @param displayName displayName
   * @param externalGroup externalGroup
   * @param origin origin
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember unmapExternalGroupUsingNameUsingDELETE(String displayName, String externalGroup, String origin) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'displayName' is set
     if (displayName == null) {
        throw new ApiException(400, "Missing the required parameter 'displayName' when calling unmapExternalGroupUsingNameUsingDELETE");
     }
     
     // verify the required parameter 'externalGroup' is set
     if (externalGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'externalGroup' when calling unmapExternalGroupUsingNameUsingDELETE");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling unmapExternalGroupUsingNameUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Groups/External/displayName/{displayName}/externalGroup/{externalGroup}/origin/{origin}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "displayName" + "\\}", apiClient.escapeString(displayName.toString()))
      .replaceAll("\\{" + "externalGroup" + "\\}", apiClient.escapeString(externalGroup.toString()))
      .replaceAll("\\{" + "origin" + "\\}", apiClient.escapeString(origin.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deprecated2UnmapExternalGroup
   * 
   * @param groupId groupId
   * @param externalGroup externalGroup
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember deprecated2UnmapExternalGroupUsingDELETE2(String groupId, String externalGroup) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling deprecated2UnmapExternalGroupUsingDELETE2");
     }
     
     // verify the required parameter 'externalGroup' is set
     if (externalGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'externalGroup' when calling deprecated2UnmapExternalGroupUsingDELETE2");
     }
     
    // create path and map variables
    String path = "/Groups/External/groupId/{groupId}/externalGroup/{externalGroup}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "externalGroup" + "\\}", apiClient.escapeString(externalGroup.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * unmapExternalGroup
   * 
   * @param groupId groupId
   * @param externalGroup externalGroup
   * @param origin origin
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember unmapExternalGroupUsingDELETE2(String groupId, String externalGroup, String origin) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling unmapExternalGroupUsingDELETE2");
     }
     
     // verify the required parameter 'externalGroup' is set
     if (externalGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'externalGroup' when calling unmapExternalGroupUsingDELETE2");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling unmapExternalGroupUsingDELETE2");
     }
     
    // create path and map variables
    String path = "/Groups/External/groupId/{groupId}/externalGroup/{externalGroup}/origin/{origin}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "externalGroup" + "\\}", apiClient.escapeString(externalGroup.toString()))
      .replaceAll("\\{" + "origin" + "\\}", apiClient.escapeString(origin.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deprecatedUnmapExternalGroup
   * 
   * @param groupId groupId
   * @param externalGroup externalGroup
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember deprecatedUnmapExternalGroupUsingDELETE(String groupId, String externalGroup) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling deprecatedUnmapExternalGroupUsingDELETE");
     }
     
     // verify the required parameter 'externalGroup' is set
     if (externalGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'externalGroup' when calling deprecatedUnmapExternalGroupUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Groups/External/id/{groupId}/{externalGroup}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "externalGroup" + "\\}", apiClient.escapeString(externalGroup.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listExternalGroups
   * 
   * @param startIndex startIndex
   * @param count count
   * @param filter filter
   * @return SearchResultsobject
   */
  public SearchResultsobject listExternalGroupsUsingGET2(Integer startIndex, Integer count, String filter) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Groups/External/list{?startIndex,count,filter}".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SearchResultsobject> returnType = new GenericType<SearchResultsobject>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deprecatedUnmapExternalGroupUsingName
   * 
   * @param displayName displayName
   * @param externalGroup externalGroup
   * @return ScimGroupExternalMember
   */
  public ScimGroupExternalMember deprecatedUnmapExternalGroupUsingNameUsingDELETE1(String displayName, String externalGroup) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'displayName' is set
     if (displayName == null) {
        throw new ApiException(400, "Missing the required parameter 'displayName' when calling deprecatedUnmapExternalGroupUsingNameUsingDELETE1");
     }
     
     // verify the required parameter 'externalGroup' is set
     if (externalGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'externalGroup' when calling deprecatedUnmapExternalGroupUsingNameUsingDELETE1");
     }
     
    // create path and map variables
    String path = "/Groups/External/{displayName}/{externalGroup}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "displayName" + "\\}", apiClient.escapeString(displayName.toString()))
      .replaceAll("\\{" + "externalGroup" + "\\}", apiClient.escapeString(externalGroup.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupExternalMember> returnType = new GenericType<ScimGroupExternalMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getExternalGroups
   * 
   * @param startIndex startIndex
   * @param count count
   * @param filter filter
   * @return SearchResultsobject
   */
  public SearchResultsobject getExternalGroupsUsingGET2(Integer startIndex, Integer count, String filter) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Groups/External{?startIndex,count,filter}".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SearchResultsobject> returnType = new GenericType<SearchResultsobject>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * addZoneManagers
   * 
   * @param group group
   * @return ScimGroup
   */
  public ScimGroup addZoneManagersUsingPOST2(ScimGroup group) throws ApiException {
    Object postBody = group;
    
     // verify the required parameter 'group' is set
     if (group == null) {
        throw new ApiException(400, "Missing the required parameter 'group' when calling addZoneManagersUsingPOST2");
     }
     
    // create path and map variables
    String path = "/Groups/zones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteZoneAdmin
   * 
   * @param userId userId
   * @param zoneId zoneId
   * @return ScimGroup
   */
  public ScimGroup deleteZoneAdminUsingDELETE(String userId, String zoneId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteZoneAdminUsingDELETE");
     }
     
     // verify the required parameter 'zoneId' is set
     if (zoneId == null) {
        throw new ApiException(400, "Missing the required parameter 'zoneId' when calling deleteZoneAdminUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Groups/zones/{userId}/{zoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteZoneScope
   * 
   * @param userId userId
   * @param zoneId zoneId
   * @param scope scope
   * @return ScimGroup
   */
  public ScimGroup deleteZoneScopeUsingDELETE2(String userId, String zoneId, String scope) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteZoneScopeUsingDELETE2");
     }
     
     // verify the required parameter 'zoneId' is set
     if (zoneId == null) {
        throw new ApiException(400, "Missing the required parameter 'zoneId' when calling deleteZoneScopeUsingDELETE2");
     }
     
     // verify the required parameter 'scope' is set
     if (scope == null) {
        throw new ApiException(400, "Missing the required parameter 'scope' when calling deleteZoneScopeUsingDELETE2");
     }
     
    // create path and map variables
    String path = "/Groups/zones/{userId}/{zoneId}/{scope}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "zoneId" + "\\}", apiClient.escapeString(zoneId.toString()))
      .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroup
   * 
   * @param groupId groupId
   * @return ScimGroup
   */
  public ScimGroup getGroupUsingGET(String groupId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupUsingGET");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * updateGroup
   * 
   * @param group group
   * @param groupId groupId
   * @param ifMatch If-Match
   * @return ScimGroup
   */
  public ScimGroup updateGroupUsingPUT1(ScimGroup group, String groupId, String ifMatch) throws ApiException {
    Object postBody = group;
    
     // verify the required parameter 'group' is set
     if (group == null) {
        throw new ApiException(400, "Missing the required parameter 'group' when calling updateGroupUsingPUT1");
     }
     
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateGroupUsingPUT1");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (ifMatch != null)
      headerParams.put("If-Match", apiClient.parameterToString(ifMatch));
    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteGroup
   * 
   * @param groupId groupId
   * @param ifMatch If-Match
   * @return ScimGroup
   */
  public ScimGroup deleteGroupUsingDELETE(String groupId, String ifMatch) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteGroupUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (ifMatch != null)
      headerParams.put("If-Match", apiClient.parameterToString(ifMatch));
    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroup> returnType = new GenericType<ScimGroup>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * editMemberInGroup
   * 
   * @param groupId groupId
   * @param member member
   * @return ScimGroupMember
   */
  public ScimGroupMember editMemberInGroupUsingPUT2(String groupId, ScimGroupMember member) throws ApiException {
    Object postBody = member;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling editMemberInGroupUsingPUT2");
     }
     
     // verify the required parameter 'member' is set
     if (member == null) {
        throw new ApiException(400, "Missing the required parameter 'member' when calling editMemberInGroupUsingPUT2");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * addMemberToGroup
   * 
   * @param groupId groupId
   * @param member member
   * @return ScimGroupMember
   */
  public ScimGroupMember addMemberToGroupUsingPOST(String groupId, ScimGroupMember member) throws ApiException {
    Object postBody = member;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling addMemberToGroupUsingPOST");
     }
     
     // verify the required parameter 'member' is set
     if (member == null) {
        throw new ApiException(400, "Missing the required parameter 'member' when calling addMemberToGroupUsingPOST");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingGET(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingGET");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingGET");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingHEAD(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingHEAD");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingHEAD");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "HEAD", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingPUT(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingPUT");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingPUT");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingPOST(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingPOST");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingPOST");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingDELETE(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingDELETE");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingPATCH(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingPATCH");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingPATCH");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getGroupMembership
   * 
   * @param groupId groupId
   * @param memberId memberId
   * @return ScimGroupMember
   */
  public ScimGroupMember getGroupMembershipUsingOPTIONS(String groupId, String memberId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupMembershipUsingOPTIONS");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling getGroupMembershipUsingOPTIONS");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ScimGroupMember> returnType = new GenericType<ScimGroupMember>() {};
    return apiClient.invokeAPI(path, "OPTIONS", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingGET(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingGET");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingHEAD(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingHEAD");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "HEAD", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingPUT(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingPUT");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingPOST(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingPOST");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingDELETE(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingPATCH(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingPATCH");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroupMemberships
   * 
   * @param groupId groupId
   * @param returnEntities returnEntities
   * @param filter filter
   * @return List<ScimGroupMember>
   */
  public List<ScimGroupMember> listGroupMembershipsUsingOPTIONS(String groupId, Boolean returnEntities, String filter) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'groupId' is set
     if (groupId == null) {
        throw new ApiException(400, "Missing the required parameter 'groupId' when calling listGroupMembershipsUsingOPTIONS");
     }
     
    // create path and map variables
    String path = "/Groups/{groupId}/members{?returnEntities,filter}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "returnEntities", returnEntities));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<ScimGroupMember>> returnType = new GenericType<List<ScimGroupMember>>() {};
    return apiClient.invokeAPI(path, "OPTIONS", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listGroups
   * 
   * @param attributes attributes
   * @param filter filter
   * @param sortBy sortBy
   * @param sortOrder sortOrder
   * @param startIndex startIndex
   * @param count count
   * @return SearchResultsobject
   */
  public SearchResultsobject listGroupsUsingGET1(String attributes, String filter, String sortBy, String sortOrder, Integer startIndex, Integer count) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Groups{?attributes,filter,sortBy,sortOrder,startIndex,count}".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "attributes", attributes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startIndex", startIndex));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SearchResultsobject> returnType = new GenericType<SearchResultsobject>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
