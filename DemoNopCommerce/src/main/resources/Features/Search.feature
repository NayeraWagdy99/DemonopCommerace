@smoke
  Feature: Search | Search using product name and SKU

    Scenario Outline: Search using Product name
      When User search with "<ProductName>"
      And user clicks search button and in the search page
      Then User find "<ProductName>" relevant results
      Examples:
        | ProductName |
        | book        |
        | laptop      |
        | nike        |

@smoke
    Scenario Outline: Search using SKU
      When user search with "<SKU>"
      And  user clicks search button and in the search page
      And click on the product in search result
      Then User find "<SKU>" inside product detail page
      Examples:
        | SKU       |
        | SCI_FAITH |
        | APPLE_CAM|
        | SF_PRO_11|
