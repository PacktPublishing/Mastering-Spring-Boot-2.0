/**
 * 
 */
package com.dineshonjava.accountservice.config;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@EnableSwagger2	
public class SwaggerConfig {

	@Bean
	public Docket api() { 
		
		return new Docket(DocumentationType.SWAGGER_2)          
			      .select()                                       
			      .apis(RequestHandlerSelectors.basePackage("com.dineshonjava.accountservice.controller"))
			      .paths(PathSelectors.ant("/customer/*"))                     
			      .build()
			      .apiInfo(apiInfo())
			      .useDefaultResponseMessages(false)                                   
				  .globalResponseMessage(RequestMethod.GET,                     
					newArrayList(
						
						new ResponseMessageBuilder()   
					    .code(500)
						.message("500 : Internal Server Error into customer microservice")
						.responseModel(new ModelRef("Error"))
						.build(),
						
						new ResponseMessageBuilder() 
							.code(403)
							.message("API Request Forbidden!")
							.build(),
						
						new ResponseMessageBuilder() 
							.code(404)
							.message("Request API Not Found!")
							.build()
							
							));
	}
	
	private ApiInfo apiInfo() {
	     return new ApiInfo(
	       "Customer Microservice REST API", 
	       "These are customer service APIs.", 
	       "API 2.0", 
	       "https://www.dineshonjava.com/Termsofservice", 
	       new Contact("Dinesh Rajput", "https://www.dineshonjava.com", "admin@dineshonjava.com"), 
	       "License of API", "https://www.dineshonjava.com/license", Collections.emptyList());
	}
}
