package TestNG.HeadlessBrowserDemo;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverDemo {
    public static void main(String[] args) {
        HtmlUnitDriver driver = new HtmlUnitDriver();

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
