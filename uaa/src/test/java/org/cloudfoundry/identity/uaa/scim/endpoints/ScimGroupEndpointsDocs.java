/*******************************************************************************
 *     Cloud Foundry
 *     Copyright (c) [2009-2016] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
package org.cloudfoundry.identity.uaa.scim.endpoints;

import org.cloudfoundry.identity.uaa.mock.InjectedMockContextTest;
import org.cloudfoundry.identity.uaa.mock.util.MockMvcUtils;
import org.cloudfoundry.identity.uaa.scim.ScimGroup;
import org.cloudfoundry.identity.uaa.scim.ScimGroupMember;
import org.cloudfoundry.identity.uaa.scim.ScimUser;
import org.cloudfoundry.identity.uaa.util.JsonUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.restdocs.snippet.Snippet;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.Collections;

import static org.cloudfoundry.identity.uaa.scim.ScimGroupMember.Type.USER;
import static org.cloudfoundry.identity.uaa.test.SnippetUtils.fieldWithPath;
import static org.cloudfoundry.identity.uaa.test.SnippetUtils.parameterWithName;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.restdocs.headers.HeaderDocumentation.headerWithName;
import static org.springframework.restdocs.headers.HeaderDocumentation.requestHeaders;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.delete;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.put;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.JsonFieldType.ARRAY;
import static org.springframework.restdocs.payload.JsonFieldType.NUMBER;
import static org.springframework.restdocs.payload.JsonFieldType.STRING;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.restdocs.snippet.Attributes.key;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
public class ScimGroupEndpointsDocs extends InjectedMockContextTest {

    private String scimReadToken;
    private String scimWriteToken;

    @Before
    public void setUp() throws Exception {
        scimReadToken = MockMvcUtils.utils().getClientCredentialsOAuthAccessToken(getMockMvc(), "admin", "adminsecret",
                "scim.read", null, true);

        scimWriteToken = MockMvcUtils.utils().getClientCredentialsOAuthAccessToken(getMockMvc(), "admin", "adminsecret",
                "scim.write", null, true);
    }

    @Test
    public void createScimGroup() throws Exception {
        ScimGroup scimGroup = new ScimGroup();
        scimGroup.setDisplayName("Cool Group Name for Creation");
        scimGroup.setDescription("the cool group");

        ScimUser member = new ScimUser(null, "cool-user", "cool-name", "cool-familyName");
        member.setPrimaryEmail("cool@chill.com");
        member = MockMvcUtils.utils().createUser(getMockMvc(), scimWriteToken, member);
        scimGroup.setMembers(Collections.singletonList(new ScimGroupMember(member.getId())));

        Snippet requestFields = requestFields(
                fieldWithPath("displayName").required().description(""),
                fieldWithPath("description").optional(null).description(""),
                fieldWithPath("members").optional(null).description(""),
                fieldWithPath("members[].value").requiredIf("members").description(""),
                fieldWithPath("members[].type").optional(USER).description(""),
                fieldWithPath("members[].origin").optional("uaa").description(""),
                fieldWithPath("meta.version").optional(0).description(""),
                fieldWithPath("meta.created").ignored(),
                fieldWithPath("schemas").ignored()
        );

        Snippet responseFields = responseFields(
                fieldWithPath("id").description(""),
                fieldWithPath("displayName").description(""),
                fieldWithPath("description").optional(null).description(""),
                fieldWithPath("members").optional(null).type(ARRAY).description(""),
                fieldWithPath("zoneId").description(""),
                fieldWithPath("meta.version").description(""),
                fieldWithPath("meta.created").description(""),
                fieldWithPath("meta.lastModified").description(""),
                fieldWithPath("schemas").description("")
        );

        createScimGroupHelper(scimGroup)
                .andDo(document("{ClassName}/{methodName}",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        requestHeaders(
                                headerWithName("Authorization").description("")
                        ),
                        requestFields,
                        responseFields));
    }

    @Test
    public void retrieveScimGroup() throws Exception {
        ScimGroup scimGroup = new ScimGroup();
        scimGroup.setDisplayName("Cool Group Name for Retrieval");

        scimGroup = JsonUtils.readValue(createScimGroupHelper(scimGroup).andReturn().getResponse().getContentAsString(), ScimGroup.class);

        Snippet responseFields = responseFields(
                fieldWithPath("id").description(""),
                fieldWithPath("displayName").description(""),
                fieldWithPath("description").type(STRING).description("").optional(),
                fieldWithPath("members").type(ARRAY).description("").optional(),
                fieldWithPath("members[].value").type(STRING).description("").optional(),
                fieldWithPath("members[].type").type(STRING).description("").optional(),
                fieldWithPath("members[].origin").type(STRING).description("").optional(),
                fieldWithPath("zoneId").description(""),
                fieldWithPath("meta.version").description(""),
                fieldWithPath("meta.created").description(""),
                fieldWithPath("meta.lastModified").description(""),
                fieldWithPath("schemas").description("")
        );

        MockHttpServletRequestBuilder get = get("/Groups/{groupId}", scimGroup.getId())
                .header("Authorization", "Bearer " + scimReadToken);

        getMockMvc().perform(get).andExpect(status().isOk())
                .andDo(document("{ClassName}/{methodName}",
                        preprocessResponse(prettyPrint()),
                        pathParameters(
                                parameterWithName("groupId").description("")
                        ),
                        requestHeaders(
                                headerWithName("Authorization").description("")
                        ),
                        responseFields));
    }

    @Test
    public void updateScimGroup() throws Exception {
        ScimGroup scimGroup = new ScimGroup();
        scimGroup.setDisplayName("Cool Group Name for Update");

        scimGroup = JsonUtils.readValue(createScimGroupHelper(scimGroup).andReturn().getResponse().getContentAsString(), ScimGroup.class);

        Snippet requestFields = requestFields(
                fieldWithPath("displayName").required().description(""),
                fieldWithPath("description").optional(null).type(STRING).description(""),
                fieldWithPath("members").optional(null).type(ARRAY).description(""),
                fieldWithPath("members[].value").requiredIf("members").type(STRING).description(""),
                fieldWithPath("members[].type").optional(USER).type(STRING).description(""),
                fieldWithPath("members[].origin").optional("uaa").type(STRING).description(""),
                fieldWithPath("meta.version").ignored(),
                fieldWithPath("id").ignored(),
                fieldWithPath("zoneId").ignored(),
                fieldWithPath("meta.created").ignored(),
                fieldWithPath("meta.lastModified").ignored(),
                fieldWithPath("schemas").ignored()
        );

        Snippet responseFields = responseFields(
                fieldWithPath("id").description(""),
                fieldWithPath("displayName").description(""),
                fieldWithPath("zoneId").description(""),
                fieldWithPath("meta.version").description(""),
                fieldWithPath("meta.created").description(""),
                fieldWithPath("meta.lastModified").description(""),
                fieldWithPath("schemas").description("")
        );

        scimGroup.setDisplayName("Cooler Group Name for Update");
        MockHttpServletRequestBuilder put = put("/Groups/{groupId}", scimGroup.getId())
                .header("Authorization", "Bearer " + scimWriteToken)
                .header("If-Match", scimGroup.getVersion())
                .contentType(APPLICATION_JSON)
                .content(JsonUtils.writeValueAsString(scimGroup));

        getMockMvc().perform(put).andExpect(status().isOk())
                .andDo(document("{ClassName}/{methodName}",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        pathParameters(
                                parameterWithName("groupId").description("")
                        ),
                        requestHeaders(
                                headerWithName("Authorization").description(""),
                                headerWithName("If-Match").description("")
                        ),
                        requestFields,
                        responseFields));
    }

    @Test
    public void deleteScimGroup() throws Exception {
        ScimGroup scimGroup = new ScimGroup();
        scimGroup.setDisplayName("Cool Group Name for Delete");

        scimGroup = JsonUtils.readValue(createScimGroupHelper(scimGroup).andReturn().getResponse().getContentAsString(), ScimGroup.class);

        Snippet responseFields = responseFields(
                fieldWithPath("id").description(""),
                fieldWithPath("displayName").description(""),
                fieldWithPath("zoneId").description(""),
                fieldWithPath("meta.version").description(""),
                fieldWithPath("meta.created").description(""),
                fieldWithPath("meta.lastModified").description(""),
                fieldWithPath("schemas").description("")
        );

        MockHttpServletRequestBuilder delete = delete("/Groups/{groupId}", scimGroup.getId())
                .header("Authorization", "Bearer " + scimWriteToken);

        getMockMvc().perform(delete).andExpect(status().isOk())
                .andDo(document("{ClassName}/{methodName}",
                        preprocessResponse(prettyPrint()),
                        pathParameters(
                                parameterWithName("groupId").description("")
                        ),
                        requestHeaders(
                                headerWithName("Authorization").description(""),
                                headerWithName("If-Match").description("").optional()
                        ),
                        responseFields));
    }

    @Test
    public void listScimGroups() throws Exception {
        ScimGroup scimGroup = new ScimGroup();
        scimGroup.setDisplayName("Cool Group Name for Listing");

        scimGroup = JsonUtils.readValue(createScimGroupHelper(scimGroup).andReturn().getResponse().getContentAsString(), ScimGroup.class);

        Snippet responseFields = responseFields(
                fieldWithPath("resources[].id").description(""),
                fieldWithPath("resources[].displayName").description(""),
                fieldWithPath("resources[].zoneId").description(""),
                fieldWithPath("resources[].meta.version").description(""),
                fieldWithPath("resources[].meta.created").description(""),
                fieldWithPath("resources[].meta.lastModified").description(""),
                fieldWithPath("resources[].schemas").description(""),
                fieldWithPath("resources[].description").type(STRING).description("").optional(),
                fieldWithPath("resources[].members").type(ARRAY).description("").optional(),
                fieldWithPath("itemsPerPage").description(""),
                fieldWithPath("startIndex").description(""),
                fieldWithPath("totalResults").description(""),
                fieldWithPath("schemas").description("")
        );

        Snippet requestParameters = requestParameters(
                parameterWithName("filter").optional("id pr").attributes(key("type").value(STRING)).description(""),
                parameterWithName("sortBy").optional("created").attributes(key("type").value(STRING)).description(""),
                parameterWithName("sortOrder").optional("ascending").attributes(key("type").value(NUMBER)).description(""),
                parameterWithName("startIndex").optional("1").attributes(key("type").value(NUMBER)).description(""),
                parameterWithName("count").optional(null).attributes(key("type").value(NUMBER)).description("")
        );

        MockHttpServletRequestBuilder get = get("/Groups")
                .header("Authorization", "Bearer " + scimReadToken)
                .param("filter", String.format("id eq \"%s\" or displayName eq \"%s\"", scimGroup.getId(), scimGroup.getDisplayName()))
                .param("sortBy", "lastModified")
                .param("count", "50")
                .param("sortOrder", "descending")
                .param("startIndex", "1");

        getMockMvc().perform(get).andExpect(status().isOk())
                .andDo(document("{ClassName}/{methodName}",
                        preprocessResponse(prettyPrint()),
                        requestParameters,
                        requestHeaders(
                                headerWithName("Authorization").description("")
                        ),
                        responseFields));
    }

    private ResultActions createScimGroupHelper(ScimGroup scimGroup) throws Exception {
        MockHttpServletRequestBuilder post = post("/Groups")
                .header("Authorization", "Bearer " + scimWriteToken)
                .contentType(APPLICATION_JSON)
                .content(JsonUtils.writeValueAsString(scimGroup));

        return getMockMvc().perform(post).andExpect(status().isCreated());
    }


}
