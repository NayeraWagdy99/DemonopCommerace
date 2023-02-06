package org.example.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LoginPage;

public class LoginStepDefintion {
    LoginPage LP = new LoginPage();
    @When("User goes to login page")
    public void ClickOnLogin(){
        LP.clickonLogin.click();
    }
    @And("^User Enters \"(.*)\"")
    public void EnterValidEmail(String Email ){
        LP.EnterValidEmail.sendKeys("test14@example.com");
    }
    @And("^user Enters \"(.*)\"")
    public void EnterValidPassword(String Password){
        LP.EnterValidPassword.sendKeys("P@ssw0rd");
    }
    @And("User Clicks on Login button")
    public void ClickOnLoginButton(){
        LP.ClickOnLoginButton.click();
    }
    @Then("User Logins to the system successfully")
    public void LoginSuccessfully(){
        LP.LoginSuccessfully();
    }
    @And("^User enters \"(.*)\"")
    public void EnterInValidEmail(String Email ){
        LP.EnterInValidEmail.sendKeys("Wrong@example.com");
    }
    @Then("User could not login in to the system")
    public void UnsuccessfullLogin(){
        LP.FailedToLogin();
    }

}
