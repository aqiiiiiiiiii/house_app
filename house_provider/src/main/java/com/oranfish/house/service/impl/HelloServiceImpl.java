package com.oranfish.house.service.impl;

import com.oranfish.house.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello() {
        return "hello dubbo";
    }
}
