package home.ivy.petclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDay;

    public home.ivy.petclinic.model.PetType getPetType() {
        return petType;
    }

    public void setPetType(home.ivy.petclinic.model.PetType petType) {
        this.petType = petType;
    }

    public home.ivy.petclinic.model.Owner getOwner() {
        return owner;
    }

    public void setOwner(home.ivy.petclinic.model.Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
