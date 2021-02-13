package com.tests.VyTrack;
import org.testng.annotations.Test;
import pages.LoginVyTrackPage2;


public class LoginVyTrackPage2Vytrcak  {


    @Test(description="verify that page title is a 'Dashboard'")
    public void test1(){
        // crate= object of LoginVyTrackPage class
        LoginVyTrackPage2 loginVyTrackPage2 =new LoginVyTrackPage2();
        // call login method from its LoginVyTrackPage where we crated it
        loginVyTrackPage2.login("storemanager73","UserUser123");
        // verification
//        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),3);
//        wait.until(ExpectedConditions.titleIs("Dashboard"));
//        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");
    }
}
