package org.example.week2.project;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            Deck deck = new Deck();
            Hand playerHand = new Hand();
            Hand dealerHand = new Hand();

            // Initial cards
            playerHand.addCard(deck.drawCard());
            playerHand.addCard(deck.drawCard());

            dealerHand.addCard(deck.drawCard());
            dealerHand.addCard(deck.drawCard());

            System.out.println("Your hand: " + playerHand);
            System.out.println("Dealer's first card: " + dealerHand.toString().split(",")[0] + "]");

            // Player Turn
            while (playerHand.getTotalValue() < 21) {
                System.out.print("Do you want to (h)it or (s)tay? ");
                String choice = scanner.nextLine().toLowerCase();
                if (choice.equals("hit") || choice.equals("h")) {
                    playerHand.addCard(deck.drawCard());
                    System.out.println("Your hand: " + playerHand);
                } else {
                    break;
                }
            }

            // Dealer Turn
            if (playerHand.getTotalValue() <= 21) {
                System.out.println("Dealer's hand: " + dealerHand);
                while (dealerHand.getTotalValue() < 17) {
                    dealerHand.addCard(deck.drawCard());
                    System.out.println("Dealer draws... " + dealerHand);
                }
            }

            // Determine Winner
            int playerTotal = playerHand.getTotalValue();
            int dealerTotal = dealerHand.getTotalValue();

            if (playerTotal > 21) {
                System.out.println("You busted! Dealer wins.");
            } else if (dealerTotal > 21) {
                System.out.println("Dealer busted! You win.");
            } else if (playerTotal > dealerTotal) {
                System.out.println("You win!");
            } else if (playerTotal < dealerTotal) {
                System.out.println("Dealer wins.");
            } else {
                System.out.println("It's a tie!");
            }

            // Replay?
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}