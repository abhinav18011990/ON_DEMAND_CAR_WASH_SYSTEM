package io.adminapplication.Admin_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

@SpringBootApplication
@EnableEurekaClient
public class AdminApplication {
	@Bean
	@LoadBalanced
    public RestTemplate getRestTemplate(){
    	return new RestTemplate();
	}
	public static void main(String[] args) {
    	SpringApplication.run(AdminApplication.class, args);
	}

}
