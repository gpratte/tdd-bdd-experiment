Feature: High Card Wins
  Does the hand with the higher card win?

  Scenario: AK beats AQ
    Given As, Ks, 4h, 3d, 2c versus As, Qs, 4h, 3d, 2c
    When I ask whether which hands wins
    Then I should be told K beats Q
