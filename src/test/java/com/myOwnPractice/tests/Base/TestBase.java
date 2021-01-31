package com.myOwnPractice.tests.Base;

import com.myOwnPractice.Utilities.BrowserUtilities;
import com.myOwnPractice.Utilities.WebDriverFActory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFActory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown(){
        BrowserUtilities.sleep(3);
        driver.close();
    }
}
