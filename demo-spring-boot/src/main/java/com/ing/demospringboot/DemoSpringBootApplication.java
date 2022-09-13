package com.ing.demospringboot;

import com.ing.demospringboot.profiles.Dish;
import com.ing.demospringboot.properties.ExampleUsingProperties;
import com.ing.demospringboot.sub2.ExampleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoSpringBootApplication.class, args);
		for(String s : ac.getBeanDefinitionNames()) {
			System.out.println("Bean: " + s);
		}

		for(String s : ac.getBeanNamesForType(String.class)) {
			System.out.println("String bean:" + s);
		}

		System.out.println(ac.getBean(ExampleBean.class).getStringBean());
		System.out.println("is this null too?" + ac.getBean(Dish.class).getIngredient().getName());


	}

	@Bean
	public String stringBean() {
		return "Hi all!";
	}

	@Bean
	public String stringBean2() {
		return "Hi all from String Bean 2!";
	}
}
