package com.oranfish.house.controller;

import com.oranfish.house.service.DbgirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbgirlController {

    @Autowired
    private DbgirlService dbGirlService;

    @GetMapping("/girl/count")
    public String getCount(){
        return dbGirlService.count().toString();
    }
}
