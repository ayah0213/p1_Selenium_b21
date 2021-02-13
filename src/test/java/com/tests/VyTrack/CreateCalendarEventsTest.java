package com.tests.VyTrack;

import com.tests.Base.TestBase2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarEventsPages;
import pages.CreateCalendarEventPage;
import pages.LoginVyTrackPage2;

public class CreateCalendarEventsTest extends TestBase2 {


    @Test(description = "verify owner's name is  Stephan Tremaine Haley")
    public void test1(){
        LoginVyTrackPage2 login = new LoginVyTrackPage2();
        CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
        CalendarEventsPages calendarEventsPages= new CalendarEventsPages();

        login.login("storemanager85","UserUser123");
        login.navigateTo("Activities","Calendar Events");
        calendarEventsPages.clickToCalendarEvent();

        String expectedOwner = "Stephan Tremaine Haley";
        String actual=createCalendarEventPage.ownerName.getText();
        Assert.assertEquals(expectedOwner,actual);

    }

}
