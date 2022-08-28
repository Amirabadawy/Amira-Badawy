package com.amazon.website.tests.smokeTest;

import com.amazon.website.browser.Browser;
import com.amazon.website.pages.BasePage;
import com.amazon.website.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SmokeTestStepDef extends BaseTest {

    @Given("website is opened")
    public void websiteIsOpened() {
        browser = new Browser();
        BasePage.waitUntilPageLoaded();
    }

    @When("search for {string} in home page")
    public void searchFor(String searchQuery){
        browser.amazon.home.typeOnSearchBox(searchQuery);
    }

    @When("click on search button in home page")
    public void clickOnSearchButton(){
        browser.amazon.resultSearch = browser.amazon.home.clickOnSearchButton();
    }

    @When("click on the Item in result page")
    public void clickOnItem(){
        browser.amazon.product = browser.amazon.resultSearch.clickOnItem();
    }

    @When("click on add to cart button in product page")
    public void clickOnAddToCartButton(){
        browser.amazon.product.clickOnAddToCartButton();
    }

    @When("click on cart icon in nav bar in home page")
    public void clickOnCartIcon(){
        browser.amazon.cart = browser.amazon.home.clickOnCartButton();
    }

    @Then("proceedToCheckout button should be displayed in cart page")
    public void proceedToCheckoutShouldBeDisplayed(){
        Assert.assertTrue(browser.amazon.cart.getProceedToCheckOutButton().isDisplayed());
    }

    @When("click on today's deals section in home page")
    public void clickOnTodayDealsSection(){
        browser.amazon.todayDeals = browser.amazon.home.clickOnTodayDealsSection();
    }

    @When("click on don't change Button in popUp in home page")
    public void clickOnDontChangeButton(){
       browser.amazon.home.clickOnDontChangeButton();
    }

    @When("select Headphones in today's deals page")
    public void SelectHeadphonesInTodayDealsPage(){
        browser.amazon.todayDeals.scrollTo(browser.amazon.todayDeals.getHeadphoneCheckBox());
        browser.amazon.todayDeals.clickOnHeadphoneCheckBox();
    }

    @When("select on grocery in today's deals page")
    public void SelectGroceryInTodayDealsPage(){
        browser.amazon.todayDeals.clickOnGroceryCheckBox();
    }

    @When("select on 10% off or more in today's deals page")
    public void SelectTenOffOrMoreDiscountInTodayDealsPage(){
        browser.amazon.todayDeals.scrollTo(browser.amazon.todayDeals.getTenOffOrMoreDiscount());
        browser.amazon.todayDeals.clickOnTenOffOrMoreDiscount();
    }

    @When("click on third page in nav bar in today's deals page")
    public void clickOnThirdPageButtonInTodayDealsPage(){
        browser.amazon.todayDeals.scrollTo(browser.amazon.todayDeals.getThirdPageButton());
        browser.amazon.todayDeals.clickOnThirdPageButton();
    }

    @When("click on fourth page in nav bar in today's deals page")
    public void clickOnForthPageButtonInTodayDealsPage(){
        browser.amazon.todayDeals.scrollTo(browser.amazon.todayDeals.getForthPageButton());
        browser.amazon.todayDeals.clickOnForthPageButton();
    }

    @When("click on Item in forth page in today's deals page")
    public void clickOnItemInForthPageTodayDealsPage(){
        browser.amazon.todayDeals.scrollTo(browser.amazon.todayDeals.getItemBox());
        browser.amazon.product = browser.amazon.todayDeals.clickOnItem();
    }

    @When("click on item in subsection in products")
    public void clickOnItemInSubsectionInProducts(){
        browser.amazon.product.clickOnItemButton();
    }
}
