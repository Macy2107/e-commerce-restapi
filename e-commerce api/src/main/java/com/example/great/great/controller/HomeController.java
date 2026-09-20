package com.example.great.great.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//  GET HTTP REQUEST
    @GetMapping("/home")
    public String welcome() {
        return "Hi, welcome to Spring boot ^^!";
    }
}
