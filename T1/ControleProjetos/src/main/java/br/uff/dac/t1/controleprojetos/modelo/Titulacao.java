/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.controleprojetos.modelo;

import br.uff.dac.t1.controleprojetos.bean.SampleEntity;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author felipe
 */

@Entity
@ManagedBean
public class Titulacao implements Serializable, SampleEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private ETitulo titulo;
    private String instituicao;
    private String area;
    private String ano;

    @ManyToOne
    private Professor professor;

    public Titulacao() {
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ETitulo getTitulo() {
        return titulo;
    }

    public void setTitulo(ETitulo titulo) {
        this.titulo = titulo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public ETitulo[] getTitulos(){ return ETitulo.values(); }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (31 * hash + this.id);
        hash = 31 * hash + Objects.hashCode(this.titulo);
        hash = 31 * hash + Objects.hashCode(this.instituicao);
        hash = 31 * hash + Objects.hashCode(this.area);
        hash = 31 * hash + Objects.hashCode(this.ano);
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
        final Titulacao other = (Titulacao) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Titulacao{" + "id=" + id + ", titulo=" + titulo + ", instituicao=" + instituicao + ", area=" + area + ", ano=" + ano + '}';
    }
        
}
