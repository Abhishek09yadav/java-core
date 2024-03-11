package com.learning.core.day6;
import java.util.Hashtable;

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee1> employeeTable = new Hashtable<>();
        Employee1 emp1 = new Employee1(101, "John Doe", "IT", "Software Engineer");
        Employee1 emp2 = new Employee1(102, "Jane Smith", "HR", "HR Manager");
        Employee1 emp3 = new Employee1(103, "Alice Johnson", "Finance", "Accountant");
        Employee1 emp4 = new Employee1(104, "Bob Brown", "Sales", "Sales Executive");
        employeeTable.put(emp1.hashCode(),emp1);
        employeeTable.put(emp2.hashCode(), emp2);
        employeeTable.put(emp3.hashCode(), emp3);
        employeeTable.put(emp4.hashCode(), emp4);
        boolean isEmpty = employeeTable.isEmpty();

        System.out.println("Is the HashTable empty? " + isEmpty);

        int searchId = 1003;
        Employee1 searchedEmployee = employeeTable.get(searchId);
        if (searchedEmployee != null) {
            System.out.println(searchedEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}

class Employee1 {
    private int id;
    private String name;
    private String department;
    private String designation;

    // Constructor
    public Employee1(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation + "]";
    }
    @Override
    public int hashCode() {
        return id; // Using employee ID as the hash code
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 otherEmployee = (Employee1) obj;
        return id == otherEmployee.id;

    }


}