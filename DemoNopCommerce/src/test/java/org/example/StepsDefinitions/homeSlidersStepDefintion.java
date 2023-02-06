package org.example.StepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;

public class homeSlidersStepDefintion {
    HomePage HP= new HomePage();
    @When("user click on first slider")
    public void ClickonFisrtSlider() throws InterruptedException {
        HP.CheckControlSlider();
        HP.CheckFirstSlider();
        Thread.sleep(3000);

    }
    @Then("verify it directs  user to Slider 1 page")
    public void Current1Page(){
        HP.DirectToSlider1Page();
    }
    @When("user clicks on second slider")
    public void ClickonSecondSlider() throws InterruptedException {
       HP.CheckControlSlider();
        HP.CheckSecondSlider();
        Thread.sleep(300);
    }
    @Then("verify it directs user to 2nd Slider Page")
    public void Current2ndPage(){
        HP.DirectToSlider2Page();
    }
}
