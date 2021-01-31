package com.tests.tests;

import com.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddRemoveButtons50Times {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testadDelete50elements() throws InterruptedException {
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i <= 50; i++) {
            addElement.click();
        }
        List<WebElement> deletebuttonisdispl = driver.findElements(By.xpath("//div[@id='elements']"));
        for (WebElement each : deletebuttonisdispl) {
            if (each.isDisplayed()) {
                System.out.println("TEst passed al delete buttons dipslayed after clicking them 50 times");
            } else {
                System.out.println("Test failed delete buttons are not dispalyed after clicking");


            }
        }
        List<WebElement> deleteeach = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        for (WebElement each : deleteeach) {
            each.click();
        }

        List<WebElement> deleteNotDisplayed = driver.findElements(By.xpath("//button[.='Delete']"));
        if (!deleteNotDisplayed.equals("Delete")){
            System.out.println("Test passed");
        }else {
            System.out.println("TEst failed");
        }



    }
    @AfterMethod
    public void teardwown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


}
