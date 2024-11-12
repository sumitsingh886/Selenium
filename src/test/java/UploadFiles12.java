import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static helper.Pages.LOANS;

public class UploadFiles12 {

    @Test
    public void uploadFile() throws IOException {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(LOANS);

        WebElement fileInput = driver.findElement(By.cssSelector("input[type = file]"));

        Path path = Files.createTempFile("Test", "txt");
        String fileName = path.toAbsolutePath().toString();
        System.out.println(fileName);

        fileInput.sendKeys(fileName);

        DemoHelper.pause();

        driver.quit();
    }
}
