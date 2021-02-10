package com.tests.Base;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase2 {

    @BeforeMethod
    public void setup(){
        String url= ConfigurationReader.getProperty("allertUrl");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);




    }
    @AfterMethod
    public void tearDown(){
        BrowserUtilities.sleep(3);
        Driver.close();
    }
}
