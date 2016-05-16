package com.example;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class GreetingService {

    public String greet(String name) {
        return "Hello " + name + "!";
    }

}
