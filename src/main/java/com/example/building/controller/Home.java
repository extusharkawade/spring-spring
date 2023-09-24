package com.example.building.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/hello")
    public String first(){
        return "hello Tushar";
    }
}
