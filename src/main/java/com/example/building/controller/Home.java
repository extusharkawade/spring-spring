package com.example.building.controller;

import com.example.building.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String first(){
        HomeService service =new HomeService();
        return service.getMaintenanceWarning();
    }
}
