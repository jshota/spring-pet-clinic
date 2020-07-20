package springpetclinic.services;

import springpetclinic.models.Owner;

import java.util.Set;

/**
 * @author j.h on 7/20/20
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
