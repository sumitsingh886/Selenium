import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class understandingWebElement3 {

    @Test
    public void webElementTest() {

        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement input = driver.findElement(By.id("firstName"));
        System.out.println(input.isDisplayed());

        WebElement registerButton = driver.findElement(By.id("register"));
        System.out.println(registerButton.getText());
        registerButton.click();

        driver.quit();

    }

 }
