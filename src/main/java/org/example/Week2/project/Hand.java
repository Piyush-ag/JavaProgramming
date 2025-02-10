package org.example.week2.project;

import java.util.ArrayList;
import java.util.List;

class Hand {
    private List<Card> cards;
    private int totalValue;
    private int aceCount;

    public Hand() {
        cards = new ArrayList<>();
        totalValue = 0;
        aceCount = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
        totalValue += card.getValue();
        if (card.getValue() == 11) {
            aceCount++;
        }
        adjustForAces();
    }

    private void adjustForAces() {
        while (totalValue > 21 && aceCount > 0) {
            totalValue -= 10;
            aceCount--;
        }
    }

    public int getTotalValue() {
        return totalValue;
    }

    public String toString() {
        return cards.toString();
    }
}