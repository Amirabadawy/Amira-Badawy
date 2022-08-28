package com.amazon.website.tests.smokeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\Downloads\\Amira-Badawy\\Amazon-Task\\src\\test\\java\\com\\amazon\\website\\tests\\smokeTest\\SmokeTest.feature",
        glue = {"com/amazon/website/tests/smokeTest"},
        plugin = {"pretty","html:reports/AmazonSmokeTest-Report.html"},
        monochrome = true
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
