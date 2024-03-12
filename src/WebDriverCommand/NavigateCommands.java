package WebDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        System.out.println(driver.getTitle());

        driver.navigate().to("https://www.google.com/webhp");  // navigate to different window
        System.out.println(driver.getTitle());

        driver.navigate().back();    // navigate back to previous link
        System.out.println(driver.getTitle());

        driver.navigate().forward();  // navigate to forward window
        System.out.println(driver.getTitle());

        driver.navigate().refresh();  // refresh the page

        driver.quit();
    }
}
