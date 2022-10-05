package com.examplewebfluxoct.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping("/test")
    public void testWebFlux() throws InterruptedException {
        getFluxExample().subscribe(s -> System.out.println("done: " + Thread.currentThread().getId() + s));
        System.out.println("done!");
    }

    public static Flux<String> getFluxExample() throws InterruptedException {
        Thread.sleep(1000);
        return Flux.just("list", "of", getValue());
    }
    public static String getValue() throws InterruptedException {
        Thread.sleep(500);
        return "blablabla";
    }
}
