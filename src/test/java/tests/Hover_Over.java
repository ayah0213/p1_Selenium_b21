package tests;

import com.tests.Utilities.BrowserUtilities;
import com.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Hover_Over {

    /*
    TC	#15:	Hover	Test
    1.Go	to	http://practice.cybertekschool.com/hovers
    2.Hover	over	to	first	image
    3.Assert:	a.“name:	user1”	is	displayed
    4.Hover	over	to	second	image
    5.Assert:	a.“name:	user2”	is	displayed
    6.Hover	over	to	third	image
    7.Confirm:	a.“name:	user3”	is	d
     */

    @Test(description = "Hover over Test")
    public void hoverOver(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        Actions action =new Actions(Driver.getDriver());

        List<WebElement> listPictures= Driver.getDriver().findElements(By.xpath("//div[@class='figure']"));
        for (WebElement eachPicture: listPictures) {
            BrowserUtilities.sleep(3);
            action.moveToElement(eachPicture).build().perform();
            Assert.assertTrue(eachPicture.isDisplayed());
            System.out.println(eachPicture.getText());

        }
//        List<String> expected = new ArrayList<>();
//            expected.addAll(Arrays.asList(actual));


    }
}
