import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling {
    @Test
    public void verticalScroll() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,500)");
        driver.quit();
    }
    @Test
    public void scrollVisibleElement() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.linkText("Due Date Calculator"));
        js.executeScript("arguments[0].scrollIntoView(0)",element);
        driver.quit();
    }
    @Test
    public void scrollPageBottom() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.quit();
    }
    @Test
    public void horizontalScroll() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codepen.io/jaemskyle/full/XWJvRL");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.linkText("Due Date Calculator"));
        js.executeScript("arguments[0].scrollIntoView(0)",element);
        driver.quit();
    }
}
