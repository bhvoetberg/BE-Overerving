package nl.novi.javaprogrammeren.overerving;

import nl.novi.javaprogrammeren.AnimalMain;

public class Domesticated extends Animal {
    //Attributes
    private String type;
    private String nameOwner;
    private String makeFood;


    //Constructor
    public Domesticated(String name, boolean gender, String type, String nameOwner, String makeFood) {
        super(name, gender);
        this.type = type;
        this.nameOwner = nameOwner;
        this.makeFood = makeFood;
    }

    //Methods


    //Getters & Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getMakeFood() {
        return makeFood;
    }

    public void setMakeFood(String makeFood) {
        this.makeFood = makeFood;
    }
}
