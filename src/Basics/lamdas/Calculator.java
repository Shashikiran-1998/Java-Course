package Basics.lamdas;
import java.util.Arrays;
import java.util.function.*;

public class Calculator  {

    public static void main(String[] args) {
      calculate((a,b) -> a+b,2,3);
      calculate((a,b) -> {  return a/b;},2,3);
      // using built in consumer and bi consumer class
      calculate1((a,b) -> {System.out.println(a/b);},2,3);
      Arrays.asList("Assk","sasa").removeIf((a)-> a.charAt(0) == 'A');
      Arrays.asList("Assk","sasa").forEach((a)-> a.charAt(0));
//      Arrays.asList("Assk","sasa").stream().reduce((a)-> String.valueOf(a.charAt(0)));
//      "sksskks".
    }

    public static <T> T calculate(Operations<T> operations,T one,T two) {
          System.out.println("Calculating start");
          return operations.accept(one,two);
    }

    public static <T> void calculate1(BiConsumer<T,T> operations,T one,T two) {
        System.out.println("Calculating start");
        operations.accept(one,two);
    }
}
