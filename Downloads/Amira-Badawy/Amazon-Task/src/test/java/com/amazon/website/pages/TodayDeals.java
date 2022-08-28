package com.amazon.website.pages;

import com.amazon.website.driver.DriverHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class TodayDeals extends BasePage {

    private final WebDriver webDriver = DriverHandler.getWebDriver();

    @FindBy(xpath = "/html/body/div[1]/div[21]/div/div/div/div[2]/div[2]/span[3]/span/ul/li[20]/label/span")
    private WebElement headphoneCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div[21]/div/div/div/div[2]/div[2]/span[3]/span/ul/li[18]/label/span")
    private WebElement groceryCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div[21]/div/div/div/div[2]/div[2]/span[6]/span/ul/li[2]/div/a")
    private WebElement tenOffOrMoreDiscount;

    @FindBy(xpath = "/html/body/div[1]/div[21]/div/div/div/div[3]/div/ul/li[4]/a")
    private WebElement thirdPageButton;

    @FindBy(xpath = "/html/body/div[1]/div[21]/div/div/div/div[3]/div/ul/li[5]/a")
    private WebElement forthPageButton;

    @FindBy(xpath = "/html/body/div[1]/div[21]/div/div/div/div[2]/div[3]/div/div[38]/div/div/a[3]")
    private WebElement itemBox;

    public WebElement getHeadphoneCheckBox() {
        return headphoneCheckBox;
    }

    public WebElement getTenOffOrMoreDiscount(){
        return tenOffOrMoreDiscount;
    }

    public WebElement getThirdPageButton(){
        return thirdPageButton;
    }

    public WebElement getForthPageButton(){
        return forthPageButton;
    }

    public WebElement getItemBox(){
        return itemBox;
    }

    public void clickOnHeadphoneCheckBox(){
        headphoneCheckBox.click();
    }

    public void clickOnGroceryCheckBox(){
       groceryCheckBox.click();
    }

    public void clickOnTenOffOrMoreDiscount(){
        tenOffOrMoreDiscount.click();
    }

    public void clickOnThirdPageButton(){
        thirdPageButton.click();
    }

    public void clickOnForthPageButton(){
        webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        forthPageButton.click();
    }

    public Product clickOnItem(){
        itemBox.click();
        return new Product();
    }


}
