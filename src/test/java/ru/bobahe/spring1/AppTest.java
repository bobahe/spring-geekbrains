package ru.bobahe.spring1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bobahe.spring1.homework3.config.ApplicationConfig;
import ru.bobahe.spring1.homework3.dao.ProjectDAO;
import ru.bobahe.spring1.homework3.dao.TaskDAO;
import ru.bobahe.spring1.homework3.model.Project;
import ru.bobahe.spring1.homework3.model.Task;

public class AppTest {

    private static final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    private static final ProjectDAO projectDAO = context.getBean(ProjectDAO.class);
    private static final TaskDAO taskDAO = context.getBean(TaskDAO.class);

    @Test
    public void projectCreateTest() {
        projectDAO.persist(new Project("Project 1"));
        Assert.assertFalse(projectDAO.findAll().isEmpty());
    }

    @Test
    public void projectReadTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        Assert.assertNotNull(projectDAO.find(project.getId()));
    }

    @Test
    public void projectUpdateTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        project.setDescription("Test description");
        projectDAO.merge(project);
        Assert.assertEquals("Test description", projectDAO.find(project.getId()).getDescription());
    }

    @Test
    public void projectRemoveTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        projectDAO.remove(project.getId());
        Assert.assertTrue(projectDAO.findAll().isEmpty());
    }

    @Test
    public void taskCreateTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        taskDAO.persist(new Task("Task 1", project));
        Assert.assertFalse(taskDAO.findAll().isEmpty());
    }

    @Test
    public void taskReadTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        final Task task = new Task("Task 1", project);
        taskDAO.persist(task);
        Assert.assertNotNull(taskDAO.find(task.getId()));
    }

    @Test
    public void taskUpdateTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        final Task task = new Task("Task 1", project);
        taskDAO.persist(task);
        task.setDescription("Test description");
        taskDAO.merge(task);
        Assert.assertEquals("Test description", taskDAO.find(task.getId()).getDescription());
    }

    @Test
    public void taskRemoveTest() {
        final Project project = new Project("Project 1");
        projectDAO.persist(project);
        final Task task = new Task("Task 1", project);
        taskDAO.persist(task);
        taskDAO.remove(task.getId());
        Assert.assertTrue(taskDAO.findAll().isEmpty());
    }

    @After
    public void cleanDatabase() {
        projectDAO.removeAll();
        taskDAO.removeAll();
    }

}
