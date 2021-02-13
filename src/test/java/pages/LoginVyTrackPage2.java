package pages;

import com.tests.Base.TestBase2;
import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginVyTrackPage2 extends TestBase2 {


    // this method will be navigating to tab's and module Vytrcak
    // tab = Dashboards,Fleet,Customers etc.
    // module= "Vehichles, calendars,Calls etc.
    public void navigateTo(String tabName, String moduleName){
        String tab ="//*[normalize-space()='"+ tabName +"' and @class='title title-level-1']";
        String moduleocator = "//*[normalize-space()='"+ moduleName +"' and @class='title title-level-2']";

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tab)));

        WebElement module = Driver.getDriver().findElement(By.xpath(tab));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));

        BrowserUtilities.waitUntillLoaderMaskDisapear();
        module.click();// once we click on Module Submodule should be visible

        WebElement submodule=Driver.getDriver().findElement(By.xpath(moduleocator));
        wait.until(ExpectedConditions.visibilityOf(submodule));
//        wait.until(ExpectedConditions.elementToBeClickable(submodule));
        submodule.click();



    }


    @FindBy(css = "div[class='loader-mask shown']")
    public WebElement loaderMask;


    @FindBy(css = "//h1[class='oro-subtitle']")
    public WebElement pageSubtitle;


    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement warningMsg;


    public String getPageTitle(){
        // any time we re verifying page name or page subtitle , loader mask appears
        BrowserUtilities.waitUntillLoaderMaskDisapear();
        BrowserUtilities.waitForStaleElement(pageSubtitle);
        return pageSubtitle.getText();
    }

    public String getUserName(){
        BrowserUtilities.waitUntillLoaderMaskDisapear();
        BrowserUtilities.waitForVisibility(username,5);
        return username.getText();
    }


    public void getoMyUser(){
        BrowserUtilities.waitUntillLoaderMaskDisapear();
        BrowserUtilities.waitForClickability(username,5).click();
        BrowserUtilities.waitForClickability(myUser,5).click();
    }





}
