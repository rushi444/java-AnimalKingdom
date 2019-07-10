package animalKingdomApp;

public abstract class AbstractAnimal {
    private static int maxNumber = 0; 
    private int number;
    private String name;
    private int year;

    public void eatFood() {
        System.out.println("Eating Food...");
    }

    public abstract String move(); 
    public abstract String breath(); 
    public abstract String reproduce(); 

    public AbstractAnimal(String name, int year) {
        maxNumber++; 
        number = maxNumber; 
        this.name = name; 
        this.year = year; 
    }

}