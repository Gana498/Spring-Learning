package com.learning.beanfactory_demo.beans;

public class GreetingService {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void sayHello(){
        System.out.println("Hello, " + message + ".");
    }
}
