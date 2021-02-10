package pages;

import com.tests.Utilities.ConfigurationReader;
import com.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTryCRM {


   @FindBy(name ="USER_LOGIN" )
    public WebElement username;

   @FindBy(name = "USER_PASSWORD")
    public WebElement password;


   @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButtonClick;

   @FindBy(xpath = "//span[.='Log out']")
   public WebElement logoutButton;

    public LoginTryCRM() {
        // Constructor is mandatory if we will use @Find by Elements annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void  login(String userName, String passw){
        username.sendKeys(userName);
        // to bebale to click LOGIN button we use KEYS.Enter
        password.sendKeys(passw, Keys.ENTER);

    }
    public void logOUT(){
        logoutButton.click();
    }



//        logIn.sendKeys(ConfigurationReader.getProperty("marketing"));
//
//        Thread.sleep(2000);
//
//        WebElement password = Driver.getDriver().findElement(By.name("USER_PASSWORD"));
//        password.sendKeys(ConfigurationReader.getProperty("crmPassword"));
//
//        Thread.sleep(2000);
//
//        WebElement logIn_button  = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
//        logIn_button.click();



}
