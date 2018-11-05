Feature: High Card Wins
  Does the hand with the higher card win?

  Scenario: AK beats AQ
    Given "AsKs4h3d2c" versus "AsQs4h3d2c"
    When I ask whether which hands wins
    Then I should be told "first hand beats second hand"

  Scenario: AQ loses to AK
    Given "AsQs4h3d2c" versus "AsKs4h3d2c"
    When I ask whether which hands wins
    Then I should be told "second hand beats first hand"

  Scenario: Equivalent high hands tie
    Given "AcKd4h3s2c" versus "AsKs4h3d2c"
    When I ask whether which hands wins
    Then I should be told "first hand ties second hand"
