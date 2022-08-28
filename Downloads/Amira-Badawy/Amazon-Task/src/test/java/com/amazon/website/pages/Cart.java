package com.amazon.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends BasePage{

    @FindBy(id = "sc-buy-box-ptc-button")
    private WebElement proceedToCheckOutButton;

    public WebElement getProceedToCheckOutButton() {
        return proceedToCheckOutButton;
    }
}
