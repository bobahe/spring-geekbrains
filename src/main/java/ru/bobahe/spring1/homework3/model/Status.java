package ru.bobahe.spring1.homework3.model;

import java.io.Serializable;

public enum Status implements Serializable {

    PLANNED("Запланировано"),
    IN_PROCESS("Выполняется"),
    READY("Выполнено");

    public String getDisplayName() {
        return displayName;
    }

    private final String displayName;

    Status(final String displayName) {
        this.displayName = displayName;
    }

}
