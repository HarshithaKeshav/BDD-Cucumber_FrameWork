Feature: Validate search functionality

  @SanityFlow
  Scenario Outline: Search for a product and validate the results
    Given amazon webpage is launched
    When user enters a product name"<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
    |product name|
    |Phone       |
    |TV          |

  @RegressionFlow
  Scenario Outline: Search for a product and validate the results
    Given amazon webpage is launched
    When user enters a product name"<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |Iphone       |
      |Apple Watch        |
