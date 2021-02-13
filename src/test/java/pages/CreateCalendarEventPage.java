package pages;

import com.tests.Base.TestBase2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCalendarEventPage extends TestBase2 {

    @FindBy(css = ".select2-chosen")
     public WebElement ownerName;

    public CreateCalendarEventPage(){

    }

}
