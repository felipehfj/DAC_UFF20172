package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Professor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@ManagedBean
@RequestScoped
public class ProfessorRepository {

    public ProfessorRepository() {
    }

    @PersistenceContext
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetos");
    EntityManager em = emf.createEntityManager();

    @Transactional
    public List<Professor> getAll(){
        return em.createQuery("SELECT p from Professor p").getResultList();
    }

    public Professor getProfessor(Professor professor){
        return em.find(Professor.class, professor);
    }

    public String salvar(Professor professor){
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(professor);
            transaction.commit();

            return "sucesso";

        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();

            return "erro";
        }
    }

    public String deletar(Professor professor){
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            em.remove(professor);
            transaction.commit();
            return "sucesso";
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
            return "erro";
        }
    }



}
