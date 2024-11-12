package TestNG.Parallel_Testing;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGParallel1 {
    @Test
    public void verifyTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        Assert.assertEquals(driver.getTitle(),"Swag Labs");
        DemoHelper.pause();
        driver.quit();

    }
    @Test
    public void verifyLogo(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        WebElement logo = driver.findElement(By.xpath("//*[@class='login_logo']"));

        Assert.assertTrue(logo.isDisplayed());
        DemoHelper.pause();
        driver.quit();

    }

}
