package com.tests.VyTrack;
import com.tests.Base.TestBase2;
import com.tests.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTests extends TestBase2{


    @Test(description="verify that page title is a 'Dashboard'")
    public void test1(){
        // crate= object of LoginPage class
        LoginPage loginPage=new LoginPage();
        // call login method from its LoginPage where we crated it
        loginPage.login("storemanager73","UserUser123");
        // verification
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),3);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");
    }
}
