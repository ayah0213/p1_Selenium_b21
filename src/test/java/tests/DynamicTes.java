package tests;

import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPAge;

public class DynamicTes {
    @Test(description = "Click to Submit button8.Assert “Your passwordis invalid!” text is displayed.")
    public void dynamic_load() {
        String url = ConfigurationReader.getProperty("dynamicUrl");
        Driver.getDriver().get(url);
        DynamicPAge cybertekDynamic = new DynamicPAge();
        cybertekDynamic.startButton.click();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(cybertekDynamic.userNameInput));


        Assert.assertTrue(cybertekDynamic.userNameInput.isDisplayed());

        // 5.Enter username: tomsmith
        cybertekDynamic.userNameInput.sendKeys("tomsmith");

        // 6.Enter password: incorrectpassword
        cybertekDynamic.passportInput.sendKeys("incorrectpassword");

        // 7.Click to Submit button8.Assert “Your passwordis invalid!” text is displayed.
        cybertekDynamic.summitBTN.click();
        Assert.assertTrue(cybertekDynamic.invalidPasswordMSG.isDisplayed());
    }


}


