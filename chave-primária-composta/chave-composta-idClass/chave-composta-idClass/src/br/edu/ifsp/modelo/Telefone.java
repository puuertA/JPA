package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table (name = "telefone")
@IdClass(TelefonePK.class)
public class Telefone implements Serializable{
@Id
@Column (name = "ddd")
private int ddd;
@Id
@Column (name = "numero")
private String numero;

public Telefone() {
}

public Telefone(int ddd, String numero) {
this.ddd = ddd;
this.numero = numero;
}

public int getDdd() {
return ddd;
}

public void setDdd(int ddd) {
this.ddd = ddd;
}

public String getNumero() {
return numero;
}

public void setNumero(String numero) {
this.numero = numero;
}

}
