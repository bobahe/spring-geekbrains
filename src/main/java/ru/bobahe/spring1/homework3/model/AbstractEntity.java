package ru.bobahe.spring1.homework3.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }
}
