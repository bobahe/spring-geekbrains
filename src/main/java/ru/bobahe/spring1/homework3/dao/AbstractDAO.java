package ru.bobahe.spring1.homework3.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDAO {

    @PersistenceContext
    protected EntityManager entityManager;

}
