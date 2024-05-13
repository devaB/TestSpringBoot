package com.springboot.nonspringclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NonSpringClassManager {

    public final NonSpringClassWrapper nonSpringClassWrapper;

    @Autowired
    NonSpringClassManager(NonSpringClassWrapper nonSpringClassWrapper){
        this.nonSpringClassWrapper = nonSpringClassWrapper;
    }
}
