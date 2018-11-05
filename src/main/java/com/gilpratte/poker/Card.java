package com.gilpratte.poker;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;

    @Override
    public int compareTo(Card other) {
        return rank.compareTo(other.rank) * -1;
    }
}
