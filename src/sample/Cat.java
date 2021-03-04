package sample;

public class Cat extends Animal {
    // Pola - Fields
    private boolean usesLitterbox;
    private Volunteer servant;


    // Konstruktory
    public Cat(String name, String color, String sound){
        // Korzystam z ogólnej klasy Animal
        super(name, color, sound);

        // Dorzucam coś od siebie
        this.usesLitterbox = false;
        this.servant = null;
    }

    public Cat(String color){
        this("Puszek", color, "Miau!");
    }

    public void setServant(Volunteer servant) {
        this.servant = servant;
    }

    public Volunteer getServant() {
        return servant;
    }

    // Metody (zachowania)
    public String meow() {
        if (age > 15){
            return "krr" + sound;
        }
        return sound;
    }

    public String ownerInfo(){
        return this.getServant().getName() + " ma " + this.getServant().getAge() + " lat.";
    }

    public void teachLitterbox(){
        this.usesLitterbox = true;
    }

}
