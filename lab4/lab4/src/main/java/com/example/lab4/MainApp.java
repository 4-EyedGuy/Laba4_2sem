
package com.example.lab4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AnotherBean anotherBean = (AnotherBean) context.getBean("anotherBean");
        anotherBean.doSomething();

        context.close();
    }
}
