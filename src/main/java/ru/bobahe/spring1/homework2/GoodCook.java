package ru.bobahe.spring1.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.bobahe.spring1.homework2.api.ICook;
import ru.bobahe.spring1.homework2.api.IFood;

@Qualifier("goodCook")
@Component
public class GoodCook implements ICook {

    @Autowired
    private IFood risotto;

    public String makeFood() {
        return "Приготовил " + risotto.getName() + " превосходно!";
    }

}
