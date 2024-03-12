package WebDriverCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        System.out.println(driver.findElement(By.name("my-text")).isDisplayed()); // Check the field is displayed or not

        System.out.println(driver.findElement(By.name("my-disabled")).isEnabled()); // CHeck the field is enable or not

        System.out.println(driver.findElement(By.id("my-check-1")).isSelected()); // check the checkbox and radio button is selected or not

        driver.quit();
    }
}
