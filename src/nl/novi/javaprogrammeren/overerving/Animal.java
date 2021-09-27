package nl.novi.javaprogrammeren.overerving;

public class Animal {
    private String name;
    private boolean gender;

    public Animal(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    //Methods
    public void sound(String sound) {
        System.out.println("The animal says: " + sound);
    }



    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
