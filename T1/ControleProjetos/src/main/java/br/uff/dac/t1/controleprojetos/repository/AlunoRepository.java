package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Aluno;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@ManagedBean
@RequestScoped
public class AlunoRepository {

    public AlunoRepository() {
    }

    @PersistenceContext
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetos");
    EntityManager em = emf.createEntityManager();

    @Transactional
    public List<Aluno> getAll(){
        return em.createQuery("SELECT a from Aluno a").getResultList();
    }

    public Aluno getAluno(Aluno aluno){
        return em.find(Aluno.class, aluno);
    }

    public String salvar(Aluno aluno){
        EntityTransaction transaction = em.getTransaction();

        try {

            transaction.begin();
            em.persist(aluno);
            transaction.commit();

            return "sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();

            return "erro";
        }
    }

    public String deletar(Aluno aluno){
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            em.remove(aluno);
            transaction.commit();
            return "sucesso";
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        return "erro";
        }
    }

}
