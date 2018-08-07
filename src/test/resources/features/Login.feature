Feature: As a user I would like to login to my giftrete page and upload items


  Scenario: Valid Login
    Given I navigate to "https://dev.giftrt.com/"
    And I click on Login "Login"
    When I enter email "tupsyn2000@yahoo.com"
    And I enter password "Testing123"
    And I click on "Secure Sign In"
    Then I should be signed in