package ru.bobahe.spring1.homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext("ru.bobahe.spring1.homework1");

        final Rifle rifle = context.getBean(Rifle.class);
        final Rifle rifle2 = context.getBean(Rifle.class);

        // Ружье выстрелит
        rifle.fire();
        // Ружье не выстрелит, так как оно синглтон
        rifle2.fire();

        // Перезарядка первого ружья. Ружье будет заряжено новым патроном, так как Bullet имеет scope prototype.
        rifle.reload(context.getBean(Bullet.class));

        // Ружье выстрелит, так как выстрел еще не производился
        rifle2.fire();
    }

}
