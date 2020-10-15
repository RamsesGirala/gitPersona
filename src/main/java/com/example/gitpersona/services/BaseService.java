package com.example.gitpersona.services;
import com.example.gitpersona.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base,ID extends Serializable> {
    List<E> findAll() throws Exception;
    E findByID(ID id) throws  Exception;
    E save(E entity) throws  Exception;
    E update(ID id,E entity) throws  Exception;
    boolean delete(ID id) throws  Exception;

}