package TestNG.Parallel_Testing;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGParallel2 {
    @Test
            public void verifyLogin(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button"));

        Assert.assertEquals(driver.getTitle(),"Swag Labs");

        DemoHelper.pause();
        driver.quit();

    }
}
