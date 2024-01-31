Feature: Test the WikiPage Login on ChromeBrowser
 Scenario Outline: Test Creation of Account on WikiPage
   Given User is on the MainPage,get title of the page
   When User will enter '<username>','<password>'
   Then User will enter '<retype>' and '<email>'
   Then user will click on Create account button
   Examples:
     | username | password  | retype    | email           |
     | user1    | password1 | password1 | email@gmail.com |
