package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
    @Test
    public void simpleAlert() {
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //open url
        driver.get("https://demo.automationtesting.in/Alerts.html");
        //find alert button and preform click action
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        //switch to alert window and accept the alert
        driver.switchTo().alert().accept();

        driver.quit();
    }
    @Test
    public void confirmAlert() {
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //open url
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();
        //find alert button and preform click action
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        //switch to alert window and accept the alert
//        driver.switchTo().alert().accept(); // ok button is clicked
        //switch to alert window and dismiss the alert
        driver.switchTo().alert().dismiss(); // cancel button is clicked
//button[@onclick='promptbox()']
//        driver.quit();
    }
    @Test
    public void promptAlert() {
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //open url
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        //find alert button and preform click action
        driver.findElement(By.xpath("//a[@id='prompt']")).click();

        driver.switchTo().alert().sendKeys("Sumit");
        driver.switchTo().alert().accept();

    }
}
