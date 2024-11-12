import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class HandleDialogTest11 {

    @Test
    void dismissAlertTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        first.sendKeys("Sumit");
        last.sendKeys("Singh");

        DemoHelper.pause();
        driver.findElement(By.id("clear")).click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        Assert.assertEquals(first.getAttribute("value"), "Sumit");
        Assert.assertEquals(last.getAttribute("value"), "Singh");
        DemoHelper.pause();


        driver.quit();

    }

    @Test
    void acceptAlertTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        first.sendKeys("Sumit");
        last.sendKeys("Singh");

        DemoHelper.pause();
        driver.findElement(By.id("clear")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertEquals(first.getAttribute("value"), "");
        Assert.assertEquals(last.getAttribute("value"), "");
        DemoHelper.pause();
    }
}
