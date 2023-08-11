package com.apiui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetTable extends BasePage {
    @FindBy (xpath = "//span[@style='color: rgb(162, 252, 162);']")
    public WebElement titleValue;
}
