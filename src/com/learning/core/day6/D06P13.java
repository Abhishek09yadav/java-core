package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee13 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee13(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee13 employee = (Employee13) obj;
        return id == employee.id;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        // Create a HashTable to store employee details
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information for 4 employees
        Employee emp1 = new Employee(1001, "John", "Engineering", "Software Engineer");
        Employee emp2 = new Employee(1002, "Jane", "HR", "HR Manager");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Alice", "Finance", "Financial Analyst");

        // Add employees to the HashTable
        employeeTable.put(emp1.hashCode(), emp1);
        employeeTable.put(emp2.hashCode(), emp2);
        employeeTable.put(emp3.hashCode(), emp3);
        employeeTable.put(emp4.hashCode(), emp4);

        // Additional employees (if not already exists)
        Employee newEmp1 = new Employee(1005, "Charles", "Testing", "QA Lead");
        Employee newEmp2 = new Employee(1006, "L&D", "Learning & Development", "");

        // Check if employees already exist
        if (!employeeTable.containsKey(newEmp1.hashCode())) {
            employeeTable.put(newEmp1.hashCode(), newEmp1);
        }
        if (!employeeTable.containsKey(newEmp2.hashCode())) {
            employeeTable.put(newEmp2.hashCode(), newEmp2);
        }

        // Display all employees
        for (Employee emp : employeeTable.values()) {
            System.out.println(emp);
        }

        // Get the number of keys in the HashTable
        int numKeys = employeeTable.size();
        System.out.println("\nNumber of keys in the HashTable: " + numKeys);
    }
}