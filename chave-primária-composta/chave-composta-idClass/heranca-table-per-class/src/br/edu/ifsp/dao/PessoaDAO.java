/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.dao;

import br.edu.ifsp.modelo.Pessoa;
import java.util.List;
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
}
