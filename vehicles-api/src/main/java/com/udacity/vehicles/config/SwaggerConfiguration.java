package com.udacity.vehicles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.*;
import springfox.documentation.service.ApiInfo;


import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Car BackEnd Vehicles API",
                "This API Lists the API for Project Car Bank END Project",
                "1.0",
                "www.ravikr42.wordpress.com/toc",
                new Contact("Ravi Kumar", "www.ravikr42.wordpress.com", "ravikr42@gmail.com"),
                "License of Vehicles API", "www.ravikr42.wordpress.com", Collections.emptyList());
    }
}
