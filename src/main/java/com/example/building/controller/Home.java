package com.example.building.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/hello")
    public String first(){
        return "hello Tushar";
    }

    @GetMapping("/mangesh")
    public String helloMangesh(){
        return "<b>hello Mangesh..!! this is my first deployment of spring boot application using CICD pipeline.." +
                "And this awesome!!</b>";
    }
}
