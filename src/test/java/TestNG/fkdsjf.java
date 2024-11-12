package TestNG;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fkdsjf {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/DynamicData.html");
        driver.findElement(By.id("save")).click();
        DemoHelper.pause();
        WebElement firstName = driver.findElement(By.xpath("//div[@id='loading']"));
        System.out.println(firstName.getText());
        driver.quit();




//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        DemoHelper.pause();
//        String printData = js.executeScript("return document.getElementById('loading').innerText").toString();
//        System.out.println(printData);
    }
}
