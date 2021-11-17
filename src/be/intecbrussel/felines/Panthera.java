package be.intecbrussel.felines;

public abstract class Panthera extends Animal {
    Panthera naya = new Panthera() {};

    public String roar() {

        return "roooo";
    }

    public void hunt() {

    }

    @Override
    public String toString() {
        return "Panthera";
    }
}
