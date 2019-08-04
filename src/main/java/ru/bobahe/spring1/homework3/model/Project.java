package ru.bobahe.spring1.homework3.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "sp_project")
public class Project extends AbstractEntity {

    private String name;

    private String description;

    private Date startDate;

    private Date endDate;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PLANNED;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    public Project(final String name) {
        this.name = name;
    }

    public Project() {
    }
}
