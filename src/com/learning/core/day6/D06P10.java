package com.learning.core.day6;
import java.util.Hashtable;

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
        Employee emp1 = new Employee(101, "John Doe", "IT", "Software Engineer");
        Employee emp2 = new Employee(102, "Jane Smith", "HR", "HR Manager");
        Employee emp3 = new Employee(103, "Alice Johnson", "Finance", "Accountant");
        Employee emp4 = new Employee(104, "Bob Brown", "Sales", "Sales Executive");
        employeeTable.put(emp1.hashCode(),emp1);
        employeeTable.put(emp2.hashCode(), emp2);
        employeeTable.put(emp3.hashCode(), emp3);
        employeeTable.put(emp4.hashCode(), emp4);
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println("Is the HashTable empty? " + isEmpty);
    }
}
class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    // Constructor
    public Employee(int id, String name, String department, String designation) {
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
        Employee otherEmployee = (Employee) obj;
        return id == otherEmployee.id;
    }


}