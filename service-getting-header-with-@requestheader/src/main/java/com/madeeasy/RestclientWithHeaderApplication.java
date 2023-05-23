package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestclientWithHeaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestclientWithHeaderApplication.class, args);
	}

}
