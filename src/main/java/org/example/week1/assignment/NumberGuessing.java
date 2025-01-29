package org.example.week1.assignment;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of tries: ");
        int maxTries = scanner.nextInt();
        int randomNumber = 1 + (int) (10 * Math.random());
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < maxTries) {
            System.out.print("Please enter your guess (1-10): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congrats! You've guessed the number in " + attempts + " tries.");
                guessedCorrectly = true;
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Sorry.. your guess is too low. You have " + (maxTries-attempts)+ " left.");
            } else {
                System.out.println("Sorry.. your guess is too high. You have " + (maxTries-attempts)+ " left.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("The correct number is: " + randomNumber);
        }

        scanner.close();
    }
}
