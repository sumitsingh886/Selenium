import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Iframe {
    @Test
    public void frame_1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        //First frame
        driver.switchTo().frame("moneyiframe");
        WebElement NSE  = driver.findElement(By.id("nseindex"));
        System.out.println(NSE.getText());
        //Switch to main page
        driver.switchTo().defaultContent();

        driver.quit();
    }
    @Test
    public void frame_2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vinothqaacademy.com/iframe/");
        //First frame
        driver.switchTo().frame("homepage");
        WebElement NSE  = driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-default']"));
        System.out.println(NSE.getText());
        //Switch to main page
        driver.switchTo().defaultContent();
        //Second frame
        driver.switchTo().frame("popuppage");
        driver.findElement(By.name("alertbox")).click();
        driver.switchTo().alert().accept();
        //find total number of iframe on web page

        driver.switchTo().defaultContent();
        int iframeCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframeCount);
        driver.quit();
    }
    @Test
    public void nestedFrame_3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.findElement(By.linkText("Iframe with in an Iframe")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
        driver.quit();
    }
}
