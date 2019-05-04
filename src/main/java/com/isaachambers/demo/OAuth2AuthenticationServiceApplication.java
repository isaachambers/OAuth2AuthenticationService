package com.isaachambers.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
public class OAuth2AuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2AuthenticationServiceApplication.class, args);
	}

}
