package com.example.building.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String first(){
        return "This site is under maintenance";
    }

    @GetMapping("/mayuri")
    public String helloMayuri(){
        return "<b>hello Mayuri..!! You're stupid</b>";
    }
}
