
Feature: Feature is to test T_Shirt purchasing

  Scenario: Purchase a T_Shirt
    Given Check Browser is open and user is loggedin
    And User click on T_Shirt tab
    And User will hover over T_Shirt item and will click Quick View button
    When User clicks on Add_TO_Cart button
    And Clicks on proceed to checkout button
    And Agree the term and conditions and click on proceed to checkout
    Then Selects the payment method
    And Clicks I confirm my order and back to my orders
