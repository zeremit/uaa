package org.cloudfoundry.identity.uaa.login;

import org.apache.commons.ssl.Base64;
import org.cloudfoundry.identity.uaa.authentication.Origin;
import org.cloudfoundry.identity.uaa.authentication.UaaAuthentication;
import org.cloudfoundry.identity.uaa.authentication.UaaPrincipal;
import org.cloudfoundry.identity.uaa.authentication.event.UserAuthenticationSuccessEvent;
import org.cloudfoundry.identity.uaa.scim.ScimUser;
import org.cloudfoundry.identity.uaa.scim.ScimUserProvisioning;
import org.cloudfoundry.identity.uaa.scim.exception.ScimResourceAlreadyExistsException;
import org.cloudfoundry.identity.uaa.user.UaaAuthority;
import org.cloudfoundry.identity.uaa.user.UaaUser;
import org.cloudfoundry.identity.uaa.user.UaaUserDatabase;
import org.cloudfoundry.identity.uaa.zone.IdentityZoneHolder;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


/*******************************************************************************
 * Cloud Foundry
 * Copyright (c) [2009-2015] Pivotal Software, Inc. All Rights Reserved.
 * <p/>
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 * <p/>
 * This product includes a number of subcomponents with
 * separate copyright notices and license terms. Your use of these
 * subcomponents is subject to the terms and conditions of the
 * subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
@Controller
public class SignInController {

    @Autowired
    private ScimUserProvisioning scimUserProvisioning;

    private UaaUserDatabase userDatabase;

    @RequestMapping("/signin/facebook")
    public String signin() {
        return "redirect:" + "https://www.facebook.com/dialog/oauth?client_id=394667127406182&redirect_uri=http://localhost:8080/uaa/oauth/facebook&scope=email";
    }

    @RequestMapping("/oauth/facebook")
    public String callback(@RequestParam String code) throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> exchange = restTemplate.exchange("https://graph.facebook.com/v2.4/oauth/access_token?client_id=394667127406182&redirect_uri=http://localhost:8080/uaa/oauth/facebook&client_secret=7822e0c5f4fba3a6dc96602e26c09890&code=" + code,
                HttpMethod.GET, null, String.class);
        String json = exchange.getBody();
        JSONObject jsonObject = new JSONObject(json);
        String accessToken = jsonObject.getString("access_token");

        String meObj = restTemplate.getForObject("https://graph.facebook.com/me?fields=email,name&access_token=" + accessToken, String.class);
        JSONObject jsonMe = new JSONObject(meObj);


        ScimUser user = new ScimUser(null, jsonMe.getString("email"), jsonMe.getString("name"), jsonMe.getString("name"));
        String scimUserId;
        user.setPrimaryEmail(jsonMe.getString("email"));
        user.setOrigin("facebook");
        try {
            ScimUser scimUser = scimUserProvisioning.createUser(user, "");
            scimUserId = scimUser.getId();
        } catch (ScimResourceAlreadyExistsException e) {
            scimUserId = e.getExtraInfo().get("user_id").toString();
        }

        UaaUser uaaUser = userDatabase.retrieveUserByName(user.getUserName(), user.getOrigin());
        UaaPrincipal result = new UaaPrincipal(uaaUser);
        Authentication authentication = new UaaAuthentication(result, uaaUser.getAuthorities(), null);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return "home";
    }

    public void setUserDatabase(UaaUserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }
}
