package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();

        SoftAssert softAssert = new SoftAssert();

        driver.get("https://testautomationpractice.blogspot.com/");

        System.out.println("Verifying title....");
        String expectedTitle = "Automation Testing Practices";
        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle,"Title Verifying");

        System.out.println("Verify Presence of Wikipedia Icon");
        WebElement wikiLogo = driver.findElement(By.className("wikipedia-icon"));
        softAssert.assertTrue(wikiLogo.isDisplayed());

        System.out.println("Verify Presence of Wikipedia Search Icon");
        WebElement wikiSearchLogo = driver.findElement(By.className("wikipedia-search-button"));
        softAssert.assertTrue(wikiSearchLogo.isDisplayed());

        driver.quit();

        softAssert.assertAll();
    }
}
