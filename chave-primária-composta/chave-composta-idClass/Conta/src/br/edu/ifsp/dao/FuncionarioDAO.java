/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.dao;

import br.edu.ifsp.modelo.Funcionario;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class FuncionarioDAO extends AbstractDAO<Funcionario> {
    public List<Funcionario> buscar() {
        //JPQL
        //Sempre pensar em classe
        
        //SELECT p FROM Produto p  
        TypedQuery<Funcionario> query = getEntityManager()
                .createQuery("SELECT p FROM Funcionario p", 
                        Funcionario.class);
        
        return query.getResultList();
    }
}
