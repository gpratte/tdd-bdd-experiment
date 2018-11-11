Feature: High Card Wins
  Does the hand with the higher card win?

  Scenario Outline: This hand beats that hand
    Given <winner> versus <loser>
    When I ask whether which hands wins
    Then I should be told <answer>

  Examples:
    | winner      | loser       | answer
    | AsKs4h3d2c  | AsQs4h3d2c  | first hand beats second hand
    | Jc10c8h5s2d | 9s8s7s5h3d  | first hand beats second hand

#  Scenario: AQ loses to AK
#    Given "AsQs4h3d2c" versus "AsKs4h3d2c"
#    When I ask whether which hands wins
#    Then I should be told "second hand beats first hand"
#
#  Scenario: Equivalent high hands tie
#    Given "AcKd4h3s2c" versus "AsKs4h3d2c"
#    When I ask whether which hands wins
#    Then I should be told "first hand ties second hand"
