package org.example.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.util.Random;

public class hoverCategoriesStepDefintion {
    HomePage HP = new HomePage();
    Random random = new Random();
    int MainCategoryRandomNumber = random.nextInt(3);
    int SubCategoryRandomNumber = random.nextInt(3);

    @When("User hover on the random selected main category")
    public void HoverOnRandomMainCategory() {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(HP.HoverOnRandomMainCategory().get(MainCategoryRandomNumber)).perform();

    }

    @And("User select random one of the three sub cateogries")
    public void RandomOfSubcategory() {
        HP.RandomOfSubCategory(MainCategoryRandomNumber).get(SubCategoryRandomNumber).getText();
        System.out.println( HP.RandomOfSubCategory(MainCategoryRandomNumber).get(SubCategoryRandomNumber).getText());
        HP.RandomOfSubCategory(MainCategoryRandomNumber).get(SubCategoryRandomNumber).click();
    }

    @Then("Check the Subcategory tile is equal or contains the one you get it while selecting random sub-category")
    public void CheckSubCategoryTile() {
        String SubCategoryTitle = HP.RandomOfSubCategory(MainCategoryRandomNumber).get(SubCategoryRandomNumber).getText();
        String pageTitle = HP.GetSubCategoryTitle().toLowerCase().trim();
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.contains(SubCategoryTitle));


    }
}
