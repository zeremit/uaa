package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ScimUser;
//import io.swagger.client.model.Error;
import io.swagger.client.model.VerificationResponse;
import io.swagger.client.model.SearchResultsobject;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class ScimuserendpointsApi {
  private ApiClient apiClient;

  public ScimuserendpointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScimuserendpointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * createUser
   * 
   * @param user user
   * @return ScimUser
   */
  public ScimUser createUserUsingPOST2(ScimUser user) throws ApiException {
    Object postBody = user;
    
     // verify the required parameter 'user' is set
     if (user == null) {
        throw new ApiException(400, "Missing the required parameter 'user' when calling createUserUsingPOST2");
     }
     
    // create path and map variables
    String path = "/Users".replaceAll("\\{format\\}","json");

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

    
    GenericType<ScimUser> returnType = new GenericType<ScimUser>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getUser
   * 
   * @param userId userId
   * @return ScimUser
   */
  public ScimUser getUserUsingGET2(String userId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserUsingGET2");
     }
     
    // create path and map variables
    String path = "/Users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    
    GenericType<ScimUser> returnType = new GenericType<ScimUser>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * updateUser
   * 
   * @param user user
   * @param userId userId
   * @param ifMatch If-Match
   * @return ScimUser
   */
  public ScimUser updateUserUsingPUT(ScimUser user, String userId, String ifMatch) throws ApiException {
    Object postBody = user;
    
     // verify the required parameter 'user' is set
     if (user == null) {
        throw new ApiException(400, "Missing the required parameter 'user' when calling updateUserUsingPUT");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserUsingPUT");
     }
     
    // create path and map variables
    String path = "/Users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    
    GenericType<ScimUser> returnType = new GenericType<ScimUser>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteUser
   * 
   * @param userId userId
   * @param ifMatch If-Match
   * @return ScimUser
   */
  public ScimUser deleteUserUsingDELETE(String userId, String ifMatch) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserUsingDELETE");
     }
     
    // create path and map variables
    String path = "/Users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    
    GenericType<ScimUser> returnType = new GenericType<ScimUser>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * verifyUser
   * 
   * @param userId userId
   * @param ifMatch If-Match
   * @return ScimUser
   */
  public ScimUser verifyUserUsingGET2(String userId, String ifMatch) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling verifyUserUsingGET2");
     }
     
    // create path and map variables
    String path = "/Users/{userId}/verify".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    
    GenericType<ScimUser> returnType = new GenericType<ScimUser>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getUserVerificationLink
   * 
   * @param userId userId
   * @param redirectUri redirect_uri
   * @param clientId client_id
   * @return VerificationResponse
   */
  public VerificationResponse getUserVerificationLinkUsingGET(String userId, String redirectUri, String clientId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserVerificationLinkUsingGET");
     }
     
     // verify the required parameter 'redirectUri' is set
     if (redirectUri == null) {
        throw new ApiException(400, "Missing the required parameter 'redirectUri' when calling getUserVerificationLinkUsingGET");
     }
     
    // create path and map variables
    String path = "/Users/{userId}/verify-link{?client_id,redirect_uri}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<VerificationResponse> returnType = new GenericType<VerificationResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * findUsers
   * 
   * @param attributes attributes
   * @param filter filter
   * @param sortBy sortBy
   * @param sortOrder sortOrder
   * @param startIndex startIndex
   * @param count count
   * @return SearchResultsobject
   */
  public SearchResultsobject findUsersUsingGET1(String attributes, String filter, String sortBy, String sortOrder, Integer startIndex, Integer count) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Users{?attributes,filter,sortBy,sortOrder,startIndex,count}".replaceAll("\\{format\\}","json");

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
