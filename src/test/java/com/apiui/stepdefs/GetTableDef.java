package com.apiui.stepdefs;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.apiui.pages.GetTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured.*;
import org.junit.Assert;
import static io.restassured.RestAssured.*;

public class GetTableDef {

    @When("verify title key value equal to {string}")
    public void verify_title_key_value_equal_to(String string) {
        GetTable getTable = new GetTable();
        String value = "\""+string+"\"";
        Assert.assertEquals(value,getTable.titleValue.getText());
    }


    @Then("verify API Activities id {int} key value equal {string}")
    public void verifyAPIActivitiesIdKeyValueEqual(int num, String value) {
       Response response = given().accept(ContentType.JSON)
               .when().pathParam("id", num)
               .get("api/v1/Activities/{id}");


      Assert.assertEquals(value,response.path("title"));

    }



}
