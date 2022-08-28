package com.ksrtc.website.tests.booking;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\Downloads\\Amira-Badawy\\Ksrtc-Task\\src\\test\\java\\com\\ksrtc\\website\\tests\\booking\\Booking.feature",
        glue = {"com/ksrtc/website/tests"},
        plugin = {"pretty","html:reports/Booking-Report.html"},
        monochrome = true
)
public class BookingTestRunner extends AbstractTestNGCucumberTests{
}
