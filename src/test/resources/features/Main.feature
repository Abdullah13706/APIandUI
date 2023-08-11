Feature: Checking information in the main page


  Scenario: on the main page
    Given the user on the main page
    When  the user click Activities button
    And   verify first Get button and click it
    Then the code url equal to "200"