package Basics;
import java.lang.*;

public class StringBuilderExample {

    public static void main(String[] args) {
        // initialization
        StringBuilder s = new StringBuilder();// empty with default capacity set by JVM(for my laptop it was 16 can vary)
        print(s);
        StringBuilder s1= new StringBuilder(50); // adding capacity
        print(s1);
        StringBuilder s2 = new StringBuilder("Hello World"); // adding capacity
        print(s2);

        // methods
        s1.append("good bye ").append(5).append(s2); // good bye 5Hello World
        s1.deleteCharAt(0).insert(0,"Hi"); // Hiood bye 5Hello World
        s1.reverse(); // it will reverse
        s1.reverse(); // it will reverse
        s1.replace(0,2,"G");// including start excluding end  you can put any string
        System.out.println(s1.compareTo(s2)); // -1 0-> if matching
        System.out.println(s1.indexOf("Hello")); // 10 or -1 if not fount
        print(s1);

    }

    public static void print(StringBuilder sb) {
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}

