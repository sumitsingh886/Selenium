import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static helper.Pages.SAVINGS;

public class WindowSize {

    @Test
    public void windowSize(){
        WebDriver driver = new ChromeDriver();

        WebDriver.Window window = driver.manage().window();

        window.maximize();
        window.minimize();
        window.setSize(new Dimension(1500,800));

        driver.get(SAVINGS);

        driver.quit();
    }
}
