import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestDrive1 {

    @Test
    public void test() {
//        System.setProperty("webdriver.chrome.driver","C:\\Web Scraping\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
