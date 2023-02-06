package org.example.Pages;

import org.example.StepsDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePage {
    public void ClickonHomePage() {
        // Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).click();
    }

    public void SelectEuroCurrecny() {
        Select CurrencyDropDown = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        CurrencyDropDown.selectByVisibleText("Euro");
    }

    public List<WebElement> GetEuroItems() {


        List<WebElement> Eurolist = Hooks.driver.findElements(By.className("prices"));

        return Eurolist;


    }

    public void SearchUsingProductName(String ProductName) {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(ProductName);

    }

    public void ClickonSearchbutton() {
        Hooks.driver.findElement(By.className("button-1")).click();
    }


    public List<WebElement> hasSearchWord() {
        List<WebElement> ListItems = Hooks.driver.findElements(By.className("product-title"));
        return ListItems;
    }

    public void SearchUsingSKU(String SKU) {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(SKU);
    }

    public void ClickonSearchbuttonForSKU() {
        Hooks.driver.findElement(By.className("button-1")).click();
    }

    public void ClickontheproductforSKU() {

        Hooks.driver.findElement(By.className("product-item")).click();

    }

    public String GetSKUoftheProduct() {
                 return Hooks.driver.findElement(By.className("sku")).getText();
    }
    public List<WebElement> HoverOnRandomMainCategory(){


        List<WebElement> RandomMainCategory = Hooks.driver.findElements(By.cssSelector("ul[class='top-menu notmobile']>li>a[href]"));

        return RandomMainCategory;
    }
    public List<WebElement> RandomOfSubCategory(int MainCategoryRandomNumber){
      MainCategoryRandomNumber +=1;
     List<WebElement> RandomSubCategory=Hooks.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li["+MainCategoryRandomNumber+" ]/ul[@class='sublist first-level']/li"));
     return RandomSubCategory;

    }
    public String GetSubCategoryTitle(){
       return Hooks.driver.findElement(By.cssSelector("div[class='page-title']")).getText();
    }
    public void openFacebook() {
        Hooks.driver.findElement(By.linkText("Facebook")).click();
    }

    public String requiredPage() throws InterruptedException {
        String CurrentURL=null;
        String parent = Hooks.driver.getWindowHandle();
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Set<String> AllWindows = Hooks.driver.getWindowHandles();
        for (String Window : AllWindows) {
            if (!Window.equalsIgnoreCase(parent)) {
                Hooks.driver.switchTo().window(Window);
               System.out.println(Hooks.driver.getCurrentUrl());
                CurrentURL=Hooks.driver.getCurrentUrl();
                Hooks.driver.close();
                Hooks.driver.switchTo().window(parent);
                System.out.println(Hooks.driver.getCurrentUrl());
                Thread.sleep(3000);

            }
        }
        return CurrentURL;

    }
    public void openTwitter() {
        Hooks.driver.findElement(By.linkText("Twitter")).click();
    }
    public void OpenRSS(){
        Hooks.driver.findElement(By.linkText("RSS")).click();
    }
    public void openYoutube(){
        Hooks.driver.findElement(By.linkText("YouTube")).click();
    }
  public void clickonWishlistButton(){
       // Hooks.driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
       // Hooks.driver.findElement(By.className("add-to-wishlist-button")).click();
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();

  }
  public void SuccessMesssageWishList(){
      SoftAssert soft = new SoftAssert();
        String successmessage=Hooks.driver.findElement(By.className("content")).getText();
        System.out.println(successmessage);
        soft.assertEquals(successmessage,"The product has been added to your wishlist");
        soft.assertAll();


  }
    public void ColorForWishList(){
        SoftAssert soft= new SoftAssert();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String ActualResult2= Hooks.driver.findElement(By.xpath("//*[@class='bar-notification success']")).getCssValue("background-color");
        System.out.println(ActualResult2);
        String color =  Color.fromString(ActualResult2).asHex();
        System.out.println(color);
        soft.assertEquals(color,"#4bb07a");
        soft.assertAll();


    }
    public void ClickonWishListTab(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-wishlist"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='bar-notification success']")));
        System.out.println("X");
        Hooks.driver.findElement(By.className("ico-wishlist")).click();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-wishlist"))).click();
        System.out.println("y");
    }
    public void CheckQuantityValue(){
      SoftAssert soft= new SoftAssert();
      String Quantity=  Hooks.driver.findElement(By.className("qty-input")).getAttribute("value");
      System.out.println(Quantity);
      int QuantityValue=Integer.parseInt(Quantity);
      System.out.println(QuantityValue);
      soft.assertTrue(QuantityValue>0);
      //  Assert.assertTrue(QuantityValue>0);
     soft.assertAll();

    }






    public void CheckFirstSlider(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/a[1]")).click();


    }
    public void DirectToSlider1Page(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        SoftAssert soft= new SoftAssert();
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-14-Pro"));
        System.out.println(1);
        String Actual= Hooks.driver.getCurrentUrl();
        System.out.println(2);
       soft.assertEquals(Actual,"https://demo.nopcommerce.com/iphone-14-Pro");
       soft.assertAll();
        System.out.println(3);

    }
    public void CheckSecondSlider(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/a[2]")).click();


    }
    public void DirectToSlider2Page(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        SoftAssert soft= new SoftAssert();
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/Galaxy-S22-Ultra"));
        System.out.println(4);
        String Actual= Hooks.driver.getCurrentUrl();
        System.out.println(5);
        soft.assertEquals(Actual,"https://demo.nopcommerce.com/Galaxy-S22-Ultra");
        soft.assertAll();
        System.out.println(6);

    }
    public void CheckControlSlider(){
        Hooks.driver.findElement(By.linkText("1")).click();
    }




}
