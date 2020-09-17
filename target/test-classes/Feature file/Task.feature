Feature: Add Customer Steps

  Scenario: Add Customer steps registration
   Given User clicks on add customer
    When User fills all the details
    And user clicks on submit
    Then User validates the user id
