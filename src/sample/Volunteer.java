package sample;

public class Volunteer {
    private String name;
    private int age;
    private boolean isInspector;

    public Volunteer(String name, int age) {
        this.name = name;
        this.age = age;
        this.isInspector = false;
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

    public boolean isInspector() {
        return isInspector;
    }

    public void setInspector(boolean inspector) {
        isInspector = inspector;
    }
}
