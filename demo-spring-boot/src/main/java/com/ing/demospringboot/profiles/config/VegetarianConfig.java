package com.ing.demospringboot.profiles.config;

import com.ing.demospringboot.profiles.Ingredient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("veggie")
public class VegetarianConfig {
    @Bean // name is ingredientBean
    public Ingredient ingredientBean() {
        Ingredient ingredient = new Ingredient();
        ingredient.setName("beans");
        return ingredient;
    }
}
