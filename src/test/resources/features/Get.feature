Feature: Key Value control


  Scenario: Completed Value
    Given the user on the main page
    Then the user click Activities button
    When verify first Get button and click it
    And verify title key value equal to "string"
    Then verify API Activities id 0 key value equal "Not Found"





