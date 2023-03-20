package com.AaTest.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/a")
    public String hello() {
        return "Hello World!";
    }
}

