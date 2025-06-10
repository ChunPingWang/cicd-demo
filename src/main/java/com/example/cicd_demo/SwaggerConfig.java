package com.example.cicd_demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("CI/CD Demo API")
                        .version("1.0.0")
                        .description("一个简单的 Spring Boot WebFlux API 演示项目")
                        .contact(new Contact()
                                .name("Demo Team")
                                .email("demo@example.com")));
    }
} 