package com.tests.GurhansTasks;


import com.github.javafaker.Faker;
import com.tests.Utilities.SmartBearethodLogin;
import com.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearLinkVErification {
    WebDriver driver;
   @BeforeMethod
    public void setup(){
       driver= WebDriverFActory.getDriver("chrome");
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       SmartBearethodLogin.smartBlogin(driver);
   }
   @Test
    public void smartBlinkVerif() throws InterruptedException {
       List<WebElement> listAlllink = driver.findElements(By.xpath("//li"));
       int countOfLinks = listAlllink.size();
       System.out.println(" and count of all links are: "+countOfLinks);
       for (WebElement eachLink : listAlllink){
           System.out.println(eachLink.getText());
       }

   }

   @Test
           public void smartBorderPlacement() throws InterruptedException {
       WebElement loginOrder= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
       loginOrder.click();
       Select famAlbum= new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
       famAlbum.selectByVisibleText("FamilyAlbum");
       Thread.sleep(2000);

       WebElement quantity= driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
       quantity.sendKeys(Keys.BACK_SPACE);
       quantity.sendKeys("2");
       Thread.sleep(2000);
       WebElement calculateButton= driver.findElement(By.xpath("//input[@type='submit']"));
       calculateButton.click();
       Thread.sleep(2000);
       Faker faker = new Faker();

       WebElement name = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
       name.sendKeys(faker.name().fullName());
       Thread.sleep(2000);
       WebElement street= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
       street.sendKeys(faker.address().streetAddress());
       Thread.sleep(2000);

       WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
       city.sendKeys(faker.address().cityName());
       Thread.sleep(2000);

       WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
       state.sendKeys(faker.address().state());
       Thread.sleep(2000);

       WebElement zipCode= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
       zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));
       Thread.sleep(2000);

       WebElement selectVisa= driver.findElement(By.xpath("//input[@type='radio']"));
       selectVisa.click();
       Thread.sleep(2000);

       WebElement cradNum= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
       cradNum.sendKeys(faker.finance().creditCard().replaceAll("-",""));
       Thread.sleep(2000);

       WebElement expDate= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
       expDate.sendKeys("02/19");
       Thread.sleep(2000);




       WebElement porcessButton= driver.findElement(By.className("buttons_process"));
porcessButton.click();
Thread.sleep(2000);
WebElement succesMsg= driver.findElement(By.xpath("//div[@class='buttons_process']/strong "));
boolean succesM=succesMsg.isDisplayed();
Assert.assertTrue(succesM, "New order has been successfully added.");
   }
   @AfterMethod
    public void teardonw() throws InterruptedException {
       Thread.sleep(3000);
       driver.close();
   }
}

