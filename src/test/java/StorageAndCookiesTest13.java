import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class StorageAndCookiesTest13 {

    @Test
    public void sessionStorage(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement save = driver.findElement(By.id("save"));


        firstName.sendKeys("Sumit");
        lastName.sendKeys("Singh");
        save.click();

        WebStorage webStorage = (WebStorage) driver;
        SessionStorage storage = webStorage.getSessionStorage();
        storage.keySet()
                        .forEach(key -> System.out.println(key + "=" + storage.getItem(key)));
        DemoHelper.pause();
        driver.get(SAVINGS);
        driver.navigate().back();

        DemoHelper.pause();

        WebElement firstName_1 = driver.findElement(By.id("firstName"));
        WebElement lastName_1 = driver.findElement(By.id("lastName"));
        Assert.assertEquals(firstName_1.getAttribute("value"), "Sumit");
        Assert.assertEquals(lastName_1.getAttribute("value"), "Singh");

        storage.clear();
        driver.navigate().refresh();

        DemoHelper.pause();
        WebElement firstName_2 = driver.findElement(By.id("firstName"));
        WebElement lastName_2 = driver.findElement(By.id("lastName"));
        Assert.assertEquals(firstName_2.getAttribute("value"), "");
        Assert.assertEquals(lastName_2.getAttribute("value"), "");



        driver.quit();
    }

    @Test
    public void cookies(){
        WebDriver driver = DriverFactory.newDriver();
        WebDriver.Options  options = driver.manage();

        Set<Cookie> cookies = options.getCookies();
        Cookie thing = options.getCookieNamed("thing");
        options.deleteAllCookies();
    }
}
