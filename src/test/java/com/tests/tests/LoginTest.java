package com.tests.tests;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import com.tests.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest(){
        String url= ConfigurationReader.getProperty("vyTrackUrl");
        Driver.getDriver().get(url);
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtilities.sleep(2);

    }

    @Test
    public void test2(){
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtilities.sleep(2);
    }
}
