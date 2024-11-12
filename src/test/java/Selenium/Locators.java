import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        //open sauce demo wage page
        driver.get("https://www.saucedemo.com");

        //Locate username by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Locate password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //Locate login button by className
        driver.findElement(By.className("submit-button")).click();
        //switch to product page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);
        //Locate Sauce Labs Bolt t-Shirt
//        driver.findElement((By.linkText("Sauce Labs Bolt T-Shirt"))).click();

        //Locate Sauce Labs Bolt t-Shirt
        driver.findElement((By.partialLinkText("Bolt T-Shirt"))).click();

        List<WebElement> element = driver.findElements((By.partialLinkText("sauce")));
        System.out.println("Element" + element.size());


        driver.quit();

    }
}
