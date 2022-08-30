package br.edu.ifsp.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author aluno
 */
@Embeddable
public class ItemPK implements Serializable{
    @Column(name = "venda_id",insertable = false, updatable = false)
    private int vendaId;
    @Column(name = "produto_id",insertable = false, updatable = false)
    private int produtoId;

    public ItemPK() {
    }

    public ItemPK(int vendaId, int produtoId) {
        this.vendaId = vendaId;
        this.produtoId = produtoId;
    }

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.vendaId;
        hash = 29 * hash + this.produtoId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemPK other = (ItemPK) obj;
        if (this.vendaId != other.vendaId) {
            return false;
        }
        return this.produtoId == other.produtoId;
    }

    
}
