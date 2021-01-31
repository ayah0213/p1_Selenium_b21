package com.tests.tests;

import com.tests.Utilities.SmartBearethodLogin;
import com.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearDeleteOrder {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFActory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearethodLogin.smartBlogin(driver);
    }
    @Test
    public void TC9_deleteOrder(){
        WebElement markSmith= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[3]//td[1]"));
        markSmith.click();
        WebElement deleteButton =driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']"));
        deleteButton.click();

    }
    @Test
    public void editOrde() throws InterruptedException {
        WebElement editButton= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[4]//td[13]"));
        editButton.click();
        Thread.sleep(2000);
        WebElement chnagedName= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        chnagedName.clear();
        Thread.sleep(2000);
        chnagedName.sendKeys("Michael Jordan");
        Thread.sleep(2000);
        WebElement updateButton= driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();
        Thread.sleep(3000);
        List<WebElement> wholeListNames=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody//td[2]"));
        String expectedName="Michael Jordan";
        for (WebElement each: wholeListNames){
            if (each.getText().equals(expectedName)){
                Assert.assertTrue(each.getText().equals(expectedName));
            }
        }


//Assert.assertTrue(wholeListNames.equals(wholeListNames.contains("Michael Jordan")));
    }
    @AfterMethod
    public void teardonw() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }}
////table[@class='SampleTable']//tr[4]//td[13]