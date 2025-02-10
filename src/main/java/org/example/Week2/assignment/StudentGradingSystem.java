package org.example.week2.assignment;

import java.util.Scanner;

public class StudentGradingSystem {

    // Method to calculate the letter grade
    public static char getLetterGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    // Method to calculate the student's average (rounded to two decimal places)
    public static double getStudentAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double avg = (double) sum / grades.length;
        return Math.round(avg * 100.0) / 100.0; // Round to two decimal places
    }

    // Method to display grades
    public static void displayGrades(int[][] grades) {
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate and display the class average (rounded to two decimal places)
    public static double getClassAverage(int[][] grades) {
        double totalSum = 0;
        int totalGrades = 0;

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                totalSum += grade;
                totalGrades++;
            }
        }

        double avg = totalSum / totalGrades;
        return Math.round(avg * 100.0) / 100.0; // Round to two decimal places
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Get number of grades per student
        System.out.print("Enter the number of grades per student: ");
        int numGrades = scanner.nextInt();

        // Declare 2D array to store grades
        int[][] grades = new int[numStudents][numGrades];

        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ": ");
            for (int j = 0; j < numGrades; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }

        // Display grades
        displayGrades(grades);

        // Calculate and display student averages and letter grades
        System.out.println("\nStudent Averages and Letter Grades:");
        for (int i = 0; i < numStudents; i++) {
            double studentAvg = getStudentAverage(grades[i]);
            char letterGrade = getLetterGrade(studentAvg);
            System.out.println("Student " + (i + 1) + " - Average: " + studentAvg + " - Grade: " + letterGrade);
        }

        // Calculate and display class average
        double classAverage = getClassAverage(grades);
        System.out.println("\nClass Average: " + classAverage);

        scanner.close();
    }
}