package com.ing.demospringboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Dish {
    private Ingredient ingredient;

    @Autowired
    public Dish(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @PostConstruct
    public void printDish() {
        System.out.println("Dish with " + ingredient.getName());
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
