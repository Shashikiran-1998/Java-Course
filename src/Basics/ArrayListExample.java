package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // declaration
        List<Object> course = new ArrayList<>();
        course.add("shashi"); // String data type
        course.add(5); // Integer
        System.out.println(course); // you can store different data type
        List<String> names = List.of("shashi","kiran");
        System.out.println(names);
//        names.add("aa"); // runtime error as above factory method creates immutable list
        List<String> names1 = new ArrayList<>(List.of("shashi","kiran"));
        names1.add("aa");
        System.out.println(names1);
        List<String> names2 = new ArrayList<>(Arrays.asList("ass","aaa"));
        List<String> names3 = new ArrayList<>(32); // initial capacity
        names3.add("a");
        String[] names5 = {"shashi","kiran"};
//        names3.addAll(names5); // error you cant put array
        names3.addAll(List.of(names5)); // works a, shashi, kiran
        names3.set(0,"b"); // b, shashi, kiran
        names3.remove("b"); // shashi, kiran
        names3.remove(0); // kiran
        //names3.size() // 1
        names3.clear(); // []
        // names3.isEmpty() true
        names3.addAll(Arrays.asList("Ram","Sham","Bham","Sam","John","Sam1","Sam2"));
        names3.removeAll(Arrays.asList("Sam1","Sam2")); // removes everthing from list //Ram, Sham, Bham, Sam, John
        names3.retainAll(Arrays.asList("Ram","Sham","Bham")); // retains all elements that are in List // Ram,Sham,Bham
        names3.sort(Comparator.naturalOrder()); // Ascending order Bham, Ram, Sham
        names3.sort(Comparator.reverseOrder()); // Sham, Ram, Bham
        String[] example = names3.toArray(new String[0]); // to convert to array
        // few methods to search elements
        names3.contains("Ram"); // true or false
        names3.containsAll(List.of("Ram")); // true or false
        names3.indexOf("Ram"); // index or -1
        names3.lastIndexOf("Ram"); // index or -1
        System.out.println(Arrays.toString(example));






    }
}
