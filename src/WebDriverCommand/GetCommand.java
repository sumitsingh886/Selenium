package WebDriverCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();

        // Get Commands

        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); // Open the URL on the browser

        System.out.println( driver.getTitle()); // Return the title of the page

        System.out.println(driver.getCurrentUrl()); // Return the URL

        WebElement heading = driver.findElement(By.xpath("html/body/main/div/div/div/h1"));
        System.out.println(heading.getText()); // Return the text value of element

        driver.quit();
    }
}
