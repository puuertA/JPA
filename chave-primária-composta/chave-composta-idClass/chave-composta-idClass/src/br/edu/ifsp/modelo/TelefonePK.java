package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;


public class TelefonePK implements Serializable{
@Column(insertable = false, updatable = false )
private int ddd;
@Column(insertable = false, updatable = false )
private String numero;

public TelefonePK(int ddd, String numero) {
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

@Override
public int hashCode() {
int hash = 3;
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
final TelefonePK other = (TelefonePK) obj;
if (this.ddd != other.ddd) {
return false;
}
return Objects.equals(this.numero, other.numero);
}

}
