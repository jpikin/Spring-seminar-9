package com.example.microService_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class Controller {
    @GetMapping
    public String hello(){
        return "Hello from Service 1";
    }
}
