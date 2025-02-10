package com.nhut.ecommerce.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AuthenticationController {

    @GetMapping("/hello")
    public String helloWorld() {
        log.info("Authentication service is working !!!");

        return "Authentication service is working !!!";
    }

}
