package Basics;

public class DataTypes {
    public static void main(String[] args) {

        int i=0;
        i=12_222;// for better readablity of cureency
        long l=0L;
        char c='a';
        boolean b=false;
        double d=0.009;


//        Wrapper Class
         Integer I=0;
         System.out.println(Integer.MAX_VALUE);
         // 2147483647
        System.out.println(Integer.MIN_VALUE);
        // -2147483647

        i=2147483647+1;
        System.out.println(i);
        // -2147483647
        i=-2147483648-1;
        System.out.println(i);
        // 2147483647

//        i=2147483648;
        // compilation error

        byte b1=12;
        System.out.println(Byte.SIZE);
        // 8 -> number of bits 127 -> 2^8
//        Integer.SIZE
        // 2^32 long 64
        long l1=12333332222L;
        // This will give error as above is considered as Integer so we need to put L
        long l2=12333332222L;


    }


}
