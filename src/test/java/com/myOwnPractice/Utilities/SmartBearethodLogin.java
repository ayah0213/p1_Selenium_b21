package com.myOwnPractice.Utilities;


import com.myOwnPractice.tests.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearethodLogin {
    /*
           Make the method static so that we dont have to create
           instance of the class.
        */


    public static void smartBlogin(WebDriver driver) {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement login = driver.findElement(By.name("ctl00$MainContent$username"));
        login.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.name("ctl00$MainContent$login_button"));
        loginButton.click();

    }

    public static void removeNameMethod(WebDriver driver, String name) {
        // firts finding that particullar checkbox for name whicever we want to delete
        // concatenta our WEBELEMENt with STring cause in the future we will use any otehr name
        WebElement deleteNameCheckButton= driver.findElement(By.xpath("(//td[2]//tr/td[.='"+name+"']/..//input)[1]"));
        deleteNameCheckButton.click();
        WebElement deletebutton = driver.findElement(By.name("ctl00$MainContent$btnDelete"));
        deletebutton.click();

        List<WebElement> listOfNames = driver.findElements(By.xpath("(//table)[2]//tr//td"));
        for (WebElement each : listOfNames) {
            if (each.getText().equals(name)) {
                System.out.println("Test failed, your name" +name+" wasnt removed");
            }else {
                Assert.assertNotEquals(each.getText(),name);
            }

        }

    }
}