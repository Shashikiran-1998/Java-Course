package Basics.Inheritance;

public class main {
    public static void main(String[] args) {
       Animal animal=new Animal("Cat","small",20);
       doSomething(animal,"fast");

       Dog dog=new Dog("Huskey","mid",50);
       doSomething(dog,"ok");
       dog.getSize();// you can get all methods from super class + new methods/attributes
    }

    public static void doSomething(Animal animal,String speed){
        System.out.println("Animal" + animal.toString());
    }
}
