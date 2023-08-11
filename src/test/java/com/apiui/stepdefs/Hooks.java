package com.apiui.stepdefs;


import com.apiui.utilities.ConfigurationReader;
import com.apiui.utilities.DBUtils;
import com.apiui.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.baseURI;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
        baseURI= ConfigurationReader.get("api_url");

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb() {
        try {
            DBUtils.createConnection();
        } catch (Exception e) {
            System.out.println("Connection Exception");

        }
        System.out.println("\tconnecting to database...");
    }


    @After("@db")
    public void closeDb() {
        DBUtils.destroyConnection();
        System.out.println("\tdisconnecting to database...");

    }


}

