package com.tests.Base;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class TestBase2 {

    @BeforeMethod
    public void setup(){
        String url= ConfigurationReader.getProperty("vyTrackUrl");
        Driver.getDriver().get(url);
       // Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 }




    @FindBy(name = "_username")
    public WebElement username;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(name="_submit")
    public WebElement submitButton;


    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;


    public void TestBase2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void logout(){
        BrowserUtilities.sleep(3);
        BrowserUtilities.clickWithJs(username);
        BrowserUtilities.clickWithJs(logoutLink);
    }

    public void  login(String userName, String passw){
        username.sendKeys(userName);
        password.sendKeys(passw, Keys.ENTER);
        submitButton.click();
    }


    @AfterMethod
    public void tearDown(){
        BrowserUtilities.sleep(3);
        Driver.close();
    }
}
