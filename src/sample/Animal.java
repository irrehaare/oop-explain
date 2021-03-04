package sample;

public abstract class Animal {
    protected String name;
    protected int age;
    protected final String sound;
    protected final String color;

    public Animal(String name, String color, String sound){
        this.age = 0; // Ugly magic number example
        this.name = name;
        this.color = color;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void birthday(){ this.age++;}

    public String getColor() {
        return color;
    }
}
