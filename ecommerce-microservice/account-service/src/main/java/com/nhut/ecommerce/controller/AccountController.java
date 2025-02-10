package com.nhut.ecommerce.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountController {

    @GetMapping("/hello")
    public String helloWorld() {
        log.info("Account service is working !!!");

        return "Account service is working !!!";
    }

}
