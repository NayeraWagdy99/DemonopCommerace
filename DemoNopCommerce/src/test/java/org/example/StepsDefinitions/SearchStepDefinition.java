package org.example.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

public class SearchStepDefinition {
    HomePage HP = new HomePage();
    SoftAssert soft = new SoftAssert();

    @When("User search with {string}")
    public void SearchUsingProductName(String ProductName) throws InterruptedException {
        HP.SearchUsingProductName(ProductName);
        Thread.sleep(5000);
    }

    @And("user clicks search button and in the search page")
    public void Clickonsearchbutton() {
        HP.ClickonSearchbutton();
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="), true);
        soft.assertAll();
    }
    @Then("User find {string} relevant results")
    public void HasSearchWord(String ProductName) {
        for (int i = 0; i < HP.hasSearchWord().size(); i++) {
            soft.assertEquals(HP.hasSearchWord().get(i).getText().toLowerCase().contains(ProductName),true);
          System.out.println(HP.hasSearchWord().get(i).getText());


        }
        soft.assertAll();


    }


  @When("user search with {string}")
  public void SearchUsingSKU(String SKU) throws InterruptedException {
        HP.SearchUsingSKU(SKU);
        Thread.sleep(5000);

  }
    @And("User clicks search button and in the search page")
    public void ClickonSearchbuttonForSKu(){
        HP.ClickonSearchbuttonForSKU();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=AP_MBP_13");
        soft.assertAll();
    }
    @And("click on the product in search result")
    public void clickontheprdouctforSKU(){
        HP.ClickontheproductforSKU();
    }
    @Then("User find {string} inside product detail page")
    public void CheckThatSKu(String SKU){

       System.out.println(HP.GetSKUoftheProduct());

     Assert.assertEquals(HP.GetSKUoftheProduct().contains(SKU),true);


    }
}
