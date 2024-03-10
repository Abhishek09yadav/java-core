package com.learning.core.day5;

import java.util.TreeSet;

class Person8 implements Comparable<Person8> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person8(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person8 other = (Person8) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person8 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Person8> persons = new TreeSet<>();

        // Add predefined persons
        persons.add(new Person8(5, "John", 35, 1999.0));
        persons.add(new Person8(3, "Popeye", 45, 5999.0));
        persons.add(new Person8(6, "Tom", 30, 3999.0));
        persons.add(new Person8(1, "Jerry", 25, 999.0));
        persons.add(new Person8(4, "Jones", 40, 6999.0));
        persons.add(new Person8(2, "Smith", 50, 2999.0));

        // Print all the names of persons in uppercase
        for (Person8 person : persons) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}