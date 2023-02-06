@smoke
  Feature:Currencies | verify Euro Symbol (€) is shown on the 4 products displayed in Home page
    Scenario: verify Euro Symbol (€) is shown on the 4 products displayed in Home page
      Given User goes to homepage
      When User Selects Euro Currency
      Then Check that  Euro Symbol  is shown on the 4 products displayed in Home page
