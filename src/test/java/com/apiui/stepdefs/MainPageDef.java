package com.apiui.stepdefs;

import com.apiui.pages.MainPage;
import com.apiui.utilities.BrowserUtils;
import com.apiui.utilities.ConfigurationReader;
import com.apiui.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.print.DocFlavor;

public class MainPageDef {
    MainPage mainPage = new MainPage();
    @Given("the user on the main page")
    public void the_user_on_the_main_page() {

        Driver.get().get(ConfigurationReader.get("FakeRESTApi.Web"));
        BrowserUtils.waitForPageToLoad(10);
    }

    @When("the user click Activities button")
    public void the_user_click_activities_button() {
        if (!mainPage.activitiesButton.isSelected()) {
            mainPage.activitiesButton.click();
        }
    }

    @And("verify first Get button and click it")
    public void verifyFirstGetButtonAndClickIt() {
        Assert.assertEquals("GET",mainPage.getButton1.getText());
        mainPage.getButton1.click();
    }

    @Then("the code url equal to {string}")
    public void the_code_url_equal_to(String string) {
        Assert.assertEquals(string,mainPage.statusCode.getText());

    }




}
