package ru.bobahe.spring1.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.bobahe.spring1.homework2.annotation.Bad;
import ru.bobahe.spring1.homework2.api.ICook;

@Component
public class Kitchen {

    @Autowired
    @Qualifier("goodCook")
    private ICook cook1;

    @Autowired
    @Bad
    private ICook cook2;

    public void work() {
        System.out.println("Cook1 " + cook1.makeFood());
        System.out.println("Cook2 " + cook2.makeFood());
    }

}
