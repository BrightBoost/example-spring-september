package com.ing.demospringboot.profiles.config;

import com.ing.demospringboot.profiles.Ingredient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("chicken")
public class ChickenConfig {

    @Bean
    public Ingredient ingredientBean() {
        Ingredient ingredient = new Ingredient();
        ingredient.setName("chicken");
        return ingredient;
    }
}
