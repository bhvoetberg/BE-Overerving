package nl.novi.javaprogrammeren.overerving;

public class Cat extends Domesticated {
    private boolean outdoor;
    public String soundsLike = "Miauw";

    public Cat(String name, boolean gender, String type, String nameOwner, String makeFood, boolean outdoor) {
        super(name, gender, type, nameOwner, makeFood);
        this.outdoor = outdoor;
    }

}
