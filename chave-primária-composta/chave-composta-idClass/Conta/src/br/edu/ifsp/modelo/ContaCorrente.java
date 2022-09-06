package br.edu.ifsp.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "conta_corrente")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ContaCorrente implements Serializable {
    
    @Id
    @Column(name = "numero_agencia")
    private long numeroAgencia;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numeroConta;
    
    @Column(name = "saldo", precision = 8, scale = 2, nullable = false)
    private BigDecimal saldo;
}
