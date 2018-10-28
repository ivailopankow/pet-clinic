package home.ivy.petclinic.services.map;

import home.ivy.petclinic.model.Pet;
import home.ivy.petclinic.services.PetService;

public class PetSerivceMap extends AbstractMapService<Pet, Long> implements PetService {
   @Override
   public Pet save(Pet object) {
      return super.save(object.getId(), object);
   }
}
