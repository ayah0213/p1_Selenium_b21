package com.tests.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFActory {

    //2nd way of creating Webdriver Factory method
    public static WebDriver getDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Goven browser type  doesnt exist ");
            return null;
        }

    }


    ///     1st way of creating Webdriver Factory method
//   public static WebDriver getDriver(String browserType){
//       if (browserType.equalsIgnoreCase("chrome")){
//           WebDriverManager.chromedriver().setup();
//           return new ChromeDriver();
//       }else if (browserType.equalsIgnoreCase("firefox")){
//           WebDriverManager.firefoxdriver().setup();
//           return new FirefoxDriver();
//       }else if (browserType.equalsIgnoreCase("ie")){
//           WebDriverManager.iedriver().setup();
//           return new EdgeDriver();
//       }
//       return null;
//   }

}
