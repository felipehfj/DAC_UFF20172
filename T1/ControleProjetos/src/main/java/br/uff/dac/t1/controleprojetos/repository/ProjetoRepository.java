package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Projeto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@ManagedBean
@RequestScoped
public class ProjetoRepository {

    @PersistenceContext
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetos");
    EntityManager em = emf.createEntityManager();

    public ProjetoRepository() {
    }

    @Transactional
    public List<Projeto> getAll(){
        return em.createQuery("SELECT p from Projeto p").getResultList();
    }

    public Projeto getProjeto(Projeto projeto){
        return em.find(Projeto.class, projeto);
    }

    public String salvar(Projeto projeto){
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(projeto);
            transaction.commit();

            return "sucesso";

        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();

            return "erro";
        }
    }

    public String deletar(Projeto projeto){
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            em.remove(projeto);
            transaction.commit();
            return "sucesso";
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
            return "erro";
        }
    }
}
