
package com.example.lab4;

public class AnotherBean {
    private MyBean myBean;

    public AnotherBean(MyBean myBean) {
        this.myBean = myBean;
        System.out.println("AnotherBean constructor called.");
    }

    public void doSomething() {
        System.out.println("AnotherBean is doing something.");
        myBean.printMessage();
    }

    public void init() {
        System.out.println("AnotherBean init method called.");
    }

    public void destroy() {
        System.out.println("AnotherBean destroy method called.");
    }
}
