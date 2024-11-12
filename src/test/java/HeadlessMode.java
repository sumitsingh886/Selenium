import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class HeadlessMode {
    @Test
    public void headlessMode(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless=true");

        WebDriver driver = new ChromeDriver(options);
        driver.get(HOME);

        WebElement buttons = driver.findElement(By.id("register"));
        System.out.println(buttons.getText());
    }
}
