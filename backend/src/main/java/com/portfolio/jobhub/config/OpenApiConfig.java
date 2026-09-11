package com.portfolio.jobhub.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration public class OpenApiConfig {
 @Bean OpenAPI jobHubOpenAPI(){ return new OpenAPI().info(new Info().title("JobHub API").version("1.0").description("REST API for job discovery, employer workflows and applications.")); }
}
