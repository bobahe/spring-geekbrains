package ru.bobahe.spring1.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.bobahe.spring1.homework2.annotation.Bad;
import ru.bobahe.spring1.homework2.api.ICook;
import ru.bobahe.spring1.homework2.api.IFood;

@Bad
@Component
public class BadCook implements ICook {

    @Autowired
    private IFood salad;

    public String makeFood() {
        return "Приготовил " + salad.getName() + "... и все отравились :(";
    }

}
