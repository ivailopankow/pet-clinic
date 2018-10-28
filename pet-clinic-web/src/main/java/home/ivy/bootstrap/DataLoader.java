package home.ivy.bootstrap;

import home.ivy.petclinic.model.Owner;
import home.ivy.petclinic.model.Vet;
import home.ivy.petclinic.services.map.OwnerServiceMap;
import home.ivy.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


   private final OwnerServiceMap ownerService;
   private final VetServiceMap vetService;

   public DataLoader() {
      this.ownerService = new OwnerServiceMap();
      this.vetService = new VetServiceMap();
   }

   @Override
   public void run(String... args) throws Exception {
      Owner owner1 = new Owner();
      owner1.setId(1L);
      owner1.setFirstName("Michael");
      owner1.setLastName("Weston");
      ownerService.save(owner1);

      Owner owner2 = new Owner();
      owner1.setId(2L);
      owner1.setFirstName("Simona");
      owner1.setLastName("Gilentale");
      ownerService.save(owner2);

      System.out.println("Owners loaded...");

      Vet vet1 = new Vet();
      vet1.setId(1L);
      vet1.setFirstName("Sam");
      vet1.setLastName("Axe");
      vetService.save(vet1);

      Vet vet2 = new Vet();
      vet1.setId(2L);
      vet1.setFirstName("Jessie");
      vet1.setLastName("Porter");
      vetService.save(vet2);

      System.out.println("Vets loaded...");
   }
}
