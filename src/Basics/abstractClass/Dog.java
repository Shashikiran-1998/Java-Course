package Basics.abstractClass;

public class Dog extends Animal {
    Dog(int size, int weight, String type) {
        super(size, weight, type);
    }
    // constructor compulsory

    @Override
    public void move() {
        
    }

    @Override
    public void makeNoise() {

    }
}
