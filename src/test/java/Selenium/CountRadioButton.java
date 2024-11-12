import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountRadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        List < WebElement> radioButton = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
        System.out.println("TotalCount " + radioButton.size());

        driver.quit();
    }
}
