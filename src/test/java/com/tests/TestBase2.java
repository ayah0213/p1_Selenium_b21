package com.tests;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase2 {

    @BeforeMethod
    public void setup(){
        String url= ConfigurationReader.getProperty("vyTrackUrl");
        Driver.get().get(url);


    }
    @AfterMethod
    public void tearDown(){
        BrowserUtilities.sleep(3);
        Driver.close();
    }
}
