package com.unicon.api.serviceapisunat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceApiSunatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApiSunatApplication.class, args);
	}

}
