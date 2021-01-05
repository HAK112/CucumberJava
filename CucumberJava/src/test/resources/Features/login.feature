@UIScenario
Feature: Feature to test Login Functionality

  @UITest
  Scenario: Check Login is succcessfull with Valid Credentials
    Given user is on login page
    When users enter username and password
    And clicks on Login button
    Then user is navigated to home page
