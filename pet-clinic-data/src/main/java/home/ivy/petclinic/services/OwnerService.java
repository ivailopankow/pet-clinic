package home.ivy.petclinic.services;

import home.ivy.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName) throws IllegalAccessException;
}
