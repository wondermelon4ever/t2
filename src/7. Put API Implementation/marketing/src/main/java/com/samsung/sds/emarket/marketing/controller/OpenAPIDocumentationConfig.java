package com.samsung.sds.emarket.marketing.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class OpenAPIDocumentationConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Emarket - Marketing HTTP API")
				.description("The Marketing Service HTTP API")
				.license("")
				.licenseUrl("http://unlicense.org")
				.termsOfServiceUrl("")
				.version("v1")
				.contact(new Contact("","", ""))
				.build();
	}


	@Bean
	public Docket api() { 
		return new Docket(DocumentationType.SWAGGER_2)  
				.useDefaultResponseMessages(false)
				.select()  
				.apis(RequestHandlerSelectors.basePackage("com.samsung.sds.emarket.marketing.controller"))
				.paths(PathSelectors.ant("/api/v1/**"))                                    
				.build()
				.apiInfo(apiInfo());
	}

}