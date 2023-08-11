package com.apiui.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPage {
    @Given("the user on the main page")
    public void the_user_on_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the title equal to FakeRESTApi.Web V1")
    public void the_title_equal_to_fake_rest_api_web_v1() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the version equal to V1 and OAS3")
    public void the_version_equal_to_v1_and_oas3() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the url equal to \\/swagger\\/v1\\/swagger.json")
    public void the_url_equal_to_swagger_v1_swagger_json() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the url equal to \\/swagger\\/v{int}\\/swagger.json")
    public void theUrlEqualToSwaggerVSwaggerJson(int arg0) {
    }
}
