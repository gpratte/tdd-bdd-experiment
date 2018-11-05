package com.gilpratte.poker;

public enum Rank {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"),
    NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    private String value;

    Rank(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Rank from(String rank) {
        switch (rank) {
            case "A":
                return ACE;
            case "K":
                return KING;
            case "Q":
                return QUEEN;
            case "J":
                return JACK;
            case "10":
                return TEN;
            case "9":
                return NINE;
            case "8":
                return EIGHT;
            case "7":
                return SEVEN;
            case "6":
                return SIX;
            case "5":
                return FIVE;
            case "4":
                return FOUR;
            case "3":
                return THREE;
            case "2":
                return TWO;
            default:
                throw new IllegalArgumentException("Unknown rank " + rank);
        }
    }
}
