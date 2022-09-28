package com.ing.demospringboot.securitydemo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleControllerWithMethodSecurity {
    public List<String> list = new ArrayList<>(Arrays.asList("nagaraja", "alex", "user", "admin", "megha"));

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

    @GetMapping("/getname")
    @PostFilter("hasRole(\"ADMIN\") or filterObject == authentication.name")
    public List<String> getName() {
        System.out.println(list);
        return list;
    }

    @GetMapping("/open")
    public String open() {
        return "hi open";
    }

    @PostAuthorize("hasRole(\"USER\")")
    @GetMapping("/postauth")
    public String userpost() {
        return "hi user";
    }

}
