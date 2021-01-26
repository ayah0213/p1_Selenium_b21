package com.myOwnPractice.tests;

import com.myOwnPractice.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifySimpleDropDown {
    WebDriver driver;
    @BeforeMethod
    public void testsetup(){
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void simpleDropDown() throws InterruptedException {
        Select defaultOption= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String actual= defaultOption.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        Thread.sleep(3000);
        Assert.assertEquals(actual,expected);
        Thread.sleep(3000);
       Select staedefVal= new Select(driver.findElement(By.xpath("//select[@id='state']")));
       String actualStat=staedefVal.getFirstSelectedOption().getText();
       String expState="Select a State";
       Assert.assertEquals(actualStat,expState);

    }
    @Test
    public void selectStateDropdoqn(){
        Select staedefVal= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStat=staedefVal.getFirstSelectedOption().getText();
        String expState="Select a State";
        Assert.assertEquals(actualStat,expState);

    }
    @Test
    public void sleect3states() throws InterruptedException {
        Select multipleChoice= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        multipleChoice.selectByValue("IL");
        Thread.sleep(2000);
        multipleChoice.selectByVisibleText("Virginia");
        Thread.sleep(2000);
        multipleChoice.selectByValue("CA");
        Thread.sleep(2000);
        String actualRes=multipleChoice.getFirstSelectedOption().getText();
        String expectedRes="California";
        Assert.assertEquals(actualRes,expectedRes);
    }
    @Test
    public void sleectDAte() throws InterruptedException {
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select month= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select day= new Select(driver.findElement(By.xpath("//select[@id='day']")));
        year.selectByVisibleText("1922");
        Thread.sleep(2000);
        month.selectByValue("11");
        Thread.sleep(2000);
        day.selectByIndex(1);
        Thread.sleep(2000);

    }
    @Test
    public void selectAllOptions() throws InterruptedException {
        Select allOptions = new Select(driver.findElement(By.xpath("(//select)[1]")));
        List<WebElement> allOPTIONS = allOptions.getOptions();
        for (WebElement each : allOPTIONS) {
            each.click();
            Thread.sleep(2000);
            System.out.println(each.getText());
        }
    }

      @Test
      public void selectMultipleOptionDropDown() throws InterruptedException {
          Select allLAng = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
          List<WebElement> list= allLAng.getOptions();
          for (WebElement each: list){
              each.click();
              System.out.println("Each language is selected: " + each.getText());
           Thread.sleep(3000);
         Assert.assertTrue(each.isSelected(),"The options is selected: "+each.getText());

      }
}
@Test
public void nonSelcte(){
        WebElement nonSelecte= driver.findElement(By.id("dropdownMenuLink"));
        nonSelecte.click();
      WebElement facebook = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[4]"));
      facebook.click();
     String actTitle = driver.getTitle();
    Assert.assertEquals(actTitle,"Facebook - Log In or Sign Up");




}
    @AfterMethod
    public void teardonw() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


}
