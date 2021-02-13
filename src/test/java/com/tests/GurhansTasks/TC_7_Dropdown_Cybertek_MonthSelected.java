package com.tests.GurhansTasks;

import com.tests.Base.TestBase;
import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;
import java.time.LocalDate;

public class TC_7_Dropdown_Cybertek_MonthSelected extends TestBase {
    WebDriver driver;
    @Test
     public void dropdownMothsSelected() throws IOException {

     String dropdownUrl=ConfigurationReader.getProperty("dropdownUrl");
        Driver.getDriver().get(dropdownUrl);
        Select select= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String currentMonth=select.getFirstSelectedOption().getText();
        String expeCurrentMonth= LocalDate.now().getMonth().name();
       Assert.assertEquals(currentMonth,expeCurrentMonth);
       System.out.println("Current montsh is :"+ currentMonth);





    }
}
