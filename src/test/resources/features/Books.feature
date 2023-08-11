Feature: Testing Books credentials

  @wip
  Scenario: Books End to End Testing

    Given the user on the main page
    When the user click Books button and click Get Books-id
    And the user click TryItOutButton and add 5 inside RequiredIdButton click execute
    Then verify "pageCount" equal to 500 as API response
    And Get Authors with "/api/v1/Authors" ending url