package ru.bobahe.spring1.homework3.dao;

import org.springframework.stereotype.Component;
import ru.bobahe.spring1.homework3.model.Project;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ProjectDAO extends AbstractDAO {

    public void persist(final Project project) {
        if (project == null) return;
        entityManager.persist(project);
    }

    public void merge(final Project project) {
        if (project == null) return;
        entityManager.merge(project);
    }

    public Project find(final String id) {
        if (id == null || id.isEmpty()) return null;
        return entityManager.find(Project.class, id);
    }

    public void remove(String id) {
        entityManager.remove(find(id));
    }

    public List<Project> findAll() {
        return entityManager.createQuery("select p from Project p", Project.class).getResultList();
    }

    public void removeAll() {
        entityManager.createQuery("delete from Project").executeUpdate();
    }

}
