
package com.example.lab4;

public class MyBean {
    private String message;

    public MyBean() {
        System.out.println("MyBean constructor called.");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    public void init() {
        System.out.println("MyBean init method called.");
    }

    public void destroy() {
        System.out.println("MyBean destroy method called.");
    }
}
