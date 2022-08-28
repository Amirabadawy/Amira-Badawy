package com.amazon.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(id = "nav-cart")
    private WebElement cartIcon;

    @FindBy(linkText = "Today's Deals")
    private WebElement todayDealsSection;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement dontChangeButton;

    /*
       Methods: Will be used for all actions needed in the Home page
      */
    public void typeOnSearchBox(String searchText){
        searchBox.sendKeys(searchText);
    }

    public ResultSearch clickOnSearchButton(){
        searchButton.click();
        return new ResultSearch();
    }

    public Cart clickOnCartButton(){
        cartIcon.click();
        return new Cart();
    }

    public TodayDeals clickOnTodayDealsSection(){
        clickOnDontChangeButton();
        todayDealsSection.click();
        return new TodayDeals();
    }

    public void clickOnDontChangeButton(){
        try {
            dontChangeButton.click();
        } catch (Exception e){

        }
    }


}
