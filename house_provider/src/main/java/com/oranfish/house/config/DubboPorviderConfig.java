package com.oranfish.house.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:config/dubbo-*.xml" })
public class DubboPorviderConfig {
}
