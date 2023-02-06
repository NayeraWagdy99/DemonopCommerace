@smoke
  Feature: HoverCategoires | User hover on one of main categories then click on sub category
    Scenario: User hover on random one of main categories then click on random one of its sub category
      When User hover on the random selected main category
     And User select random one of the three sub cateogries
      Then Check the Subcategory tile is equal or contains the one you get it while selecting random sub-category