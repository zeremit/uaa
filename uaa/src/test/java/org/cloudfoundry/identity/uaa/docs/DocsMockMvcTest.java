package org.cloudfoundry.identity.uaa.docs;

import org.cloudfoundry.identity.uaa.audit.AuditEventType;
import org.cloudfoundry.identity.uaa.mock.InjectedMockContextTest;
import org.cloudfoundry.identity.uaa.test.TestClient;
import org.cloudfoundry.identity.uaa.util.JsonUtils;
import org.cloudfoundry.identity.uaa.zone.IdentityZone;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentation;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.restdocs.snippet.Snippet;
import org.springframework.security.oauth2.common.util.RandomValueStringGenerator;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*******************************************************************************
 * Cloud Foundry
 * Copyright (c) [2009-2015] Pivotal Software, Inc. All Rights Reserved.
 * <p>
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 * <p>
 * This product includes a number of subcomponents with
 * separate copyright notices and license terms. Your use of these
 * subcomponents is subject to the terms and conditions of the
 * subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/

public class DocsMockMvcTest extends InjectedMockContextTest {

    @Rule
    public final RestDocumentation restDocumentation = new RestDocumentation("build/generated-snippets");

    private MockMvc mockMvc;

//    @Override
//    public void configure(ConfigurableMockMvcBuilder mockMvcBuilder) {
//        mockMvcBuilder.apply(documentationConfiguration(this.restDocumentation))
//                .alwaysDo(document("{method-name}/{step}/",preprocessRequest(prettyPrint()),preprocessResponse(prettyPrint())));
//    }
//
    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(getWebApplicationContext())
                .apply(documentationConfiguration(this.restDocumentation))
                .build();
    }

    @Test
    public void testCreateZone() throws Exception {
        // given a client and a client token
        TestClient testClient = new TestClient(getMockMvc());
        String identityClientToken = testClient.getClientCredentialsOAuthAccessToken(
                "identity",
                "identitysecret",
                "zones.read,zones.write,scim.zones");

        // and given an identity zone prototype
        RandomValueStringGenerator generator = new RandomValueStringGenerator();
        String id = generator.generate();

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("id", id);
        requestBody.put("subdomain", "twiglet");
        requestBody.put("name", "The Twiglet Zone");
        requestBody.put("description", "Like the Twilight Zone but tastier.");

        // when the /identity-zones endpoint is invoked
        Snippet requestSnippet = requestFields(
                fieldWithPath("id").description("zone id")
                        .type(JsonFieldType.STRING),
                fieldWithPath("subdomain").description("zone subdomain")
                        .type(JsonFieldType.STRING),
                fieldWithPath("description").description("A plain test description of the new zone")
                        .type(JsonFieldType.STRING)
                        .optional(),
                fieldWithPath("config").description("The zone's configuration properties")
                        .type(JsonFieldType.OBJECT)
                        .optional(),
                fieldWithPath("config.tokenPolicy").description("The zone's token policy configuration")
                        .type(JsonFieldType.OBJECT)
                        .optional(),
                fieldWithPath("config.tokenPolicy.accessTokenValidity").description("The duration of access tokens issued by this zone")
                        .type(JsonFieldType.NUMBER)
                        .optional(),
                fieldWithPath("config.tokenPolicy.refreshTokenValidity").description("The duration of refresh tokens issued by this zone")
                        .type(JsonFieldType.NUMBER)
                        .optional(),
                fieldWithPath("name").description("zone name")
                        .type(JsonFieldType.STRING));

        Snippet responseSnippet = responseFields(
                fieldWithPath("id").description("zone id")
                        .type(JsonFieldType.STRING),
                fieldWithPath("subdomain").description("zone subdomain")
                        .type(JsonFieldType.STRING)
                        .optional(),
                fieldWithPath("description").description("A plain test description of the new zone")
                        .type(JsonFieldType.STRING)
                        .optional(),
                fieldWithPath("config").description("The zone's configuration properties")
                        .type(JsonFieldType.OBJECT)
                        .optional(),
                fieldWithPath("config.tokenPolicy").description("The zone's token policy configuration")
                        .type(JsonFieldType.OBJECT)
                        .optional(),
                fieldWithPath("config.tokenPolicy.refreshTokenValidity").description("The duration of refresh tokens issued by this zone")
                        .type(JsonFieldType.NUMBER)
                        .optional(),
                fieldWithPath("config.tokenPolicy.accessTokenValidity").description("The duration of access tokens issued by this zone")
                        .type(JsonFieldType.NUMBER)
                        .optional(),
                fieldWithPath("config.tokenPolicy.refreshTokenValidity").description("The duration of refresh tokens issued by this zone")
                        .type(JsonFieldType.NUMBER)
                        .optional(),
                fieldWithPath("name").description("zone name")
                        .type(JsonFieldType.STRING),
                fieldWithPath("version").description("Number of times zone has been modified")
                        .type(JsonFieldType.NUMBER),
                fieldWithPath("created").description("When the zone was created.  Represented as ticks since the epoch.")
                        .type(JsonFieldType.NUMBER),
                fieldWithPath("last_modified").description("When the zone was last modified.  Represented as ticks since the epoch.")
                        .type(JsonFieldType.NUMBER));

        getMockMvc().perform(
            post("/identity-zones")
                .header("Authorization", "Bearer " + identityClientToken)
                .contentType(APPLICATION_JSON)
                .content(JsonUtils.writeValueAsString(requestBody))
                .accept(APPLICATION_JSON))

        // then the identity zone is created
            .andExpect(status().is2xxSuccessful())
            .andDo(document("createZone",
                    requestSnippet,
                    responseSnippet
                )
            );
        }




}
