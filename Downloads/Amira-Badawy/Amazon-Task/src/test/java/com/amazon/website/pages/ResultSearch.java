package com.amazon.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultSearch extends BasePage{

    @FindBy(xpath = "//*[@class= 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
    private WebElement firstItem;

    public WebElement getFirstItem() {
        return firstItem;
    }

    public Product clickOnItem(){
        firstItem.click();
        return new Product();
    }
}
