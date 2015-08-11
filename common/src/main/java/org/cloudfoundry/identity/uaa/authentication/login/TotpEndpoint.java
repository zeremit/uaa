/*
 * *****************************************************************************
 *      Cloud Foundry
 *      Copyright (c) [2009-2015] Pivotal Software, Inc. All Rights Reserved.
 *      This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *      You may not use this product except in compliance with the License.
 *
 *      This product includes a number of subcomponents with
 *      separate copyright notices and license terms. Your use of these
 *      subcomponents is subject to the terms and conditions of the
 *      subcomponent's license, as noted in the LICENSE file.
 * *****************************************************************************
 */

package org.cloudfoundry.identity.uaa.authentication.login;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorConfig;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;
import com.warrenstrange.googleauth.GoogleAuthenticatorQRGenerator;
import com.warrenstrange.googleauth.ICredentialRepository;
import org.cloudfoundry.identity.uaa.authentication.UaaAuthentication;
import org.cloudfoundry.identity.uaa.authentication.UaaPrincipal;
import org.cloudfoundry.identity.uaa.util.UaaStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;

@Controller
public class TotpEndpoint {

    private GoogleAuthenticatorConfig config = new GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder().build();
    private GoogleAuthenticator authenticator = new GoogleAuthenticator(config);


    private static final HashMap<String,String> codes = new HashMap<>();
    private static final HashMap<String,GoogleAuthenticatorKey> keys = new HashMap<>();

    public GoogleAuthenticatorKey createCredentials(String userName) {
        GoogleAuthenticatorKey key = keys.get(userName);
        if (key==null) {
            key = authenticator.createCredentials(userName);
            keys.put(userName, key);
        }
        return key;
    }

    @RequestMapping(value = { "/totp_qr_code.new" }, method = RequestMethod.GET)
    public String generateNewQrUrl(Model model, Principal principal) throws NoSuchAlgorithmException, IOException {
        UaaPrincipal uaaPrincipal = (principal instanceof UaaAuthentication) ? ((UaaAuthentication)principal).getPrincipal() : null;
        keys.remove(uaaPrincipal.getId());
        return generateQrUrl(model, principal);
    }

    @RequestMapping(value = { "/totp_qr_code" }, method = RequestMethod.GET)
    public String generateQrUrl(Model model, Principal principal) throws NoSuchAlgorithmException, IOException {
        UaaPrincipal uaaPrincipal = (principal instanceof UaaAuthentication) ? ((UaaAuthentication)principal).getPrincipal() : null;
        if (keys.get(uaaPrincipal.getId())==null) {
            String url = GoogleAuthenticatorQRGenerator.getOtpAuthURL("UAA", uaaPrincipal.getName(), createCredentials(uaaPrincipal.getId()));
            model.addAttribute("qrurl", url);
        }
        return "qr_code";
    }

    @RequestMapping(value = { "/totp_qr_code.do" }, method = RequestMethod.POST)
    public String validateCode(Model model,
                               Principal principal,
                               @RequestParam("code") String code)
        throws NoSuchAlgorithmException, IOException {
        UaaPrincipal uaaPrincipal = (principal instanceof UaaAuthentication) ? ((UaaAuthentication)principal).getPrincipal() : null;
        String error = null;
        if (!StringUtils.hasText(codes.get(uaaPrincipal.getId()))) {
            error = "Please rescan the QR code.";
            keys.remove(uaaPrincipal.getId());
        } else if (UaaStringUtils.isInteger(code)) {
            if ( authenticator.authorizeUser(uaaPrincipal.getId(),Integer.valueOf(code))) {
                return "home";
            } else {
                error = "Invalid code.";
            }
        } else {
            error = "Code must be numeric.";
        }
        model.addAttribute("error", error);
        return generateQrUrl(model, principal);
    }



    public static class InMemoryRepository implements ICredentialRepository {
        @Override
        public String getSecretKey(String userName) {
            return codes.get(userName);
        }

        @Override
        public void saveUserCredentials(String userName, String secretKey, int validationCode, List<Integer> scratchCodes) {
            codes.put(userName, secretKey);
        }
    }

}
