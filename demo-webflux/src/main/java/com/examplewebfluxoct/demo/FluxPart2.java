package com.examplewebfluxoct.demo;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class FluxPart2 {
    public static void main(String[] args) throws InterruptedException {
       // getFlux().subscribe(s -> System.out.println(Thread.currentThread().getId() + ": " + s));
        getRangeFlux().subscribe(s -> System.out.println(Thread.currentThread().getId() + ": " + s));
       // getIntervalFlux().subscribe(s -> System.out.println(Thread.currentThread().getId() + ": " + s));
       // Thread.sleep(3000);
    }

    public static Flux<String> getFlux() {
        return Flux
                .fromIterable(Arrays.asList("a", "b", "c"))
                .log();
    }

    public static Flux<Integer> getRangeFlux() {
        return Flux
                .range(0,10)
                .map(x -> x * x)
                .log();
    }

    // async
    public static Flux<Long> getIntervalFlux() {
        return Flux.interval(Duration.ofMillis(500)).log();
    }

}
