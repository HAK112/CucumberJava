@SanityScenario
Feature: Feature to test Google Search Functionality

  @SanityTest
  Scenario: Validate Google Search is working
    Given browser is open
    And user is on google search page
    When user enters text in text box
    And hits enter
    Then user is navigated to search results
