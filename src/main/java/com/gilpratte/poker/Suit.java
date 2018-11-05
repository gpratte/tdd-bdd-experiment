package com.gilpratte.poker;

public enum Suit {
    CLUBS("c"), DIAMONDS("d"), HEARTS("h"), SPADES("s");

    private String value;

    Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Suit from(String suit) {
        switch (suit) {
            case "c":
                return CLUBS;
            case "d":
                return DIAMONDS;
            case "h":
                return HEARTS;
            case "s":
                return SPADES;
            default:
                throw new IllegalArgumentException("Unknown suit " + suit);
        }
    }
}