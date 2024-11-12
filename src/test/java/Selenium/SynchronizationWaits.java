import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SynchronizationWaits {
        WebDriver driver = new ChromeDriver();
    @Test
    public void implicitWaitTest() {

        driver.get("https://www.google.co.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Gmail")).click();

//        Stopwatch watch = null;
//        try {
//            watch = Stopwatch.createStarted();
//            driver.findElement(By.linkText("Gmailsadd")).click();
//        } catch (Exception e){
//            watch.stop();
//            System.out.println(e);
//            System.out.println(watch.elapsed(TimeUnit.SECONDS) + "Seconds");
//        }
        driver.quit();
    }

    @Test
    public void explicitWaitTest() {
        driver.get("https://www.google.co.in/");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Stopwatch watch = null;
        try {
            watch = Stopwatch.createStarted();
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
            element.click();
        } catch (Exception e){
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + "Seconds");
        }


        driver.quit();
    }
    @Test
    public void fluentWaitTest(){
        driver.get("https://www.google.co.in/");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("This is custom message")
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
        //Failed
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmailfdsdf")));
        element.click();
        driver.quit();
    }

}

