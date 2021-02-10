package tests;

import com.tests.Base.TestBase2;
import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests  extends TestBase2 {

    @Test(description = "VErify that page title is a Dashboard")
    public void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager73","UserUser123");
        BrowserUtilities.sleep(3);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");
    }

}
