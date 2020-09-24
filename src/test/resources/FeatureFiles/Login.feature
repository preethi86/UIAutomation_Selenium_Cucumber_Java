Feature: Login
  Background:
    Given user is on the Home Page "http://appymonk.com" of AppyMonk Website
    When user clicks on the signin button
  Then Login page should display with the text "LOGIN"

  @regression @smoke
  Scenario: Verification of Login Function
    # Given user on the Login Page
    And user enters the credentials username as "admin" and password as "admin123"
   When user click login button
   #Then user should see his details