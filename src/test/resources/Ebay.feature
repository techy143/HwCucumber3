Feature: Login feature

  Scenario: Login with valid credentials

    Given I navigate to www.ebay.com
    And I click on login button
    When I enter UserID and Password
    Then I should go to home page
    #And I close the browser

  Scenario: Login with invalid credentials

    Given I navigate to www.ebay.com
    And I click on login button
    When I enter wrong UserID and Password
    Then I should see the error message
    And I close the browser
