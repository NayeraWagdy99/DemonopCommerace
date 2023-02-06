@smoke
  Feature: FollowUs | users could open followUs links
    Scenario: user opens facebook link
    When user clicks facebook link
      Then verify that current url is equal to "https://www.facebook.com/nopCommerce"
@smoke
Scenario: user opens twitter link
  When user clicks twitter link
  Then Verify that current url is equal to "https://twitter.com/nopCommerce"
@smoke
  Scenario: user opens rss link
    When user clicks rss link
    Then Verify That current url is equal to "https://demo.nopcommerce.com/new-online-store-is-open"
@smoke
    Scenario: user opens youtube link
      When user click youtube link
      Then Verify That Current url is equal to "https://www.youtube.com/user/nopCommerce"