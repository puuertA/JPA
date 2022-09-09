package br.edu.ifsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO<T> {
        private final EntityManagerFactory emf;
    
    public AbstractDAO(){
        emf = Persistence.createEntityManagerFactory("named-queryPU");
    }
    
    protected EntityManager getEntityManager() {
        return this.emf.createEntityManager();
    }
    
    public void inserir(T entity) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();

        em.close();
    }
    
    public void alterar(T entity) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();

        em.close();
    }
}
