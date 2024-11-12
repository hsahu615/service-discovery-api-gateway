package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea")
public class ServiceAController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello world from Service A!";
    }

}