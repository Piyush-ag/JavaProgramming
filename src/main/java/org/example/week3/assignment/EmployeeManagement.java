package org.example.week3.assignment;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = input.nextInt();
        input.nextLine(); // Clear buffer

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            // Get Employee ID
            System.out.print("Enter Employee ID: ");
            int id = input.nextInt();
            input.nextLine(); // Clear buffer

            // Get Name
            System.out.print("Enter First Name: ");
            String firstName = input.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = input.nextLine();
            Name name = new Name(firstName, lastName);

            // Get Address
            System.out.print("Enter Street: ");
            String street = input.nextLine();
            System.out.print("Enter City: ");
            String city = input.nextLine();
            System.out.print("Enter State: ");
            String state = input.nextLine();
            System.out.print("Enter Zip Code: ");
            String zip = input.nextLine();
            Address address = new Address(street, city, state, zip);

            // Get Hire Date
            System.out.print("Enter Hire Date (Month Day Year): ");
            int month = input.nextInt();
            int day = input.nextInt();
            int year = input.nextInt();
            input.nextLine(); // Clear buffer
            Date hireDate = new Date(month, day, year);

            // Create Employee
            employees[i] = new Employee(id, name, address, hireDate);
        }

        // Display Employees
        System.out.println("\nEmployee Details:");
        displayEmployees(employees);

        input.close();
    }

    public static void displayEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println("\n--------------------");
            System.out.println(emp);
        }
    }
}