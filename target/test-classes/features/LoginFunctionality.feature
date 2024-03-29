Feature: Login Functionality
  As a user of the e-commerce website
  I want to be able to log in to my account
  So that I can access personalized features and make purchases
  Scenario: Login steps
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the home page


