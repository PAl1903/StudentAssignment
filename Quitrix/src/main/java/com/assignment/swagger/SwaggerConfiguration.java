package com.assignment.swagger;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

import io.swagger.v3.oas.annotations.servers.Server;


@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "Student API",
    version = "1.0",
    contact = @Contact(
      name = "xyz", email = "info@xyz.com", url = "xyz.com"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    termsOfService = "${tos.uri}",
    description = "${api.description}"
  ),
  servers = @Server(
    url = "/",
    description = "This API is for storing and fetching the student data"
  )
)
public class SwaggerConfiguration {

}
