/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author felipe
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Professor extends Pessoa implements Serializable {
    @Id
    private int id;
    private String siape;

    public Professor() {
    }

    public Professor(int id, String siape) {
        this.id = id;
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.siape);
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
        final Professor other = (Professor) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.siape, other.siape);
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", siape=" + siape + '}';
    }

}
