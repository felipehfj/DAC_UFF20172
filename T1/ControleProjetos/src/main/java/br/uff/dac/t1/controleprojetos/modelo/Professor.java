package br.uff.dac.t1.controleprojetos.modelo;

import br.uff.dac.t1.controleprojetos.bean.SampleEntity;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ManagedBean
public class Professor extends Pessoa implements Serializable, SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String siape;

    @OneToMany(mappedBy = "professor")
    private Set<Titulacao> titulacoes;

    @OneToMany(mappedBy = "professor")
    private Set<Turma> turmas;

    @OneToMany(mappedBy = "professor")
    private Set<Projeto> projetos;

    public Professor() {

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public Set<Titulacao> getTitulacoes() {
        return titulacoes;
    }

    public void setTitulacoes(Set<Titulacao> titulacoes) {
        this.titulacoes = titulacoes;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(Set<Projeto> projetos) {
        this.projetos = projetos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Professor professor = (Professor) o;

        if (id != professor.id) return false;
        if (!siape.equals(professor.siape)) return false;
        if (titulacoes != null ? !titulacoes.equals(professor.titulacoes) : professor.titulacoes != null) return false;
        if (turmas != null ? !turmas.equals(professor.turmas) : professor.turmas != null) return false;
        return projetos != null ? projetos.equals(professor.projetos) : professor.projetos == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = (int) (31 * result + id);
        result = 31 * result + siape.hashCode();
        result = 31 * result + (titulacoes != null ? titulacoes.hashCode() : 0);
        result = 31 * result + (turmas != null ? turmas.hashCode() : 0);
        result = 31 * result + (projetos != null ? projetos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", siape='" + siape + '\'' +
                ", titulacoes=" + titulacoes +
                ", turmas=" + turmas +
                ", projetos=" + projetos +
                '}';
    }
}
