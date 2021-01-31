package com.myOwnPractice.myOwnTests;

import com.myOwnPractice.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForgotPAssword {
    WebDriver driver;

    @BeforeMethod
    public void testSetUp() {
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void elementFind() {
        List<WebElement> allWebelements = driver.findElements(By.xpath("//body"));


        for (WebElement each : allWebelements) {
            if (each.isDisplayed()) {
                System.out.println("Congrats your test passed, each  webelement :" + each.getText());
            } else {
                System.out.println("sorry your test Failed");
            }

        }
//      WebElement homeLink= driver.findElement(By.xpath("//a[.='Home']"));
//      WebElement forgotPassword= driver.findElement(By.xpath());
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
