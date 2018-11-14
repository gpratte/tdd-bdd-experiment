package com.gilpratte.poker;


import org.javatuples.Triplet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HandTest {

    List<Triplet<String, String, Integer>> scenarios;

    @Before
    public void setUp() {
        scenarios = new ArrayList<>();

        Triplet<String, String, Integer> scenario = Triplet.with("AsKs4h3d2c", "AsQs4h3d2c", 1);
        scenarios.add(scenario);

        scenario = Triplet.with("AsQs4h3d2c", "AsKs4h3d2c", -1);
        scenarios.add(scenario);

        scenario = Triplet.with("AsKs4h3d2c", "AsKs4h3d2c", 0);
        scenarios.add(scenario);
    }

    /*
     * Test scenarios
     */
    @Test
    public void testScenarios() {
        for(Triplet<String, String, Integer> scenario : scenarios) {
            // Arrange
            Hand hand1 = new Hand(scenario.getValue0());
            Hand hand2 = new Hand(scenario.getValue1());

            int expected = scenario.getValue2();

            // Act
            int actual = hand1.compareTo(hand2);
            System.out.println("actual " + actual);

            // Assert
            Assert.assertEquals(expected, actual);
        }
    }


}