package com.gilpratte.poker;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A 5 card poker hand
 */
@Data
public class Hand {
    List<Card> cards;

    public void addCard(Card card) {
        if (cards == null) {
            cards = new ArrayList<>();
        }
        cards.add(card);
    }

}
