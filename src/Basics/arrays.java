package Basics;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // declaration
        int[] a;
        int b[];

        // Initialization
        a = new int[5]; // It initializes to 0 for all
        System.out.println(Arrays.toString(a));
        a = new int[] {1,3,5}; // [1,3,3] new Array block is assigned
        System.out.println(Arrays.toString(a));
        b=new int[10];
        System.out.println(Arrays.toString(b));
        System.out.println(b.length);


    }
}
