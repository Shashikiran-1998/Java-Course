package Basics;

public class formatting {
    public static void main(String[] args) {

        String s="Bullet point\n \u2022 First point\n \u2022 Second point ";
        System.out.println(s);

        //text block
//        s= """ kkk
//   mkkkk
//""";
        int num =5;
        double deci = 35;
        System.out.printf("printing a number %d",num);
        System.out.printf("printing a number %f %n",deci);// printing a number 5printing a number 35.000000
        System.out.printf("printing a number %.2f",deci);// printing a number 5printing a number 35.00

        String format = String.format("printing a number %.2f",deci); //printing a number 5printing a number 35.00




    }
}
