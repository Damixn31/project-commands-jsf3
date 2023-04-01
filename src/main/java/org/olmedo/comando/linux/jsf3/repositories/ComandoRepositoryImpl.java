package org.olmedo.comando.linux.jsf3.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.olmedo.comando.linux.jsf3.entities.Comando;

import java.util.List;

@RequestScoped
public class ComandoRepositoryImpl implements CrudRepository<Comando>{

    @Inject
    private EntityManager em;

    @Override
    public List listar() {
        return em.createQuery("from Comando", Comando.class).getResultList();
    }

    @Override
    public Comando porId(long id) {
        return em.find(Comando.class, id);
    }
}
