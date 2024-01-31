# Demo of Data table
# Data table is created under the steps which needs the data
# there is no place holder in this case
# no Examples keyword
Feature: Test the WikiPage Login on ChromeBrowser
 Scenario: Test Creation of Account on WikiPage
 
   Given User enter following details
     | user1 | password1 | password1 | email@gmail.com |
     | user2 | password2 | password1 | email@gmail.com |
     | user3 | password3 | password1 | email@gmail.com |
     | user4 | password4 | password1 | email@gmail.com |
     | user5 | password5 | password1 | email@gmail.com |
     | user6 | password6 | password1 | email@gmail.com |
     | user7 | password7 | password1 | email@gmail.com |
     | user8 | password8 | password1 | email@gmail.com |
   Then user clicks on Create account