package com.gilpratte.poker;

import lombok.Data;

@Data
public class Card {
    private final Rank rank;
    private final Suit suit;
}
