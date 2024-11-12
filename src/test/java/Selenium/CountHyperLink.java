import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountHyperLink {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");

        List < WebElement> hyperLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links " + hyperLinks.size());
        for (WebElement i: hyperLinks){
            System.out.println(i.getText());
        }
        driver.quit();
    }
}
