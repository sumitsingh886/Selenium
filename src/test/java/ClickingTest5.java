import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class ClickingTest5 {

    @Test
    public void clickingTest(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id("firstName"));
        WebElement checkBox = driver.findElement(By.id("heard-about"));
        WebElement registerButton = driver.findElement(By.id("register"));

        checkBox.click();
        registerButton.click();

        DemoHelper.pause();

        driver.quit();
    }
    @Test
    public void doubleClickingTest(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement checkBox = driver.findElement(By.id("heard-about"));
        Actions actions = new Actions(driver); //Actions is a object
        actions.doubleClick(checkBox).perform();
        actions.contextClick(checkBox).perform(); //right click

        DemoHelper.pause();
        driver.quit();
    }
}

