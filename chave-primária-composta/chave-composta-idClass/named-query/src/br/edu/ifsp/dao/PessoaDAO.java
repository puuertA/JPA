package br.edu.ifsp.dao;

import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.pep.dao.AbstractDAO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class PessoaDAO extends AbstractDAO<Pessoa>{
    public List<Pessoa> buscar() {
        //JPQL
        //Sempre pensar em classe
        
        //SELECT p FROM Produto p  
        TypedQuery<Pessoa> query = getEntityManager()
                .createQuery("SELECT p FROM Pessoa p", 
                        Pessoa.class);
        
        return query.getResultList();
    }
    
    public Pessoa buscarPorId(long id){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorId", Pessoa.class);
        query.setParameter("id", id);
        
        return query.getSingleResult();
    }
    
    public Pessoa buscarPorNome(String nome){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorNome", Pessoa.class);
        query.setParameter("nome", "%"+nome+"%");
        
        return query.getSingleResult();
    }
    
    public void verificarEstadoDoCicloDeVida() {
        Pessoa p = new Pessoa("Ana", new Date(), new BigDecimal(5000));
        
        EntityManager em = getEntityManager();
        System.out.println(em.contains(p));
        
        em.persist(p);
        
        System.out.println("Esta no estado gerenciado? " + em.contains(p));
        
        em.detach(p);
        
        System.out.println("Esta no estado gerenciado? " + em.contains(p));
    }
    
    public void remover(Pessoa p)
    {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        System.out.println("Está no estado gerenciado?" + em.contains(p));
        em.remove(em.merge(p));
        
        em.getTransaction().commit();
        em.close();
    }
}
