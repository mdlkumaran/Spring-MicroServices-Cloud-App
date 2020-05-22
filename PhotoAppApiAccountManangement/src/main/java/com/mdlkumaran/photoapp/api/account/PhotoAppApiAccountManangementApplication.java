package com.mdlkumaran.photoapp.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppApiAccountManangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiAccountManangementApplication.class, args);
	}

}
