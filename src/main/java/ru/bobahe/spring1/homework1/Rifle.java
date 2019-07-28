package ru.bobahe.spring1.homework1;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Rifle {

    private Bullet bullet;

    @Autowired
    public void setBullet(@NotNull final Bullet bullet) {
        this.bullet = bullet;
    }

    public void fire() {
        if (bullet == null) {
            System.out.println("The rifle is empty");
            return;
        }
        System.out.println("BOOM!");
        bullet = null;
    }

}
