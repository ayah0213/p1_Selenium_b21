package com.tests.GurhansTasks;

import com.tests.Base.TestBase2;
import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.testng.annotations.Test;

public class LoginTestWithTEstBase extends TestBase2 {

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
