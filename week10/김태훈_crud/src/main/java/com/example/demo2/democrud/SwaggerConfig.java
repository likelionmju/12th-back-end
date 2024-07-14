package com.example.demo2.democrud;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                .title("멋쟁이사자처럼 게시판 CRUD API")
                .version("v1.0.0")
                .description("멋쟁이사자처럼 게시판 CRUD 새션에서 만든 Post API입니다."));
    }

}
