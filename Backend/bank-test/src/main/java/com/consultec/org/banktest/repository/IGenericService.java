package com.consultec.org.banktest.repository;

import com.consultec.org.banktest.modelo.ResponseGeneric;

import java.util.List;
import java.util.UUID;

public interface IGenericService<S,E,Id> {
    List<S> findAll();
    ResponseGeneric<S> Create(E entity);
    ResponseGeneric<S> Update(E entity);
    ResponseGeneric<S> Delete(Id id);

}
