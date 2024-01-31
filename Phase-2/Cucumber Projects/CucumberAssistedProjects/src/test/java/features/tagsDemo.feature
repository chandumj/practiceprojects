@all
Feature: Testing Ninjademo login page

  @homepage @sanity
  Scenario: User should open NinjaDemo login page on ChromeBrowser and get title of the page
    Given User is on Chrome browser
    When User is on Chrome browser users enters the URL
    Then User gets title of the page
    And user closes the browser

  @search @regression
  Scenario: User should search for a product in the hoempage
    Given User is on Chrome browser
    When User is on Chrome browser users enters the URL
    And User will enter a product in search box
    And user click on submit button
    Then product list should be displayed
    And user closes the browser

  @cart
  Scenario: User Click on Add to Cart link
    Given User is on Chrome browser
    When User is on Chrome browser users enters the URL
    And user click on Addto cart link
    Then user is navigated to Cart page
    And user closes the browser
