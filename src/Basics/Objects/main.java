package Basics.Objects;

public class main {
    public static void main(String[] args) {
        User user=null;
        // Here variable with User class is created and no object is assigned
//        user.isAbove18();
        // null pointer
        user = new User();
//        new User() is creating instance or refrence it is created in memeory
        user=new User(1,"skdd",5,3,true);
        // new object is refrenced

    }
}
