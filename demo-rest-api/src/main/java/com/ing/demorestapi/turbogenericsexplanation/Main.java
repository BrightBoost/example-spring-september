package com.ing.demorestapi.turbogenericsexplanation;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.setContent(laptop);

        Chihuahua chihuahua = new Chihuahua();
        // content that is not of type Laptop cannot be added
        // laptopBag.setContent(chihuahua);
    }
}
