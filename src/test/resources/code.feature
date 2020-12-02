@tag
Feature: facebook application

  @tag1
  Scenario: login facebook
    Given user launches browser
    When enter the email and pass
    And user hits login btn
    Then user navigate home page
