package com.gilpratte.poker;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    private static final String HAND1_BEATS_HAND2 = "first hand beats second hand";
    private static final String HAND1_TIES_HAND2 = "first hand ties second hand";
    private static final String HAND2_BEATS_HAND1 = "second hand beats first hand";

    private Hand hand1;
    private Hand hand2;
    private String actualAnswer;

    @Given("^AsKs(\\d+)h(\\d+)d(\\d+)c versus AsQs(\\d+)h(\\d+)d(\\d+)c$")
    public void asks_h_d_c_versus_AsQs_h_d_c(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {

        System.out.println("!!! arg1 " + arg1);

        hand1 = new Hand();
        Card card = new Card(Rank.TWO, Suit.CLUBS);
        hand1.addCard(card);
        card = new Card(Rank.THREE, Suit.DIAMONDS);
        hand1.addCard(card);
        card = new Card(Rank.FOUR, Suit.HEARTS);
        hand1.addCard(card);
        card = new Card(Rank.KING, Suit.SPADES);
        hand1.addCard(card);
        card = new Card(Rank.ACE, Suit.SPADES);
        hand1.addCard(card);

        hand2 = new Hand();
        card = new Card(Rank.TWO, Suit.CLUBS);
        hand2.addCard(card);
        card = new Card(Rank.THREE, Suit.DIAMONDS);
        hand2.addCard(card);
        card = new Card(Rank.FOUR, Suit.HEARTS);
        hand2.addCard(card);
        card = new Card(Rank.QUEEN, Suit.SPADES);
        hand2.addCard(card);
        card = new Card(Rank.ACE, Suit.SPADES);
        hand2.addCard(card);
    }

    @When("^I ask whether which hands wins$")
    public void i_ask_whether_which_hands_wins() {
        int comparison = hand1.compareTo(hand2);
        if (comparison < 0) {
            actualAnswer = HAND2_BEATS_HAND1;
        } else if (comparison == 0) {
            actualAnswer = HAND1_TIES_HAND2;
        } else {
            actualAnswer = HAND1_BEATS_HAND2;
        }
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }


}
