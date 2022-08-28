package com.amazon.website.tests;

import com.amazon.website.driver.DriverHandler;
import io.cucumber.java.Before;

public class HooksHandler extends BaseTest{

    @Before
    public void setUp(){
        driverHandler = new DriverHandler();
        driverHandler.navigate();
    }

//    @After
//    public void tearDown(){
//        driverHandler.close();
//    }
}
