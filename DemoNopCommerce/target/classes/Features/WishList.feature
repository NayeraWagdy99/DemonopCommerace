@smoke
  Feature: WishList | User can click on wishlist successfully
    Scenario: User can click on wishlist button and success message appear
      When User click on wishlist button
      Then User see success message
      And user see background color green
@smoke
      Scenario: User can click on Wishlist Tab on the top of the page
        When User click on wishlist button
        And User click on wishlist tab
        Then Verify Qty value is bigger than 0