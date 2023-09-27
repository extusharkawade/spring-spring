package com.example.building.controller;

import com.example.building.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Home {
    @Autowired
    HomeService service;

    @GetMapping("/")
    public String first(){
        return service.getMaintenanceWarning();
    }

}
