
Feature: Feature is to test login functionality

  Background: 
    Given Check Browser is open
    And User is on Automamationpractice page
    When User clicks on signin button
    Then System will be navigated to the Automation home page

  Scenario: Check sucessful login with valid credentials
    Given User enters valid <username> and <password>
    When Clicks on login button
    Then User will be redirected to the home page

  Scenario: Check unsucessful login with invalid credentials
    Given User enters invalid <username> and <password>
    When Clicks on login button
    Then System will show an error

  Scenario: Check unsucessful login with only valid password
    Given User enters valid <password>
    When Clicks on login button
    Then System will show an error

  Scenario: Check unsucessful login with only valid username
    Given User enters valid <username>
    When Clicks on login button
    Then System will show an error
    
    Scenario Outline: Check unsucessful login without username and password
    Given Username and password fields are empty
    When Clicks on login button
    Then System will show an error

    Examples: 
      | username                    | password  |
      | muhammad.junaid50@gmail.com | 012345678 |
