import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class NavigationTest2 {

    private  static final String PREFIX = "file:///" + System.getProperty("user.dir") + "\\src\\web\\";
    @Test
    public void basicNavigationTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(PREFIX + "index.html");

        DemoHelper.pause();     //Selenium did not provide the slowdown the code we are using native java
        driver.get(PREFIX + "savings.html");

        DemoHelper.pause();
        driver.navigate().back();

        DemoHelper.pause();
        driver.navigate().forward();

        DemoHelper.pause();
        driver.navigate().refresh();

        DemoHelper.pause();
        driver.quit();
    }

    @Test
    public void basicNavigationTestRefactored(){
        WebDriver driver = DriverFactory.newDriver();

        driver.get(HOME);

        DemoHelper.pause();
        driver.get(SAVINGS);

        driver.quit();
    }
}
