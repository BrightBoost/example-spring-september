package com.ing.demospringboot.aopdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleEndpointsController {

    @LogStuff
    @GetMapping("test-aop")
    public void testAOP() {
        System.out.println("in the method");
    }
}
