package TestNG;

import helper.DemoHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void verifyPageTitle() {

        //Launch Chrome
        WebDriver driver = new ChromeDriver();
        //OpenURL
        driver.get("https://www.google.co.in/");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        DemoHelper.pause();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.quit();
    }
}
