package com.tests.GurhansTasks;

import com.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxVerifictaion {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void checkboxVerification() {
        WebElement succesCheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        succesCheckBox.click();
        WebElement succesMsg = driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));
        if (succesMsg.isDisplayed()) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAILED");
        }
        succesCheckBox.click();
        if (!succesMsg.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

    }

    @Test
    public void cheCkAll() throws InterruptedException {
        WebElement checkAll = driver.findElement(By.xpath("//input[@value='Check All']"));

        String actual = checkAll.getAttribute("value");
        String expectedres = "Check All";
        Assert.assertEquals(actual, expectedres);
        Thread.sleep(3000);
        checkAll.click();
        Thread.sleep(3000);

        List<WebElement> allcheckBoxes = driver.findElements(By.xpath("//div[@class='checkbox']"));
        for (WebElement each: allcheckBoxes)
            each.click();

        Thread.sleep(3000);
        WebElement uncheck = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        String act1 = uncheck.getAttribute("value");
        String exp2 = "Uncheck All";
        Assert.assertEquals(act1, exp2);
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
