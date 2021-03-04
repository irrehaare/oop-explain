package sample;

import java.util.ArrayList;

public class Schronisko {
    ArrayList<Animal> pets;
    ArrayList<Volunteer> helpers;

    public Schronisko() {
        this.pets = new ArrayList<>();
        this.helpers = new ArrayList<>();
    }

    public void admitPet(Transporter transporter){
        if (transporter.hasPet()){
            pets.add(transporter.getPet());
        }
    }

    public void checkCats(){
        for (Animal pet: pets) {
            System.out.println(pet.getName() + ": obecny!");
        }
    }

    public ArrayList<Animal> getPets() {
        return pets;
    }

    public ArrayList<Volunteer> getHelpers() {
        return helpers;
    }
}
