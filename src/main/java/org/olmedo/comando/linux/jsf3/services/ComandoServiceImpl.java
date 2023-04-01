package org.olmedo.comando.linux.jsf3.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.olmedo.comando.linux.jsf3.entities.Comando;
import org.olmedo.comando.linux.jsf3.repositories.CrudRepository;

import java.util.List;
import java.util.Optional;

@Stateless
public class ComandoServiceImpl implements ComandoService {

    @Inject
    private CrudRepository<Comando> repository;

    @Override
    public List<Comando> listar() {
        return repository.listar();
    }

    @Override
    public Optional<Comando> porId(Long id) {
        try {
            return Optional.of(repository.porId(id));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
