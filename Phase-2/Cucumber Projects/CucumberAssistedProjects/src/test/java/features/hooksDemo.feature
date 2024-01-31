Feature: Test the WikiPage Login on ChromeBrowser

  Scenario: Test Creation of Account on WikiPage
    Given User is on the MainPage,get title of the page
    When User will enter username,password
    Then User will enter emial id & retype password
    Then user will click on Create account button

  Scenario: Test user is able to loginto the WikiPage
    Given User is on the MainPage,get title of the page
    When User clicks on login link
    And User will enter username and password
    Then User will click login button
