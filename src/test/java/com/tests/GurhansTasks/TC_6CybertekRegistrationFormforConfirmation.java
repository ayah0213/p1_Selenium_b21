package com.tests.GurhansTasks;

import com.github.javafaker.Faker;
import com.tests.Base.TestBase;
import com.tests.Utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TC_6CybertekRegistrationFormforConfirmation extends TestBase {


    @Test
    public void regitsrsation_form(WebDriver driver) throws IOException {

        Properties properties = new Properties();
        String path="configuration.properties";
        FileInputStream file=new FileInputStream(path);
        properties.load(file);
        String regFormUrl= properties.getProperty("registrFormUrl");
        driver.get(regFormUrl);
        BrowserUtilities.sleep(2);
        Faker faker= new Faker();

        WebElement fName= driver.findElement(By.xpath("//input[@placeholder='first name']"));
        BrowserUtilities.sleep(2);

        WebElement lName= driver.findElement(By.xpath("//input[@placeholder='last name']"));
        lName.sendKeys(faker.name().lastName());
        BrowserUtilities.sleep(2);

        WebElement userName= driver.findElement(By.xpath("//input[@placeholder='username']"));
        userName.sendKeys(faker.lorem().characters(8,10)+faker.number().digits(6));

        WebElement email= driver.findElement(By.xpath("//input[@placeholder='email@email.com']"));
        email.sendKeys(faker.internet().emailAddress());

       WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
       password.sendKeys(faker.internet().password(8,16));
       BrowserUtilities.sleep(2);

        WebElement phoneNumber= driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("256-262-2789");
        BrowserUtilities.sleep(2);

        WebElement genderF= driver.findElement(By.xpath("//input[@value='female']"));
        genderF.click();
        BrowserUtilities.sleep(2);

        WebElement dob= driver.findElement(By.xpath("//input[@name='birthday']"));
        dob.sendKeys(faker.number().numberBetween(1,12)+"/"+faker.number().numberBetween(01,28)+"/"+faker.number().numberBetween(1900,2020));
        BrowserUtilities.sleep(2);

        Select select= new Select(driver.findElement(By.xpath("//select[@name='department']")));
        select.selectByVisibleText("Select your Department/Office");
        BrowserUtilities.sleep(2);

        Select select1=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        select1.getFirstSelectedOption();
        BrowserUtilities.sleep(2);

       WebElement lanJAva= driver.findElement(By.xpath("//input[@value='java']"));
       lanJAva.click();
       BrowserUtilities.sleep(2);

       WebElement signUpButton= driver.findElement(By.id("wooden_spoon"));
       signUpButton.click();
WebElement succesMsg= driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));
String actualMsg= succesMsg.getText();
String expectedmsg="You've successfully completed registration!";
        Assert.assertEquals(actualMsg,expectedmsg);
        System.out.println(actualMsg);




    }
}
