package ru.bobahe.spring1.homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext("ru.bobahe.spring1");
    }

}