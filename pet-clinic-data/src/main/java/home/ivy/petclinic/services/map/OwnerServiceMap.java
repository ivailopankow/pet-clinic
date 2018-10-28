package home.ivy.petclinic.services.map;

import home.ivy.petclinic.model.Owner;
import home.ivy.petclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

   @Override
   public Owner findByLastName(String lastName) throws IllegalAccessException {
      return super.findAll().stream()
            .filter(owner -> owner.getLastName().equals(lastName))
            .findFirst().orElseThrow(IllegalAccessException::new);
   }

   @Override
   public Owner save(Owner object) {
      return super.save(object.getId(), object);
   }
}
