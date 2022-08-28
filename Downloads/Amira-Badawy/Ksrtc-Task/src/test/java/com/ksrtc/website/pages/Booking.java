package com.ksrtc.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Booking extends BasePage{
    /*
      Web Elements
   */
    @FindBy(id="Forward-1467467616730")
    private WebElement targetDroppingPoint;

    @FindBy(id="mobileNo")
    private WebElement mobileNoInput;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy( id="Forward28")
    private WebElement seventeenthSeat;

    @FindBy(xpath = "//*[@name=\"passengerName\"]")
    private WebElement passengerNameInput;

    @FindBy( xpath = "//select[@class='form-control custom-select']/option[@value='24']")
    private WebElement genderInput;

    @FindBy( id="passengerAgeForward0")
    private WebElement passengerAgeInput;

    @FindBy( xpath = "//select[@class='form-control custom-select']/option[@value='1466060086837']")
    private WebElement concessionInput;

    @FindBy(xpath = "/html/body/main/form/section/div/div[6]/div[3]/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[2]/div/div[2]/ul/li[2]")
    private WebElement droppingPointTab;

    @FindBy( id="PgBtn")
    private WebElement makePaymentButton;

    @FindBy(xpath = "/html/body/main/form/section/div/div[6]/div[3]/div[2]/div[1]/div[1]/div[5]/div/input[4]")
    private WebElement selectSeatsButton;

     /*
      Methods: Will be used for all actions needed in the Booking page
   */

    public WebElement getDroppingPointTab() {
        return droppingPointTab;
    }

    public WebElement getTargetDroppingPoint(){
        return targetDroppingPoint;
    }

    public WebElement getMobileNoInput() {
        return mobileNoInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPassengerNameInput() {
        return passengerNameInput;
    }

    public WebElement getMakePaymentButton() {
        return makePaymentButton;
    }

    public void clickOnSelectSeatsButton(){
        selectSeatsButton.click();
    }

    public void clickOnDroppingPointTab(){
       droppingPointTab.click();
    }

    public void clickOnTargetDroppingPoint(){
     targetDroppingPoint.click();
    }

    public void typeMobileNo(String mobileNumber){
       mobileNoInput.sendKeys(mobileNumber);
    }

    public void typeEmail(String email){
        emailInput.sendKeys(email);
    }

    public void clickOnSeventeenthSeat(){
        seventeenthSeat.click();
    }

    public void typePassengerName(String passengerName){
       passengerNameInput.sendKeys(passengerName);
    }

    public void clickOnGenderInput(){
       genderInput.click();
    }

    public void typePassengerAgeInput(String passengerAge){
        passengerAgeInput.sendKeys(passengerAge);
    }

    public void clickOnConcessionInput(){
        concessionInput.click();
    }

    public Payment clickOnMakePaymentButton(){
        makePaymentButton.click();
        return new Payment();
    }

}
