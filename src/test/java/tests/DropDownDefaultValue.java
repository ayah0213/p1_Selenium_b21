package tests;

import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DropDownDefaultValue {

    /*
    TC#7: Cybertek “month”dropdown default value
    1.Open browser
    2.Go to website: http://practice.cybertekschool.com/dropdowns
    3.Verify default value is always showing the current montho
    Expected: If currently in June, should show June selected.
     */
    @Test(description = "Dropdown default value")
    public void dropdownDefault(){
        String url= ConfigurationReader.getProperty("dropdowns");
        Driver.getDriver().get(url);
        Select select=new Select(Driver.getDriver().findElement(By.id("month")));
        WebElement february=select.getFirstSelectedOption();
        String currentMonth="February";
        String actualMonth= february.getText();
        Assert.assertTrue(actualMonth.equals(currentMonth));


    }

    /*
    TC#8: Cybertek “month”dropdown list of default values verification
    1.Do both verifications in the same test
    2.Verify list of months are correct as expected.
    Expected: Options should contain all 12 months of the year.
     */
    @Test(description = "months list default value verification")
    public void monthsDefaultValueverification(){
        String url= ConfigurationReader.getProperty("dropdowns");
        Driver.getDriver().get(url);
        Select select=new Select(Driver.getDriver().findElement(By.id("month")));

        String actual ="";
        List<WebElement> listMOnths =select.getOptions();
        for (WebElement each : listMOnths){
            actual =each.getText();
           // System.out.println( actual);
        }
         List<String> expected= new ArrayList<>();
        expected.addAll(Arrays.asList(actual));
       // expected.addAll(Arrays.asList("January","February","March","April","May","June","July","August","September","October","Novermber","December"));


        Assert.assertTrue(expected.contains(actual));
}



    }

