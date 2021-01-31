package com.tests;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import com.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        driver = WebDriverFActory.getDriver("chrome");
        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void teardown () throws InterruptedException {
        Thread.sleep(3);
        driver.close();
    }
}