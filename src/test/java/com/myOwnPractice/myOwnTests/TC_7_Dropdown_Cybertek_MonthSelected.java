package com.myOwnPractice.myOwnTests;

import com.myOwnPractice.Utilities.BrowserUtilities;
import com.myOwnPractice.Utilities.ConfigurationReader;
import com.myOwnPractice.tests.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Properties;

public class TC_7_Dropdown_Cybertek_MonthSelected extends TestBase {

    @Test
public void dropdownMothsSelected() throws IOException {

    //   ConfigurationReader.getProperty("dropdown");

        BrowserUtilities.sleep(5);

        driver.get("http://practice.cybertekschool.com/dropdown");
        Select select= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String currentMonth=select.getFirstSelectedOption().getText();
        String expeCurrentMonth= LocalDate.now().getMonth().name();
      //  Assert.assertTrue(currentMonth,expeCurrentMonth);
        System.out.println("Current montsh is :"+ currentMonth);





//        Properties properties= new Properties();
//        String path="configuration.properties";
//        FileInputStream file = new FileInputStream(path);
//        properties.load(file);
//        String dropdownUrl= properties.getProperty("dropdrown");
//        BrowserUtilities.sleep(2);



    }
}
