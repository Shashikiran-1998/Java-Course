package Basics.lamdas;

public class Calculator  {

    public static void main(String[] args) {
      calculate((a,b) -> a+b,2,3);
      calculate((a,b) -> {  return a/b;},2,3);
    }

    public static <T> T calculate(Operations<T> operations,T one,T two) {
          System.out.println("Calculating start");
          return operations.accept(one,two);
    }
}
