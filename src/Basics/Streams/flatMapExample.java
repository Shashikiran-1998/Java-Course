package Basics.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapExample {

    public static void main(String[] args) {

        Employee john = new Employee("John",23);
        Employee Sneha = new Employee("Sneha",25);
        Employee Savish = new Employee("Savish",27);
        Employee neha = new Employee("neha",32);

        Department hr = new Department("HR", Arrays.asList(john,Sneha));
        Department accounting = new Department("Accounting", Arrays.asList(Savish,neha));

        Stream.of(hr,accounting).flatMap((e)-> e.getEmployeeList().stream()).
                filter(e -> e.getAge() > 25).map(Employee::getName).forEach(System.out::println);

        List<String> a = Stream.of(hr,accounting).flatMap((e)-> e.getEmployeeList().stream()).
                filter(e -> e.getAge() > 25).map(Employee::getName).collect(Collectors.toList());

        Stream.of(hr,accounting).flatMap((e)-> e.getEmployeeList().stream()).
                filter(e -> e.getAge() > 25).map(Employee::getName).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        // ArrayList is created for all eleemnt -> then added for each element -> merge all arraylist

       Map<Integer,List<Employee>> sd = Stream.of(hr,accounting).flatMap((e)-> e.getEmployeeList().stream()).collect(Collectors.groupingBy(Employee::getAge));
       System.out.println(sd);

    }
}
