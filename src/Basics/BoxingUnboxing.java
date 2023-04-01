package Basics;

public class BoxingUnboxing {
    public static void main(String[] args) {
        // Manually boxing
        Integer a = Integer.valueOf(15); // preferred but unnecessary
        Integer b = new Integer(12); // depricated
        int c= a.intValue(); // uneccessary

        // Automatic boxing and unboxing
        Integer d = 15;
        int e = d;

        Integer f = getPrimitive(); //AutpBoxing
        int g = getWrapper(); // AutoUnboxing
    }

    public static int getPrimitive() {
        return 15;
    }

    public static Integer getWrapper() {
        return Integer.valueOf(10);
    }
}
