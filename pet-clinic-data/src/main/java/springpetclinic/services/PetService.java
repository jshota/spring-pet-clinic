package springpetclinic.services;

import springpetclinic.models.Pet;

import java.util.Set;

/**
 * @author j.h on 7/20/20
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
