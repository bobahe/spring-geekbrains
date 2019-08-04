package ru.bobahe.spring1.homework3.dao;

import org.springframework.stereotype.Component;
import ru.bobahe.spring1.homework3.model.Project;
import ru.bobahe.spring1.homework3.model.Task;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class TaskDAO extends AbstractDAO {

    public void persist(final Task task) {
        if (task == null) return;
        entityManager.persist(task);
    }

    public void merge(final Task task) {
        if (task == null) return;
        entityManager.merge(task);
    }

    public Task find(final String id) {
        if (id == null || id.isEmpty()) return null;
        return entityManager.find(Task.class, id);
    }

    public void remove(String id) {
        entityManager.remove(find(id));
    }

    public List<Task> findAll() {
        return entityManager.createQuery("select p from Task p", Task.class).getResultList();
    }

    public void removeAll() {
        entityManager.createQuery("delete from Task").executeUpdate();
    }

}
