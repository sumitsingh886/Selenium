import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Screenshot {
    @Test
    public void fullPageScreenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/");
        //Capture full page screenshot
        //Step 1: Convert web driver object to TakeScreenshot interface
        TakesScreenshot ts = (TakesScreenshot) driver;
        //Step 2: call getScreenshotsAs method to create image file
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Web Scraping\\Selenium\\Screenshot\\fullPage.png");
        //Step 3: Copy image file into designation
        FileUtils.copyFile(screenshot,destination);
//        Path destination = Paths.get("failure-screenshot.png");

//        Files.move(screenshot.toPath(),destination, REPLACE_EXISTING);

        driver.quit();
    }

    @Test
    public void sectionScreenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/");
        //Capture section screenshot of web page
        //Step 1: Convert web driver object to TakeScreenshot interface
        WebElement section = driver.findElement(By.xpath("//section[@id='overview']"));
        //Step 2: call getScreenshotsAs method to create image file
        File screenshot = section.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Web Scraping\\Selenium\\Screenshot\\fullPage1.png");
        //Step 3: Copy image file into designation
        FileUtils.copyFile(screenshot,destination);
//        Path destination = Paths.get("failure-screenshot.png");

//        Files.move(screenshot.toPath(),destination, REPLACE_EXISTING);
        driver.quit();
    }
    @Test
    public void webElementScreenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/");
        //Capture section screenshot of web page
        //Step 1: Convert web driver object to TakeScreenshot interface
        WebElement section = driver.findElement(By.xpath("//section[@id = 'overview']/div/div[5]/div[2]"));
        //Step 2: call getScreenshotsAs method to create image file
        File screenshot = section.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Web Scraping\\Selenium\\Screenshot\\fullPage2.png");
        //Step 3: Copy image file into designation
        FileUtils.copyFile(screenshot, destination);
//        Path destination = Paths.get("failure-screenshot.png");

//        Files.move(screenshot.toPath(),destination, REPLACE_EXISTING);
        driver.quit();
    }
}