/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.controleprojetos.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author felipe
 */

@Entity
public class Turma implements Serializable{
    @Id
    private int id;
    private String codigo;
    private String periodo;
    private ETurno turno;
    private String sala;

    public Turma() {
    }

    public Turma(int id, String codigo, String periodo, ETurno turno, String sala) {
        this.id = id;
        this.codigo = codigo;
        this.periodo = periodo;
        this.turno = turno;
        this.sala = sala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ETurno getTurno() {
        return turno;
    }

    public void setTurno(ETurno turno) {
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.codigo);
        hash = 23 * hash + Objects.hashCode(this.periodo);
        hash = 23 * hash + Objects.hashCode(this.turno);
        hash = 23 * hash + Objects.hashCode(this.sala);
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
        final Turma other = (Turma) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.periodo, other.periodo);
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", codigo=" + codigo + ", periodo=" + periodo + ", turno=" + turno + ", sala=" + sala + '}';
    } 
    
}
