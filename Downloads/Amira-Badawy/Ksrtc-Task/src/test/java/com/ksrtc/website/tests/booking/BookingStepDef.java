package com.ksrtc.website.tests.booking;

import com.ksrtc.website.browser.Browser;
import com.ksrtc.website.pages.BasePage;
import com.ksrtc.website.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BookingStepDef extends BaseTest {

    @Given("website is opened")
    public void websiteIsOpened() {
        browser = new Browser();
        BasePage.waitUntilPageLoaded();
    }

    @When("choose from target trip from the popular routes in home page")
    public void chooseTrip(){
        browser.ksrtc.home.waitUntilElementIsVisible(browser.ksrtc.home.getTripSelection());
        browser.ksrtc.home.clickOnTrip();
    }

    @When("click on Search for bus button in home page")
    public void searchFor(){
        browser.ksrtc.booking = browser.ksrtc.home.clickOnSearchForBusButton();
    }

    @When("choose the arrival date in home page")
    public void chooseArrivalDateField(){
        browser.ksrtc.home.clickOnDepartureDateField();
    }

    @When("click on arrow in calender in home page")
    public void clickOnCalenderArrow(){
        browser.ksrtc.home.clickOnCalenderArrow();
    }

    @When("click on target arrival date in home page")
    public void clickOnTargetArrivalDate(){
        browser.ksrtc.home.clickOnTargetDepartureDate();
    }

    @When("click on select seats button in booking page")
    public void clickOnSelectSeatsButton(){
        browser.ksrtc.booking.clickOnSelectSeatsButton();
    }

    @When("click on the dropping point tab in booking page")
    public void clickOnTheDroppingPointTab(){
        browser.ksrtc.home.waitUntilElementIsVisible(browser.ksrtc.booking.getDroppingPointTab());
        browser.ksrtc.booking.clickOnDroppingPointTab();
    }

    @When("choose the  target dropping point in booking page")
    public void chooseTheTargetDroppingPointTab(){
        browser.ksrtc.booking.scrollTo(browser.ksrtc.booking.getTargetDroppingPoint());
        browser.ksrtc.booking.clickOnTargetDroppingPoint();
    }

    @When("type mobile number {string} in customer details in booking page")
    public void typeMobileNumberInCustomerDetailsInBookingPage(String mobileNumber){
        browser.ksrtc.booking.scrollTo(browser.ksrtc.booking.getMobileNoInput());
        browser.ksrtc.booking.typeMobileNo(mobileNumber);
    }

    @When("type email {string} customer details in booking page")
    public void typeEmailInCustomerDetailsInBookingPage(String email){
        browser.ksrtc.booking.waitUntilElementIsVisible(browser.ksrtc.booking.getEmailInput());
        browser.ksrtc.booking.typeEmail(email);
    }

    @When("Choose the seventeenth seat in booking page")
    public void chooseTheSeventeenthSeatInBookingPage(){
        browser.ksrtc.booking.clickOnSeventeenthSeat();
    }

    @When("type passenger name {string} in passenger details in booking page")
    public void typePassengerNameInPassengerDetailsInBookingPage(String passengerName){
        browser.ksrtc.booking.scrollTo(browser.ksrtc.booking.getPassengerNameInput());
        browser.ksrtc.booking.typePassengerName(passengerName);
    }

    @When("Choose gender in passenger details in booking page")
    public void chooseGenderInPassengerDetailsInBookingPage() {
        browser.ksrtc.booking.clickOnGenderInput();
    }

    @When("type passenger age {string} in passenger details in booking page")
    public void typePassengerAgeInPassengerDetailsInBookingPage(String passengerAge){
        browser.ksrtc.booking.typePassengerAgeInput(passengerAge);
    }

    @When("choose concession in passenger details in booking page")
    public void chooseConcessionInPassengerDetailsInBookingPage() {
        browser.ksrtc.booking.clickOnConcessionInput();
    }

    @When("click on make payment button in booking page")
    public void clickOnMakePaymentButtonInBookingPage() {
        browser.ksrtc.booking.scrollTo(browser.ksrtc.booking.getMakePaymentButton());
        browser.ksrtc.payment = browser.ksrtc.booking.clickOnMakePaymentButton();
    }

    @When("type card Number {string} in payment page")
    public void typeCardNumberInPaymentPage(String cardNumber){
        browser.ksrtc.payment.typeOnCardNumberInput(cardNumber);
    }

    @When("type cvv Number {string} in payment page")
    public void typeCvvInPaymentPage(String cvvNumber){
        browser.ksrtc.payment.typeOnCvvInput(cvvNumber);
    }

    @When("type card Holder Name {string} in payment page")
    public void typeCardHolderNameInPaymentPage(String cardHolderName){
        browser.ksrtc.payment.typeOnCardHolderNameInput(cardHolderName);
    }

    @When("select expiry month and expiry year in payment page")
    public void clickOnExpiryMonthAndExpiryYearInPaymentPage() {
        browser.ksrtc.payment.clickOnExpiryMonth();
        browser.ksrtc.payment.clickOnExpiryYear();
    }

    @When("make payment button should be displayed in cart page")
    public void makePaymentShouldBeDisplayedInPaymentPage() {
        Assert.assertTrue(browser.ksrtc.payment.getMakePaymentButton().isDisplayed());

    }

}
