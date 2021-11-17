package be.intecbrussel.felines;

public class Animal {


    protected static int animalCount;
    private char size;
    private char coat;
    private String color;
    private double weight;


    public void makeNoise(String sound) {

    }

    public void eat() {

    }

    public void sleep() {

    }

    public boolean isAlive() {

        return true;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }
}


