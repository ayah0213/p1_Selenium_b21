package com.tests.Base;

import com.tests.Utilities.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.tests.Utilities.WebDriverFActory;


import java.util.concurrent.TimeUnit;

public abstract class TestBase {


    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFActory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return ;

    }
    @AfterMethod
    public void teardown () throws InterruptedException {
        Thread.sleep(3);
        driver.close();
    }
}