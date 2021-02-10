package tests;

import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginTryCRM;

public class LoginCRMTest {

@BeforeMethod
public void setup(){
    String url = ConfigurationReader.getProperty("CRM");
    Driver.getDriver().get(url);
}


    @Test(dataProvider = "loginCredentials",dataProviderClass = DataProviderDemo.class)
    public void login(String userName, String password){

        LoginTryCRM login= new LoginTryCRM();
        login.login(userName, password);


    }
    @AfterMethod
    public void logOUT(){
        Driver.getDriver().close();
    }


}
