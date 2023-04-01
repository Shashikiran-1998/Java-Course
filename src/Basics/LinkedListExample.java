package Basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // To add new elements
        names.add("Ram");
        // names.add(3,"Sham"); // array out of bound Run time index
        names.add("sham");
        names.add(1,"Pam"); // Ram, Pam, sham
        names.addLast("Sam");
        names.addFirst("Sam");

        // Que methods
        names.offer("Shankar");
        names.offerFirst("Shashi");
        names.offerLast("Shashi kiran");

        // Stack methods
        names.push("Sooraj"); // [Sooraj, Shashi, Sam, Ram, Pam, sham, Sam, Shankar, Shashi kiran]


        // Get methods
        System.out.println("index at 0 "+names.get(0));
        System.out.println("index at 0 "+names.getFirst());
        System.out.println("index at n - 1 "+names.getLast());
        System.out.println("index af Sam "+names.indexOf("Sam"));
        System.out.println("index af Sam "+names.lastIndexOf("Sam"));

        // Queue retrival ,ethods
        System.out.println("get elemnt in queue "+names.element()); // last

        // Stack retrival methods
        System.out.println("Stack peek"+ names.peek());
        System.out.println("Stack first peek "+ names.peekFirst());
        System.out.println("Stack last peek "+ names.peekLast());

        // Iterators

        Iterator<String> a =  names.iterator();
        while (a.hasNext()) {
            String t= a.next();
            System.out.println(t);
//            if(t.equals("Sam")) {
//                a.remove();
//            }
        }

        for (String t : names) {
            System.out.println(t);
//            if(t.equals("Sam")) {
//                a.remove();
//            }
        }
        names.removeIf(t -> t.equals("Sam"));


        // list Iterator

        ListIterator<String> b = names.listIterator(0); // If you put nothing then you will get iterator at starting
        while (b.hasNext()){
            String name = b.next();
            if(name.equals("Sooraj")) {
                b.add("Nitish");
                b.previous(); // this will go back
            }
            System.out.println("list iterator "+ name);
        }
        while (b.hasPrevious()){
            String name = b.previous();
            System.out.println("list iterator previous "+ name);
        }
        System.out.println("list iterator "+names); // Sooraj, Nitish, Shashi, Ram, Pam, sham, Shankar, Shashi kiran

        // Remove elements
        names.remove(); // Shashi, Sam, Ram, Pam, sham, Sam, Shankar, Shashi kiran -> removes first element
        names.remove("Sam"); // Shashi, Ram, Pam, sham, Sam, Shankar, Shashi kiran -> removes only one element
        names.remove(0); // Ram, Pam, sham, Sam, Shankar, Shashi kiran

//        names.removeFirst(); removes first element
//        names.removeLast(); removes last element

        String temp = names.poll();
        System.out.println("temp = " + temp); // Ram removes and printed

        names.pollFirst(); // removes first element
        names.pollLast(); // removes last element -> sham, Sam, Shankar

        // Stack methods to remove
        names.pop(); // Sam, Shankar -> removes first element


//





        System.out.println(names);

    }
}
