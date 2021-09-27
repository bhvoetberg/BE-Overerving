package nl.novi.javaprogrammeren.overerving;

import javax.print.DocFlavor;

public class Animal {
    private String name;
    private boolean genderMale;

    public Animal(String name, boolean gender) {
        this.name = name;
        this.genderMale = gender;
    }

    //Methods
    public String sound(String sound) {
        return sound;
    }

    public String move(){
        return "moved 0,25m";
    }

    public String genderFull(){
        if (genderMale = true) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public String eat(String food) {
        return food;
    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return genderMale;
    }

    public void setGender(boolean gender) {
        this.genderMale = gender;
    }
}
