package Basics.Objects;

import java.util.Objects;

public class User {

    private int id= 0;
    private String name;
    private int age;
    private double salary;
    private boolean isAbove18 ;

    public User(){
        // default constructor

        this(0,"NA",0,0,false);
        // This will call another constructor
    }

    public User(int id, String name, int age, double salary, boolean isAbove18) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isAbove18 = isAbove18;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAbove18() {
        return isAbove18;
    }

    public void setAbove18(boolean above18) {
        isAbove18 = above18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Double.compare(user.salary, salary) == 0 && isAbove18 == user.isAbove18 && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary, isAbove18);
    }
}
