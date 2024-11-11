package com.practice.controller;

import com.netflix.discovery.EurekaClient;
import com.practice.external.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {
    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private ServiceA serviceA;

    @GetMapping("helloEureka")
    public String helloWorld() {
        String serviceAResponse = serviceA.helloWorld();
        return serviceAResponse;
    }
}