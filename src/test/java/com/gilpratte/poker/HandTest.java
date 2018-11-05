package com.gilpratte.poker;


import org.junit.Assert;
import org.junit.Test;

public class HandTest {

    /*
     * Test hand 1 beats hand 2 high card
     */
    @Test
    public void testH1BeatsH2HighCard() {

        String winner = "2cAsKs4h3d";
        Hand winningHand = new Hand(winner);

        String loser = "4h3dAsQs2c";
        Hand losingHand = new Hand(loser);

        Assert.assertTrue(winner + " should beat " + loser, winningHand.compareTo(losingHand) > 0);

    }

    /*
     * Test hand 1 loses to hand 2 high card
     */
    @Test
    public void testH1LosesToH2HighCard() {

        String winner = "AsKs4h3d2c";
        Hand winningHand = new Hand(winner);

        String loser = "AsQs4h3d2c";
        Hand losingHand = new Hand(loser);

        Assert.assertTrue(loser + " should lose to " + winner, losingHand.compareTo(winningHand) < 0);

    }

    /*
     * Test hand 1 ties hand 2 high card
     */
    @Test
    public void testH1TiesH2HighCard() {

        String hand1 = "AsKs4h3d2c";
        Hand firstHand = new Hand(hand1);

        String hand2 = "AcKd4h3s2c";
        Hand secondHand = new Hand(hand2);

        Assert.assertTrue(hand1 + " should tie " + hand2, firstHand.compareTo(secondHand) == 0);

        Assert.assertTrue(hand2 + " should tie " + hand1, secondHand.compareTo(firstHand) == 0);

    }


}