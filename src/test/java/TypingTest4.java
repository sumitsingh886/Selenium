import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class TypingTest4 {

    @Test
    public void typingTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement dob = driver.findElement(By.id("dob"));

        first.sendKeys("Sumit");
        last.sendKeys("Prajapati");
        email.sendKeys("sk5006093@gmail.com");
        DemoHelper.pause();
        email.clear();
        email.sendKeys("sumit.singh@acsicorp.com");
        dob.sendKeys("15/05/2001");

        DemoHelper.pause();
        driver.quit();
    }
}
