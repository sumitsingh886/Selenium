import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static helper.Pages.HOME;

public class FindMultipleElementsTest8 {

    @Test
    public void multipleElementTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        List<WebElement> errorMessage = driver.findElements(By.className("invalid-feedback"));

        print(errorMessage.get(0).getText());
        print(errorMessage.get(1).getText());
        print(errorMessage.get(2).getText());

        driver.findElement(By.id("register")).click();

        print(errorMessage.get(0).getText());
        print(errorMessage.get(1).getText());
        print(errorMessage.get(2).getText());

        driver.quit();
    }

    private void print(String text){
        System.out.println("Error Message " + text);
    }
}
