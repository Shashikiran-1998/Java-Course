package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class comparableComparater {

    public static void main(String[] args) {
        Student[] s = {new Student(0,0,"ZAsdd"),new Student(0,0,"Assdd")};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s)); // sorted
        testComparator t=new testComparator();
        Arrays.sort(s,t.reversed());
        // Implementation of comparator with anonymous class
        Arrays.sort(s,new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        // using lambdas comparator class
        Arrays.sort(s, (o1, o2) -> o1.name.compareTo(o2.name));

        // using Comparator Interface
        Arrays.sort(s, Comparator.comparing(o -> o.name));


    }
}

class testComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}
class Student implements Comparable<Student> {

    Student(int id,double gpa,String name) {
       this.id=id;
       this.gpa = gpa;
       this.name = name;
    }
    int id;
    double gpa;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       return this.name.compareTo(o.name);
    }
}
