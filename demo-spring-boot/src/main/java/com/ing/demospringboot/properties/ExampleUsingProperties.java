package com.ing.demospringboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
// @PropertySource("classpath:myvalues.properties") // we don't need this because we use default location
public class ExampleUsingProperties {

    @Value("${example}") // this happens after the constructor
    private String example;

    public ExampleUsingProperties() {
        System.out.println("in constructor ExampleUsingProperties:" + example);
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
