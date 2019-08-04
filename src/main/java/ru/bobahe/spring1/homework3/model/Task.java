package ru.bobahe.spring1.homework3.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "sp_task")
public class Task extends AbstractEntity {

    private String name;

    private String description;

    public Task() {
    }

    private Date startDate;

    public Task(final String name, final Project project) {
        this.name = name;
        this.project = project;
    }

    private Date endDate;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PLANNED;

    @ManyToOne
    private Project project;

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

    public Project getProject() {
        return project;
    }

    public void setProject(final Project project) {
        this.project = project;
    }

}
