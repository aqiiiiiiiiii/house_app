package com.oranfish.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HouseProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseProviderApplication.class, args);
		while(true){}
	}
}
