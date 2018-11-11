package com.gilpratte.poker;

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

    @Given("(.*) versus (.*)$")
    public void versus(String arg1, String arg2)  {

        System.out.println("arg1 " + arg1);
        hand1 = new Hand(arg1);
        System.out.println("hand1 " + hand1);

        hand2 = new Hand(arg2);
        System.out.println("hand2 " + hand2);
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

    @Then("^I should be told (.*)$")
    public void i_should_be_told(String expectedAnswer) {
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

}
