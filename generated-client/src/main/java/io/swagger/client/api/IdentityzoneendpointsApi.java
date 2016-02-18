package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.IdentityZone;
//import io.swagger.client.model.Error;
import io.swagger.client.model.BaseClientDetails;
import io.swagger.client.model.ClientDetails;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-18T10:10:08.525-08:00")
public class IdentityzoneendpointsApi {
  private ApiClient apiClient;

  public IdentityzoneendpointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentityzoneendpointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * getIdentityZones
   * 
   * @return List<IdentityZone>
   */
  public List<IdentityZone> getIdentityZonesUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/identity-zones".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<IdentityZone>> returnType = new GenericType<List<IdentityZone>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * createIdentityZone
   * 
   * @param body body
   * @return IdentityZone
   */
  public IdentityZone createIdentityZoneUsingPOST1(IdentityZone body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createIdentityZoneUsingPOST1");
     }
     
    // create path and map variables
    String path = "/identity-zones".replaceAll("\\{format\\}","json");

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

    
    GenericType<IdentityZone> returnType = new GenericType<IdentityZone>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * createClient
   * 
   * @param identityZoneId identityZoneId
   * @param clientDetails clientDetails
   * @return ClientDetails
   */
  public ClientDetails createClientUsingPOST2(String identityZoneId, BaseClientDetails clientDetails) throws ApiException {
    Object postBody = clientDetails;
    
     // verify the required parameter 'identityZoneId' is set
     if (identityZoneId == null) {
        throw new ApiException(400, "Missing the required parameter 'identityZoneId' when calling createClientUsingPOST2");
     }
     
     // verify the required parameter 'clientDetails' is set
     if (clientDetails == null) {
        throw new ApiException(400, "Missing the required parameter 'clientDetails' when calling createClientUsingPOST2");
     }
     
    // create path and map variables
    String path = "/identity-zones/{identityZoneId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identityZoneId" + "\\}", apiClient.escapeString(identityZoneId.toString()));

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

    
    GenericType<ClientDetails> returnType = new GenericType<ClientDetails>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteClient
   * 
   * @param identityZoneId identityZoneId
   * @param clientId clientId
   * @return ClientDetails
   */
  public ClientDetails deleteClientUsingDELETE2(String identityZoneId, String clientId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identityZoneId' is set
     if (identityZoneId == null) {
        throw new ApiException(400, "Missing the required parameter 'identityZoneId' when calling deleteClientUsingDELETE2");
     }
     
     // verify the required parameter 'clientId' is set
     if (clientId == null) {
        throw new ApiException(400, "Missing the required parameter 'clientId' when calling deleteClientUsingDELETE2");
     }
     
    // create path and map variables
    String path = "/identity-zones/{identityZoneId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identityZoneId" + "\\}", apiClient.escapeString(identityZoneId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

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

    
    GenericType<ClientDetails> returnType = new GenericType<ClientDetails>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getIdentityZone
   * 
   * @param id id
   * @return IdentityZone
   */
  public IdentityZone getIdentityZoneUsingGET(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getIdentityZoneUsingGET");
     }
     
    // create path and map variables
    String path = "/identity-zones/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<IdentityZone> returnType = new GenericType<IdentityZone>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * updateIdentityZone
   * 
   * @param body body
   * @param id id
   * @return IdentityZone
   */
  public IdentityZone updateIdentityZoneUsingPUT(IdentityZone body, String id) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateIdentityZoneUsingPUT");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateIdentityZoneUsingPUT");
     }
     
    // create path and map variables
    String path = "/identity-zones/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<IdentityZone> returnType = new GenericType<IdentityZone>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteIdentityZone
   * 
   * @param id id
   * @return IdentityZone
   */
  public IdentityZone deleteIdentityZoneUsingDELETE(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteIdentityZoneUsingDELETE");
     }
     
    // create path and map variables
    String path = "/identity-zones/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<IdentityZone> returnType = new GenericType<IdentityZone>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
