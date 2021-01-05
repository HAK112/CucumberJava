@SmokeScenario
Feature: Feature to test Automation Practice Login Functionality

  @SmokeTest
  Scenario Outline: Check Login is succcessfull with Valid Credentials
    Given browser is open
    And user clicks on Signin button
    When user enter <username> and <password>
    And user clicks on Login button
    Then user is navigated to account page

    Examples: 
      | username        | password  |
      | tester@test.com | tester123 |