package com.practice.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SERVICE-A")
public interface ServiceA {

    @GetMapping("/servicea/helloWorld")
    String helloWorld();
}
