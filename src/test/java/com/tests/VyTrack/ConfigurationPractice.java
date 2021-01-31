package com.tests.VyTrack;

import com.tests.TestBase2;
import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigurationPractice extends TestBase2 {

    //#browser TYPE
    //browser=chrome

    //practiceCybertek=https://practice.cybertekschool.com
    //vyTrackUrl=https://qa1.vytrack.com/

    //#Credentials:
    //vyUsername=storemanager85
    //vyPassw=UserUser123

    @Test
    public void test1(){
       String expectedBrowser="chrome";
       String actual= ConfigurationReader.getProperty("browser");
        Assert.assertEquals(expectedBrowser,actual);
        System.out.println(ConfigurationReader.getProperty("googlUrl"));
        System.out.println(ConfigurationReader.getProperty("vyPassw"));
        System.out.println(ConfigurationReader.getProperty("vyUsername"));

    }

    @Test
    public void test2(){
        System.out.println(Driver.get().getTitle());
        BrowserUtilities.sleep(2);
    }

}
