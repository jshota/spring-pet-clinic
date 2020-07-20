package springpetclinic.services;

import springpetclinic.models.Owner;

/**
 * @author j.h on 7/20/20
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
