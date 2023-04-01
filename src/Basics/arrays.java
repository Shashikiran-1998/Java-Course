package Basics;

import java.util.Arrays;
import java.util.Collections;

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

        // some common methods of Arrays
        int[] first = new int[]{5,4,3,2,1};
        int[] second=first;
        int[] third = Arrays.copyOf(first,10);
        Arrays.sort(second); // sorts
        System.out.println(Arrays.toString(first)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(second)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(third)); // [5, 4, 3, 2, 1, 0, 0, 0, 0, 0
        // reference is taken second so any changes to any will affect both
        Arrays.fill(second,0,2,4);
        System.out.println(Arrays.toString(second)); // [4, 4, 3, 4, 5]
        System.out.println(Arrays.binarySearch(second,4)); // returns index -1 if not there
        System.out.println(Arrays.equals(first,third));// true or false
        "ttttt".matches("//d+");// matches regex
        // It always great to use Integer[] we can reverse sort all those we can do
        // first.length method to get length

//        Varargs
        String[] String1 =  {"One","Two","Three"};
        test(String1);
        System.out.println(Arrays.toString(String1)); // Its changes so reference is passed

        // Multidimensional array
        int[][] arr=new int[3][];
        arr[0] = new int[] {1,2,3,4,5};
        arr[1] = new int[] {1,2,3};

        System.out.println(Arrays.deepToString(arr));









    }

    public static void test(String... ans) {
        ans[0] = "Test";

    }
}
