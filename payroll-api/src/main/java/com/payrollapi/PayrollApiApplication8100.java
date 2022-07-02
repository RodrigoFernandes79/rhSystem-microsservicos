package com.payrollapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class PayrollApiApplication8100 {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApiApplication8100.class, args);
	}

}
