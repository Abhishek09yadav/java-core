package com.learning.core.day4;


public class D04P03 {
    public static void main(String[] args) {
        // Example usage
        Validator validator = new Validator();
        try {
            Applicant applicant1 = new Applicant("John Doe", "Probationary Officer", 25);
            validator.validate(applicant1);
            System.out.println("Applicant 1 details are valid");

            Applicant applicant2 = new Applicant("", "Manager", 35);
            validator.validate(applicant2);
            System.out.println("Applicant 2 details are valid");
        } catch (CatheyBankException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}