package com.ing.demorestapi.turbogenericsexplanation;

public class Bag<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String unpack() {
        System.out.println("Unpacking...");
        return content.toString();
    }
}
