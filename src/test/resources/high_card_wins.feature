Feature: High Card Wins
  Does the hand with the higher card win?

  Scenario Outline: This hand beats that hand
    Given <winner> versus <loser>
    When I ask whether which hands wins
    Then I should be told <answer>

    Examples:
      | winner      | loser      | answer                       |
      | AsKs4h3d2c  | AsQs4h3d2c | first hand beats second hand |
      | Jc10c8h5s2d | 9s8s7s5h3d | first hand beats second hand |
      | AsQs4h3d2c  | AsKs4h3d2c | second hand beats first hand |
      | AcKd4h3s2c  | AsKs4h3d2c | first hand ties second hand  |
