package pages;

import com.tests.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "_username")
    public WebElement username;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(name="_submit")
    public WebElement submitButton;


    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement warningMsg;

    public LoginPage() {
        // Constructor is mandatory if we will use @Find by Elements annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // this is reusable login method
    //just call this method and provide username and password
    public void  login(String userName, String passw){
        username.sendKeys(userName);
        // to bebale to click LOGIN button we use KEYS.Enter
        password.sendKeys(passw, Keys.ENTER);
        Driver.getDriver().close();
    }

}
