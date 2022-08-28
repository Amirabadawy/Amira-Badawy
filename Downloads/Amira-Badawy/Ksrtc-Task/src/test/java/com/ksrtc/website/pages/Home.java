package com.ksrtc.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{
    /*
      Web Elements
   */
    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg btn-block btn-booking']")
    private WebElement searchForBusButton;

    @FindBy(id="txtJourneyDate")
    private WebElement departureDateField;

    @FindBy(xpath = "//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")
    private WebElement calenderArrow;

    @FindBy(xpath = "/html/body/div[1]/table/tbody/tr[2]/td[4]/a")
    private WebElement targetDepartureDate;

    @FindBy(xpath = "/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]/a")
    private WebElement tripSelection;

     /*
      Methods: Will be used for all actions needed in the Home page
   */

    public WebElement getTripSelection() {
        return tripSelection;
    }

    public Booking clickOnSearchForBusButton(){
        searchForBusButton.click();
        return new Booking();
    }

    public void clickOnTrip(){
        tripSelection.click();
    }

    public void clickOnDepartureDateField(){
       departureDateField.click();
    }

    public void clickOnCalenderArrow(){
        calenderArrow.click();
    }

    public void clickOnTargetDepartureDate(){
        targetDepartureDate.click();
    }


}
