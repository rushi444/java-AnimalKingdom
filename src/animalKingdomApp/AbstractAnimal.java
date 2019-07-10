package animalKingdomApp;

public abstract class AbstractAnimal {
    private static int maxNumber = 0;
    private int number;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year) {
        maxNumber++;
        number = maxNumber;
        this.name = name;
        this.year = year;
    }

    public String eatFood() {
        return "Eating Food...";
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

}