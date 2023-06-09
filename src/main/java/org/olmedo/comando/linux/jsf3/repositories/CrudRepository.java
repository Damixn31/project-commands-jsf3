package org.olmedo.comando.linux.jsf3.repositories;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listar();
    T porId(long id);
}
