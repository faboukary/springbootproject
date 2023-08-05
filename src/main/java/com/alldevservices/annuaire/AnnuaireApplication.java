package com.alldevservices.annuaire;

import springfox.documentation.service.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.spi.DocumentationType;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;


@SpringBootApplication
@EnableSwagger2
public class AnnuaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnuaireApplication.class, args);
	}

        @Bean
        public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2) 
        .select() 
        .apis( RequestHandlerSelectors.basePackage("com.alldevservices.annuaire")) 
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo()); 
        }

        private ApiInfo apiInfo() {
         return new ApiInfoBuilder().title("Library Spring Boot REST API Documentation")
         .description("REST APIs For Managing Person in an Annuaire of contacts")
          .contact(new Contact("All Dev Services", "https://alldevservices.com/", "fkoulibaly2016@gmail.com"))
         .version("1.0")
         .build();
        }


}
