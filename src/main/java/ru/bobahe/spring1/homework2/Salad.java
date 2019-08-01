package ru.bobahe.spring1.homework2;

import org.springframework.stereotype.Component;
import ru.bobahe.spring1.homework2.api.IFood;

@Component
public class Salad implements IFood {

    public String getName() {
        return "salad";
    }

}
