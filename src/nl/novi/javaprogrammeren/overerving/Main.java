package nl.novi.javaprogrammeren.overerving;

public class Main {
    public static void main(String[] args) {
        Cat sam = new Cat("Sam", false, "cat", "Rober", "Royal Canin", false);
        System.out.println("This " + sam.getType() + " is named " + sam.getName() + " and owned by " + sam.getNameOwner());

    }
}
