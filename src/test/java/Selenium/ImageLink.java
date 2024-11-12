import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImageLink {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/linked_image.html");

        driver.findElement(By.xpath("//img[@id='enclosedImage']")).click();
        if (driver.getTitle().equals("We Arrive Here")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
