package org.example.Pages;

import org.example.StepsDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class RegisterPage {

    //public  WebElement ClickOnRegister(){
    // WebElement Register= Hooks.driver.findElement(By.className("ico-register"));
    ///  return Register;
    //}
    public RegisterPage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement ClickOnRegister;

    @FindBy(id = "gender-female")
    public WebElement SelectGender;

    @FindBy(id = "FirstName")
    public WebElement ValidDataFirstName;
    @FindBy(id = "LastName")
    public WebElement ValidDataLastName;

    public void SelectDate() {

        Select DateDropDown = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        DateDropDown.selectByVisibleText("2");
    }

    public void SelectMonth() {

        Select DateDropDown = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        DateDropDown.selectByVisibleText("February");
    }

    public void SelectYear() {

        Select DateDropDown = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        DateDropDown.selectByVisibleText("1914");


    }
    @FindBy(id = "Email")
    public WebElement EnterEmail;
    @FindBy(id="Password")
    public WebElement EnterPassword;
    @FindBy(id="ConfirmPassword")
    public WebElement EnterConfirmPassword;

    @FindBy(id="register-button")
    public WebElement ClickOnRegisterButton;

    public void successMessage(){
        SoftAssert soft = new SoftAssert();
      String ActualResult= Hooks.driver.findElement(By.className("result")).getText();
      soft.assertEquals(ActualResult,"Your registration completed");
      Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String ActualResult2=Hooks.driver.findElement(By.className("result")).getCssValue("color");
      soft.assertEquals(ActualResult2,"rgba(76, 177, 124, 1)");
      soft.assertAll();
    }
}
