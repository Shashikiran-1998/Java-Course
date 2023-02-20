package Basics;

public class mrthodOverloading {

    public static void main(String[] args) {

    }

    public static int test(String animal,int score) {
        return 2;
    }

    public static int test(int score,String animal) {
        return 2;
    }

    public static void test(String animal) {
        return ;
    }

//    public static int test(String animal) {
//        return 6;
//    }
    // error as parameter already present
}
