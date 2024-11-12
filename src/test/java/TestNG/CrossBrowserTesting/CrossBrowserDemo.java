package TestNG.CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Locale;

public class CrossBrowserDemo {
    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void LaunchBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "msedge":
                driver = new EdgeDriver();
                break;
            default:
                driver = null;
                break;
        }
    }

    @Test
    public void verifyTitle() {
        driver.get("http://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void CloseBrowser() {
        driver.quit();
    }
}
