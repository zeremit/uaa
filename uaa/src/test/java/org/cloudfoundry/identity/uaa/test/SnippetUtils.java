package org.cloudfoundry.identity.uaa.test;

import org.cloudfoundry.identity.uaa.util.JsonUtils;
import org.springframework.restdocs.payload.FieldDescriptor;
import org.springframework.restdocs.request.ParameterDescriptor;
import org.springframework.restdocs.snippet.Attributes;

import static org.springframework.restdocs.snippet.Attributes.key;
import static org.springframework.util.StringUtils.hasText;

public final class SnippetUtils {
    private SnippetUtils() {}

    public static ConstrainableParameter parameterWithName(String name) {
        return new ConstrainableParameter(name);
    }

    public static ConstrainableField fieldWithPath(String name) {
        return new ConstrainableField(name);
    }

    public static class ConstrainableParameter extends ParameterDescriptor {
        private ConstrainableParameter(String name) {
            super(name);
        }

        public ParameterDescriptor required() {
            return attributes(key("constraints").value("Required"));
        }

        public ParameterDescriptor optional(String defaultValue) {
            Attributes.Attribute[] attrs = new Attributes.Attribute[] {key("constraints").value(hasText(defaultValue) ? "Optional (defaults to `" + defaultValue + "`)" : "Optional")};
            return attributes(attrs);
        }
    }


    public static class ConstrainableField extends FieldDescriptor {
        private ConstrainableField(String name) {
            super(name);
        }

        public FieldDescriptor required() {
            return attributes(key("constraints").value("Required"));
        }

        public FieldDescriptor optional(Object defaultValue) {
            String defaultValueText;
            if(defaultValue == null) {
                defaultValueText = "";
            } else {
                defaultValueText = JsonUtils.writeValueAsString(defaultValue);
            }

            Attributes.Attribute[] attrs = new Attributes.Attribute[] {key("constraints").value(hasText(defaultValueText) ? "Optional (defaults to `" + defaultValueText + "`)" : "Optional")};
            return attributes(attrs);
        }
    }

}
