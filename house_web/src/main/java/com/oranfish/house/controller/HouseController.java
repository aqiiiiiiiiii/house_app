package com.oranfish.house.controller;

import com.oranfish.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/house/count")
    public String getCount(){
        return houseService.count().toString();
    }
}
