/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.controleprojetos.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author felipe
 */

@Entity
public class Titulacao implements Serializable{
    @Id
    private int id;
    private ETitulo titulo;
    private String instituicao;
    private String area;
    private Date ano;

    public Titulacao() {
    }

    public Titulacao(int id, ETitulo titulo, String instituicao, String area, Date ano) {
        this.id = id;
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.area = area;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
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
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Titulacao{" + "id=" + id + ", titulo=" + titulo + ", instituicao=" + instituicao + ", area=" + area + ", ano=" + ano + '}';
    }
        
}
