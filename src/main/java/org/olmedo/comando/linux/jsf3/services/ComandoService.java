package org.olmedo.comando.linux.jsf3.services;

import jakarta.ejb.Local;
import org.olmedo.comando.linux.jsf3.entities.Comando;

import java.util.List;
import java.util.Optional;

@Local
public interface ComandoService {

    List<Comando> listar();
    Optional<Comando> porId(Long id);
}
