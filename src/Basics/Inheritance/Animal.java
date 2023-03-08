package Basics.Inheritance;

public class Animal {
    private String Type;

    public Animal(String type, String size, int weight) {
        Type = type;
        Size = size;
        this.weight = weight;
    }

    public Animal() {

    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Type='" + Type + '\'' +
                ", Size='" + Size + '\'' +
                ", weight=" + weight +
                '}' + super.toString();
    }

    private String Size;
    private int weight;

    public void move(){
        System.out.println("moving");
    }


}
