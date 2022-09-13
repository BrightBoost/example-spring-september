package com.ing.demospringboot.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
    private String stringBean;

    @Autowired
    public ExampleBean(String stringBean) {
        this.stringBean = stringBean;
    }


    public String getStringBean() {
        return stringBean;
    }

    public void setStringBean(String stringBean) {
        this.stringBean = stringBean;
    }
}
