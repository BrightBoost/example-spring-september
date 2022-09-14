package com.ing.demorestapi.turbogenericsexplanation;

public class GroceriesBag {
    private Groceries content;

    public Groceries getContent() {
        return content;
    }

    public void setContent(Groceries content) {
        this.content = content;
    }

    public String unpack() {
        System.out.println("Unpacking...");
        return content.toString();
    }
}
