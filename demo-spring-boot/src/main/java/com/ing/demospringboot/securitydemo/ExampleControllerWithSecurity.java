package com.ing.demospringboot.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleControllerWithSecurity {


    @GetMapping("secure-get")
    public void secureEndpoint() {
        System.out.println("very secure");
    }
}
