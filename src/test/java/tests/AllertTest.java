package tests;


import com.tests.Base.TestBase2;
import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllertPractice;


public class AllertTest  extends TestBase2 {

        @Test(description = "Click on JsAllert")
        public void test1(){
            AllertPractice alertParctice = new AllertPractice();
            alertParctice.clickJsAler();
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
           BrowserUtilities.sleep(5);
           Assert.assertEquals(alertParctice.succesJsAlertMsg.getText(), "You successfuly clicked an alert");

        }

    @Test(description = "Click on JsAllert")
    public void test2(){
        AllertPractice alertParctice = new AllertPractice();
        alertParctice.clickJsConfirm();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        BrowserUtilities.sleep(5);
        Assert.assertEquals(alertParctice.JsConfirmMsg.getText(), "You clicked: Ok");

    }


    @Test(description = "Click on JsAllert")
    public void test3(){
        AllertPractice alertParctice = new AllertPractice();
        alertParctice.clickJsPromp();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello world");
        BrowserUtilities.sleep(3);
        alert.accept();
        Assert.assertEquals(alertParctice.helloWorldms.getText(), "You entered: hello world");

    }


        }


