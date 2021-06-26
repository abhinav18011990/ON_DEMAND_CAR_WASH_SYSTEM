package io.cloud.service.Discover_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.*;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverServerApplication.class, args);
	}

}
