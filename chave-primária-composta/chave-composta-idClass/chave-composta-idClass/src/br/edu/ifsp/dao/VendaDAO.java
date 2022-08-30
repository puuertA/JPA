package br.edu.ifsp.dao;

import br.edu.ifsp.modelo.Produto;
import br.edu.ifsp.modelo.Venda;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class VendaDAO extends AbstractDAO<Produto> {

    public List<Venda> buscar() {
        //JPQL
        //Sempre pensar em classe

        //SELECT p FROM Produto p  
        TypedQuery<Venda> query = getEntityManager()
                .createQuery("SELECT v FROM Venda v",
                        Venda.class);

        return query.getResultList();
    }

}
