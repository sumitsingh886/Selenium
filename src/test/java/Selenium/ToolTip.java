import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class ToolTip {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String actualTooltip = driver.findElement(By.xpath("//textarea[@id='APjFqb']")).getAttribute("title");

        String expectedTooltip = "Search";

        if(actualTooltip.equals(expectedTooltip)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();

    }
}
