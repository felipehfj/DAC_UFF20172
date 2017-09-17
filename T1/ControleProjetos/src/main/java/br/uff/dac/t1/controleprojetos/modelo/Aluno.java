package br.uff.dac.t1.controleprojetos.modelo;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ManagedBean
public class Aluno extends Pessoa implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private ECurso curso;
    @Column(nullable = false)
    private String matricula;

    private Double cr;

    @ManyToMany
    private Set<Projeto> projetos;

    public Aluno() {
    }

    public Aluno(ECurso curso, String matricula, Double cr, Set<Projeto> projetos) {
        this.curso = curso;
        this.matricula = matricula;
        this.cr = cr;
        this.projetos = projetos;
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(Set<Projeto> projetos) {
        this.projetos = projetos;
    }

    public ECurso getCurso() {
        return curso;
    }

    public void setCurso(ECurso curso) {
        this.curso = curso;
    }

    public Double getCr() {
        return cr;
    }

    public void setCr(Double cr) {
        this.cr = cr;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ECurso[] getCursos() {
        return ECurso.values();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (curso != null ? curso.hashCode() : 0);
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + (cr != null ? cr.hashCode() : 0);
        return result;
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
