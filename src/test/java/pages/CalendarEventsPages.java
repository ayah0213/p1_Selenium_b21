package pages;

import com.tests.Base.TestBase2;
import com.tests.Utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPages extends TestBase2 {


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventBtn;


    public void clickToCalendarEvent(){
        BrowserUtilities.waitForVisibility(createCalendarEventBtn,5);
        BrowserUtilities.waitForClickability(createCalendarEventBtn,5);
        createCalendarEventBtn.click();
    }

}
