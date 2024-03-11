package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee12 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee12(int id, String name, String department, String designation) {
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
        Employee12 employee = (Employee12) obj;
        return id == employee.id;
    }
}

public class D06P12 {
    public static void main(String[] args) {
        // Predefined staff members
        Employee12 staff1 = new Employee12(1001, "Daniel", "L&D", "Analyst");
        Employee12 staff2 = new Employee12(1002, "Thomas", "Testing", "Tester");
        Employee12 staff3 = new Employee12(1003, "Robert", "Development", "Product Manager");
        Employee12 staff4 = new Employee12(1004, "Grace", "Tech Support", "");
        Hashtable<Integer, Employee12> staffTable = new Hashtable<>();
        staffTable.put(staff1.getId(), staff1);
        staffTable.put(staff2.getId(), staff2);
        staffTable.put(staff3.getId(), staff3);
        staffTable.put(staff4.getId(), staff4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new staff member details in the format: id name designation department");
        String input = scanner.nextLine();
        scanner.close();
        String[] parts = input.split(" ");
        int newId = Integer.parseInt(parts[0]);
        if (!staffTable.containsKey(newId)) {
            String newName = parts[1];
            String newDesignation = parts[2];
            String newDepartment = parts[3];
            Employee12 newStaffMember = new Employee12(newId, newName, newDepartment, newDesignation);
            staffTable.put(newId, newStaffMember);
            System.out.println("Staff member added successfully.");
        } else {
            System.out.println("Staff member with the given id already exists.");
        }

        System.out.println("Current Staff Members:");
        for (Employee12 staff : staffTable.values()) {
            System.out.println(staff);
        }
    }
}