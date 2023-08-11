package com.apiui.stepdefs;

import com.apiui.pages.BooksPage;
import com.apiui.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.AssertionSupport;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class BooksStepDefs {
    BooksPage booksPage = new BooksPage();
    @Then("the user click Books button and click Get Books-id")
    public void the_user_click_books_button_and_click_get_books_id() {
        booksPage.getBooksId.click();
    }



    @Then("verify {string} equal to {int} as API response")
    public void verify_equal_to_as_api_response(String string, Integer int1) {
        Response response = given().accept(ContentType.JSON)
                .and().pathParam("id",5)
                .when().get("/api/v1/Books/{id}");
        int expUI = Integer.parseInt(String.valueOf(int1));
        int acUI = Integer.parseInt(booksPage.pageCountValue.getText());
        Assert.assertEquals(expUI,acUI);
        int expAPI = Integer.parseInt(String.valueOf(int1));
        int acAPI = response.path("\""+string+"\"");
        Assert.assertEquals(expAPI,acAPI);
        Assert.assertEquals(acUI,acAPI);
        System.out.println(expAPI);
        System.out.println(acAPI);
        System.out.println(expUI);



    }





    @And("the user click TryItOutButton and add {int} inside RequiredIdButton click execute")
    public void theUserClickTryItOutButtonAndAddInsideRequiredIdButtonClickExecute(int arg0) {

        BrowserUtils.waitForVisibility(booksPage.tryItOutButton,5);
        booksPage.tryItOutButton.click();
        BrowserUtils.waitForVisibility(booksPage.requiredIdButton, 5);
        booksPage.requiredIdButton.sendKeys(""+arg0+"");

        BrowserUtils.waitForClickablility(booksPage.executeButton,10);
        booksPage.executeButton.click();
        BrowserUtils.waitFor(2);

    }

    @And("Get Authors with {string} ending url")
    public void getAuthorsWithEndingUrl(String arg0) {
        Response response = given().accept(ContentType.JSON)
                .get(""+arg0+"");
        response.prettyPrint();
    }
}
