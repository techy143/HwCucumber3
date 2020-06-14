Feature: Login feature

  Scenario Outline: Login with valid credentials

    Given I navigate to "https://demo.broadleafcommerce.org/" page
    And I click on login button
    When I enter <username> and <password>
    And I should go to home page
    Then I click on Green Ghost

    Examples:
      |username |password |
    |tauhidechy147@outlook.com | Canada143 |


