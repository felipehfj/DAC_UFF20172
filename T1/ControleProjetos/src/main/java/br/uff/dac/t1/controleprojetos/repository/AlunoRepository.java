package br.uff.dac.t1.controleprojetos.repository;

import br.uff.dac.t1.controleprojetos.modelo.Aluno;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
public class AlunoRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public List<Aluno> getAll(){
        return em.createQuery("SELECT Aluno a from Aluno").getResultList();
    }
}
