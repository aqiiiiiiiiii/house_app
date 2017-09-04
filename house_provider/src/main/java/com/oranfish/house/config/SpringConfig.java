package com.oranfish.house.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:config/spring-*.xml" })
public class SpringConfig {
}
