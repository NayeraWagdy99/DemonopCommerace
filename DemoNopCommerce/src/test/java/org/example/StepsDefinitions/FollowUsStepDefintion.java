package org.example.StepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import javax.xml.ws.WebEndpoint;

public class FollowUsStepDefintion {
    HomePage HP = new HomePage();

    @When("user clicks facebook link")
    public void openFacebook() {
        HP.openFacebook();
    }

    @Then("^verify that current url is equal to \"(.*)\"")
    public void FacebookPage(String URL) throws InterruptedException {
        URL = "https://www.facebook.com/nopCommerce";
        Assert.assertEquals(HP.requiredPage(), URL);


    }

    @When("user clicks twitter link")
    public void openTwitter() {
        HP.openTwitter();
    }

    @Then("^Verify that current url is equal to \"(.*)\"")
    public void TwitterPage(String URL) throws InterruptedException {
        URL = "https://twitter.com/nopCommerce";
        Assert.assertEquals(HP.requiredPage(), URL);
    }

    @When("user clicks rss link")
    public void openRSS() {
        HP.OpenRSS();
    }

    @Then("^Verify That current url is equal to \"(.*)\"")
    public void RSSPage(String URL) throws InterruptedException {
        URL = "https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(HP.requiredPage(), URL);
    }

    @When("user click youtube link")
    public void openYoutube() {
        HP.openYoutube();
    }

    @Then("^Verify That Current url is equal to \"(.*)\"")
    public void youtubePage(String URL) throws InterruptedException {
        URL = "https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(HP.requiredPage(), URL);
    }
}