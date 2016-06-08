Feature: As a customer
  I want to withdraw money from my account

  Scenario: 
    Given I have 10000 in my account
    And there is 20000 in ATM dispenser
    When I withdraw 5000
    Then my account balance must be 5000
    And ATM Dispenser balance must be 15000
