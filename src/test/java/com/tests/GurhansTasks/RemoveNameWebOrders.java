package com.tests.GurhansTasks;

import com.tests.Base.TestBase;
import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.SmartBearethodLogin;
import org.testng.annotations.Test;


public class RemoveNameWebOrders extends TestBase {

    @Test
    public void removngName(){
   SmartBearethodLogin.smartBlogin(driver);
  BrowserUtilities.sleep(3);
  SmartBearethodLogin.removeNameMethod(driver,"Samuel Clemens");


    }
            }

//SmartBearethodLogin.removeNameMethod(driver,"Clare Jefferson");


