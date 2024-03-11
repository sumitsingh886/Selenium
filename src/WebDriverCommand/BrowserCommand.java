package WebDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.close(); // Only close the current window
        System.exit(0); // End the WebDriver session
//        Use the close and exit together
//        driver.quit(); // Close the multiple blowser tabs and end the WebDriver session.
    }
}
