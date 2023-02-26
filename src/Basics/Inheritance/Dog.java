package Basics.Inheritance;

public class Dog extends Animal  {
    public Dog(String type, String size, int weight) {
        super(type, size, weight);
//        super(); error no default contructor
    }
    private String size= String.valueOf(5);

    @Override
    public String getSize() {
        return super.getSize();
//        return size;

    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void move(){
        super.move();
        if(super.getSize().equals("30")){
            run();
        } else  {
            walk();
        }
    }

    public void run(){
        System.out.println("running");
    }

    public void walk(){
        System.out.println("walking");
    }
}
