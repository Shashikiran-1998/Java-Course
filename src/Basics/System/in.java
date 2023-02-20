package Basics.System;

import java.util.Arrays;
import java.util.Scanner;

public class in {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Here i am giving Scanner System.in object we can give File object also
        // out is final variable of claass PrintStream
        String example=sc.nextLine();
        System.out.println(example);
    }

}
