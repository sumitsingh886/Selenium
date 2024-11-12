package TestNG.Listener;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.time.Duration;

//@Listeners(TestNG.Listener.TestNGListenerClass.class)
public class TestNGListener {
    @Test
    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        DemoHelper.pause();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

        driver.quit();
    }
    @Test
    public void testFail(){
        System.out.println("Failed test case");
        Assert.assertTrue(false);

    }
    @Test
    public void testSkipped (){
        System.out.println("Skipped test case");
        throw new SkipException("Skip Exception thrown.....");

    }


}
