package com.skills4it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IHelloService service = context.getBean("helloService", IHelloService.class);
        service.sayHello();

    }
}