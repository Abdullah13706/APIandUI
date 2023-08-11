package com.apiui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"operations-tag-Books\"]/a/span")
    public  WebElement booksButton;

    @FindBy(xpath = "//*[@id=\"operations-Books-get_api_v1_Books__id_\"]/div[1]/span[1]")
    public  WebElement getBooksId;

    @FindBy(xpath = "//button[@class='btn try-out__btn']")
    public WebElement tryItOutButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement requiredIdButton;
    @FindBy(xpath = "//button[@class='btn execute opblock-control__btn']")
    public WebElement executeButton;

    @FindBy(xpath = "//span[contains(text(),'500')]")
    public WebElement pageCountValue;

}
