package pages;

import com.tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicPAge {
    public DynamicPAge(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    public WebElement startButton;

    @FindBy(id = "username")
    public WebElement userNameInput;

    @FindBy(id = "pwd")
    public WebElement passportInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement summitBTN;

    @FindBy(id="flash")
    public WebElement invalidPasswordMSG;

}
