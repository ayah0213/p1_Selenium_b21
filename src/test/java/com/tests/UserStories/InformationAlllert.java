package com.tests.UserStories;

import com.tests.Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InformationAlllert extends TestBase {
    //TC #1: Information alert practice
    // 1.Open browser
    @Test
    public void infrmation_allert_practie(){
      driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    // 3.Click to “Click for JS Alert”button
    // 4.Click to OK button from the alert
    // 5.Verify “You successfulyclicked an alert”text is displayed.










    // TC #2: Confirmationalert practice
    // 1.Open browser
    // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    // 3.Click to “Click for JS Confirm” button
    // 4.Click to OK button from the alert
    // 5.Verify “You clicked: Ok” text is displayed.
    // TC #3: Information alert practice1.Open browser
    // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    // 3.Click to “Click for JS Prompt” button
    // 4.Send “hello”text to alert
    // 5.Click to OK button from the alert
    // 6.Verify “You entered:  hello” text is displayed.
}
