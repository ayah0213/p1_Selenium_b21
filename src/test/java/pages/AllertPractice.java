package pages;


import com.tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllertPractice {


    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    public WebElement JsAlert;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
    public WebElement JsConfirm;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    public WebElement JsPrompt;

    @FindBy(xpath = "//p[@style='color:green']")
    public WebElement succesJsAlertMsg;

    @FindBy(xpath = "//p[.='You clicked: Ok']")
    public WebElement JsConfirmMsg;

    @FindBy(xpath = "//p[.='You entered: hello world']")
    public WebElement helloWorldms;




    public AllertPractice(){
  PageFactory.initElements(Driver.getDriver(), this);
    }


    public void clickJsAler(){
JsAlert.click();

    }

//    public void setSuccesJsAlertMsg(){
//        succesJsAlertMsg.getText();
//    }
    public void clickJsConfirm(){
        JsConfirm.click();
    }

//    public void setSuccesJsConfirmtMsg(){
//        JsConfirmMsg.getText();
//    }

    public  void clickJsPromp(){
        JsPrompt.click();
    }
}
