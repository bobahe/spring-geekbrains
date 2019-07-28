package ru.bobahe.spring1.homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext("ru.bobahe.spring1.homework1");

        final Rifle rifle = context.getBean(Rifle.class);
        final Rifle rifle2 = context.getBean(Rifle.class);

        rifle.fire();
        rifle2.fire();
    }

}
