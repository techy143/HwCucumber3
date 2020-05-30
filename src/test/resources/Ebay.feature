Feature: Login feature

  Scenario: Login with valid credentials

    Given I navigate to www.ebay.com
    And I click on login button
    When I enter UserID and Password
    And  I click on login button
    Then I should go to home page

  Scenario: Login with invalid credentials

    Given I navigate to www.ebay.com
    And I click on login button
    When I enter wrong UserID and Password
    And  I click on login button
    Then I should see the error message
