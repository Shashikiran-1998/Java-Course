package Basics.methodRefrence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class maini {

    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<>(Arrays.asList("Asdd","sdmdmsd","dsddds"));
        // Method referencing
        s.forEach(System.out::println);

        Supplier<PlainOld> p = PlainOld::new;

        ArrayList<PlainOld> plainOlds = new ArrayList<>();
        plainOlds.add(p.get());
        


    }
}

class PlainOld {
    int id;

    public PlainOld() {
    }

    public PlainOld(int id) {
        this.id = id;
    }
}
