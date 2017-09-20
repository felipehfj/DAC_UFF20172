package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Turma;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@ManagedBean
@RequestScoped
public class TurmaRepository {

    public TurmaRepository() {
    }

    @PersistenceContext
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetos");
    EntityManager em = emf.createEntityManager();

    @Transactional
    public List<Turma> getAll(){
        return em.createQuery("SELECT a from Turma a").getResultList();
    }

    @Transactional
    public Turma getTurma(Turma turma){
        return em.find(Turma.class, turma);
    }

    public String salvar(Turma turma){
        EntityTransaction transaction = em.getTransaction();

        try {

            transaction.begin();
            em.persist(turma);
            transaction.commit();

            return "sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();

            return "erro";
        }
    }

    public String deletar(Turma turma){
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            em.remove(turma);
            transaction.commit();
            return "sucesso";
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        return "erro";
        }
    }

}
