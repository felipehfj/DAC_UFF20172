package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Titulacao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@ManagedBean
@RequestScoped
public class TitulacaoRepository {

    public TitulacaoRepository() {
    }

    @PersistenceContext
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetos");
    EntityManager em = emf.createEntityManager();

    @Transactional
    public List<Titulacao> getAll(){
        return em.createQuery("SELECT t from Titulacao t").getResultList();
    }

    @Transactional
    public Titulacao getTitulacao(Titulacao titulacao){
        return em.find(Titulacao.class, titulacao);
    }

    public String salvar(Titulacao titulacao){
        EntityTransaction transaction = em.getTransaction();

        try {

            transaction.begin();
            em.persist(titulacao);
            transaction.commit();

            return "sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();

            return "erro";
        }
    }

    public String deletar(Titulacao titulacao){
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            em.remove(titulacao);
            transaction.commit();
            return "sucesso";
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        return "erro";
        }
    }

}
