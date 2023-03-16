package com.banking.consumerBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerBankApplication.class, args);
	}

}
