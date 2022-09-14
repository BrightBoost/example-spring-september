package com.ing.demorestapi.turbogenericsexplanation;

public class LaptopBag {
    private Laptop content;

    public Laptop getContent() {
        return content;
    }

    public void setContent(Laptop content) {
        this.content = content;
    }

    public String unpack() {
        System.out.println("Unpacking...");
        return content.toString();
    }

}
