package com.example.building.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class HomeTests {
    private Home home;
    @BeforeEach
    private void getObj(){
        home=new Home();
    }

    @Test
    void firstTest(){
       String result = home.first();
       assertEquals("This site is under maintenance",result);
    }

}
