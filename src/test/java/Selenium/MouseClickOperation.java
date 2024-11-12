import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseClickOperation {
    @Test
    public void rightClick(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions actions = new Actions(driver);
        actions.contextClick(button).perform(); //right click

        driver.quit();
    }
    @Test
    public void doubleClick(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(button).perform(); //right click

        driver.quit();
    }
}
