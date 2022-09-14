package com.ing.demorestapi.turbogenericsexplanation;

public class ChihuahuaBag {
    private Chihuahua content;

    public Chihuahua getContent() {
        return content;
    }

    public void setContent(Chihuahua content) {
        this.content = content;
    }

    public String unpack() {
        System.out.println("Unpacking...");
        return content.toString();
    }
}
