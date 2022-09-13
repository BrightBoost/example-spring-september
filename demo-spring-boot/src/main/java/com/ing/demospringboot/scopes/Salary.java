package com.ing.demospringboot.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Salary {
    private Double nr;

    public Salary() {
        this.nr = Math.random() * 1000;
    }

    public Double getNr() {
        return nr;
    }
}
