package home.ivy.petclinic.services.map;

import home.ivy.petclinic.model.Vet;
import home.ivy.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
   @Override
   public Vet save(Vet object) {
      return super.save(object.getId(), object);
   }
}
