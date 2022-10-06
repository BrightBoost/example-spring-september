package com.examplewebfluxoct.demo;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;

public class FunWithFlux {
    public static void main(String[] args) throws InterruptedException{
        getFlux().log().subscribe(s -> System.out.println(Thread.currentThread().getId() + " : " +  s));
        getFluxInt().log().subscribe(s -> System.out.println(Thread.currentThread().getId() + " : " +  s));
        getFluxIncr().log().subscribe(s -> System.out.println(Thread.currentThread().getId() + " : " +  s));
        getFluxRangeMap().log().subscribe(s -> System.out.println(Thread.currentThread().getId() + " : " +  s));
        System.out.println("done");
        Thread.sleep(2000); //incr different thread
    }

    public static Flux<String> getFlux() {
        return Flux.fromIterable(Arrays.asList("1", "2", "3"));
    }



    public static Flux<Integer> getFluxInt() {
        return Flux.range(0, 10);
    }

    public static Flux<Long> getFluxIncr() {
        return Flux.interval(Duration.ofMillis(500));
    }

    public static Flux<Integer> getFluxRangeMap() {
        return Flux.range(0, 10).map(x->x*x);

    }

}
