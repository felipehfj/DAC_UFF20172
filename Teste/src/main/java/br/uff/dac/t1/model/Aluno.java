/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author felipe
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Aluno extends Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private ECurso curso;
    private float cr;
    private String matricula;

    public Aluno() {
    }

    public Aluno(int id, ECurso curso, float cr, String matricula) {
        this.id = id;
        this.curso = curso;
        this.cr = cr;
        this.matricula = matricula;
    }

    public ECurso getCurso() {
        return curso;
    }

    public void setCurso(ECurso curso) {
        this.curso = curso;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.curso);
        hash = 11 * hash + Float.floatToIntBits(this.cr);
        hash = 11 * hash + Objects.hashCode(this.matricula);
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
        final Aluno other = (Aluno) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", curso=" + curso + ", cr=" + cr + ", matricula=" + matricula + '}';
    }

}
