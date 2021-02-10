package tests;

import com.tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHAndler {


    @Test(description = "window handler practice")
    public void windows_Handler(){
        Driver.getDriver().get("http://practice.cybertekschool.com/windows");
        String expected="Practice";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));
        WebElement clickHereBtn=Driver.getDriver().findElement(By.xpath("//a[@href='/windows/new']"));
        clickHereBtn.click();
        Driver.getDriver().switchTo();
        String expectedTitle="New Window";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));


    }

    /*2=============
TC	#	:	Window	Handlepractice
1.Create	a	new	class	called:	WindowHandlePractice
2.Create	new	test	and	make	set	ups
3.Go	to	:	http://practice.cybertekschool.com/windows
4.Assert:	Title	is	“Practice”
5.Click	to:	“Click	Here”text
6.Switch	to	new	Window.
7.Assert:	Title	is	“New	Window
 */
}
