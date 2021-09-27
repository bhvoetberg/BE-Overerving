package nl.novi.javaprogrammeren.overerving;

public class Main {
    public static void main(String[] args) {
        Cat sam = new Cat("Sam", false, "cat", "Rober", "Royal Canin", false);
        System.out.println("This " + sam.getType() + " is named " + sam.getName() + " and owned by " + sam.getNameOwner());
        System.out.println(sam.getName() + " " + sam.move() + " and says " + sam.sound(sam.soundsLike.toLowerCase()));

        Tiger simba = new Tiger("Simba", true, 2, "Tuesday", "India", 42);
        System.out.println("This " + simba.genderFull().toLowerCase() + " " + simba.getClass().getSimpleName().toLowerCase() + " is named " + simba.getName() + " and lives in cage " + simba.getCage());
        System.out.println(simba.getName() + " eats " + simba.eat("meat") + " and was last fed on" + simba.getLastFed());

        Animal[] group = {sam, simba};
        for (Animal x: group) {
            System.out.println(x.getName() + " " + x.move());
        }

    }
}
