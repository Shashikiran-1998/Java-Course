package Basics.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamExample {

    public static void main(String[] args) {
        List<String> source = Arrays.asList("A1", "A2",
                "B1", "B3", "B25", "b21",
                "C2", "C12"
        );

        source.stream().map(String::toUpperCase)
                .filter((s) -> s.startsWith("B"))
                .sorted().forEach(System.out::println);
//        ------------------------------
        Stream<String> s1 = Stream.of("A1", "A2",
                "B1", "B3", "B25", "b21",
                "C2", "C12");
        Stream<String> s2 = Stream.of("A1", "A2",
                "B1", "B3", "B25", "b21",
                "C2", "C12","N10");

        Stream<String> s = Stream.concat(s1,s2);

        System.out.println(s.distinct().peek(System.out::println).count());
        // foreach is terminating method but peak returns what it has input

    }
}