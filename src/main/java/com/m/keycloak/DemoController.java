package com.m.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/demo")
public class DemoController {
    @GetMapping
    public String hello() {
        return "Hello from Spring boot & Keycloak";
    }

    @GetMapping("/helloAdmin")
    public String helloAdmin() {
        return "Hello from Spring boot & Keycloak - ADMIN";
    }
}
