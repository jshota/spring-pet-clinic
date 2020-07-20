package springpetclinic.services;

import java.util.Set;

/**
 * @author j.h on 7/20/20
 *
 * A mimic interface of CRUDRepository
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    T delete(T object);

    T deleteById(ID id);
}
