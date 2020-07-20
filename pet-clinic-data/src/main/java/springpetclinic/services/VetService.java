package springpetclinic.services;

import springpetclinic.models.Vet;

import java.util.Set;

/**
 * @author j.h on 7/20/20
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
