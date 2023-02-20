package Basics;

public class controlStatments {
    public static void main(String[] args) {
//        if(true){
//
//        }else {
//
//        }
//        int k=0;
//        switch (k){
//            case 1:
//                1+1;
//                break;
//        }
        for(int i=0;i<10;i++){
            System.out.println("For loop"+i);
        }
        int j=0;
        while (j<10){
            System.out.println("While loop"+j);
            j++;
        }
        j=0;
        do {
            System.out.println("While loop"+j);
            j++;
        } while (j<10);

        // first do happens then checks while
    }




}
