package com.tests.VyTrack;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginVyTrackPage2;


public class NewCalendarEvents extends LoginVyTrackPage2 {

    @Test(description = "verify page subtitle is equals: All Calendar events")
    public void test1(){
        LoginVyTrackPage2 loginpage= new LoginVyTrackPage2();
        loginpage.login("storemanager85","UserUser123");
        loginpage.navigateTo("Activities","Calendar Events");
        String expectedSubtitle="All Calendar Events";
        String actual = loginpage.getPageTitle();
        Assert.assertEquals(actual,expectedSubtitle);



    }



}
