package sample;

public class Transporter {
    private Animal pet;
    private boolean isOpen;
    private String color;

    public Transporter(){
        this.pet = null;
        this.isOpen = false;
        this.color = "black";
    }

    public void open(){
        isOpen = true;
    }

    public void close(){
        isOpen = false;
    }

    public void checkContent(){
        if (pet!=null){
            System.out.println("There is " + pet.getName() + " inside!");
        } else {
            System.out.println("There is no pet inside.");
        }
    }

    public void paint(String newColor){
        color = newColor;
        System.out.println("The color is now " + color);
    }

    public void putCatIn(Cat newCat){
        if (isOpen){
            pet = newCat;
            this.close();
            System.out.println("Cat " + pet.getName() + " is inside.");
        }else{
            System.out.println("Transporter is closed, no pet is in!");
        }
    }

    public Animal getPet() {
        Animal temp = pet;
        pet = null;
        this.open();
        return temp;
    }

    public boolean hasPet(){
        return pet != null;
    }
}
