package com.gilpratte.poker;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A 5 card poker hand
 */
@Data
public class Hand implements Comparable<Hand> {
    List<Card> cards = new ArrayList<>();

    public Hand(String cardsAsText) {
        parse(cardsAsText);
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand other) {
        HandType hand1Type = determineHandType(cards);
        HandType hand2Type = determineHandType(other.cards);
        if (hand1Type == hand2Type) {
            switch (hand1Type) {
                case HIGH_CARD:
                    return compareHighCard(cards, other.cards);
            }
        }
        throw new RuntimeException("comparing other than two high card hands not yet implemented");
    }

    private HandType determineHandType(List<Card> cards) {
        return HandType.HIGH_CARD;
    }

    private int compareHighCard(List<Card> cards1, List<Card> cards2) {

        if (cards1 == null || cards2 == null || cards1.size() != cards2.size()) {
            throw new IllegalArgumentException("Cannot compare cards");
        }

        int result = 0;
        for (int i = 0; i < cards1.size(); ++i) {
            result = cards1.get(i).getRank().compareTo(cards2.get(i).getRank());
            if (result != 0) {
                return result;
            }
        }
        return result;
    }

    // Cards as text should have the syntax <rank><suit> with suite lower case.
    // For example 10sJcQsKsAh
    private void parse(String cardsAsText) {

        if (cardsAsText == null) {
            throw new IllegalArgumentException("Hand as a string of characters cannot be null");
        }

        Rank rank = null;
        Suit suit = null;
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < cardsAsText.length(); ++i) {
            current.append(cardsAsText.charAt(i));

            // Get the rank first
            if (rank == null) {
                try {
                    rank = Rank.from(current.toString());
                    current.setLength(0);
                } catch(IllegalArgumentException e) {
                    // do nothing
                }
            } else {
                // Get the suit
                try {
                    suit = Suit.from(current.toString());
                    Card card = new Card(rank, suit);
                    cards.add(card);
                    rank = null;
                    suit = null;
                    current.setLength(0);
                } catch(IllegalArgumentException e) {
                    // do nothing
                }
            }
        }

        if (cards.size() != 5) {
            throw new IllegalArgumentException("Invalid hand " + cards);
        }

    }
}
