package com.amazon.website.browser;

import com.amazon.website.amazonWebsite.AmazonWebsite;
import com.amazon.website.driver.DriverHandler;
import org.openqa.selenium.WebDriver;


public class Browser {

    private final WebDriver webDriver = DriverHandler.getWebDriver();

    public AmazonWebsite amazon;

    public Browser(){
        amazon = new AmazonWebsite();
    }

}
