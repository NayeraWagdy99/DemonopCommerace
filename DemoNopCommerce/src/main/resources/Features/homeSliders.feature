@smoke
  Feature:HomeSliders | Check if the two sliders are clickable
    Scenario: Check if the first slider is clickable on home page
      When user click on first slider
      Then verify it directs  user to Slider 1 page
@smoke
    Scenario: Check if the second slider is clickable on home page
      When user clicks on second slider
      Then verify it directs user to 2nd Slider Page