import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        //Locate username by tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        //Locate password by tag[attribute = value]
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
        //Locate login button by tag.class of value
        driver.findElement(By.cssSelector("input.submit-button")).click();
        //Add product to card by tag.class of value[attribute = value]
        driver.findElement(By.cssSelector("button.btn[name = add-to-cart-sauce-labs-backpack]")).click();
        //tag[attribute^= sub-string]
        driver.findElement(By.cssSelector("button[name$=light]")).click();
        driver.quit();
    }
}
