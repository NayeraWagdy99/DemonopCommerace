package org.example.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterStepDefinition {
    RegisterPage Register= new RegisterPage();
    @Given("User go to register page")
    public void registerPage(){
      Register.ClickOnRegister.click();
    }
    @When("user select gender type")
    public void SelectGender(){
        Register.SelectGender.click();
    }
    @And("^User enter \"(.*)\"")
    public void EnterFirstName(String FirstName ){
        Register.ValidDataFirstName.sendKeys("automation");
    }
    @And("^user enter \"(.*)\"")
    public void EnterLastName(String LastName){
        Register.ValidDataLastName.sendKeys("tester");}
    @And( "user enter Date")
    public void SelectDate(){
        Register.SelectDate();
    }
    @And("user enter month")
    public void SelectMonth(){
        Register.SelectMonth();
    }
    @And("user enter year")
    public void SelectYear(){
        Register.SelectYear();
    }
    @And("^User enters valid \"(.*)\"")
    public void EnterEmail(String Email){
        Register.EnterEmail.sendKeys("test15@example.com");
    }
    @And("^User fills \"(.*)\"")
    public void EnterPassword(String password ){
        Register.EnterPassword.sendKeys("P@ssw0rd");
    }
    @And("^user fills \"(.*)\"")
    public void EnterConfirmPassword(String password ){
        Register.EnterConfirmPassword.sendKeys("P@ssw0rd");
    }
    @And("User clicks on register button")
    public void ClickOnRegisterButton(){
        Register.ClickOnRegisterButton.click();
    }
    @Then("success message is displayed")
    public void SuccessMessage(){
        Register.successMessage();
    }
}