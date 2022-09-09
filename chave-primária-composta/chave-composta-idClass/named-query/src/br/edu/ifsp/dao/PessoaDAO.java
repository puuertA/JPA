package br.edu.ifsp.dao;

import br.edu.ifsp.modelo.Pessoa;
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
    
}
