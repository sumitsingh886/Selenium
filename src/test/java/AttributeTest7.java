import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class AttributeTest7 {

    @Test
    public void isEnabledTest(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement textarea = driver.findElement(By.id("textarea"));
        Assert.assertFalse(textarea.isEnabled());

        WebElement checkbox = driver.findElement(By.id("heard-about"));

        if(textarea.isEnabled()){
            textarea.sendKeys("Hello");
        } else {
            checkbox.click();
            textarea.sendKeys("Hello All");
            DemoHelper.pause();
        }

        driver.quit();
    }

    @Test
    public void isDisplayedTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement errorMessage = driver.findElement(By.className("invalid-feedback"));
        Assert.assertFalse(errorMessage.isDisplayed());
        System.out.println((errorMessage.isDisplayed()));

        driver.findElement(By.id("register")).click();
        DemoHelper.pause();
        Assert.assertTrue(errorMessage.isDisplayed());
        System.out.println(errorMessage.isDisplayed());

        driver.quit();
    }
}
