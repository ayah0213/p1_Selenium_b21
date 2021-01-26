package com.myOwnPractice.tests;

import com.myOwnPractice.Utilities.BrowserUtilities;
import com.myOwnPractice.Utilities.SmartBearethodLogin;
import com.myOwnPractice.tests.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class RemoveNameWebOrders extends TestBase {

    @Test
    public void removngName(){
   SmartBearethodLogin.smartBlogin(driver);
  BrowserUtilities.sleep(3);
  SmartBearethodLogin.removeNameMethod(driver,"Samuel Clemens");


    }
            }

//SmartBearethodLogin.removeNameMethod(driver,"Clare Jefferson");


