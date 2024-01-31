# Use '#' to write a comment in the feature file
# comments can be used to describe about the feature
# We can use commands to write who author of this feature file
# we use commnets to write about extra information on testing of this feature
# Any comments will not be exeucted.
# Feature file is case sensistive
# A feature file always starts with the keyword Feature:
# Inside a feature we have scenario like a Test scenrio
# Every scenrio includes Test steps
# Tets steps are written using Gherkin
# Gherkin - semiformal language
# 5 keywords: Given, When, Then, And, But
# Testers can use any keyword for writing the fetaure file
# however few guideline:
# Given : for Assumptions like user opened Chrome browse ror URL
# use When : when user want to perform an action
# use Then : when you want to write output/result
# And & But : To add more situations/conditions
Feature: Testing Ninjademo login page

  Scenario: User should open NinjaDemo login page on ChromeBrowser and get title of the page
    Given User is on Chrome browser
    When User is on Chrome browser users enters the URL
    Then User gets title of the page
    And user closes the browser
