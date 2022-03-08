Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch Chrome browser
    When I open  orange hrm homepage
    Then I verify that the logo preset on page
    And Close browser