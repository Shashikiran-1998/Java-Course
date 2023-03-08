package Basics;

public class StringMethods {
    public static void main(String[] args) {
        String s="Hello World";
        //Inspection methods
        System.out.println(s.length());// 11
        System.out.println(s.charAt(0));// H
        System.out.println(s.indexOf(0));// -1
        System.out.println(s.indexOf('l'));// 2
        System.out.println(s.indexOf("ll"));// 2
        System.out.println(s.indexOf("ll",5));// -1 checks from 5th index
        // same function but inverted for last index
        System.out.println(s.lastIndexOf('l'));// 9

       // comparison methods
        System.out.println(s.equals("s"));// false
        System.out.println(s.equals("Hello World"));// true
        System.out.println(s.contains("World1"));// false true for world
        s=s.toLowerCase();
        System.out.println(s.equalsIgnoreCase("Hello World")); // true
        System.out.println(s.startsWith("hello")); // true
        System.out.println(s.endsWith("world")); // true

        // manipulation methods
        System.out.println(s.concat(" shashi").concat("kiran")); //hello world shashikiran

        System.out.println(String.join("/","Shashi","kiran","R")); // Shashi/kiran/R
        System.out.println(s.substring(1,4)); // ell
        System.out.println(s.replace("he","He")); // Hello world
        System.out.println("    hii           ".trim()); // hii



    }
}
