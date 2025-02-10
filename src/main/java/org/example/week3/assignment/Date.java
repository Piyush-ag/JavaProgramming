package org.example.week3.assignment;

public class Date {
    private int month, day, year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}