package TestNG.HeadlessBrowserDemo;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrowser {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http:/www.google.com");

        System.out.println("Before Search: " + driver.getTitle());

        WebElement searchbox = driver.findElement(By.className("gLFyf"));
        searchbox.sendKeys("India Gate");
        searchbox.sendKeys(Keys.ENTER);

        DemoHelper.pause();
        System.out.println("After Search: " + driver.getTitle());
        DemoHelper.pause();

        driver.quit();
    }
}
