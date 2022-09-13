package com.ing.demospringboot.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Liar {

//    @Autowired
//    private ApplicationContext applicationContext;

    @Autowired
    private Salary salary;

    public Salary getSalary() {
     //   Salary l = (Salary) applicationContext.getBean("salary");
        return salary;
    }
}
