package org.example.week3.assignment;

public class Employee {
    private int id;
    private Name name;
    private Address address;
    private Date hireDate;

    public Employee(int id, Name name, Address address, Date hireDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hireDate = hireDate;
    }

    public String toString() {
        return "Employee ID: " + id + "\nName: " + name + "\nAddress: " + address + "\nHire Date: " + hireDate;
    }
}