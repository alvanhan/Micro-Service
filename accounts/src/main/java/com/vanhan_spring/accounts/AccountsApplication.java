package com.vanhan_spring.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.vanhan_spring.accounts.controller") })
@EnableJpaRepositories("com.vanhan_spring.accounts.repository")
@EntityScan("com.vanhan_spring.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Bank Accounts microservice REST API Documentation",
				description = "Bank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "van han",
						email = "vanhanid@mail.com",
						url = "-"
				),
				license = @License(
						name = "Apache 2.0",
						url = "-"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Bank Accounts microservice REST API Documentation",
				url = "-"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
