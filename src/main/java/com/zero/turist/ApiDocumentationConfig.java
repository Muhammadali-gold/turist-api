package com.zero.turist;

import io.swagger.annotations.*;

@SwaggerDefinition(
        info = @Info(
                description = "Awesome Resources",
                version = "V0.0.0.0",
                title = "Awesome Resource API",
                contact = @Contact(
                        name = "Zero",
                        email = "zero@zero.com",
                        url = "http://www.zero.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        basePath = "/api/**",
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://zero.com")
)
public interface ApiDocumentationConfig {
}

