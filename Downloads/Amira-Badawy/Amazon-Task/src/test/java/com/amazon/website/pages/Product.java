package com.amazon.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends BasePage{

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(id= "wishListMainButton")
    private WebElement addToListButton;

    @FindBy(xpath = "//*[@class=\"a-size-base a-color-base a-link-normal a-text-normal\"]")
    private WebElement itemButton;


    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public void clickOnAddToListButton(){
        try {
            addToListButton.click();
        } catch (Exception e){

        }
    }

    public void clickOnItemButton(){
        itemButton.click();
    }

}
