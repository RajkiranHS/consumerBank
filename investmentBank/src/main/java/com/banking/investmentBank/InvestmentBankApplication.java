package com.banking.investmentBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InvestmentBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentBankApplication.class, args);
	}

}
