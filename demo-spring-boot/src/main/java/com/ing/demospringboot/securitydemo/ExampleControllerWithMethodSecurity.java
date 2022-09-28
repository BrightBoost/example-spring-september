package com.ing.demospringboot.securitydemo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleControllerWithMethodSecurity {

    @Secured("ROLE_USER")
    @GetMapping("/hi")
    public String hi() {
        return "Hi";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/hiadmin")
    public String hiAdmin() {
        return "Hi ad";
    }

}
