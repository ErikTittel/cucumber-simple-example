Feature: Withdraw money from the ATM

  In order to by beer
  I as a citizen in credit
  want to withdraw cash from the ATM

  AK: should work!!!

  Scenario: Successful withdrawal from an account in credit
    Given my account has been credited with 100 Euro.
    When I withdraw 20 Euro.
    Then the balance of my account should be 80 Euro.