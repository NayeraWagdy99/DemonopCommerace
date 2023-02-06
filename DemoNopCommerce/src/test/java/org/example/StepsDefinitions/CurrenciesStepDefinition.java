package org.example.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CurrenciesStepDefinition {
    HomePage Currency = new HomePage();

    @Given("User goes to homepage")
    public void ClickonHomePage() {
        Currency.ClickonHomePage();

    }

    @When("User Selects Euro Currency")
    public void SelectEuro() {
        Currency.SelectEuroCurrecny();
    }

    @Then("Check that  Euro Symbol (€) is shown on the 4 products displayed in Home page")
    public void CheckEuroSymbolIssShown() {



        for (int i=0;i<4;i++){
            String Euro=Currency.GetEuroItems().get(i).getText();
            System.out.println(Euro);
            Assert.assertEquals(Euro.contains("€"),true);
        }
    }



}