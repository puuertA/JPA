package br.edu.ifsp.dao;

import br.edu.ifsp.modelo.Item;
import br.edu.ifsp.modelo.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class VendaDAO extends AbstractDAO<Venda> {

    public List<Venda> buscar() {
        //JPQL
        //Sempre pensar em classe

        //SELECT p FROM Produto p  
        TypedQuery<Venda> query = getEntityManager()
                .createQuery("SELECT v FROM Venda v",
                        Venda.class);

        return query.getResultList();
    }

//    @Override
//    public void inserir(Venda venda) {
//        EntityManager em = getEntityManager();
//        
//        em.getTransaction().begin();
//        em.persist(venda);
//        
//        for (Item item : venda.getItens()){
//            em.persist(item);
//        }
//        
//        em.getTransaction().commit();
//        
//        em.close();
//    }

    
    
}
