package animalKingdomApp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("1.");
        animals.sort((o1, o2) -> o2.getYear() - o1.getYear());
        animals.forEach(a -> System.out.println(a.getName() + "was discovered in " + a.getYear()));

        System.out.println("2.");
        animals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animals.forEach(a -> System.out.println(a.getName()));

        System.out.println("3.");
        animals.sort((o1, o2) -> o1.move().compareToIgnoreCase(o2.move()));
        animals.forEach(a -> System.out.println(a.getName() + ": " + a.move() + " "));

        System.out.println("4.");
        animals.forEach(a -> {
            if (a.breath() == "lungs") {
                System.out.println(a.getName());
            }
        });

        System.out.println("5."); 
        animals.forEach(a -> {
            if ((a.breath() == "lungs") && (a.getYear() == 1758)){
                System.out.println(a.getName());
            }
        });

        System.out.println("6.");
        animals.forEach(a -> {
            if ((a.reproduce() == "eggs") && (a.breath() == "lungs")){
                System.out.println(a.getName());
            }
        });

        System.out.println("7.");
        animals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animals.forEach(a -> {
            if(a.getYear() == 1758) {
                System.out.println(a.getName());
            }
        });

        System.out.println("**Stretch**");
        animals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animals.forEach(a -> {
            if ((a.move() == "walk") && (a.breath() == "lungs") && (a.reproduce() == "live births")) {
                System.out.println(a.getName());
            }
        });





    }
}