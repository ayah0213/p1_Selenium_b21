package com.tests.tests;

import com.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddRemoveElements {
    WebDriver driver;

    @BeforeMethod
    public void addRemoveElements() {
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @Test
    public void addRemoveMethods() throws InterruptedException {
        WebElement addElementbutton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementbutton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println(" TEst PAssed, Delete button is dipslayed after clicking add Element button");
        } else {
            System.out.println("Test Passed");
        }

        if (deleteButton.isDisplayed()) {
            System.out.println("Good job Test Passed, DELETE button is gone");
        } else {
            System.out.println("Sorry DELETE button still displaed, test FAiled");

            deleteButton.click();
            Thread.sleep(3000);


        }
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
