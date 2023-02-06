package org.example.Pages;

import org.example.StepsDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    public LoginPage(){
      PageFactory.initElements(Hooks.driver, this);
}
   @FindBy(className = "ico-login")
    public WebElement clickonLogin;
    @FindBy(id = "Email")
    public WebElement EnterValidEmail;
    @FindBy(id="Password")
    public WebElement EnterValidPassword;
    @FindBy(className = "login-button")
    public WebElement ClickOnLoginButton;
    public void LoginSuccessfully(){
        String  CurrentURL= Hooks.driver.getCurrentUrl();
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(CurrentURL,"https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String myAccountTab = Hooks.driver.findElement(By.className("ico-account")).getText();
        soft.assertEquals(myAccountTab,"My account");
        soft.assertAll();
    }
    @FindBy(id = "Email")
    public WebElement EnterInValidEmail;

    public void FailedToLogin(){
        String FailedToLoginMessage= Hooks.driver.findElement(By.className("message-error")).getText();
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(FailedToLoginMessage,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
       Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String ActualResult2=Hooks.driver.findElement(By.className("message-error")).getCssValue("color");
        String color = Color.fromString(ActualResult2).asHex();
        soft.assertEquals(color,"#e4434b");
        //soft.assertAll();


    }
}
