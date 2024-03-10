package com.learning.core.day5;

import java.util.*;

class Person1 implements Comparable<Person1> {
    int id;
    private String name;
    private int age;
    private double salary;

    public Person1(int id, String name, int age, double salary) {
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

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + "', age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person1 person = (Person1) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person1 other) {
        return Integer.compare(this.id, other.id);
    }
}
public class D05P06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Person1> personSet = new TreeSet<>();

        // Taking input for 6 persons
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for person " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            personSet.add(new Person1(id, name, age, salary));
        }

        // Printing details of persons whose age is greater than 25
        System.out.println("Persons whose age is greater than 25:");
        for (Person1 person : personSet) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}