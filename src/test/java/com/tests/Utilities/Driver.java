package com.tests.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){

    }

    public static WebDriver getDriver(){
        // if webdriver wasnt crated yet
        if (driver==null){
            // create webdriver object based on value from propertie file
            String browser=ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;
                default:
                    // if browser is wrong then throw exception
                    // no browser will be opened
                    throw new RuntimeException("Wrong browser type!");
            }
        }
        return  driver;
    }

    public static void close(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
