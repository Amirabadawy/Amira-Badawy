package com.ksrtc.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends BasePage{
    /*
    Web Elements
    */
    @FindBy(id="cnumber")
    private WebElement cardNumberInput;

    @FindBy(id="cvv2")
    private WebElement cvvInput;

    @FindBy(id="cname2")
    private WebElement cardHolderNameInput;

    @FindBy( xpath = "//select[@class='form-control']/option[@value='07']")
    private WebElement expiryMonth;

    @FindBy( xpath = "//select[@class='form-control']/option[@value='2027']")
    private WebElement expiryYear;

    @FindBy(id="proceedForm")
    private WebElement makePaymentButton;

    /*
          Methods: Will be used for all actions needed in the Booking page
    */

    public WebElement getMakePaymentButton() {
        return makePaymentButton;
    }

    public void typeOnCardNumberInput(String cardNumber){
        cardNumberInput.sendKeys(cardNumber);
    }

    public void typeOnCvvInput(String cvv){
        cvvInput.sendKeys(cvv);
    }

    public void typeOnCardHolderNameInput(String cardHolderName){
        cardHolderNameInput.sendKeys(cardHolderName);
    }

    public void clickOnExpiryMonth(){
        expiryMonth.click();
    }

    public void clickOnExpiryYear(){
        expiryYear.click();
    }
}
