import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Level;

import static helper.Pages.HOME;

public class ConsollogCapture {

    @Test
    public void consoleLog() {

        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.BROWSER, Level.ALL);

        ChromeOptions options = new ChromeOptions();
        options.setCapability(ChromeOptions.LOGGING_PREFS, logs);

        WebDriver driver = new ChromeDriver(options);
        driver.get(HOME);

        driver.findElement(By.id("register")).click();

        LogEntries browseLogs = driver.manage().logs().get(LogType.BROWSER);
        Assert.assertFalse(browseLogs.getAll().isEmpty());

        browseLogs.forEach(System.out::println);

        browseLogs.forEach(logEntry -> System.out.println(logEntry.getLevel() + " " + logEntry.getMessage()));

        DemoHelper.pause();

        driver.quit();

    }
}
