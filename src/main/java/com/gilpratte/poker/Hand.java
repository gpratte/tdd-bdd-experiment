package com.gilpratte.poker;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A 5 card poker hand
 */
@Data
public class Hand implements Comparable<Hand> {
    List<Card> cards;

    public void addCard(Card card) {
        if (cards == null) {
            cards = new ArrayList<>();
        }
        cards.add(card);
    }

    @Override
    public int compareTo(Hand o) {
        return 1;
    }

}
