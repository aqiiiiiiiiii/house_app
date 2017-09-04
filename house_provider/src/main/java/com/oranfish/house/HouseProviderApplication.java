package com.oranfish.house;

import com.oranfish.house.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class HouseProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseProviderApplication.class, args);
		while(true){}
	}
}
