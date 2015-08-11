package org.cloudfoundry.identity.uaa.login;

import org.cloudfoundry.identity.uaa.authentication.UaaAuthentication;
import org.cloudfoundry.identity.uaa.authentication.UaaPrincipal;
import org.cloudfoundry.identity.uaa.scim.ScimUser;
import org.cloudfoundry.identity.uaa.scim.ScimUserProvisioning;
import org.cloudfoundry.identity.uaa.scim.exception.ScimResourceAlreadyExistsException;
import org.cloudfoundry.identity.uaa.user.UaaUser;
import org.cloudfoundry.identity.uaa.user.UaaUserDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class SignInController {

    @Autowired
    private ScimUserProvisioning scimUserProvisioning;

    private UaaUserDatabase userDatabase;

    @RequestMapping("/signin/facebook")
    public String signin() {
        return "redirect:" + "https://www.facebook.com/dialog/oauth?client_id=394667127406182&redirect_uri=http://localhost:8080/uaa/oauth/facebook&scope=email";
    }

    @RequestMapping("/signin/github")
    public String signinGithub() {
        return "redirect:" + "https://github.com/login/oauth/authorize?client_id=36c0942aa26e551b4209&redirect_uri=http://localhost:8080/uaa/oauth/github&scope=user:email";
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
        return "redirect:/home";
    }

    @RequestMapping("/oauth/github")
    public String callbackGithub(@RequestParam String code) throws JSONException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");

        HttpEntity entity = new HttpEntity(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> exchange = restTemplate.exchange("https://github.com/login/oauth/access_token?client_id=36c0942aa26e551b4209&redirect_uri=http://localhost:8080/uaa/oauth/github&client_secret=76a3716ddf22e13a459ebcafcf35b225970d65ef&code=" + code,
                HttpMethod.GET, entity, String.class);
        String json = exchange.getBody();
        JSONObject jsonObject = new JSONObject(json);
        String accessToken = jsonObject.getString("access_token");

        String meObj = restTemplate.getForObject("https://api.github.com/user/emails?access_token=" + accessToken, String.class);
        String email = ((JSONObject)new JSONArray(meObj).get(0)).getString("email");

        ScimUser user = new ScimUser(null, email, email, email);
        user.setPrimaryEmail(email);
        user.setOrigin("github");
        try {
            scimUserProvisioning.createUser(user, "");
        } catch (ScimResourceAlreadyExistsException e) {
        }

        UaaUser uaaUser = userDatabase.retrieveUserByName(user.getUserName(), user.getOrigin());
        UaaPrincipal result = new UaaPrincipal(uaaUser);
        Authentication authentication = new UaaAuthentication(result, uaaUser.getAuthorities(), null);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "redirect:/home";
    }

    public void setUserDatabase(UaaUserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }
}
