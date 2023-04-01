package org.olmedo.comando.linux.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.olmedo.comando.linux.jsf3.entities.Comando;
import org.olmedo.comando.linux.jsf3.services.ComandoService;

import java.util.Arrays;
import java.util.List;

@Model // junta @ResquestScope con @Named lo usamos cuando queremos usar los dos en una sola
public class ComandosController {

    @Inject
    private ComandoService service;

    @Produces
    @Model
    public String titulo() {
        return "Comando de linux";
    }

    @Produces
    @RequestScoped
    @Named("listado")
    public List<Comando> findAll() {
        // return Arrays.asList(new Comando("ls"), new Comando("cp"), new Comando("mv"));
        return service.listar();
    }
}
