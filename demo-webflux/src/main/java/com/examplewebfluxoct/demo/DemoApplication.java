package com.examplewebfluxoct.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
		getMonoExample().subscribe(s -> System.out.println("done: " + Thread.currentThread().getId() + s),
				s -> System.out.println("problems occurred"),
				() -> System.out.println("it's done"));
		System.out.println("done!" + Thread.currentThread().getId());
	}

	public static Mono<String> getMonoExample() throws InterruptedException {
		Thread.sleep(1000);
		return Mono.fromFuture(getIt());
	}

	private static CompletableFuture<String> getIt(){
		return CompletableFuture.supplyAsync(() -> "aha");
	}
	public static String getValue() throws InterruptedException {
		Thread.sleep(1000);
		return "blablabla";
	}

}
