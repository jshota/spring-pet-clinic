package springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.models.Owner;
import springpetclinic.models.Vet;
import springpetclinic.services.OwnerService;
import springpetclinic.services.VetService;

/**
 * @author j.h on 8/6/20
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Fiona");
        owner1.setLastName("Sit");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Khil");
        owner2.setLastName("Fong");

        ownerService.save(owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Vet1");
        vet1.setLastName("Sit");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vet2");
        vet2.setLastName("Fong");

        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
