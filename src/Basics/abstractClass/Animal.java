package Basics.abstractClass;

public abstract class Animal {

    private int size;
    private int weight;
    private String type;

    Animal(int size,int weight,String type) {
        this.size = size;
        this.weight = weight;
        this.type = type;
    }

    public abstract void move();
    public abstract void makeNoise();
}
