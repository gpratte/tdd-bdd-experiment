package com.gilpratte.poker;


import org.junit.Assert;
import org.junit.Test;

public class HandTest {

    @Test
    public void testCompareHighCardHand1Wins() {

        String winner = "As, Ks, 4h, 3d, 2c";
        Hand winningHand = new Hand();
        Card card = new Card(Rank.TWO, Suit.CLUBS);
        winningHand.addCard(card);
        card = new Card(Rank.THREE, Suit.DIAMONDS);
        winningHand.addCard(card);
        card = new Card(Rank.FOUR, Suit.HEARTS);
        winningHand.addCard(card);
        card = new Card(Rank.KING, Suit.SPADES);
        winningHand.addCard(card);
        card = new Card(Rank.ACE, Suit.SPADES);
        winningHand.addCard(card);

        String loser = "As, Qs, 4h, 3d, 2c";
        Hand losingHand = new Hand();
        card = new Card(Rank.TWO, Suit.CLUBS);
        losingHand.addCard(card);
        card = new Card(Rank.THREE, Suit.DIAMONDS);
        losingHand.addCard(card);
        card = new Card(Rank.FOUR, Suit.HEARTS);
        losingHand.addCard(card);
        card = new Card(Rank.QUEEN, Suit.SPADES);
        losingHand.addCard(card);
        card = new Card(Rank.ACE, Suit.SPADES);
        losingHand.addCard(card);

        Assert.assertTrue(winner + " should beat " + loser, winningHand.compareTo(losingHand) > 0);

    }
    @Test
    public void testCompareHighCardHand2Wins() {

        String winner = "As, Ks, 4h, 3d, 2c";
        Hand winningHand = new Hand();
        Card card = new Card(Rank.TWO, Suit.CLUBS);
        winningHand.addCard(card);
        card = new Card(Rank.THREE, Suit.DIAMONDS);
        winningHand.addCard(card);
        card = new Card(Rank.FOUR, Suit.HEARTS);
        winningHand.addCard(card);
        card = new Card(Rank.KING, Suit.SPADES);
        winningHand.addCard(card);
        card = new Card(Rank.ACE, Suit.SPADES);
        winningHand.addCard(card);

        String loser = "As, Qs, 4h, 3d, 2c";
        Hand losingHand = new Hand();
        card = new Card(Rank.TWO, Suit.CLUBS);
        losingHand.addCard(card);
        card = new Card(Rank.THREE, Suit.DIAMONDS);
        losingHand.addCard(card);
        card = new Card(Rank.FOUR, Suit.HEARTS);
        losingHand.addCard(card);
        card = new Card(Rank.QUEEN, Suit.SPADES);
        losingHand.addCard(card);
        card = new Card(Rank.ACE, Suit.SPADES);
        losingHand.addCard(card);

        Assert.assertTrue(loser + " should lose to " + winner, losingHand.compareTo(winningHand) < 0);

    }


}