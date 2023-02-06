package org.example.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class WishlistStepDefinition {
    HomePage HP= new HomePage();
    @When("User click on wishlist button")
    public void ClickonWishListButton(){
        HP.clickonWishlistButton();
    }
    @Then("User see success message")
    public void SuccessMessage(){
        HP.SuccessMesssageWishList();
    }
    @And("user see background color green")
    public void ColorForWishList(){
    HP.ColorForWishList();
    }
    @And("User click on wishlist tab")
    public  void ClickOnWishList(){
        HP.ClickonWishListTab();
    }
    @Then("Verify Qty value is bigger than 0")
    public void CheckQuantityValue(){
        HP.CheckQuantityValue();
    }
}
