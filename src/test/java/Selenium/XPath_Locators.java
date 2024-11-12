import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPath_Locators {
    @Test
    public void XPath_locator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        //Locate username by single attribute
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //Locate username by contains
        driver.findElement(By.xpath(" //input[contains(@id,'user')]")).sendKeys("standard_user");
        //Locate password by multiple attribute
        driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
        //Locate login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //AND Expression
//        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
        //OR Expression
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();
        //Start_with
        driver.findElement(By.xpath("//button[starts-with(@id,'bolt-t-shirt')]")).click();
//        driver.quit();
    }
    @Test
    public void position_Last(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/09/temp.html");
        //By position()
        driver.findElement(By.xpath("//input[@type='text'][position()=2]")).sendKeys("Sumit");
        //By last()
        driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("Prajapati");

    }
}