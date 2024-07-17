package com.example.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("멋쟁이사자처럼 게시판 CRUD API")
                        .version("v1.0.0")
                        .description("멋쟁이사자처럼 게시판 CRUD 세션에서 만든 Post API 입니다."));
    }
}
