package Basics;

public class Casting {

    @Override
    public String toString() {
        return "Casting{}";
    }

    public static void main(String[] args) {
        byte b=Byte.MAX_VALUE;
//        b=b/2;
        // the above line Throws as Error because if yougive expression it will think variable is Int by default so Casting is required
        b=129/2;
        // works
        b=(byte) b;

        Short s=(short) 100L;
        Short s1=(byte) 100L;

    }
}
