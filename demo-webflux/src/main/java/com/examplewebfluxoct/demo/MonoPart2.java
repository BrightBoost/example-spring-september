package com.examplewebfluxoct.demo;

import reactor.core.publisher.Mono;

public class MonoPart2 {
    public static void main(String[] args) {
      //  getMono().subscribe(s -> System.out.println("Thread " + Thread.currentThread().getId() + ": " + s));
        getEmptyMono().subscribe(s -> System.out.println("Thread " + Thread.currentThread().getId() + ": " + s));

    }

    public static Mono<String> getMono() {
        return Mono
                .just("Some string")
                .log();
    }

    public static Mono getEmptyMono() {
        return Mono.empty().log();
    }
}
