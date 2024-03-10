package com.learning.core.day5;
import java.util.TreeSet;

class Person10 implements Comparable<Person10> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person10(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person10 other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person10)) return false;
        Person10 person = (Person10) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    public String getName() {
        return name;
    }
}

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person10> people = new TreeSet<>();
        people.add(new Person10(4, "Jones", 22, 6999.0));
        people.add(new Person10(1, "Alice", 30, 10000.0));
        people.add(new Person10(3, "Bob", 25, 8000.0));
        people.add(new Person10(2, "Charlie", 28, 9500.0));
        people.add(new Person10(6, "Jenny", 24, 7000.0));
        people.add(new Person10(5, "Derek", 35, 12000.0));

        for (Person10 person : people) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
