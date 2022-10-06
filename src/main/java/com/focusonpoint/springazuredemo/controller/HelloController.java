package com.focusonpoint.springazuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Congratulation SpringBoot Application is deployed to Azure!!!";
    }
}
