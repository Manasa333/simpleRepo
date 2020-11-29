Feature: orangehrm Login

  Scenario: Logo presence on orangehrm home page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page and login
    And close browser