package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Disciplina;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@ManagedBean
@RequestScoped
public class DisciplinaRepository {

    @PersistenceContext
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetos");
    EntityManager em = emf.createEntityManager();

    public DisciplinaRepository() {
    }

    @Transactional
    public List<Disciplina> getAll(){
        return em.createQuery("SELECT p from Disciplina p").getResultList();
    }

    public Disciplina getDisciplina(Disciplina disciplina){
        return em.find(Disciplina.class, disciplina);
    }

    public String salvar(Disciplina disciplina){
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(disciplina);
            transaction.commit();

            return "sucesso";

        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();

            return "erro";
        }
    }

    public String deletar(Disciplina disciplina){
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            em.remove(disciplina);
            transaction.commit();
            return "sucesso";
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
            return "erro";
        }
    }
}
