package com.apiui.pages;

import com.apiui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
 public MainPage() {
     PageFactory.initElements(Driver.get(), this);
 }
 @FindBy (linkText = "Activities")
    public WebElement activitiesButton;

 @FindBy(xpath = "//span[@class='opblock-summary-method']")
    public WebElement getButton1;

    @FindBy(xpath = "//td[@class='response-col_status']")
    public WebElement statusCode;
}
