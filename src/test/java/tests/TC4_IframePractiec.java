package tests;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4_IframePractiec {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("http://practice.cybertekschool.com/iframe");
        Driver.getDriver().manage().window().maximize();


    }
/*
1==============
TC #4: Iframe practice
1.Create a new class called: IframePractice
2.Create new test and make set ups
3.Go to: http://practice.cybertekschool.com/iframe
4.Assert: “Your content goes here.” Text is displayed.
5.Assert: “An iFrame containing the TinyMCEWYSIWYG Editor
*/

    @Test(description = "Iframe Asseryion text")
    public void IframePractice(){
        WebElement okButton= Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[18]"));
        okButton.click();
        BrowserUtilities.sleep(3);
        Driver.getDriver().switchTo().frame("mce_0_ifr");
        WebElement textMsg=Driver.getDriver().findElement(By.id("tinymce"));
        Assert.assertTrue(textMsg.isDisplayed());
       Driver.getDriver().switchTo().defaultContent();
       String expected="An iFrame containing the TinyMCE WYSIWYG Editor";
       BrowserUtilities.sleep(3);
       String actual=Driver.getDriver().findElement(By.xpath("//h3")).getText();
       Assert.assertTrue(actual.contains(expected));



    }

    @AfterMethod
    public void tearDown(){
        BrowserUtilities.sleep(3);
        Driver.getDriver().close();
    }
}





